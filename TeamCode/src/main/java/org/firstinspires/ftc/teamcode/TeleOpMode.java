package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name = "TeleOp", group = "Debug")
public class TeleOpMode extends OpMode {

    public Lift lift = new Lift();
//    public Drivetrain drivetrain = new Drivetrain();
    public ElapsedTime runtime = new ElapsedTime();
    public ServoFoundation servoFoundation = new ServoFoundation();

    public double speed = 0;

    @Override
    public void init() {

        servoFoundation.initServo(hardwareMap);
        lift.initLift(hardwareMap);
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


        //LIFT TELEOP

        if (gamepad2.left_stick_y > 0) {
            lift.up();
        }

        if (gamepad2.left_stick_y < 0) {
            lift.down();
        }

        else {
            lift.pause();
        }




//        // DRIVETRAIN TELEOP
//
//        while (gamepad2.left_stick_y == 0) {
//            lift.pause();
//        }
//
//        while (gamepad1.left_stick_y < 0) {
//            drivetrain.moveForward();
//        }
//        drivetrain.stopMovement();
//
//
//        while (gamepad1.left_stick_y > 0) {
//            drivetrain.moveReverse();
//        }
//        drivetrain.stopMovement();
//
//
//        while (gamepad1.left_stick_x > 0) {
//            drivetrain.strafeRight();
//
//        }
//        drivetrain.stopMovement();
//
//        while (gamepad1.left_stick_x < 0) {
//            drivetrain.strafeLeft();
//
//        }
//        drivetrain.stopMovement();
//
//
//        while (gamepad1.right_stick_x < 0) {
//            drivetrain.rotateRight();
//        }
//        drivetrain.stopMovement();
//
//        while (gamepad1.right_stick_x > 0) {
//            drivetrain.strafeLeft();
//        }
//        drivetrain.stopMovement();
//
//        while (gamepad1.right_stick_y < 0) {
//            drivetrain.diagonalRight();
//        }
//        drivetrain.stopMovement();
//
//        while (gamepad1.right_stick_y > 0) {
//            drivetrain.diagonalLeft();
//        }
//        drivetrain.stopMovement();


        //SERVOFOUNDATION

        while (gamepad1.left_trigger == 1) {

            servoFoundation.down();

        }

        while (gamepad1.right_trigger == 1) {

            servoFoundation.up();

        }
    }

    @Override
    public void stop() {
    }
}