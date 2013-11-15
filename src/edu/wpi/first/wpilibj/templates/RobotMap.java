package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
 
    //SETS ALL PORT VALUES
    
    //Run Mode
    public static final boolean DEBUG_MODE = false;
    
    //Joystick Type
    public static final boolean DUAL_JOYSTICK = true;
    public static final boolean WHEEL = false;
    
    //Motor Values
    public static final int LEFT_MOTOR_ONE = 1;
    public static final int RIGHT_MOTOR_ONE = 2;
    public static final int LEFT_MOTOR_TWO = 3;
    public static final int RIGHT_MOTOR_TWO = 4;
    
    //Sonic Shifter Gear
    public static boolean HIGH_GEAR = false;
    public static boolean LOW_GEAR = true;
    
    //Sonic Shifter Type
    public static final int TYPE_HIGH_GEAR = 1;
    public static final int TYPE_LOW_GEAR = 2;
    
    //Drive Type
    public static boolean FORWARD = false;
    public static boolean REVERSE = false;
    
}
