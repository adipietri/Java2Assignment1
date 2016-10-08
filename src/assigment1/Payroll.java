/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment1;

import java.util.Scanner;

/**
 *
 * @author aadn7d
 */
public class Payroll {

    /**
     * @param args the command line arguments
     */
    
    static Employee[] employeeArray = new Employee[3];
    
    public static void main(String[] args) 
    {
        Payroll pyrll = new Payroll();
        pyrll.menu();
        // TODO code application logic here
    }
    
    public void menu() {
        int input;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Populate Employees:");
            System.out.println("2. Select Employee");
            System.out.println("3. Save Employee");
            System.out.println("4. Load Employee");
            System.out.println("5. Exit System");

            Scanner sc = new Scanner(System.in);
            
            input = sc.nextInt();

            if (input == 1) {
                populateEmployee();

            } else if (input == 2) {
                selectEmployee();

            } else if (input == 3) {
                saveEmployee();

            } else if (input == 4) {
                loadEmployee();

            } else if (input != 5) {
                System.out.println("Invalid Input");
            }

            
        } while (input != 5);
    }
    
    public void populateEmployee()
    {
        
        employeeArray[0] = new Hourly();
        employeeArray[1] = new Salary();
        employeeArray[2] = new Commission();
              
    }
    
    public void selectEmployee()
    {
       System.out.println("Please enter account 0, 1, or 2");
       Scanner sc = new Scanner(System.in);
       int selectedIndex;
       selectedIndex = sc.nextInt();
       employeeArray[selectedIndex].menu(); 
    }
    
    public void saveEmployee()
    {
        //save employees to file
    }
    
    public void loadEmployee()
    {
        //load employees from file
    }
}
