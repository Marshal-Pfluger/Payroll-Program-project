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
//  Description:   Contains the CommissionEmployee class which inherits the employee class. 
//
//********************************************************************

// Start CommissionEmployee class
public class CommissionEmployee extends Employee{
	// Declare private class variables
	private double grossSales;
	private double commissionRate;
	
	   //***************************************************************
	   //
	   //  Method:       CommissionEmployee
	   // 
	   //  Description:  Constructor for CommissionEmployee class
	   //
	   //  Parameters:   String first, String last, String social, double gross, double rate
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	public CommissionEmployee(String first, String last, String social, double gross, double rate) {
		super(first, last, social);
		setGrossSales(gross);
		setCommissionRate(rate);
	}// End Constructor 
	
	   //***************************************************************
	   //
	   //  Method:       setGrossSales
	   // 
	   //  Description:  Setter for grossSales
	   //
	   //  Parameters:   double gross
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************
	// Setter for grossSales
	public void setGrossSales(double gross) {
		grossSales = gross > 0.0 ? gross : 0.0;
	}// End setGrossSales
	
	   //***************************************************************
	   //
	   //  Method:       setCommissionRate
	   // 
	   //  Description:  Setter for commissionRate
	   //
	   //  Parameters:   double rate
	   //
	   //  Returns:      N/A
	   //
	   //**************************************************************

	public void setCommissionRate(double rate) {
		commissionRate = rate > 0.0 ? rate : 0.0;
	}// End setCommissionRate
	
	   //***************************************************************
	   //
	   //  Method:       earnings
	   // 
	   //  Description:  Earnings method to calculate pay and return value
	   //
	   //  Parameters:   N/A
	   //
	   //  Returns:      double weekly salary 
	   //
	   //**************************************************************
	// Earnings method to calculate pay and return value
	public double earnings() {
		return (grossSales * commissionRate);
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
        return String.format( "Commission Employee: %s\n%s: $%,.2f; %s: %.2f", super.toString(), "Gross Sales", grossSales, "Commission Rate", commissionRate);
    }// End toString
}// End CommissionEmployee class 