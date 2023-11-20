package calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFirstCalculatorInJava {
	
	// Making global static variables to access them further into the program
	private static JButton clear;
	private static JButton egal;
	private static JButton minus;
	private static JButton plus;
	private static JButton mlt;
	private static JButton div;
	private static JButton schimbasemn;
	private static JButton punct;
	private static JButton buton0;
	private static JButton buton1;
	private static JButton buton2;
	private static JButton buton3;
	private static JButton buton4;
	private static JButton buton5;
	private static JButton buton6;
	private static JButton buton7;
	private static JButton buton8;
	private static JButton buton9;
	private static JFrame gui;
	private static JTextField zonatext;
	private static double num1, num2, result;
	private static char operator;
	
	
public static void main(String[] args) {
		
		
		// Creating the functions for every button pressed
		class Listener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(e.getSource()==buton0) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("0"));
					else
						zonatext.setText("0");
				}
				
				if(e.getSource()==buton1) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("1"));
					else
						zonatext.setText("1");
				}
				
				if(e.getSource()==buton2) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("2"));
					else
						zonatext.setText("2");
				}
				
				if(e.getSource()==buton3) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("3"));
					else
						zonatext.setText("3");
				}

				if(e.getSource()==buton4) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("4"));
					else
						zonatext.setText("4");
				}

				if(e.getSource()==buton5) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("5"));
					else
						zonatext.setText("5");
				}

				if(e.getSource()==buton6) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("6"));
					else
						zonatext.setText("6");
				}

				if(e.getSource()==buton7) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("7"));
					else
						zonatext.setText("7");
				}

				if(e.getSource()==buton8) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("8"));
					else
						zonatext.setText("8");
				}
				
				if(e.getSource()==buton9) {
					if(!zonatext.getText().equals("0"))
					zonatext.setText(zonatext.getText().concat("9"));
					else
						zonatext.setText("9");
				}
				
				if(e.getSource()==punct) {
					if(!zonatext.getText().contains(".")) {
						zonatext.setText(zonatext.getText().concat("."));
					}
				}
				
				if(e.getSource()==schimbasemn) {
					double curent = Double.parseDouble(zonatext.getText());
					zonatext.setText(Double.toString(-curent));
				}
				
				
				if(e.getSource() == clear) {
					zonatext.setText("0");
					num1=num2=result=0;
				}
				
				if(e.getSource() == plus) {
					num1 = Double.parseDouble(zonatext.getText());
					System.out.println(num1);
					operator = '+';
					zonatext.setText("0");
				}
				
				if(e.getSource() == minus) {
					num1 = Double.parseDouble(zonatext.getText());
					System.out.println(num1);
					operator = '-';
					zonatext.setText("0");
				}
				
				if(e.getSource() == div) {
					num1 = Double.parseDouble(zonatext.getText());
					System.out.println(num1);
					operator = '/';
					zonatext.setText("0");
				}
				
				if(e.getSource() == mlt) {
					num1 = Double.parseDouble(zonatext.getText());
					System.out.println(num1);
					operator = '*';
					zonatext.setText("0");
				}
				
				if(e.getSource() == egal) {
					num2 = Double.parseDouble(zonatext.getText());
					System.out.println(num2);
					result = num2;
					System.out.println(num1 +" "+ num2 + " "+ result+"\n");
					switch(operator) {
						case '+':
							result = num1 + num2;
							System.out.println(num1 +" "+ num2 + " "+ result+"\n");
							break;
						case '-':
							result = num1 - num2;
							System.out.println(num1 +" "+ num2 + " "+ result+"\n");
							break;
						case '*':
							result = num1 * num2;
							System.out.println(num1 +" "+ num2 + " "+ result+"\n");
							break;
						case '/':
							// In case of division with 0 throw an exception
							try {
								if(num2==0) throw new ArithmeticException();
								result = num1 / num2;
								System.out.println(num1 +" "+ num2 + " "+ result+"\n");
							}
							catch(ArithmeticException exc) {
								zonatext.setText("!!! Can't divide with 0 !!!");
								return;
							}
							break;
					}
					operator = '0';
					System.out.println(result);
					if((result - Math.floor(result))==0) {
						int temp = (int) result;
						zonatext.setText(Integer.toString(temp));
						}
					else {
						zonatext.setText(Double.toString(result));
					}
					num1 = result;
					num2 = 0;
				}
				
			}
		}
		// Creating the GUI
		gui = new JFrame("Calculator");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setLayout(null);
		gui.getContentPane().setBackground(Color.black);
		gui.setSize(345, 394);
		
		//Creating the font
		Font font1 = new Font("SansSerif",Font.BOLD,20);
		
		// Creating the text zone
		zonatext = new JTextField();
		zonatext.setBackground(Color.gray);
		zonatext.setEditable(false);
		zonatext.setText("0");
		zonatext.setBounds(5, 5, 319, 93);
		
		// Creating the buttons
		egal = new JButton("=");
		egal.setBackground(Color.gray);
		egal.setBounds(245, 300, 80-1, 49);
		egal.setFont(font1);
		
		punct = new JButton(".");
		punct.setBackground(Color.gray);
		punct.setBounds(165, 300, 80-1, 49);
		punct.setFont(font1);
		
		buton0 = new JButton("0");
		buton0.setBackground(Color.gray);
		buton0.setBounds(85, 300, 80-1, 49);
		buton0.setFont(font1);
		
		schimbasemn = new JButton("+/-");
		schimbasemn.setBackground(Color.gray);
		schimbasemn.setBounds(5, 300, 80-1, 49);
		schimbasemn.setFont(font1);
		
		buton1 = new JButton("1");
		buton1.setBackground(Color.gray);
		buton1.setBounds(5, 250, 80-1, 49);
		buton1.setFont(font1);
		
		buton2 = new JButton("2");
		buton2.setBackground(Color.gray);
		buton2.setBounds(85, 250, 80-1, 49);
		buton2.setFont(font1);
		
		buton3 = new JButton("3");
		buton3.setBackground(Color.gray);
		buton3.setBounds(165, 250, 80-1, 49);
		buton3.setFont(font1);
		
		plus = new JButton("+");
		plus.setBackground(Color.gray);
		plus.setBounds(245, 250, 80-1, 49);
		plus.setFont(font1);
		
		buton4 = new JButton("4");
		buton4.setBackground(Color.gray);
		buton4.setBounds(5, 200, 80-1, 49);
		buton4.setFont(font1);
		
		buton5 = new JButton("5");
		buton5.setBackground(Color.gray);
		buton5.setBounds(85, 200, 80-1, 49);
		buton5.setFont(font1);
		
		buton6 = new JButton("6");
		buton6.setBackground(Color.gray);
		buton6.setBounds(165, 200, 80-1, 49);
		buton6.setFont(font1);
		
		minus = new JButton("-");
		minus.setBackground(Color.gray);
		minus.setBounds(245, 200, 80-1, 49);
		minus.setFont(font1);
		
		buton7 = new JButton("7");
		buton7.setBackground(Color.gray);
		buton7.setBounds(5, 150, 80-1, 49);
		buton7.setFont(font1);
		
		buton8 = new JButton("8");
		buton8.setBackground(Color.gray);
		buton8.setBounds(85, 150, 80-1, 49);
		buton8.setFont(font1);
		
		buton9 = new JButton("9");
		buton9.setBackground(Color.gray);
		buton9.setBounds(165, 150, 80-1, 49);
		buton9.setFont(font1);
		
		mlt = new JButton("X");
		mlt.setBackground(Color.gray);
		mlt.setBounds(245, 150, 80-1, 49);
		mlt.setFont(font1);
		
		div = new JButton("/");
		div.setBackground(Color.gray);
		div.setBounds(245, 100, 80-1, 49);
		div.setFont(font1);
		
		clear = new JButton("C");
		clear.setBackground(Color.gray);
		clear.setBounds(5, 100, 240-1, 49);
		clear.setFont(font1);
		
		
		// Adding the listener to our buttons
		Listener listener = new Listener();
		egal.addActionListener(listener);
		minus.addActionListener(listener);
		plus.addActionListener(listener);
		div.addActionListener(listener);
		mlt.addActionListener(listener);
		clear.addActionListener(listener);
		punct.addActionListener(listener);
		schimbasemn.addActionListener(listener);
		buton0.addActionListener(listener);
		buton1.addActionListener(listener);
		buton2.addActionListener(listener);
		buton3.addActionListener(listener);
		buton4.addActionListener(listener);
		buton5.addActionListener(listener);
		buton6.addActionListener(listener);
		buton7.addActionListener(listener);
		buton8.addActionListener(listener);
		buton9.addActionListener(listener);
		
		
		// Adding the components to our GUI
		gui.add(zonatext);
		
		gui.add(egal);
		gui.add(punct);
		gui.add(buton0);
		gui.add(schimbasemn);
		
		gui.add(buton1);
		gui.add(buton2);
		gui.add(buton3);
		gui.add(plus);
		
		gui.add(buton4);
		gui.add(buton5);
		gui.add(buton6);
		gui.add(minus);
		
		gui.add(buton7);
		gui.add(buton8);
		gui.add(buton9);
		gui.add(mlt);
		
		gui.add(div);
		gui.add(clear);
		
		
		
		zonatext.setFont(font1);
		zonatext.setHorizontalAlignment((int) JFrame.CENTER_ALIGNMENT);
		gui.setVisible(true);
		gui.setResizable(false);
	}
}