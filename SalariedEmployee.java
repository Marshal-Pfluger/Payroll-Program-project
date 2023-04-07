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
//  Description:   Contains the SalariedEmployee class which inherits the employee class. 
//
//********************************************************************

// Start SalariedEmployee Class
public class SalariedEmployee extends Employee{
	// Declare private class variables
	private double weeklySalary;
	
	   //***************************************************************
	   //
	   //  Method:       SalariedEmployee
	   // 
	   //  Description:  SalariedEmployee constructor
	   //
	   //  Parameters:   String first, String last, String social, double weeklyWage
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	public SalariedEmployee(String first, String last, String social, double weeklyWage) {
		super(first, last, social);
		setWage(weeklyWage);
	}// End SalariedEmployee constructor
	
	   //***************************************************************
	   //
	   //  Method:       setWage
	   // 
	   //  Description:  Setter method for weeklySalary using ? : conditional operator to handle negative values.
	   //
	   //  Parameters:   double weeklyWage
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	public void setWage(double weeklyWage) {
		weeklySalary = weeklyWage > 0 ? weeklyWage : 0.0;
	}// End weeklySalary Setter
	
	   //***************************************************************
	   //
	   //  Method:       earnings
	   // 
	   //  Description:  Earnings method to return weekly salary. 
	   //
	   //  Parameters:   N/A
	   //
	   //  Returns:      double weeklySalary
	   //
	   //**************************************************************
	public double earnings() {
		return weeklySalary;
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
        return String.format( "Salaried Employee: %s", super.toString());
    }// End toString
}// End SalariedEmployee class