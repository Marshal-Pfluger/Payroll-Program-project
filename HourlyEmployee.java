//********************************************************************
//
//  Developer:     Marshal Pfluger
//
//  Project #:     Two
//
//  File Name:     PieceEmployee.java
//
//  Course:        COSC 4301 Modern Programming
//
//  Due Date:      2/15/2023
//
//  Instructor:    Prof. Fred Kumi 
//
//  Java Version:  17.0.4.1
//
//  Description:   Contains the HourlyEmployee class which inherits the employee class. 
//
//********************************************************************

//Start HourlyEmployee class
public class HourlyEmployee extends Employee{
	// Declare private class variables
	private double wage;
	private double hours;
	private int overtime = 40;
	
	   //***************************************************************
	   //
	   //  Method:       HourlyEmployee
	   // 
	   //  Description:  Constructor for HourlyEmployee class
	   //
	   //  Parameters:   String first, String last, String social, double hWage, double numHours
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	public HourlyEmployee(String first, String last, String social, double hourWage, double numHours) {
		super(first, last, social);
		setWage(hourWage);
		setHours(numHours);
	}// End Constructor 
	
	   //***************************************************************
	   //
	   //  Method:       setWage
	   // 
	   //  Description:  Setter method for wage using ? : conditional operator to handle negative values.
	   //
	   //  Parameters:   double hourWage
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	public void setWage(double hourWage) {
		wage = hourWage > 0.0 ? hourWage : 0.0;
	}// End setWage
	
	   //***************************************************************
	   //
	   //  Method:       setHours
	   // 
	   //  Description:  Setter method for hours using ? : conditional operator to handle negative values.
	   //
	   //  Parameters:   double numHours
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	public void setHours(double numHours) {
		hours = numHours > 0.0 ? numHours : 0.0;
	}// End setHours
	
	   //***************************************************************
	   //
	   //  Method:       earnings
	   // 
	   //  Description:  Earnings method to calculate pay and return value
	   //
	   //  Parameters:   N/A
	   //
	   //  Returns:      double pay
	   //
	   //**************************************************************
	public double earnings() {
		double pay;
		//Calculate pay adjusted for overtime
		if (hours > overtime) {
			pay = (((wage * 1.5) * (hours - overtime)) + (wage * overtime));
		}
		// Pay without overtime 
		else {
			pay = (wage * hours);
		}// End if statement
		return pay;
	}// End earnings method
	
	   //***************************************************************
	   //
	   //  Method:       toString
	   // 
	   //  Description:  Override toString method in parent class to output similar output
	   //
	   //  Parameters:   N/A
	   //
	   //  Returns:      string object
	   //
	   //**************************************************************
    public String toString() {
        return String.format( "Hourly Employee: %s\n%s: $%,.2f; %s: %.2f ", super.toString(), "Hourly Wage", wage, "Hours Worked", hours);
    }// End toString
}// End HourlyEmployees class
