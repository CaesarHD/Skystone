package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class Function {

    public DcMotor FR;
    public DcMotor BR;
    public DcMotor BL;
    public DcMotor FL;

    public Servo FD;

    HardwareMap hwMap = null;

    ElapsedTime runtime = new ElapsedTime();

    static final double COUNTS_PER_MOTOR_REV = 383.6;
    static final double WHEEL_DIAMETER_CM = 10.0;
    static final double DRIVE_GEAR_REDUCTION = 3;
    int targetDistance;
    static final double COUNTS_PER_CM = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) / (WHEEL_DIAMETER_CM * 3.1415);

    public void init(HardwareMap ahwMap) {

        ahwMap = hwMap;

        FR = hwMap.get(DcMotor.class, "FR");
        BR = hwMap.get(DcMotor.class, "BR");
        BL = hwMap.get(DcMotor.class, "BL");
        FL = hwMap.get(DcMotor.class, "FL");

        FD = hwMap.get(Servo.class, "FD");

        FD.setPosition(0);

        FR.setDirection(DcMotor.Direction.FORWARD);
        BR.setDirection(DcMotor.Direction.FORWARD);
        BL.setDirection(DcMotor.Direction.FORWARD);
        FL.setDirection(DcMotor.Direction.FORWARD);

        FR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BR.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        BL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        FL.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

    }

    public void move (double distance, double speed) {

        FR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        FL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        targetDistance = (int)(distance * COUNTS_PER_CM);

        FR.setTargetPosition(targetDistance);
        BR.setTargetPosition(targetDistance);
        BL.setTargetPosition(targetDistance);
        FL.setTargetPosition(targetDistance);

        FR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        FL.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        runtime.reset();

        FR.setPower(speed);
        BR.setPower(speed);
        BL.setPower(speed);
        FL.setPower(speed);

    }

    public void rightstrafe (double distance, double speed) {

        FR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        FL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        targetDistance = (int) (distance * COUNTS_PER_CM);

        FR.setTargetPosition(targetDistance);
        BR.setTargetPosition(targetDistance);
        BL.setTargetPosition(targetDistance);
        FL.setTargetPosition(targetDistance);

        FR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        FL.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        runtime.reset();

        FR.setPower(speed);
        BR.setPower(speed);
        BL.setPower(speed);
        FL.setPower(speed);

    }

    public void leftstrafe (double distance, double speed) {

        FR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        FL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        targetDistance = (int) (distance * COUNTS_PER_CM);

        FR.setTargetPosition(targetDistance);
        BR.setTargetPosition(targetDistance);
        BL.setTargetPosition(targetDistance);
        FL.setTargetPosition(targetDistance);

        FR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        FL.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        runtime.reset();

        FR.setPower(speed);
        BR.setPower(speed);
        BL.setPower(speed);
        FL.setPower(speed);

    }

    public void rotate (double distance, double speed) {

        FR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BR.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        BL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        FL.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        targetDistance = (int) (distance * COUNTS_PER_CM);

        FR.setTargetPosition(targetDistance);
        BR.setTargetPosition(targetDistance);
        BL.setTargetPosition(targetDistance);
        FL.setTargetPosition(targetDistance);

        FR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BR.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BL.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        FL.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        runtime.reset();

        FR.setPower(speed);
        BR.setPower(speed);
        BL.setPower(speed);
        FL.setPower(speed);

    }

}

