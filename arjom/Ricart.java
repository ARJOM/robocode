package arjom;
import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Ricart - a robot by Ricart
 */
public class Ricart extends Robot
{
	/**
	 * run: Ricart's default behavior
	 */
	public void run() {

		setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		while(true) {
			ahead(100);
			turnRight(40);
			turnGunRight(360);
			turnRight(40);
			back(100);
			turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(10);
		fire(10);
		fire(10);
		fire(10);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		back(20);
		turnRight(60);
		ahead(20);
	}	
}

