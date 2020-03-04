package calculator;
import java.util.Scanner;
import java.lang.Math;

public class General {
	double result;
	General() {
		Scanner scn = new Scanner(System.in);
        System.out.println("Choose Your Action : \n1. Addition \n2. Subtruction \n3. Division \n4. Multiplication \n5. Square \n6. Root");
        int chooseAction = scn.nextInt();
        
        if (chooseAction <= 4) {
    		System.out.println("Enter Two Number: ");
            double x = scn.nextDouble();
            double y = scn.nextDouble();
            
            switch(chooseAction) {
	        	case 1:
	        		result = x + y;
	        		break;
	
	        	case 2:
	        		result = x - y;
	        		break;
	        		
	        	case 3:
	        		result = x / y;
	        		break;
	        	
	        	case 4:
	        		result = x * y;
	        		break;
	        		
	            // operator doesn't match any case constant
	        	default:
	        		System.out.print("Error! input is not correct");
	        		break;
            }
            System.out.println(result);
        }else {
    		System.out.println("Enter a number: ");
            double x = scn.nextDouble();
        	switch(chooseAction) {
	        	case 5:
	        		result = x * x;
	        		break;
	
	        	case 6:
	        		result = Math.sqrt(x);
	        		break;
	        		
	            // operator doesn't match any case constant
	        	default:
	        		System.out.print("Error! input is not correct");
	        		break;
        	}
        System.out.println(result);
        }
        if(scn != null) {
            scn.close();
        }
	}
}
