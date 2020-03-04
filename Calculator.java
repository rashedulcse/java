package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("Choose Your Calculator : \n1. General \n2. Scientific");
        int chooseCalc = scn.nextInt();
        
        switch(chooseCalc) {
            case 1:
                new General();
                break;

            case 2:
            	new Scientific();
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! input is not correct");
                break;
        }
        
        if(scn != null) {
            scn.close();
        }
	}
}
