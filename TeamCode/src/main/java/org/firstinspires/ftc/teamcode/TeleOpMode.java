package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name = "TeleOp", group = "Debug")
public class TeleOpMode extends OpMode {

    private DcMotor FR;
    private DcMotor BR;
    private DcMotor BL;
    private DcMotor FL;

    private Servo FD;

    public double speed = 0;

    @Override
    public void init() {

        FR = hardwareMap.get(DcMotor.class, "FR");
        BR = hardwareMap.get(DcMotor.class, "BR");
        BL = hardwareMap.get(DcMotor.class, "BL");
        FL = hardwareMap.get(DcMotor.class, "FL");
        FD = hardwareMap.get(Servo.class, "FD");

        FR.setDirection(DcMotor.Direction.FORWARD);
        BR.setDirection(DcMotor.Direction.FORWARD);
        BL.setDirection(DcMotor.Direction.FORWARD);
        FL.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void init_loop() {
    }

    @Override
    public void start() {
    }

    @Override
    public void loop() {

        telemetry.addData("Status", "Initialized");

        if (gamepad1.y) speed = 0.25;
        if (gamepad1.b) speed = 0.50;
        if (gamepad1.a) speed = 0.75;
        if (gamepad1.x) speed = 1.00;

        telemetry.addData("Speed: ", speed);
        telemetry.update();


        while (gamepad1.left_stick_y < 0) {

            //FORWARD

            FR.setPower(speed);
            BR.setPower(speed);
            BL.setPower(-speed);
            FL.setPower(-speed);
        }

        FR.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        FL.setPower(0);


        while (gamepad1.left_stick_y > 0) {

            //REVERSE

            FR.setPower(-speed);
            BR.setPower(-speed);
            BL.setPower(speed);
            FL.setPower(speed);
        }

        FR.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        FL.setPower(0);


        while (gamepad1.left_stick_x > 0) {

            //STRAFE RIGHT

            FR.setPower(speed);
            BR.setPower(-speed);
            BL.setPower(-speed);
            FL.setPower(speed);

        }

        FR.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        FL.setPower(0);

        while (gamepad1.left_stick_x < 0) {

            //STRAFE LEFT

            FR.setPower(-speed);
            BR.setPower(speed);
            BL.setPower(speed);
            FL.setPower(-speed);

        }

        FR.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        FL.setPower(0);


        while (gamepad1.right_stick_x < 0) {

            //ROTATE RIGHT

            FR.setPower(-speed);
            BR.setPower(-speed);
            BL.setPower(-speed);
            FL.setPower(-speed);

        }

        FR.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        FL.setPower(0);

        while (gamepad1.right_stick_x > 0) {

            //ROTATE LEFT

            FR.setPower(speed);
            BR.setPower(speed);
            BL.setPower(speed);
            FL.setPower(speed);

        }

        FR.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        FL.setPower(0);

        while (gamepad1.right_stick_y < 0) {

            //DIAGONAL RIGHT

            FR.setPower(speed);
            BL.setPower(speed);

        }

        FR.setPower(0);
        BL.setPower(0);

        while (gamepad1.right_stick_y > 0) {

            //DIAGONAL LEFT

            BR.setPower(speed);
            FL.setPower(speed);

        }

        BR.setPower(0);
        FL.setPower(0);

        while (gamepad1.left_trigger == 1) {

            FD.setPosition(1);

        }

        while (gamepad1.dpad_left || gamepad1.dpad_right) {

            FD.setPosition(0);
        }

        while (gamepad1.right_trigger == 1) {

            FD.setPosition(-1);

        }

    }

    @Override
    public void stop() {

        FD.setPosition(0);

    }
}