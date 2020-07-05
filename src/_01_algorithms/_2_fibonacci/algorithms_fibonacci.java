package _01_algorithms._2_fibonacci;

public class algorithms_fibonacci {
	public static void main(String[] args) {
		
		 int number1=0;
		 int number2=1;
		System.out.print(number1);
				System.out.print(number2);
		 for(int i=0;i<10;i++) {
		int sum=number1+number2; 
		number1=number2;
		System.out.print(sum);
		number2=sum;
		 }
		
	}
	
	//listening to music so its hard to hear y'all
}

