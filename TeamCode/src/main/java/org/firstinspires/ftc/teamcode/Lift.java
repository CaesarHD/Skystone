package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Lift extends LinearOpMode {

    public DcMotor liftMotor1;
    public DcMotor liftMotor2;

    public void up()
    {
        liftMotor1.setPower(0.5);
        liftMotor2.setPower(-0.5);
    }

    public void down()
    {
        liftMotor1.setPower(-0.5);
        liftMotor2.setPower(0.5);
    }

    public void pause()
    {
        liftMotor1.setPower(0);
        liftMotor2.setPower(0);
    }

    @Override
    public void runOpMode()
    {
        liftMotor1 = hardwareMap.dcMotor.get("liftMotor1");
        liftMotor2 = hardwareMap.dcMotor.get("liftMotor2");

        liftMotor1.setDirection(DcMotorSimple.Direction.FORWARD);
        liftMotor2.setDirection(DcMotorSimple.Direction.FORWARD);



    }
}
