package src;

import java.util.Scanner;

public class Info_Castillo {

	static Scanner castillo_Scan = new Scanner(System.in);
	   
	    private static String LastName,FirstName,MiddleName,Section = null,Gradelvl;
	    private static int Birth, year = 2022,Birth2,Birth3,grade1 = 0,grade2 = 0,grade3 = 0,grade4 = 0;
	    private static int Age,dob;
	   
		//static int year = Period.between(hhhDate,today).getYears();
		
		
	public static void Main(){
		System.out.print("WELCOME TO MY FINAL PROJ THIS SEMESTER\nCODER:Riceo G. Castillo");
		System.out.println(" ");
	}
	public static void NAMES(){
	
		
		
		System.out.println(" ");
		System.out.print("DO INPUT YOUR LASTNAME:");
		LastName = castillo_Scan.next();

		System.out.print("DO INPUT YOUR FIRSTNAME:");
		FirstName = castillo_Scan.next();
		
		System.out.print("DO INPUT YOUR MIDDLENAME:");
		MiddleName = castillo_Scan.next();
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
		//float Age = Birth3-year;
		float DataOne = (grade1 + grade2 + grade3 + grade4);
		float DataTwo = DataOne /4;
		 String initials = MiddleName.substring(0,1);
		//float Gradelvl =+ Gradelvl;
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
			System.out.print("\nPASSED\n");
		}
		if ( DataTwo >= 90) {
			System.out.print("\nHIGHEST");
		}
    	if ( DataTwo >= 80) {
			System.out.print(" HONOR");
    	}
		if ( DataTwo < 75){
			System.out.print("\nFAILED\nRICEO YOU FAILED!");
		}
	  
		
		
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
