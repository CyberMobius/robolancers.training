package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.templates.subsystems.ExampleSubsystem;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static DriveTrain driveTrain;
    
    public static void init() {
        oi = new OI();
        driveTrain = new DriveTrain();
        
        SmartDashboard.putData(driveTrain);
        
        if(RobotMap.DEBUG_MODE){
            //TALONS
            for(int i = 0; i <= 10; i++){
                if(CommandBase.oi.talons[i] != null){
                    LiveWindow.addActuator("DriveTrain", "Talon Name: " +CommandBase.oi.talons[i].toString(),CommandBase.oi.talons[i]);
                }
            }
            //VICTORS
            for(int i = 0; i <= 10; i++){
                if(CommandBase.oi.victors[i] != null){
                    LiveWindow.addActuator("DriveTrain","Victor Name: " +CommandBase.oi.victors[i].toString(),CommandBase.oi.victors[i]);
                }
            }
            //DOUBLE SOLENOID
            for(int i = 0; i <= 10; i++){
                if(CommandBase.oi.doubleSolenoids[i] != null){
                    LiveWindow.addActuator("DriveTrain","DSol Name: " +CommandBase.oi.doubleSolenoids[i].toString(),CommandBase.oi.doubleSolenoids[i]);
                }
            }
        }
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
