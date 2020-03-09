package org.firstinspires.ftc.teamcode.Tests;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.DriveAutodrive.Autodrivetrain;

public class EncoderTest extends OpMode {

    public ElapsedTime runtime = new ElapsedTime();
    public Autodrivetrain autodrivetrain = new Autodrivetrain();

    int ticks = 4480;
    double p = 0.5;

    @Override
    public void init() {

        telemetry.addData("Status ", "Initialized");
        autodrivetrain.hardwareMap(hardwareMap);

    }

    public void init_loop() {

    }

    public void start() {

        runtime.reset();
    }

    public void loop() {

        autodrivetrain.stopAndResetEncoders();

        autodrivetrain.rightFront.setTargetPosition(ticks);
        autodrivetrain.rightBack.setTargetPosition(ticks);
        autodrivetrain.leftFront.setTargetPosition(-ticks);
        autodrivetrain.leftBack.setTargetPosition(-ticks);

        autodrivetrain.runToPosition();

        autodrivetrain.setIdenticalPower(p);

        telemetry.addData("RF: ", autodrivetrain.rightFront.getCurrentPosition());
        telemetry.addData("RB: ", autodrivetrain.rightBack.getCurrentPosition());
        telemetry.addData("LF: ", autodrivetrain.leftFront.getCurrentPosition());
        telemetry.addData("LB: ", autodrivetrain.leftBack.getCurrentPosition());
        telemetry.update();

        autodrivetrain.setIdenticalPower(0.0);

        telemetry.addData("Status ", "Done");
        telemetry.update();


    }
}
