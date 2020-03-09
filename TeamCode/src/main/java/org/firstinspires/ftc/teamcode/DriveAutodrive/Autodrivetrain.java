package org.firstinspires.ftc.teamcode.DriveAutodrive;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Autodrivetrain  {

    public DcMotor rightFront;
    public DcMotor rightBack;
    public DcMotor leftFront;
    public DcMotor leftBack;

    public DcMotor liftMotor1;
    public DcMotor liftMotor2;

    public final double diameter = 10.0;
    public final double wheelCircumference = diameter * Math.PI;
    public final double ticksPerRotation = 1440.0;
    public final double gearRatio = 3.0 / 1.0;
    public final double scaleFactor = 1.0;
    public final double ticksPerCentimeter = (ticksPerRotation * scaleFactor) / (gearRatio * wheelCircumference);

    int targetDistance;

    public void hardwareMap(HardwareMap hardwareMap) {

        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        rightBack = hardwareMap.get(DcMotor.class, "rightBack");
        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
        leftFront = hardwareMap.get(DcMotor.class, "leftFront");


        rightFront.setDirection(DcMotor.Direction.FORWARD);
        rightBack.setDirection(DcMotor.Direction.FORWARD);
        leftBack.setDirection(DcMotor.Direction.FORWARD);
        leftFront.setDirection(DcMotor.Direction.FORWARD);
    }

    public void runToPosition () {

        rightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        leftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);

    }

    public void stopAndResetEncoders () {

        rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        leftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    public void setIdenticalPower(double power) {

        rightFront.setPower(power);
        rightBack.setPower(power);
        leftFront.setPower(power);
        leftBack.setPower(power);
    }

    public void moveForward (double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        rightFront.setTargetPosition(targetDistance);
        rightBack.setTargetPosition(targetDistance);
        leftFront.setTargetPosition(-targetDistance);
        leftBack.setTargetPosition(-targetDistance);

        runToPosition();

        setIdenticalPower(power);

        stopAndResetEncoders();
    }

    public void moveReverse (double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        rightFront.setTargetPosition(-targetDistance);
        rightBack.setTargetPosition(-targetDistance);
        leftFront.setTargetPosition(targetDistance);
        leftBack.setTargetPosition(targetDistance);

        runToPosition();

        setIdenticalPower(power);

        stopAndResetEncoders();
    }

    public void strafeRight (double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        rightFront.setTargetPosition(targetDistance);
        rightBack.setTargetPosition(-targetDistance);
        leftFront.setTargetPosition(-targetDistance);
        leftBack.setTargetPosition(targetDistance);

        runToPosition();

        setIdenticalPower(power);

        stopAndResetEncoders();
    }

    public void strafeLeft (double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        rightFront.setTargetPosition(-targetDistance);
        rightBack.setTargetPosition(targetDistance);
        leftFront.setTargetPosition(targetDistance);
        leftBack.setTargetPosition(-targetDistance);

        runToPosition();

        setIdenticalPower(power);

        stopAndResetEncoders();
    }

    public void rotateRight (double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        rightFront.setTargetPosition(-targetDistance);
        rightBack.setTargetPosition(-targetDistance);
        leftFront.setTargetPosition(-targetDistance);
        leftBack.setTargetPosition(-targetDistance);

        runToPosition();

        setIdenticalPower(power);

        stopAndResetEncoders();
    }

    public void rotateLeft (double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        rightFront.setTargetPosition(targetDistance);
        rightBack.setTargetPosition(targetDistance);
        leftFront.setTargetPosition(targetDistance);
        leftBack.setTargetPosition(targetDistance);

        runToPosition();

        setIdenticalPower(power);

        stopAndResetEncoders();
    }

    public void diagonalRight (double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        rightFront.setTargetPosition(targetDistance);
        leftBack.setTargetPosition(targetDistance);

        runToPosition();

        setIdenticalPower(power);

        stopAndResetEncoders();
    }

    public void diagonalLeft (double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        rightBack.setTargetPosition(targetDistance);
        leftFront.setTargetPosition(targetDistance);

        runToPosition();

        setIdenticalPower(power);

        stopAndResetEncoders();
    }

    public void autodrivetrainStop(){


        setIdenticalPower(0.0);
    }

    public void liftUp(double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        liftMotor1.setTargetPosition(targetDistance);
        liftMotor2.setTargetPosition(targetDistance);

        liftMotor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        liftMotor1.setPower(power);

        liftMotor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        liftMotor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }

    public void liftDown(double distance, double power) {

        targetDistance = (int) (distance * ticksPerCentimeter);

        liftMotor1.setTargetPosition(-targetDistance);
        liftMotor2.setTargetPosition(-targetDistance);

        liftMotor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        liftMotor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        liftMotor1.setPower(power);

        liftMotor1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        liftMotor2.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }

    public void liftStop() {

        liftMotor1.setPower(0.0);
        liftMotor2.setPower(0.0);
    }

}
