package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.DriveAutodrive.Autodrivetrain;

import static android.os.SystemClock.sleep;

@Autonomous(name="Move", group="Test")

public class Move extends OpMode{

    public ElapsedTime runTime = new ElapsedTime();
    public Autodrivetrain autodrivetrain = new Autodrivetrain();

    @Override
    public void init(){

        telemetry.addData("Status", "Initialized");
        autodrivetrain.hardwareMap(hardwareMap);
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
       autodrivetrain.moveReverse(10,0.75);
       autodrivetrain.strafeLeft(10,0.75);
       autodrivetrain.strafeRight(10,0.75);
       autodrivetrain.rotateLeft(54,0.75);
       autodrivetrain.rotateRight(54,0.75);

        autodrivetrain.autodrivetrainStop();

        autodrivetrain.liftUp(60,0.50);
        autodrivetrain.liftDown(60,0.50);

        telemetry.addData("Status: ","Done");
        telemetry.update();

    }

}
