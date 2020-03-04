package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "STervo", group = "Debug")
public class ServoT extends LinearOpMode {

    private Servo FD;
    private Servo FS;

    private ElapsedTime runtime = new ElapsedTime();


    @Override
    public void runOpMode() {

        FD = hardwareMap.get(Servo.class, "FD");
        FS = hardwareMap.get(Servo.class, "FS");
        FD.setPosition(0);
        FS.setPosition(0);

        waitForStart();


        if (opModeIsActive()){

            FD.setPosition(1);
            FS.setPosition(1);
            sleep(5000);
            FD.setPosition(0);
            FS.setPosition(0);

        }
    }
}
