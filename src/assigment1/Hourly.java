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
public class Hourly extends Employee // will override ComputeGross
{

    /**
     *
     */
    @Override
    public void computeGross() 
    {
        //Prompt for hours
        //Prompt for rate
        //Calc OT at time and a half	
        gross = rate * hours;
                     
    }

    Hourly() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

}
