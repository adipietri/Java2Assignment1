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
public class Salary extends Employee //will override computeGross
{

    @Override
    public void computeGross() {
        gross = rate * hours;
        //Prompt for Staff or Executive
        //Set Gross salary to $50,000 for staff and $100,000 for executives
                        
    }

    Salary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
