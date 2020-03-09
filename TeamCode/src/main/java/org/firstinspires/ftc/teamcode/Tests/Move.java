package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.DriveAutodrive.Autodrivetrain;
import org.firstinspires.ftc.teamcode.DriveAutodrive.Drivetrain;

import static android.os.SystemClock.sleep;

@Autonomous(name="Move", group="Test")

public class Move extends OpMode{

    public ElapsedTime runTime = new ElapsedTime();
    public Autodrivetrain autodrivetrain = new Autodrivetrain();

    @Override
    public void init(){

        telemetry.addData("Status", "Initialized");
        autodrivetrain.hardwareMap();
    }

    @Override
    public void init_loop(){

    }

    @Override
    public void start(){

        runTime.reset();
    }

    @Override
    public void loop(){

       autodrivetrain.moveForward(10,0.75);

        sleep(1000);

        autodrivetrain.autodrivetrainStop();

        autodrivetrain.liftUp(60,0.50);
        autodrivetrain.liftDown(60,0.50);

        telemetry.addData("Status: ","Done");
        telemetry.update();

    }

}
