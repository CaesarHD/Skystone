//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.util.ElapsedTime;
//
//import static android.os.SystemClock.sleep;
//
//@Autonomous(name="Move", group="Test")
//public class Move extends OpMode{
//
//    private DcMotor rightFront;
//    private DcMotor rightBack;
//    private DcMotor leftBack;
//    private DcMotor leftFront;
//
//    public ElapsedTime runTime = new ElapsedTime();
//    public Drivetrain drivetrain = new Drivetrain();
//
//
//    public void hardwareMap(){
//
//        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
//        rightBack = hardwareMap.get(DcMotor.class, "rightBack");
//        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
//        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
//
//
//        rightFront.setDirection(DcMotor.Direction.FORWARD);
//        rightBack.setDirection(DcMotor.Direction.FORWARD);
//        leftBack.setDirection(DcMotor.Direction.FORWARD);
//        leftFront.setDirection(DcMotor.Direction.FORWARD);
//
//    }
//    @Override
//    public void init(){
//
//        telemetry.addData("Status", "Initialized");
//        hardwareMap();
//    }
//
//    @Override
//    public void init_loop(){
//
//    }
//
//    @Override
//    public void start(){
//
//        runTime.reset();
//    }
//
//    @Override
//    public void loop(){
//
//        double speed = 0.5;
//
//       drivetrain.moveForward();
//
//        sleep(2000);
//
//        drivetrain.stopMovement();
//
//        telemetry.addData("Status: ","Done");
//        telemetry.update();
//
//    }
//
//}
