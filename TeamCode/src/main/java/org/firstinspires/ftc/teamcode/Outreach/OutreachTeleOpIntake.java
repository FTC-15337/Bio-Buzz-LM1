package org.firstinspires.ftc.teamcode.Outreach;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Outreach TeleOp Intake")
public class OutreachTeleOpIntake extends OpMode {

//    OutreachDriveIntake driveIntake = new OutreachDriveIntake();
    DcMotor intake;

    @Override
    public void init() {
//        driveIntake.inti(hardwareMap);
        intake = hardwareMap.get(DcMotor.class, "intake");
        intake.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    @Override
    public void loop() {
//        if (gamepad1.a) {
//            driveIntake.Reset();
//        }

        if (gamepad1.b) {
            intake.setPower(0.75);
        } else {
            intake.setPower(0);
        }
    }
}
