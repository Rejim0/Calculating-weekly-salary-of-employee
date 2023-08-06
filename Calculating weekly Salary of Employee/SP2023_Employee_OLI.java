//SP2023_Employee_OLI
//SP2023_LAB7PART1_OLI

class SP2023_Employee_OLI extends SP2023_Person {
	private float salary_rate; 

public SP2023_Employee_OLI(String num, String last, String first, String phoneN, String addr, float salary_rate)
{
	super(num, last, first, phoneN, addr);
	this.salary_rate = salary_rate;
}
public float salaryInOneWeek()
{
	if(salary_rate < 1000 )
	{
		return this.salary_rate * 40;
	}
	else
	{
		return this.salary_rate / 52 ;
	}
}

@Override public String toString()
{
	return (super.toString() + "Salary Rate: " + String.format("%33.2f", salary_rate )+
			"\nSalary in One Week: " + String.format("%26.2f",salaryInOneWeek()));                    
 
		  
}

}