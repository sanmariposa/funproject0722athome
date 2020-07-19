package funProject0722atHome;
import java.util.Scanner;


public class A_Main {

	public static void main(String[] args) {
		
		final int MENU_Instruction = 1;
		final int MENU_StartSurvey = 2;
		final int MENU_BringStats = 3;
		final int MENU_Exit = 4;
		
		int menu;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("MAIN MENU");
			System.out.println("---------------");
			System.out.println("1. Instruction");
			System.out.println("2. Start Survey");
			System.out.println("3. Poll Result");
			System.out.println("4. EXIT");
			System.out.println("---------------");
			
			System.out.println("> ");
			menu = sc.nextInt();
			
			switch(menu) {
			//Instruction
			case MENU_Instruction:
				
				B_Instruction bringInstruction = new B_Instruction();
				bringInstruction.instruction();
				System.out.println();
				break;
				
			//Start Survey
			case MENU_StartSurvey:
				
				//Industry Selection
				C_Industry bringIndustry = new C_Industry();
				bringIndustry.chooseIndustry();
				
				
			 }

		}

	}

}
