   import java.util.Scanner;  // Access the Scanner class
   import java.io.*;          // Access PrintWriter and related classes
   import java.io.FileReader; // Access FileReader
   import java.text.DecimalFormat; // Access decimal format class
   import java.util.ArrayList; // Access array list class


public class JadeJamesMelodyMonroe_4_05 {
   
   public static void main(String[ ] args) throws IOException {

      // Declarations
      final String EMPLOYEE_INPUT  = "EmployeeInput.txt";
      final String EMPLOYEE_PARAMETERS = "EmployeeParameters.txt";
      final String OUTPUT_FILE = "JadeJames&MelodyMonroe_4_05_Output.txt";   
   
      public void grossPay(int basePay, int hours) {
         
         int hours = 0;
         int basePay = 10;
         int grossPay = 0;
         
         if (hours <= 40) {
            grossPay = hours * basePay;
         }
         
         else if (hours <= 50) {
            grossPay = (40 * basePay) + ((hours - 40) * (basepay * 1.5));
         } 
         
         else {
            grossPay = (40 * basePay) + ((50 - 40) * (basepay * 1.5)) + ((hours - 50) * (basepay * 2.0));
         } 
         
      } //end grossPay

   
   } // End main  
} // End class   
