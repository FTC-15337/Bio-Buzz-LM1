package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Mechanisms.Drive;
import org.firstinspires.ftc.teamcode.Mechanisms.Intake;

import java.security.InvalidKeyException;

@TeleOp
public class TeleOP extends OpMode {
    Drive drive = new Drive();
    Intake intake = new Intake();
    @Override
    public void init() {
        drive.init(hardwareMap);
        intake.init(hardwareMap);
    }


    @Override
    public void loop() {
        if (gamepad1.a){
            drive.Reset();
        }

        if (gamepad1.b){
            intake.intakeSpeed(0.75);
        }

        double forward, strafe, rotate;
        forward = -gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;
        drive.driveFieldRelative(forward,strafe,rotate);
    }
}
