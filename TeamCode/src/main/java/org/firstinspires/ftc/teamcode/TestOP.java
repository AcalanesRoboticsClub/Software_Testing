// Written by AcaBots FTC team 24689 for the 2025-26 DECODE Season

/*
-------------------- CONTROL SCHEME - CONTROLLER 1 --------------------
Buttons:
    A: Toggle intake, transfer, and riser belts
    START: Reset IMU
    BACK: Reverse intake, transfer, and riser belts + turret intake kicker wheel


D-Pad:
    UP: Close/lobbing preset
    DOWN: Far launch zone preset
    RIGHT: Middle launch zone preset, low angle
    LEFT: Middle launch zone preset, high angle

Triggers:
    RT: Turret rotate right
    LT: Turret rotate left

Shoulder Buttons:
    RB: Turret flywheel
    LB: Turret intake kicker wheel

Joysticks:
    Right: Relative Chassis Rotation
    Left: Absolute Chassis Strafe based on orientation when START button is pressed

-------------------- CONTROL SCHEME - CONTROLLER 2 --------------------
Same as controller 1, except turret rotation is disabled
 */

package org.firstinspires.ftc.teamcode;
import android.util.Size;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.IMU;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.List;

@TeleOp // Defines class as a teleOP routine
public class TestOP extends LinearOpMode{
    // Define a servo with CRServo

    // Define a motor with DcMotor

    @Override
    public void runOpMode() throws InterruptedException { // Main execution function
        // Hardware Definitions. Must match names setup in robot configuration in the driver hub. config is created and selected selected with driver hub menu

        // INITIALIZATIONS AND SETUP

        // Initialize servos with hardwareMap.get(CRServo.class, "____name____");

        // Initialize motors with hardwareMap.dcMotor.get("____name____");

        // Reverse direction of motors with motorName.setDirection(DcMotorSimple.Direction.REVERSE)


        waitForStart();

        if (isStopRequested()) return;

        // CONTROL LOOP
        while (opModeIsActive()) {
            // Check if "a" button is pressed with gamepad1.aWasPressed()

            // Set the power of a motor with motorName.setPower(____value____)
            //    The power must be between -1 and 1, a power of 0 means the motor is not running
        }
    }
}