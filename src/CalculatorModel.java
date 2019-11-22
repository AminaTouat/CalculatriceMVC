/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package mvc;

/**
 *
 * @author TOUAT amina
 */

// Le modèle effectue toutes les opérations nécessaires.
//Le modèle ne sait pas que la vue existe

public class CalculatorModel {

    private int calculationValue;
    private double calculationValueS;
    
    

    public void addTwoNumbers(int firstNumber, int secondNumber){
        calculationValue = firstNumber + secondNumber;
    }
    public void substractTwoNumbers(int firstNumber, int secondNumber) {
    	calculationValue = firstNumber - secondNumber ;
    	
    }
    public void multiplyTwoNumbers(int firstNumber, int secondNumber) {
    	calculationValue = firstNumber * secondNumber ;
    	
    }
    public void divideTwoNumbers(int firstNumber, int secondNumber) {
    	calculationValue = firstNumber / secondNumber ;
    	
    }

    public void sin(int firstNumber) {
    	 
     calculationValueS = (Math.sin(firstNumber));
    }
    public void cos(int firstNumber) {
    	calculationValueS = (Math.cos(firstNumber));
    }
    public void sqrt(int firstNumber) {
    	calculationValueS = (Math.sqrt(firstNumber));
    }
    public void fact(int firstNumber) {
    	int i,fact = 1;
    	for(i=1;i<=firstNumber;i++){    
    	      fact=fact*i;    
    	  }
        calculationValueS = fact;
    }
    public void addTwoNumbersS(int firstNumber, int secondNumber){
        calculationValueS = firstNumber + secondNumber;
    }
    public void substractTwoNumbersS(int firstNumber, int secondNumber) {
    	calculationValueS = firstNumber - secondNumber ;
    	
    }
    public void multiplyTwoNumbersS(int firstNumber, int secondNumber) {
    	calculationValueS = firstNumber * secondNumber ;
    	
    }
    public void divideTwoNumbersS(int firstNumber, int secondNumber) {
    	calculationValueS = firstNumber / secondNumber ;
    	
    }
    public void pus (int firstNumber, int secondNumber) {
    	calculationValueS = (int) Math.pow(firstNumber, secondNumber);
    }
  
    
    
    public int getCalculationValue(){
        return calculationValue;        

    } 
    public double getCalculationValueS(){
        return calculationValueS;        

    } 
   
}
