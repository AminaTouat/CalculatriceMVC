/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package mvc;

/**
 *
 * @author TOUAT amina
 */
public class Mvc {
    
    public static void main(String[] args) {
    	
    	CalculatorView theView = new CalculatorView();
    	CalculatorViewB theViewB = new CalculatorViewB();
    	CalculatorViewS theViewS = new CalculatorViewS();
    	CalculatorModel theModel = new CalculatorModel();
        
        CalculatorController theController = new CalculatorController(theView,theModel,theViewB,theViewS);
        
        theView.setVisible(true);
        theViewB.setVisible(true);
        theViewS.setVisible(true);
        
        
    }
}