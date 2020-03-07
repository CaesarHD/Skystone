package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class ServoFoundation {

    public Servo foundationServoLeft;
    public Servo foundationServoRight;

    public void down() {

        foundationServoLeft.setPosition(1);
        foundationServoRight.setPosition(0);
    }

    public void up() {

        foundationServoLeft.setPosition(0);
        foundationServoRight.setPosition(1);
    }

    public void initServo(HardwareMap hardwareMap) {

        foundationServoRight = hardwareMap.get(Servo.class, "foundationServoRight");
        foundationServoLeft = hardwareMap.get(Servo.class, "foundationServoLeft");


    }

}
