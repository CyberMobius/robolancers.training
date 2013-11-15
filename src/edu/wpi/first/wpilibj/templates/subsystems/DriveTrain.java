/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.commands.DriveWithJoystick;

/**
 * @author Armond
 */

public class DriveTrain extends Subsystem{
    private RobotDrive drive;
    private double x, y, speed;
    
    public static Victor leftMotor1, rightMotor1, leftMotor2, rightMotor2;
    public static DoubleSolenoid sonicShifter1;
    
    public DriveTrain(){
        super("Drive Train");
        
       leftMotor1 = new Victor(RobotMap.LEFT_MOTOR_ONE);
       CommandBase.oi.victors[0] = leftMotor1;
       rightMotor1 = new Victor(RobotMap.RIGHT_MOTOR_ONE);
       CommandBase.oi.victors[1] = rightMotor1;
       leftMotor2 = new Victor(RobotMap.LEFT_MOTOR_TWO);
       CommandBase.oi.victors[2] = leftMotor2;
       rightMotor2 = new Victor(RobotMap.RIGHT_MOTOR_TWO);
       CommandBase.oi.victors[3] = rightMotor2;
        
       sonicShifter1 = new DoubleSolenoid(1,2);
       CommandBase.oi.doubleSolenoids[0] = sonicShifter1;
       
       speed = 0.5;
    }
    
    public void initDefaultCommand(){
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public void moveWithJoystick(double moveValue, double rotateValue){
        x = moveValue*speed;
        y = rotateValue*speed;
        drive.arcadeDrive(y,x);
    }
}
