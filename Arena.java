package combatRobots;

import java.util.Scanner;
public class Arena {
	
	public static void main(String[] args) {
		Scanner sc = new  Scanner (System.in);
		System.out.println("Welcome to the UnderGames !");
		System.out.println("what is the name should you give on your robot ?");
		String str = sc.nextLine();
		System.out.println("The name of the first robot is : "+str);
		System.out.println("Please enter the name of the second robot.");
		String stg = sc.nextLine();
		System.out.println("The name of the second robot is : "+stg);
		System.out.println("the next fight will oppose the robot "+str+" and the robot "+stg);
		System.out.println();
		System.out.println("Ready or not, fight !");
		System.out.println();
		
		Robot rb0;
		rb0 = new Robot(str);
	
		Robot rb1;
		rb1 = new Robot(stg);
		
		while(rb0.getLife() !=0 && rb1.getLife() !=0) {
			rb0.fire(rb1);
			rb0.isDead(rb1);
			rb1.fire(rb0);
		}
		
	}
}
