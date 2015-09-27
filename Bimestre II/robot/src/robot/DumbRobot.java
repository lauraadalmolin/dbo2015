package robot;

import robocode.JuniorRobot;

public class DumbRobot extends JuniorRobot {

	
	@Override
	public void run() {
		while(true) {
			ahead(100);
			fire(0.5);
			back(100);
			fire(0.5);
			turnRight(15);
			fire(0.5);
		}
	}
	
}
