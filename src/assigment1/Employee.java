/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment1;

/**
 *
 * @author aadn7d
 */
public class Employee
{
    /*********************
	     Attributes
	*********************/
	float rate=30.0f;
	float taxrate=0.2f;
	int hours=45;
	float gross=0.0f;
	float tax=0.0f;
	float net=0.0f;
	float net_percent=0.0f;

	//End Attributes
        
        /********************
	     Constructors
	********************/
        public Employee()
        {
            
        }
        	
	/********************
	     Methods
	********************/
        public void menu()
        {
            System.out.println("1. Calculate Gross Pay");
            System.out.println("2. Calculate Tax");
            System.out.println("3. Calculate Net Pay");
            System.out.println("4. Calculate Net Percent");
            System.out.println("5. Display Employee ");

        }
         
	public void computeGross()
        { 
		gross=rate*hours;
                
	}

	protected void computeTax() 
        { 
		tax=gross*taxrate;
	}

	protected void computeNet()
        { 
		net=gross-tax;
	}

	protected void computeNetperc() 
        { 
		net_percent=(net/gross)*100;
	}
	
	protected void displayEmployee() 
        {
		System.out.println("Hours: " + new Integer(hours));
		System.out.println("Rate: " + new Float(rate));
		System.out.println("Gross: " + new Float(gross));
		System.out.println("Net: " + new Float(net));
		System.out.println("Net%: " + new Float(net_percent) + "%");
	}

} 
