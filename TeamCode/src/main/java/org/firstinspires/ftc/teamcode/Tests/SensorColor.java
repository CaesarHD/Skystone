package org.firstinspires.ftc.teamcode.Tests;

import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.DriveAutodrive.Autodrivetrain;
@Autonomous(name = "ColorSensor", group = "Test")
public class SensorColor extends LinearOpMode {

    com.qualcomm.robotcore.hardware.ColorSensor colorSensor;
    public ElapsedTime runTime = new ElapsedTime();
    public Autodrivetrain autodrivetrain = new Autodrivetrain();
    @Override
    public void runOpMode()
    {
        float hsvValues[] = { 0F , 0F , 0F };
        final float values[] = hsvValues;

        colorSensor = hardwareMap.colorSensor.get("colorSensor");
        telemetry.addData("Status", "Initialized");

        waitForStart();

        while(opModeIsActive()){

            Color.RGBToHSV(colorSensor.red() *8, colorSensor.green() *8, colorSensor.blue() *8, hsvValues);
            telemetry.addData("Red ", colorSensor.red());
            telemetry.addData("Green ", colorSensor.green());
            telemetry.addData("Blue ", colorSensor.blue());
            telemetry.update();
        }
    }
}
