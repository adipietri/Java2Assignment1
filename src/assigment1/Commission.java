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
public class Commission extends Employee //will override computeGross
{

    @Override
    public void computeGross() {
        //Prompt for number of items sold
        //Prompt for unit price of item sold (we are selling widgets so just set a price of your choosing)
        //Commission Employees will get 50% of gross sales
        gross = rate * hours;
                       
    }

    Commission() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
