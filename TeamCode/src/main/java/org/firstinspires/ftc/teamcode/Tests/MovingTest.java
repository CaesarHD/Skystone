package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.DriveAutodrive.Autodrivetrain;

import static java.lang.Thread.sleep;


@Autonomous(name="MovingTest", group="Test")
public class MovingTest extends OpMode {

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
        autodrivetrain.sleep(200);
        autodrivetrain.moveReverse(10,0.75);
        autodrivetrain.sleep(200);
        autodrivetrain.strafeLeft(10,0.75);
        autodrivetrain.sleep(200);
        autodrivetrain.strafeRight(10,0.75);
        autodrivetrain.sleep(200);
        autodrivetrain.rotateLeft(54,0.75);
        autodrivetrain.sleep(200);
        autodrivetrain.rotateRight(54,0.75);
        autodrivetrain.sleep(200);
        autodrivetrain.diagonalRight(10,0.75);
        autodrivetrain.sleep(200);
        autodrivetrain.diagonalLeft(10,0.75);
        autodrivetrain.sleep(200);

        autodrivetrain.autodrivetrainStop();
    }
}
