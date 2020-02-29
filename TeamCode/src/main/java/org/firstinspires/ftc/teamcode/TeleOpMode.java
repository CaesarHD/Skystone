package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp(name = "TeleOp", group = "Debug")
public class TeleOpMode extends LinearOpMode {

    private DcMotor FR;
    private DcMotor BR;
    private DcMotor BL;
    private DcMotor FL;

    public double speed = 0;

    @Override
    public void runOpMode() throws InterruptedException {

        FR = hardwareMap.get(DcMotor.class, "FR");
        BR = hardwareMap.get(DcMotor.class, "BR");
        BL = hardwareMap.get(DcMotor.class, "BL");
        FL = hardwareMap.get(DcMotor.class, "FL");

        FR.setDirection(DcMotor.Direction.FORWARD);
        BR.setDirection(DcMotor.Direction.FORWARD);
        BL.setDirection(DcMotor.Direction.FORWARD);
        FL.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();

        while (opModeIsActive()) {

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

            telemetry.update();

        }
    }
}