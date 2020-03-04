package calculator;
import java.util.Scanner;
import java.lang.Math;

public class Scientific {
	double result;
	Scientific() {
		Scanner scn = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division"
				+ "\n5. Modulus\n6. Square\n7. Root\n8. Log\n9. ln\n10. sin\n11. cos\n12. tan\n"
				+ "13. sec\n14. cosec\n15. cot\n16. factorial\n17. Power");
        int chooseAction = scn.nextInt();
        
        if (chooseAction <= 5 || chooseAction == 17) {
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
	        	case 5:
	        		result = x % y;
	        		break;
	        	
	        	case 17:
	        		result = Math.pow(x, y);
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
	        	case 6:
	        		result = x * x;
	        		break;
	
	        	case 7:
	        		result = Math.sqrt(x);
	        		break;
	        	case 8:
	        		result = Math.log10(x);
	        		break;
	        	case 9:
	        		result = Math.log(x);
	        		break;
	        	case 10:
	        		result = Math.sin(x);
	        		break;
	        	case 11:
	        		result = Math.cos(x);
	        		break;
	        	case 12:
	        		result = Math.tan(x);
	        		break;
	        	case 13:
	        		result = 1/Math.cos(x);
	        		break;
	        	case 14:
	        		result = 1/Math.sin(x);
	        		break;
	        	case 15:
	        		result = 1/Math.tan(x);
	        		break;
	        	case 16:
	        		double i, frac = 1;
	        		for (i = 1; i <= x; i++) {
	        			frac *= i;
	        		}
	        		result = frac;
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
