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
//  Description:   Contains the BasePlusCommissionEmployee class which inherits the employee class. 
//
//********************************************************************

// Start BasePlusCommissionEmployee class
public class BasePlusCommissionEmployee extends CommissionEmployee{
	// Declare private class variables
	private double baseSalary;
	
	   //***************************************************************
	   //
	   //  Method:       BasePlusCommissionEmployee
	   // 
	   //  Description:  Constructor for BasePlusCommissionEmployee class
	   //
	   //  Parameters:   String first, String last, String social, double gross, double rate, double base
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	public BasePlusCommissionEmployee(String first, String last, String social, double gross, double rate, double base) {
		super(first, last, social, gross, rate);
		setBaseSalary(base);
		
	}// End Constructor for BasePlusCommissionEmployee
	
	   //***************************************************************
	   //
	   //  Method:       setBaseSalary
	   // 
	   //  Description:  Setter method for baseSalary
	   //
	   //  Parameters:   double base
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	public void setBaseSalary(double base) {
		baseSalary = base > 0.0 ? base : 0.0;
	}// End baseSalary
	
	   //***************************************************************
	   //
	   //  Method:       earnings
	   // 
	   //  Description:  Earnings method override from parent CommissionEmployee
	   //
	   //  Parameters:   N/A
	   //
	   //  Returns:      double weekly salary
	   //
	   //**************************************************************
	public double earnings(){
		return (baseSalary + super.earnings());
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
        return String.format( "Base-salaried %s; %s: $%,.2f", super.toString(), "Base Salary", baseSalary);
    }// End toString
}// End BasePlusCommissionEmployee class