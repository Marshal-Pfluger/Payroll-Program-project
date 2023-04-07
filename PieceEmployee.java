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
//  Description:   Contains the PieceEmployee class which inherits the employee class. 
//
//********************************************************************

//Start PieceEmployee class
public class PieceEmployee extends Employee{
	// Declare private class variables
	private double wage;
	private int pieces;
	
	   //***************************************************************
	   //
	   //  Method:       PieceEmployee
	   // 
	   //  Description:  Constructor for PieceEmployee class
	   //
	   //  Parameters:   String first name, String last name, String social number, double pieceWage, int pieces
	   //
	   //  Returns:      N/A 
	   //
	   //**************************************************************
	public PieceEmployee(String first, String last, String social, double pieceWage, int pieces){
		super(first, last, social);
		setWage(pieceWage);
		setPieces(pieces);
	}//end constructor
	
	   //***************************************************************
	   //
	   //  Method:       setWage
	   // 
	   //  Description:  Setter method for wage using ? : conditional operator to handle negative values.
	   //
	   //  Parameters:   double pieceWage
	   //
	   //  Returns:      N/A 
	   //
	   //************************************************************** 
	public void setWage(double pieceWage){
		wage = pieceWage > 0.0 ? pieceWage : 0.0 ;
	}//end setWage
	
	   //***************************************************************
	   //
	   //  Method:       setPieces
	   // 
	   //  Description:  Setter method for pieces using ? : conditional operator to handle negative values.
	   //
	   //  Parameters:   int numPieces
	   //
	   //  Returns:      N/A 
	   //
	   //**************************************************************
	public void setPieces(int numPieces){
		pieces = numPieces > 0 ? numPieces : 0;
	}//end setPieces
	
	   //***************************************************************
	   //
	   //  Method:       earnings
	   // 
	   //  Description:  Earnings method to calculate pay for PieceEmployee
	   //
	   //  Parameters:   None
	   //
	   //  Returns:      double pay 
	   //
	   //**************************************************************
	public double earnings(){
		double pay = (wage * pieces);
		return pay;
	}//end earnings method
	
	   //***************************************************************
	   //
	   //  Method:       toString
	   // 
	   //  Description:  Override toString method in parent class to output similar output
	   //
	   //  Parameters:   None
	   //
	   //  Returns:      string object
	   //
	   //**************************************************************

    public String toString() {
        return String.format( "Piece Employee: %s\n%s: $%,.2f; %s: %d ", super.toString(), "Piece Wage", wage, "Number of Pieces", pieces);
    }// End toString
}// End PiecesEmployee class
		
		
		
		
	