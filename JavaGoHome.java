import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class JavaGoHome {

	public static void main(String[] args) {
		String id ="JAVA APT 507";
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
	}
}