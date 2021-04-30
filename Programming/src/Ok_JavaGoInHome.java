import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class Ok_JavaGoInHome {

	public static void main(String[] args) {
		String myid = "JAVA APT 507";
		
		// Elevator call
		Elevator myElevator = new Elevator(myid);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(myid);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(myid+" / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(myid+" / floorLamp");
		floorLamp.on();
	}
	
}
