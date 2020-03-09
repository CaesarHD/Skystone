package org.firstinspires.ftc.teamcode.Mecanisms;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Lift  {

    public DcMotor liftMotor1;
    public DcMotor liftMotor2;

    public void up()
    {
        liftMotor1.setPower(0.5);
        liftMotor2.setPower(0.5);
    }

    public void down()
    {
        liftMotor1.setPower(-0.5);
        liftMotor2.setPower(-0.5);
    }

    public void pause()
    {
        liftMotor1.setPower(0);
        liftMotor2.setPower(0);
    }

    public void initLift(HardwareMap hardwareMap)
    {
        liftMotor1 = hardwareMap.get(DcMotor.class,"liftMotor1");
        liftMotor2 = hardwareMap.get(DcMotor.class,"liftMotor2");

        liftMotor1.setDirection(DcMotorSimple.Direction.FORWARD);
        liftMotor2.setDirection(DcMotorSimple.Direction.FORWARD);



    }
}
