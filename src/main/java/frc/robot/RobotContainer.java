/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                                                */
/* Open Source Software - may be modified and shared by FRC teams. The code     */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                                                                                             */
/*----------------------------------------------------------------------------*/

package frc.robot;

import static frc.robot.Constants.*;

import java.util.logging.Logger;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {

    // The robot's subsystems and commands are defined here...
    private final RobotBase robot;
    private final Logger logger = Logger.getLogger("Robot");

    // DRIVE
    private final VictorSP frontLeftMotor = new VictorSP(FRONT_LEFT_MOTOR);
    private final VictorSP frontRightMotor = new VictorSP(FRONT_RIGHT_MOTOR);
    private final VictorSP rearLeftMotor = new VictorSP(REAR_LEFT_MOTOR);
    private final VictorSP rearRightMotor = new VictorSP(REAR_RIGHT_MOTOR);

    // INTAKE
    private final VictorSP intakeMotor = new VictorSP(INTAKE_MOTOR);

    // DRIVE SUBSYSTEM
    private final SpeedControllerGroup leftMotors = new SpeedControllerGroup(frontLeftMotor, rearLeftMotor);
    private final SpeedControllerGroup rightMotors = new SpeedControllerGroup(frontRightMotor, rearRightMotor);

    private final DifferentialDrive driveTrain = new DifferentialDrive(leftMotors, rightMotors);
    private final DriveSubsystem driveSubsystem = new DriveSubsystem(driveTrain);


    public RobotContainer(RobotBase robot) {
        this.robot = robot;

        // Configure the button bindings
        configureButtonBindings();
        configureObjects();
    }

    /**
     * Use this method to define your button->command mappings. Buttons can be
     * created by instantiating a {@link GenericHID} or one of its subclasses
     * ({@link edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then
     * passing it to a {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
     */
    private void configureButtonBindings() {

    }

    public void configureObjects() {

    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        return null;
    }

    public VictorSP getIntakeMotor() {
        return intakeMotor;
    }
}
