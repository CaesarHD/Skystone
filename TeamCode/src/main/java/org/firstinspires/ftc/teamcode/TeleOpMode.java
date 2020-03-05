package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name = "TeleOp", group = "Debug")
public class TeleOpMode extends OpMode {

    Function robot = new Function();
    public  ElapsedTime runtime = new ElapsedTime();

    public double speed = 0;
    @Override
    public void init() {

        robot.init(hardwareMap);
        telemetry.addData("Status", "Initialized");

    }

    @Override
    public void init_loop() {
    }

    @Override
    public void start() {
        runtime.reset();
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

            robot.FR.setPower(speed);
            robot.BR.setPower(speed);
            robot.BL.setPower(-speed);
            robot.FL.setPower(-speed);
        }

        robot.FR.setPower(0);
        robot.BR.setPower(0);
        robot.BL.setPower(0);
        robot.FL.setPower(0);


        while (gamepad1.left_stick_y > 0) {

            //REVERSE

            robot.FR.setPower(-speed);
            robot.BR.setPower(-speed);
            robot.BL.setPower(speed);
            robot.FL.setPower(speed);
        }

        robot.FR.setPower(0);
        robot.BR.setPower(0);
        robot.BL.setPower(0);
        robot.FL.setPower(0);


        while (gamepad1.left_stick_x > 0) {

            //STRAFE RIGHT

            robot.FR.setPower(speed);
            robot.BR.setPower(-speed);
            robot.BL.setPower(-speed);
            robot.FL.setPower(speed);

        }

        robot.FR.setPower(0);
        robot.BR.setPower(0);
        robot.BL.setPower(0);
        robot.FL.setPower(0);

        while (gamepad1.left_stick_x < 0) {

            //STRAFE LEFT

            robot.FR.setPower(-speed);
            robot.BR.setPower(speed);
            robot.BL.setPower(speed);
            robot.FL.setPower(-speed);

        }

        robot.FR.setPower(0);
        robot.BR.setPower(0);
        robot.BL.setPower(0);
        robot.FL.setPower(0);


        while (gamepad1.right_stick_x < 0) {

            //ROTATE RIGHT

            robot.FR.setPower(-speed);
            robot.BR.setPower(-speed);
            robot.BL.setPower(-speed);
            robot.FL.setPower(-speed);

        }

        robot.FR.setPower(0);
        robot.BR.setPower(0);
        robot.BL.setPower(0);
        robot.FL.setPower(0);

        while (gamepad1.right_stick_x > 0) {

            //ROTATE LEFT

            robot.FR.setPower(speed);
            robot.BR.setPower(speed);
            robot.BL.setPower(speed);
            robot.FL.setPower(speed);

        }

        robot.FR.setPower(0);
        robot.BR.setPower(0);
        robot.BL.setPower(0);
        robot.FL.setPower(0);

        while (gamepad1.right_stick_y < 0) {

            //DIAGONAL RIGHT

            robot.FR.setPower(speed);
            robot.BL.setPower(speed);

        }

        robot.FR.setPower(0);
        robot.BL.setPower(0);

        while (gamepad1.right_stick_y > 0) {

            //DIAGONAL LEFT

            robot.BR.setPower(speed);
            robot.FL.setPower(speed);

        }

        robot.BR.setPower(0);
        robot.FL.setPower(0);

        while (gamepad1.left_trigger == 1) {

            robot.FD.setPosition(1);

        }

        while (gamepad1.dpad_left || gamepad1.dpad_right) {

            robot.FD.setPosition(0);
        }

        while (gamepad1.right_trigger == 1) {

            robot.FD.setPosition(0);

        }

    }

    @Override
    public void stop() {
    }
}