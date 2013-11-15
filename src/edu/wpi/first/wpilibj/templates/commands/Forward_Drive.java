/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Armond
 */
public class Forward_Drive extends CommandBase {

    protected void initialize() {
    }

    protected void execute(){
        RobotMap.FORWARD = true;
        RobotMap.REVERSE = false;
        
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
    
    
}
