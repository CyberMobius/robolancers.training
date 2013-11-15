
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.Forward_Drive;
import edu.wpi.first.wpilibj.templates.commands.Reverse_Drive;
import edu.wpi.first.wpilibj.templates.commands.SSPneumaticToggle;
import edu.wpi.first.wpilibj.templates.subsystems.DriveTrain;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Victor[] victors = new Victor[10]; //TODO: TEST OBJECT SUB
    public Talon[] talons = new Talon[10];
    public DoubleSolenoid[] doubleSolenoids = new DoubleSolenoid[10];
    
    
    public static Joystick driveStick = new Joystick(1);
    JoystickButton driveBtn1 = new JoystickButton(driveStick, 1),
        driveBtn2 = new JoystickButton(driveStick, 2),
        driveBtn3 = new JoystickButton(driveStick, 3),
        driveBtn4 = new JoystickButton(driveStick, 4),
        driveBtn5 = new JoystickButton(driveStick, 5),
        driveBtn6 = new JoystickButton(driveStick, 6),
        driveBtn7 = new JoystickButton(driveStick, 7),
        driveBtn8 = new JoystickButton(driveStick, 8),
        driveBtn9 = new JoystickButton(driveStick, 9),
        driveBtn10 = new JoystickButton(driveStick, 10),
        driveBtn11 = new JoystickButton(driveStick, 11);
    
    public static Joystick wheel = new Joystick(1);
    JoystickButton wheelBtn1 = new JoystickButton(wheel, 1),
        wheelBtn2 = new JoystickButton(wheel, 2),
        wheelBtn3 = new JoystickButton(wheel, 3),
        wheelBtn4 = new JoystickButton(wheel, 4),
        wheelBtn5 = new JoystickButton(wheel, 5),
        wheelBtn6 = new JoystickButton(wheel, 6),
        wheelBtn7 = new JoystickButton(wheel, 7),
        wheelBtn8 = new JoystickButton(wheel, 8),
        wheelBtn9 = new JoystickButton(wheel, 9),
        wheelBtn10 = new JoystickButton(wheel, 10),
        wheelBtn11 = new JoystickButton(wheel, 11);
    
    public OI(){
        driveBtn2.whenReleased(new SSPneumaticToggle(DriveTrain.sonicShifter1));
        
        wheelBtn1.whenPressed(new Forward_Drive());
        wheelBtn2.whenPressed(new Reverse_Drive());
        
    }
}

