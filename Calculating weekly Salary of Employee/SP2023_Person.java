//SP2023_Person
//SP2023_LAB7PART1_OLI


public class SP2023_Person {
	protected String SSNumber;
	protected String lastName;
	protected String firstName;
	protected String phone;
	protected String address;
	
	public SP2023_Person()
	{
		SSNumber = "";
		lastName = "";
		firstName = "";
		phone    = "";
		address  = "";
	}
	public SP2023_Person(String num, String last, String first, String phoneN, String addr)
	{
		SSNumber = num;
		lastName = last;
		firstName = first;
		phone    = phoneN;
		address  = addr;	
	}
	public String toString()
	{
		return String.format("%-15s%31s\n", "SS Number: ", SSNumber) +
			   String.format("%-15s%31s\n", "Name: ", firstName + lastName) +
			   String.format("%-15s%25s\n", "Address: ", address);
			  
	}
}