// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.XboxController;

/**
 * Basic Concepts:
 * - 1. Can you print out to the SmartDashboard?
 * - 2. Can you set the Speed (-1 to 1) of the intakeMotor and print out that speed?
 * - 3. Can you create a variable for the speed that you are using?
 *  - 3a. Use it to set the speed of the motor
 *  - 3b. Use it to print out the speed of the motor
 * - 4. Can you make a int variable for the deviceId (14) for the motor?
 * - 5. Can you multiply your speed by a number between 0 and 1 and store it in the variable newSpeed?
 *  - 5a. Bonus points if the number between 0 and 1 is stored in a variable.
 * - 6. Can you leave a comment by newSpeed explaining why you chose your speed Ammount and the multiplier?
 * --------------------------------------------------------------------------------------------------------------------
 * Control Flow:
 * - 1. Can you uncomment the XboxController import?
 * - 2. Can you create a XboxController object with the id of 0?
 *  - 2a. Bonus points if id 0 is stored in a variable.
 * - 3. Can you create a Conditional 
 *      where if X gets pressed it goes your negative speed and if B is pressed it goes speed else it goes zero speed?
 * - 4. Can you create a Multiple Condition
 *      where if the joystick is above or below a threshold the motor does not run?
 *  - 4a. Bonus points if the threshold is stored in a variable.
 * --------------------------------------------------------------------------------------------------------------------
 * Arrays:
 * - 1. Can you make an array size of 3 with mutliple speeds?
 * - 2. Can you make it so that if a button is pressed it indexes from the array (ex. A = 0, B = 1, ...)
 * - 3. Can you calculate the average of your speed array, and if last button is pressed it runs the average speed?
 * --------------------------------------------------------------------------------------------------------------------
 * Methods:
 * - 1. Can you make a method that runs at a set speed?
 * - 2. Can you make a method that takes in -1 to 1 and it maps it from 0 to 1 and it returns that value?
 */

/**
 * The VM is configured to automatically run this class, and to call the run() function when the
 * robot is enabled. If you change the name of this class or the package after creating this
 * project, you must also update the build.gradle file in the project.
 */
public class Robot extends EducationalRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  private TalonFX intakeMotor;

  @Override
  public void robotInit()
  {
    intakeMotor = new TalonFX(14);
    // Create controller here
  }

  /** This function is run when the robot is enabled. */
  @Override
  public void run()
  {
    // add code here (ex. motor.set(), controller.getAButton(), ...)
    // remember google is your friend ✨
  }
}
