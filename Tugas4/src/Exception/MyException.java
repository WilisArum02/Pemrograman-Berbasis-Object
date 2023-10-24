/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author HP
 */
public class MyException extends Exception {
    //store account information
    private static int accno[] = {1001, 1002, 1003, 1004, 1005};
  
    private static String name[] =
                 {"Oryza", "Saf", "Andin", "Agus", "Pipit"};
  
    private static double bal[] =
         {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
  
    // default constructor
    MyException() {    }
  
    // parameterized constructor
    MyException(String str) { super(str); }
  
    // write main()
    public static void main(String[] args){
        try  {
            // display the heading for the table
            System.out.println("ACCNO" + "\t" + "CUSTOMER" +
                                           "\t" + "BALANCE");
  
            // display the actual account information
            for (int i = 0; i < 5 ; i++)
            {
                System.out.println(accno[i] + "\t" + name[i] +
                                                "\t" + bal[i]);
  
                // display own exception if balance < 1000
                if (bal[i] > 1000 && bal[i]< 2000)
                {
                    MyException me =
                       new MyException("Balance more than 1000 less than 2000");
                    throw me;
                }
            }
        } //end of try
        
        catch (MyException e) {
            e.printStackTrace();
        }
    }
    
}
