import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class JavaGoHomeInput {

	public static void main(String[] args) {
		String id =args[0];//'java apt 705'
		String bright =args[1];//'30'
		//elevator call
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//light on
		Lighting hallLamp = new Lighting(id +"/Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id +"/Floor Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + "/Mood Lamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}
}
