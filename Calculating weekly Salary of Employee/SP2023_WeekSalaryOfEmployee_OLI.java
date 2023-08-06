//SP2023_WeekSalaryOfEmployee_OLI
//SP2023_LAB7PART1_OLI

import java.util.Scanner;
public class SP2023_WeekSalaryOfEmployee_OLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your SS Number? ");
		String num = input.nextLine();
		
		System.out.println("What's your last name? ");
		String last = input.nextLine();
		
		System.out.println("What's your first name? ");
		String first = input.nextLine();
		
		System.out.println("What's your phone number? ");
		String phoneN = input.nextLine();
		
		System.out.println("What's your address? ");
		String addr = input.nextLine();
		
		System.out.println("What's your salary rate? ");
		float salary_rate = input.nextFloat(); 
		
		System.out.println("");
		
		
SP2023_Employee_OLI week_salary = new SP2023_Employee_OLI(num, last, first, phoneN, addr, salary_rate); 

System.out.println("SP2023_WeekSalaryOfEmployee_OLI.java");
System.out.println("SALARY OF THE WEEK – REJIM OLI");
System.out.println("----------------------------------------------");
System.out.println(week_salary.toString());
	}
}
