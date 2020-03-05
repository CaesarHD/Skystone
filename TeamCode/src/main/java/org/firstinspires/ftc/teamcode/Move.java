package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import static android.os.SystemClock.sleep;

@Autonomous(name="Move", group="Debug")
public class Move extends OpMode{

    private DcMotor FR;
    private DcMotor BR;
    private DcMotor BL;
    private DcMotor FL;

    private ElapsedTime runTime = new ElapsedTime();


    @Override
    public void init(){

        FR = hardwareMap.get(DcMotor.class, "FR");
        BR = hardwareMap.get(DcMotor.class, "BR");
        BL = hardwareMap.get(DcMotor.class, "BL");
        FL = hardwareMap.get(DcMotor.class, "FL");


        FR.setDirection(DcMotor.Direction.FORWARD);
        BR.setDirection(DcMotor.Direction.FORWARD);
        BL.setDirection(DcMotor.Direction.FORWARD);
        FL.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void init_loop(){

    }

    @Override
    public void start(){

    }

    @Override
    public void loop(){

        double speed = 0.5;

        telemetry.addData("Status: ","Initialized");

        FR.setPower(speed);
        BR.setPower(speed);
        BL.setPower(-speed);
        FL.setPower(-speed);

        sleep(2000);

        FR.setPower(0);
        BR.setPower(0);
        BL.setPower(0);
        FL.setPower(0);

        telemetry.addData("Status: ","Done");
        telemetry.update();

    }

}
