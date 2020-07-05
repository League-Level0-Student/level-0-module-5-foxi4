package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog(null, "Gimme a number :D");
		int numbers=Integer.parseInt(number);
		for(int i=2; i<numbers; i++) {
		if(numbers % i==0) {
			JOptionPane.showMessageDialog(null, "The number is not prime.");
			System.exit(0);
			
		}
		
		}
		JOptionPane.showMessageDialog(null,"The number is prime.");
		}
}


