package quiz2_1;
import java.util.Scanner;

public class quiz2_Q1 {

	public static void main(String[] args) {
		  java.util.Scanner input = new Scanner(System.in);
		  
		  System.out.print("Please enter percentage increase of tuition : ");
		  double percentage = input.nextDouble();
		  
		  double a = 12342.00;
		  
		  double b = 1+percentage;
		  
		  double sum = 0;
		  
		 
		  
		  for(int i = 0; i <= 3; i++){
			   double tuition = Math.pow(b,i);
			   
			   sum += a * tuition;
			  
		  }
		  double total = Math.floor(sum);
		  
		  System.out.println("the total tuition is "+ total);
		  
		  
				  
				  
		

	}

}
