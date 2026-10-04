package org.firstinspires.ftc.teamcode.Outreach;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Outreach.OutreachDrive;

@TeleOp
public class OutreachTeleOpDrive extends OpMode {
    OutreachDrive drive = new OutreachDrive();

    @Override
    public void init(){drive.inti(hardwareMap);}

    @Override
    public void loop() {
        if (gamepad1.a) {
            drive.Reset();
        }

        double forward, strafe, rotate;
        forward = -gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;
        drive.driveFieldRelative(forward,strafe,rotate);
    }
}
