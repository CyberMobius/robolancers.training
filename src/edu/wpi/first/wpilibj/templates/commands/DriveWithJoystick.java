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
    private double moveValue, rotateValue, speedFactor;
    
    public DriveWithJoystick(){ requires(driveTrain); }
    
    public void initialize(){}
    
    public void execute(){
        if(RobotMap.DUAL_JOYSTICK){
            if((Math.abs(OI.driveStick.getRawAxis(1)) > .1) || (Math.abs(OI.driveStick.getRawAxis(2)) > .1)){
                rotateValue = OI.driveStick.getRawAxis(1);
                moveValue = OI.driveStick.getRawAxis(2);
            }else{
                moveValue = 0;
                rotateValue = 0;
            }
            
        }
        
        if(RobotMap.WHEEL){
            if(RobotMap.FORWARD){
                if((Math.abs(OI.driveStick.getRawAxis(2)) > .1)){ //TODO: get Axis Values
                    rotateValue = OI.driveStick.getRawAxis(3);
                }
               moveValue = 0.2 + speedFactor; //TODO: acceleration button
            }
            else if(RobotMap.REVERSE){ 
                if((Math.abs(OI.driveStick.getRawAxis(2)) > .1)){
                    rotateValue = OI.driveStick.getRawAxis(3);
                }
                moveValue = -(0.4 + speedFactor);    
            }else{
                moveValue = 0;
                rotateValue = 0;
            } 
            driveTrain.moveWithJoystick(moveValue, rotateValue);
        }
    }
    
    protected boolean isFinished(){ return false; }
    protected void end(){}
    protected void interrupted(){}
    
    public void setSpeedFactor(){
    
    }
}
