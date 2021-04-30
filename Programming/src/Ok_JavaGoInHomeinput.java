import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class Ok_JavaGoInHomeinput {

	// parameter(매개변수)
	public static void main(String[] args) {
//		String myid = JOptionPane.showInputDialog("Enter a ID");
//		String bright = JOptionPane.showInputDialog("Enter a Bright");
		String myid = args[0];
		String bright = args[1];
		
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
		
		DimmingLights moodLamp = new DimmingLights(myid+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}
	
}
