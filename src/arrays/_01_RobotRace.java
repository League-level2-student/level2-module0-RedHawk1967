package arrays;


import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;


import java.awt.print.Book;
import java.util.Random;


import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {


		Robot[] robots = new Robot[5];
		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(0);
			robots[i].setY(600);

		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.

		Random random = new Random();

		boolean raceRunning = true;

		while (raceRunning == true) {

			for (int i = 0; i < 5; i++) {

				robots[i].setSpeed(50);
				int x = random.nextInt(15);
				robots[i].move(x);

				if (robots[i].getY() <= 0) {
					System.out.println("Robot " + i + " Is the winner of the y race");
					raceRunning = false;
				

				}

			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		for (int f = 0; f < 5; f++) {
			robots[f].setX(300); robots[f].setY(300);
		}
		boolean circularRunning = true;

		while (circularRunning == true) {
			
			for (int i = 0; i < 5; i++) {

				robots[i].setSpeed(10);
				int x = random.nextInt(10)+1;
				for (int j = 0; j < x; j++) {
					
				
				robots[i].move(1);
				robots[i].turn(1);
				
				if (robots[i].getY() == 300 && robots[i].getX() == 300) {
					System.out.println("Robot " + i + " is the winner of the circular race");
					circularRunning = false;
					System.exit(0);
				}
				}
			
			

		}

	}

}
}
// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
