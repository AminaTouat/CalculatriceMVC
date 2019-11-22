/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package mvc;

/**
 *
 * @author TOUAT amina
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Le Controlleur fait la coordination des interactions entre la vue et le modèle

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorViewB theViewB;
	private CalculatorViewS theViewS;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel,CalculatorViewB theViewB,CalculatorViewS theViewS ) {
		this.theView = theView;
		this.theViewB = theViewB;
		this.theViewS = theViewS;
		this.theModel = theModel;
		
		this.theView.addCalculateListener(new CalculateListener());
		this.theViewB.addCalculateListener(new CalculateListenerB());
		this.theViewS.addCalculateListener(new CalculateListenerS());
		
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber = 0;
			
					
			try{
				String i = theView.i;
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				if(theView.i=="+") theModel.addTwoNumbers(firstNumber, secondNumber);
				if(theView.i=="-") theModel.substractTwoNumbers(firstNumber, secondNumber);
				if(theView.i=="*") theModel.multiplyTwoNumbers(firstNumber, secondNumber);
				if(theView.i=="/") theModel.divideTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
				theViewB.setCalcSolution(Integer.toBinaryString(theModel.getCalculationValue()));
				
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	class CalculateListenerB implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String firstNumber, secondNumber = "";
			
					
			try{
			
				firstNumber = theViewB.getFirstNumber();
				secondNumber = theViewB.getSecondNumber();
				int first = Integer.parseInt(firstNumber, 2);
				int second =  Integer.parseInt(secondNumber, 2);
				
				if(theViewB.i=="+") {
					theModel.addTwoNumbers(first, second);
					theViewB.setCalcSolution(Integer.toBinaryString(theModel.getCalculationValue()));
					theView.setCalcSolution(theModel.getCalculationValue());
				}
				else {
				if(theViewB.i=="-") theModel.substractTwoNumbers(first, second);
				if(theViewB.i=="*") theModel.multiplyTwoNumbers(first, second);
				if(theViewB.i=="/") theModel.divideTwoNumbers(first, second);
				theViewB.setCalcSolution(Integer.toBinaryString(theModel.getCalculationValue()));
				theView.setCalcSolution(theModel.getCalculationValue());
				}
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theViewB.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
	class CalculateListenerS implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int firstNumber, secondNumber,num ;
			try {
				String i = theViewS.i;
				if(i == "sin") {
					num = theViewS.getNum();
					theModel.sin(num);
				}
				else if(i=="cos") {
					num = theViewS.getNum();
					theModel.cos(num);
				}
				else if(i=="√") {
					num = theViewS.getNum();
					theModel.sqrt(num);
				}
				else if(i=="!") {
					num = theViewS.getNum();
					theModel.fact(num);
				}
				else{
				firstNumber = theViewS.getFirstNumber();
				secondNumber = theViewS.getSecondNumber();
				if(theViewS.i=="+") theModel.addTwoNumbersS(firstNumber, secondNumber);
				if(theViewS.i=="-") theModel.substractTwoNumbersS(firstNumber, secondNumber);
				if(theViewS.i=="*") theModel.multiplyTwoNumbersS(firstNumber, secondNumber);
				if(theViewS.i=="/") theModel.divideTwoNumbersS(firstNumber, secondNumber);
				if(theViewS.i=="^") theModel.pus(firstNumber, secondNumber);
			}
				theViewS.setCalcSolution(theModel.getCalculationValueS());
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theViewB.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
	}
	
}