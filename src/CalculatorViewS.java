/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package mvc;

/**
 *
 * @author TOUAT amina
 */


// Le seul travail de la vue est d'afficher ce que l'utilisateur voit
// La vue n'effectue pas d'opérations
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class CalculatorViewS extends JFrame{
private  JTextField saisir = new JTextField("0");
	private JButton b1= new JButton("1");
	private JButton b2= new JButton("2");
	private JButton b3= new JButton("3");
	private JButton b4= new JButton("4");
	private JButton b5= new JButton("5");
	private JButton b6= new JButton("6");
	private JButton b7= new JButton("7");
	private JButton b8= new JButton("8");
	private JButton b9= new JButton("9");
	private JButton b0= new JButton("0");
	private JButton addi= new JButton("+");
	private JButton sus= new JButton("-");
	private JButton egal= new JButton("=");
	private JButton multi= new JButton("*");
	private JButton div= new JButton("/");
	private JButton point= new JButton(".");
	private JButton c= new JButton("C");
	private JButton sin= new JButton("sin");
	private JButton cos= new JButton("cos");
	private JButton n= new JButton("n!");
	private JButton x= new JButton("x^y ");
	private JButton x1= new JButton("√x");
	public String i="";/*pour empêcher l'insertion de plusieurs opérations*/
	public int j=0;/*pour éviter d'insérer plus d'un point dans le même nombre*/
	public int s=0;
	CalculatorViewS(){


		JPanel calcPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Vue Scientifique");
        this.setResizable(false);
        this.setBounds(800, 0, 300, 400);
        // Ajouter une icone à la fenetre
		ImageIcon imgicon = new ImageIcon(
		new ImageIcon("IconCalculatrice.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
		this.setIconImage(imgicon.getImage());
		
		calcPanel.setLayout(null);
		saisir.setEnabled(false);
		saisir.setDisabledTextColor(Color.black);
		saisir.setBounds(20,10, 250,50);
	      calcPanel.add(saisir);
	        b1.setBounds(30, 70, 50, 30);
	        calcPanel.add(b1);
	        
	        b2.setBounds(85, 70, 50, 30);
	        calcPanel.add(b2);
	       
	        b3.setBounds(140, 70, 50, 30);
	        calcPanel.add(b3);
	        
	        b4.setBounds(30, 105, 50, 30);
	        calcPanel.add(b4);
	        
	        b5.setBounds(85, 105, 50, 30);
	        calcPanel.add(b5);
	        
	        b6.setBounds(140, 105, 50, 30);
	        calcPanel.add(b6);
	        
	        b7.setBounds(30, 140, 50, 30);
	        calcPanel.add(b7);
	        
	        b8.setBounds(85, 140, 50, 30);
	        calcPanel.add(b8);
	        
	        b9.setBounds(140, 140, 50, 30);
	        calcPanel.add(b9);
	        
	        b0.setBounds(30, 175, 50, 30);
	        calcPanel.add(b0);
	     
	        addi.setBounds(195, 70, 50, 30);
	        calcPanel.add(addi);
	        
	        sus.setBounds(195, 105, 50, 30);
	        calcPanel.add(sus);
	        
	        egal.setBounds(85, 175, 50, 30);
	        calcPanel.add(egal);
	        
	        multi.setBounds(195, 140, 50, 30);
	        calcPanel.add(multi);
	        
	        div.setBounds(195, 175, 50, 30);
	        calcPanel.add(div);
	        
	        point.setBounds(140, 175, 50, 30);
	        calcPanel.add(point);
	        
	        c.setBounds(85, 210, 50, 30);
	        calcPanel.add(c);
	        
	        sin.setBounds(30, 245, 60, 40);
	        calcPanel.add(sin);
	        
	        cos.setBounds(95, 245, 60, 40);
	        calcPanel.add(cos);
	        
	        n.setBounds(160, 245, 60, 40);
	        calcPanel.add(n);
	        
	        x.setBounds(35, 290, 60, 40);
	        calcPanel.add(x);
	        
	        x1.setBounds(100, 290, 60, 40);
	        calcPanel.add(x1);
		this.add(calcPanel);
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
            	if(s==0) {
            	saisir.setText("");
            	s++;}
            	saisir.setText(saisir.getText()+"1");
            }
        });
	 b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"2");
            }
        });
	 b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"3");
            }
        });
	 b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"4");
            }
        });
	 b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"5");
            }
        });
	 b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"6");
            }
        });
	 b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"7");
            }
        });
	 b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"8");
            }
        });
	 b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"9");
            }
        });
	 b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(s==0) {
	            	saisir.setText("");
	            	s++;}
            	saisir.setText(saisir.getText()+"0");
            }
        });
	 addi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(i=="") {
                	saisir.setText(saisir.getText()+"+");
                	i="+";
                	j=0;
                	s++;
                
            }
            }
        });
	 sus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	  if(i=="") {
            		  saisir.setText(saisir.getText()+"-");
	                	i="-";
	                	j=0;
	                	s++;
	                
	            }
            }
        });
	 multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	  if(i=="") {
            		  saisir.setText(saisir.getText()+"*");
	                	i="*";
	                	j=0;
	                	s++;
	                
	            }
            }
        });
	 div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	  if(i=="") {
            		  saisir.setText(saisir.getText()+"/");
	                	i="/";
	                	j=0;
	                	s++;
	                
	            }
            }
        });
	 point.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(j==0) {
            		saisir.setText(saisir.getText()+".");
            	j++;
            	s++;
            	}
            }
        });
		  c.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	saisir.setText("");
	                i="";
	                j=0;
	            }
	        });
		  sin.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	saisir.setText("sin");
	     
	                i="sin";
	                j=0;
	                s++;
	            }
	        });
		  cos.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	saisir.setText("cos");
	                i="cos";
	                j=0;
	            }
	        });
		  n.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	saisir.setText("!");
	                i="!";
	                j=0;
	                s++;
	            }
	        });
		  x.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	saisir.setText(saisir.getText()+"^");
	                i="^";
	                j=0;
	                s++;
	            }
	        });
		  x1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	saisir.setText("√");
	                i="√";
	                j=0;
	                s++;
	            }
	        });
		  
		  
	}

	public int getFirstNumber(){

		String formula = saisir.getText();
    	String first = formula.substring(0, formula.indexOf(i));
		return Integer.parseInt(first);

	}

	public int getSecondNumber(){

		String formula = saisir.getText();
    	String second = formula.substring(formula.indexOf(i)+1);
		return Integer.parseInt(second);

	}
	public int getNum() {
		String formula = saisir.getText();
    	String first;
    	if(i=="sin") first = formula.substring(formula.indexOf("n")+1);
    	else if(i=="cos") first = formula.substring(formula.indexOf("s")+1);
    	else if(i=="√") first = formula.substring(formula.indexOf("√")+1);
    	else if(i=="n!") first = formula.substring(formula.indexOf("!")+1);
    	else	first = formula.substring(formula.indexOf(i)+1);
		return Integer.parseInt(first);
	}

	public int getCalcSolution(){

		return Integer.parseInt(egal.getText());

	}

	public void setCalcSolution(double solution){
		i="";
		j=0;
		saisir.setText(Double.toString(solution));

	}

	// Si on clique sur le bouton, on execute une méthode dans le controlleur

            void addCalculateListener(ActionListener listenForCalcButton){

            	egal.addActionListener(listenForCalcButton);

	}
           



	void displayErrorMessage(String errorMessage){

		JOptionPane.showMessageDialog(this, errorMessage);

	}
	



}
