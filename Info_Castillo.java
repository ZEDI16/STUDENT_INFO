package src;

import java.util.Scanner;
public class Info_Castillo {
	static Scanner castillo_Scan = new Scanner(System.in);
	   
	    private static String LastName,FirstName,MiddleName,Section = null,Gradelvl;
	    private static int Birth, year = 2022,Birth2,Birth3,grade1 = 0,grade2 = 0,grade3 = 0,grade4 = 0,Age;
	    public static void Main(){
	        System.out.println("\t\t\t\t+-----------------------------+\t\t\t\t");
			System.out.println("\t\t\t\t+                             +\t\t\t\t");
			System.out.println("\t\t\t\t+ WELCOME TO MY FINAL PROJECT +\t\t\t\t");
			System.out.println("\t\t\t\t+ THIS QUARTER.               +\t\t\t\t");
			System.out.println("\t\t\t\t+                             +\t\t\t\t");
			System.out.println("\t\t\t\t+ CODER: RICEO G> CASTILLO    +\t\t\t\t");
			System.out.println("\t\t\t\t+-----------------------------+\t\t\t\t");
	}
	public static void NAMES(){
		
		System.out.println(" ");
		System.out.print("DO INPUT YOUR LASTNAME:");
		LastName = castillo_Scan.nextLine();

		System.out.print("DO INPUT YOUR FIRSTNAME:");
		FirstName = castillo_Scan.nextLine();
		
		System.out.print("DO INPUT YOUR MIDDLENAME:");
		MiddleName = castillo_Scan.nextLine();
	}

	public static void AGE (){	
		System.out.println(" ");
		System.out.println("DO INPUT YOUR DATE OF BIRTH");
		System.out.println(" ");
		System.out.print("INPUT HERE:");
		Birth = castillo_Scan.nextInt();
		Birth2 = castillo_Scan.nextInt();
		Birth3 = castillo_Scan.nextInt();
		Age = year - Birth3;
	   }
	public static void GRADEnSECTION(){	
		System.out.println(" ");
		System.out.print("DO INPUT YOUR GRADE LEVEL:");
		Gradelvl = castillo_Scan.next();
		System.out.print("DO INPUT YOUR SECTION:");
		Section = castillo_Scan.next();
		System.out.println(" ");
	}
	public static void GRADEnRESULT(){
		System.out.print("1ST QUARTER GRADE:");
		grade1 = castillo_Scan.nextInt();
		System.out.print("2ST QUARTER GRADE:");
		grade2 = castillo_Scan.nextInt();
		System.out.print("3ST QUARTER GRADE:");
		grade3 = castillo_Scan.nextInt();
		System.out.print("4ST QUARTER GRADE:");
		grade4 = castillo_Scan.nextInt();
	}
	public static void OUTPUTS(){
		
		float DataOne = (grade1 + grade2 + grade3 + grade4);
		float DataTwo = DataOne /4;
		 String initials = MiddleName.substring(0,1);
		
		System.out.println(" ");
		System.out.println("=======");
		System.out.println("OUTPUT:");
		System.out.println("=======");
		System.out.println(" ");
		
		System.out.print("\nSTUDENT:"+FirstName+" "+initials+"."+" "+LastName);
		System.out.print("\nAGE:" + Age);
		System.out.println("\nGRADE LEVEL & SECTION:" + Gradelvl+"-"+Section);
		
		System.out.print(" ");
		System.out.print("\n1ST:" + grade1);
		System.out.print("\n2ND:" + grade2);
		System.out.print("\n3RD:" + grade3);
		System.out.print("\n4TH:" + grade4);
		System.out.println(" ");
		System.out.println("\nGENERAL AVERAGE:" + DataTwo);
		System.out.print(" ");
	    System.out.print("\nREMARKS:");
		if ( DataTwo >= 75) {
			System.out.print("PASSED\n");
		}
		if ( DataTwo >= 95) {
			System.out.print("HIGH");
		}
		if ( DataTwo >= 98) {
			System.out.print("EST" +" ");
		}
    	if ( DataTwo >= 90) {
			System.out.print(" "+"HONOR");
    	}
		if ( DataTwo < 75){
			System.out.print("FAILED\nRICEO YOU FAILED!");
		}
		System.out.print("\n[Program Finished]");
	}
		public static void main(String[] args) {
		Main();	
		NAMES();
		AGE();
		GRADEnSECTION();
		GRADEnRESULT();
		OUTPUTS();
	}
}
