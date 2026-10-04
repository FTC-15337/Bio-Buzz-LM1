package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class Test extends OpMode {
    private DcMotor motor;

    public void init() {
        motor = hardwareMap.get(DcMotor.class, "frontRight");
    }

    public void loop() {
        motor.setPower(-1);
    }
}