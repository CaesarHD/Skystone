//package org.firstinspires.ftc.teamcode;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//import org.firstinspires.ftc.robotcore.external.Telemetry;
//
//public class Drivetrain extends OpMode {
//
////    public DcMotor rightFront;
////    public DcMotor rightBack;
////    public DcMotor leftFront;
////    public DcMotor leftBack;
//
//    double speed;
//
////    public void hardwareMap() {
////
////        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
////        rightBack = hardwareMap.get(DcMotor.class, "rightBack");
////        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
////        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
////
////
////        rightFront.setDirection(DcMotor.Direction.FORWARD);
////        rightBack.setDirection(DcMotor.Direction.FORWARD);
////        leftBack.setDirection(DcMotor.Direction.FORWARD);
////        leftFront.setDirection(DcMotor.Direction.FORWARD);
////
////    }
////
////    public void moveForward(){
////
////        rightFront.setPower(speed);
////        rightBack.setPower(speed);
////        leftFront.setPower(-speed);
////        leftBack.setPower(-speed);
////    }
////
////    public void moveReverse() {
////
////        rightFront.setPower(-speed);
////        rightBack.setPower(-speed);
////        leftFront.setPower(speed);
////        leftBack.setPower(speed);
////    }
////
////    public void strafeRight() {
////
////        rightFront.setPower(speed);
////        rightBack.setPower(-speed);
////        leftFront.setPower(-speed);
////        leftBack.setPower(speed);
////    }
////
////    public void strafeLeft() {
////
////        rightFront.setPower(-speed);
////        rightBack.setPower(speed);
////        leftFront.setPower(speed);
////        leftBack.setPower(-speed);
////    }
////
////    public void rotateRight() {
////
////        rightFront.setPower(-speed);
////        rightBack.setPower(-speed);
////        leftFront.setPower(-speed);
////        leftBack.setPower(-speed);
////    }
////
////    public void rotateLeft() {
////
////        rightFront.setPower(speed);
////        rightBack.setPower(speed);
////        leftFront.setPower(speed);
////        leftBack.setPower(speed);
////    }
////
////    public void diagonalRight() {
////
////        rightFront.setPower(speed);
////        leftBack.setPower(speed);
////    }
////
////    public void diagonalLeft() {
////
////        rightBack.setPower(speed);
////        leftFront.setPower(speed);
////    }
////
////    public void stopMovement() {
////
////        rightFront.setPower(0.0);
////        rightBack.setPower(0.0);
////        leftFront.setPower(0.0);
////        leftBack.setPower(0.0);
////    }
//
//    @Override
//    public void init() {
//
////        hardwareMap();
//
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
//    }
//
//    public void loop(){
//
//
//
//
//    }
//}
