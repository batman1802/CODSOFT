package com;

import java.util.Scanner;

public class GradeCalculator {

	 public static String GradeObtained(double marksPercentage){

	        if(marksPercentage>=90 || marksPercentage<=100 ){
	            return "A+";
	        }
	        else if(marksPercentage>=80 || marksPercentage <90){
	            return "A";
	        }
	        else if(marksPercentage>=70 || marksPercentage<80){
	return "B";
	        }
	        else if(marksPercentage>=60 || marksPercentage<70){
	            return "C";
	        }
	        else if(marksPercentage>=50 || marksPercentage<60){
	            return "D";
	        }

	        else if (marksPercentage>40 || marksPercentage<50){
	            return "E";
	        }
	        else {
	            return "F";
	        }
	    }
	    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    //Taking Marks from th eUser.

	    System.out.println("Enter the number of Objects: ");
	    int numOfSubjects = sc.nextInt();

	    double[] marks = new double[numOfSubjects];

	    for (int i=0; i<numOfSubjects; i++)
	    {
	        System.out.println("Enter the no of marks in " + (i +1) + " subject : " );
	        marks[i] = sc.nextDouble();
	    }

	    //Calculating the total no.of marks

	    double toatalMarks = 0;

	    for (double mark: marks)
	    {

	        toatalMarks += mark;
	    }

	    System.out.println("The total Marks Obtained are: " + toatalMarks);

	    //Calculating the Average Perecentage
	    double marksPercentage = (toatalMarks/(numOfSubjects*100))*100;

	    //Calculating Grade
	    String grade = GradeObtained(marksPercentage);


	    //displaying Results

	    System.out.println("The Results obtained are : ");
	    System.out.println("Total Marks: " + toatalMarks);
	    System.out.println("Average Percentage: "+ marksPercentage);
	    System.out.println("Grade: " + grade);

	    //Closing the Scanner
	    sc.close();
	    }
}
