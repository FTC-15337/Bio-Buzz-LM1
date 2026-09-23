package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Drive;

@TeleOp
public class TeleOP extends OpMode {
    Drive drive = new Drive();
    @Override
    public void init() {
        drive.inti(hardwareMap);
    }


    @Override
    public void loop() {
        if (gamepad1.a){
            drive.Reset();
        }
        double forward, strafe, rotate;
        forward = -gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;
        drive.driveFieldRelative(forward,strafe,rotate);
    }
}
