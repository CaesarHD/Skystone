package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoFoundation extends LinearOpMode {

    public Servo foundationServo;

    public void down() {

        foundationServo.setPosition(1);
    }

    public void up() {

        foundationServo.setPosition(0);
    }

    @Override
    public void runOpMode() {

        foundationServo = hardwareMap.servo.get("foundationServo");


    }

    }
