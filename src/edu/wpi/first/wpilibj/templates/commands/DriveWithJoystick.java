/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Armond
 */
public class DriveWithJoystick extends CommandBase{
    private double moveValue, rotateValue, leftDrive, rightDrive, speed;
    
    public DriveWithJoystick(){ requires(driveTrain); }
    
    public void initialize(){}
    
    public void execute(){
        setSpeedFactor(1.0); //set the speed to a certain value Currently: 100%
        
        if(RobotMap.MONO_JOYSTICK && RobotMap.ARCADE_DRIVE){
            if((Math.abs(OI.joystick1.getRawAxis(1)) > .1) || (Math.abs(OI.joystick1.getRawAxis(2)) > .1)){
                rotateValue = OI.joystick1.getRawAxis(1);
                moveValue = OI.joystick1.getRawAxis(2);
            }else{
                moveValue = 0;
                rotateValue = 0;
            }
            driveTrain.moveWithJoystick(moveValue, rotateValue, speed);
        }
        
        if(RobotMap.DUAL_JOYSTICK && RobotMap.TANK_DRIVE){
            if((Math.abs(OI.joystick1.getRawAxis(2)) > .1)){
                leftDrive = OI.joystick1.getRawAxis(2);
            }else{
                leftDrive = 0;
            }
            if((Math.abs(OI.joystick2.getRawAxis(2)) > .1)){
                rightDrive = OI.joystick1.getRawAxis(2);
            }else{
                rightDrive = 0;
            }
            driveTrain.moveWithJoystick(moveValue, rotateValue, speed);
        }
        
        if(RobotMap.DUAL_JOYSTICK && RobotMap.RC_DRIVE){
            if((Math.abs(OI.joystick1.getRawAxis(2)) > .1)){
                moveValue = OI.joystick1.getRawAxis(2);
            }else{
                moveValue = 0;
            }
            if((Math.abs(OI.joystick2.getRawAxis(1)) > .1)){
                rotateValue = OI.joystick1.getRawAxis(1);
            }else{
                rotateValue = 0;
            }
            driveTrain.moveWithJoystick(moveValue, rotateValue, speed);
        }
        
        if(RobotMap.WHEEL){ //TODO: Speed variable buttons
            if(RobotMap.FORWARD){
                if((Math.abs(OI.joystick1.getRawAxis(2)) > .1)){ //TODO: get Axis Values
                    rotateValue = OI.joystick1.getRawAxis(3);
                }
               moveValue = 0.2 + speed; //TODO: acceleration button
            }
            else if(RobotMap.REVERSE){ 
                if((Math.abs(OI.joystick1.getRawAxis(2)) > .1)){
                    rotateValue = OI.joystick1.getRawAxis(3);
                }
                moveValue = -(0.4 + speed);    
            }else{
                moveValue = 0;
                rotateValue = 0;
            } 
            driveTrain.moveWithJoystick(moveValue, rotateValue, speed);
        }
    }
    
    protected boolean isFinished(){ return false; }
    protected void end(){}
    protected void interrupted(){}
    
    public void setSpeedFactor(double s){ this.speed = s; }
    
}
