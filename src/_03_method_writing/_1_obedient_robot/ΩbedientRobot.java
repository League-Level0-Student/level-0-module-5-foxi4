package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ΩbedientRobot {
	static Robot iCU= new Robot();
public static void main(String[] args) {
//playing music ≈nøw≈
	String answer2 = JOptionPane.showInputDialog("What color do you want your outline to be (colors: rainbow)");
	if(answer2.equals("Red")) {
		iCU.setPenColor(Color.red);
	}
	if(answer2.equals("Orange")) {
		iCU.setPenColor(Color.orange);
	}
	if(answer2.equals("Yellow")) {
		iCU.setPenColor(Color.yellow);
	}
	if(answer2.equals("Green")) {
		iCU.setPenColor(Color.green);
	}
	if(answer2.equals("Blue")) {
		iCU.setPenColor(Color.blue);
	}
	if(answer2.equals("Purple")) {
		iCU.setPenColor(Color.magenta);
	}
	
	String answer = JOptionPane.showInputDialog("Choose a shape you want to be drawn. (Square, Circle, Triangle)");
	if(answer.equals("Square")) {
		drawSquare();
	}
	if(answer.equals("Circle")) {
		drawCircle();
	}
	if(answer.equals("Triangle")) {
		drawTriangle();
	}


//   =(≈´W`≈)=> 

}
public static void drawSquare() {
	iCU.penDown();
	iCU.setSpeed(111);
	for (int i = 0; i < 4; i++) {
		iCU.move(200);
		iCU.turn(90);
		}
	
}
public static void drawTriangle() {
	iCU.penDown();
	iCU.setSpeed(111);
	for (int i = 0; i < 3; i++) {
		iCU.turn(120);
		iCU.move(200);
	}
}
public static void drawCircle() {
	iCU.penDown();
	iCU.setSpeed(400);
	for (int i = 0; i < 400; i++) {
		iCU.turn(1);
		iCU.move(2);
	}
}
}
























