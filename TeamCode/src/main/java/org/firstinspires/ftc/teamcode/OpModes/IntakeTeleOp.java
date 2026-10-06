package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Mechanisms.Drive;
import org.firstinspires.ftc.teamcode.Mechanisms.Intake;

@TeleOp
public class IntakeTeleOp extends OpMode {
    Intake intake = new Intake();
    Drive drive = new Drive();
    @Override
    public void init() {
        intake.init(hardwareMap);
        drive.init(hardwareMap);
    }


    @Override
    public void loop() {
        if (gamepad1.a){
            drive.Reset();
        }

        if (gamepad1.left_bumper) {
            intake.intakeSpeed(0.75);
        } else {
            intake.intakeSpeed(0);
        }
        double forward, strafe, rotate;
        forward = -gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;
        drive.driveFieldRelative(forward,strafe,rotate);
    }
}

