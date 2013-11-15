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
public class Reverse_Drive extends CommandBase{

    protected void initialize() {
    }

    protected void execute() {
        
        RobotMap.FORWARD = false;
        RobotMap.REVERSE = true;
   
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
    
}
