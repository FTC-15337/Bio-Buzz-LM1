package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Mechanisms.Drive;



@TeleOp (name = "Teleop")
public class TeleOP extends OpMode {
    DcMotor intake;
    Drive drive = new Drive();
    @Override
    public void init() {
        intake = hardwareMap.get(DcMotor.class, "intake");
        intake.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        drive.inti(hardwareMap);
    }


    @Override
    public void loop() {
        if (gamepad1.a){
            drive.Reset();
        }

        if (gamepad1.left_bumper) {
            intake.setPower(0.75);
        } else {
            intake.setPower(0);
        }
        double forward, strafe, rotate;
        forward = -gamepad1.left_stick_y;
        strafe = gamepad1.left_stick_x;
        rotate = gamepad1.right_stick_x;
        drive.driveFieldRelative(forward,strafe,rotate);
    }
}
