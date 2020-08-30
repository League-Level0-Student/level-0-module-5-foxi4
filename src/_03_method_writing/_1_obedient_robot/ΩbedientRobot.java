package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ΩbedientRobot {
	static Robot iCU= new Robot();
public static void main(String[] args) {
//playing music nøw
	
	String answer = JOptionPane.showInputDialog("Choose a shape you want to be drawn. (Square, Circle, Triangle)");
	if(answer=="Square") {
		drawSquare();
	}
	if(answer=="Circle") {
		drawCircle();
	}
	if(answer=="Triangle") {
		drawTriangle();
	}


iCU.penDown();

iCU.setSpeed(100);
}
public static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		iCU.move(200);
		iCU.turn(90);
		}
	
}
public static void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		iCU.turn(120);
		iCU.move(200);
	}
}
public static void drawCircle() {
	for (int i = 0; i < 400; i++) {
		iCU.turn(1);
		iCU.move(2);
	}
}
}
























