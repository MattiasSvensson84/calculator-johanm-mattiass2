package org.calculator.mainframe;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.html.parser.Parser;

import org.calculator.classes.AdvancedMethods;
import org.calculator.classes.BasicMethods;

public class MainFrame implements ActionListener {

	private AdvancedMethods am = new AdvancedMethods();
	private BasicMethods bm = new BasicMethods();

	private JFrame frame;
	private JButton btnAddition = new JButton("+");
	private JButton btnSubtraction = new JButton("-");
	private JButton btnMultiplication = new JButton("X");
	private JButton btnDivision = new JButton("/");
	private JButton btnClear = new JButton("C");
	
	private JFormattedTextField frmtdtxtfldNum = new JFormattedTextField();
	private JFormattedTextField frmtdtxtfldNum_1 = new JFormattedTextField();
	private JFormattedTextField frmtdtxtfldResult = new JFormattedTextField();
	
	private JLabel lblResultLabel = new JLabel("Result: ");
	private JLabel lblth = new JLabel("1st:");
	private JLabel lblSecondNumber = new JLabel("2nd:");
	
	private final JButton btnPi = new JButton("PI");
	private final JButton btnExp = new JButton("exp");
	private final JButton btnPow = new JButton("pow");
	private final JButton btnSquare = new JButton("sqrt");
	private final JButton btnToRadians = new JButton("radians");
	private final JButton btnToDegree = new JButton("degrees");
	private final JButton button1 = new JButton("1");
	private final JButton button2 = new JButton("2");
	private final JButton button3 = new JButton("3");
	private final JButton button4 = new JButton("4");
	private final JButton button5 = new JButton("5");
	private final JButton button6 = new JButton("6");
	private final JButton button7 = new JButton("7");
	private final JButton button8 = new JButton("8");
	private final JButton button9 = new JButton("9");
	private final JButton buttonComma = new JButton(",");
	private final JButton button0 = new JButton("0");
	private final JButton buttonEquals = new JButton("=");
	private ScriptEngineManager manager = new ScriptEngineManager();
	private ScriptEngine engine = manager.getEngineByName("js"); 
	private double mathResult = 0;
	private String mathInputString;
	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
		addActionListener();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnAddition);
		frame.getContentPane().add(btnSubtraction);
		frame.getContentPane().add(btnMultiplication);
		frame.getContentPane().add(btnDivision);
		frame.getContentPane().add(frmtdtxtfldNum);
		frame.getContentPane().add(frmtdtxtfldNum_1);
		frame.getContentPane().add(frmtdtxtfldResult);
		frame.getContentPane().add(lblResultLabel);
		frame.getContentPane().add(lblSecondNumber);
		frame.getContentPane().add(lblth);
		frame.getContentPane().add(btnClear);
		frame.getContentPane().add(btnPi);
		frame.getContentPane().add(btnExp);
		frame.getContentPane().add(btnPow);
		frame.getContentPane().add(btnSquare);
		frame.getContentPane().add(btnToRadians);
		frame.getContentPane().add(btnToDegree);
		frame.getContentPane().add(button1);
		frame.getContentPane().add(button2);
		frame.getContentPane().add(button3);
		frame.getContentPane().add(button4);
		frame.getContentPane().add(button5);
		frame.getContentPane().add(button6);
		frame.getContentPane().add(button7);
		frame.getContentPane().add(button8);
		frame.getContentPane().add(button9);
		frame.getContentPane().add(buttonComma);
		frame.getContentPane().add(button0);
		frame.getContentPane().add(buttonEquals);
		frame.setVisible(true);
		
		btnAddition.setBounds(420, 339, 50, 25);
		btnSubtraction.setBounds(420, 301, 50, 25);
		btnMultiplication.setBounds(420, 263, 50, 25);
		btnDivision.setBounds(420, 225, 50, 25);
		btnPi.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPi.setBounds(12, 225, 50, 25);
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnExp.setBounds(12, 263, 50, 25);
		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnPow.setBounds(12, 301, 50, 25);
		btnSquare.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSquare.setBounds(69, 225, 50, 25);
		btnToRadians.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnToRadians.setBounds(69, 263, 50, 25);
		btnToDegree.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnToDegree.setBounds(69, 301, 50, 25);
		button1.setBounds(147, 225, 60, 25);
		button2.setBounds(219, 225, 60, 25);
		button3.setBounds(291, 225, 60, 25);
		button4.setBounds(147, 263, 60, 25);
		button5.setBounds(219, 263, 60, 25);	
		button6.setBounds(291, 263, 60, 25);		
		button7.setBounds(147, 301, 60, 25);	
		button8.setBounds(219, 301, 60, 25);	
		button9.setBounds(291, 301, 60, 25);		
		buttonComma.setBounds(147, 339, 60, 25);		
		button0.setBounds(219, 339, 60, 25);
		buttonEquals.setBounds(420, 390, 50, 50);
		btnClear.setBounds(291, 339, 60, 25);

		frmtdtxtfldNum.setText("");
		frmtdtxtfldNum.setBounds(70, 50, 360, 30);
		frmtdtxtfldNum_1.setText("");
		frmtdtxtfldNum_1.setBounds(70, 100, 360, 30);	
		frmtdtxtfldResult.setText("");
		frmtdtxtfldResult.setBounds(70, 143, 360, 30);
				
		lblResultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultLabel.setBounds(12, 143, 50, 30);
		lblSecondNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSecondNumber.setBounds(2, 107, 56, 16);
		lblth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblth.setBounds(6, 57, 56, 16);
		
		

	
		
	}
	public void addActionListener() {
		btnAddition.addActionListener(this);
		btnSubtraction.addActionListener(this);
		btnMultiplication.addActionListener(this);
		btnDivision.addActionListener(this);
		btnClear.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		buttonComma.addActionListener(this);
		buttonEquals.addActionListener(this);
		btnExp.addActionListener(this);
		btnPi.addActionListener(this);
		btnPow.addActionListener(this);
		btnToDegree.addActionListener(this);
		btnToRadians.addActionListener(this);
		btnSquare.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
	/*	if (e.getSource() == btnAddition) {
			try {
			String firstField = frmtdtxtfldNum.getText();
			String secondField = frmtdtxtfldNum_1.getText();
			double txt2dbl1 = Double.parseDouble(firstField);
			double txt2dbl2 = Double.parseDouble(secondField);
			double res = bm.add(txt2dbl1, txt2dbl2);
			frmtdtxtfldResult.setText(""+res);
			} catch (Exception a) {
				a.getMessage();
			}
		}
		if (e.getSource() == btnSubtraction) {
			try {
			String firstField = frmtdtxtfldNum.getText();
			String secondField = frmtdtxtfldNum_1.getText();
			double txt2dbl1 = Double.parseDouble(firstField);
			double txt2dbl2 = Double.parseDouble(secondField);
			double res = bm.subtract(txt2dbl1, txt2dbl2);
			frmtdtxtfldResult.setText(""+res);
			} catch (Exception a) {
				a.getMessage();
			}
		}
		if (e.getSource() == btnMultiplication) {
			try {
			String firstField = frmtdtxtfldNum.getText();
			String secondField = frmtdtxtfldNum_1.getText();
			double txt2dbl1 = Double.parseDouble(firstField);
			double txt2dbl2 = Double.parseDouble(secondField);
			double res = bm.multiplication(txt2dbl1, txt2dbl2);
			frmtdtxtfldResult.setText(""+res);
			} catch (Exception a) {
				a.getMessage();
			}
		}
		if (e.getSource() == btnDivision) {
			try {
			String firstField = frmtdtxtfldNum.getText();
			String secondField = frmtdtxtfldNum_1.getText();
			double txt2dbl1 = Double.parseDouble(firstField);
			double txt2dbl2 = Double.parseDouble(secondField);
			double res = bm.division(txt2dbl1, txt2dbl2);
			frmtdtxtfldResult.setText(""+res);
			} catch (Exception a) {
				a.getMessage();
			}
		}
		if (e.getSource() == btnClear) {
			try {
				frmtdtxtfldNum.setText("");
				frmtdtxtfldNum_1.setText("");
				frmtdtxtfldResult.setText("");
			} catch (Exception a) {
				a.getMessage();
			}
		}*/
		if (e.getSource() == btnExp){
			try {
				String firstField = frmtdtxtfldNum.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = am.exp(txt2dbl1);
				frmtdtxtfldResult.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}
		}
		
		if (e.getSource()== btnPi){
			try {
				String firstField = frmtdtxtfldNum.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = am.PI(txt2dbl1);
				frmtdtxtfldResult.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}		
		}
		
		if (e.getSource() == btnPow){
			try {
				String firstField = frmtdtxtfldNum.getText();
				String secondField = frmtdtxtfldNum_1.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double txt2dbl2 = Double.parseDouble(secondField);
				double res = am.pow(txt2dbl1, txt2dbl2);				
				frmtdtxtfldResult.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}	
		}
		
		if (e.getSource() == btnSquare){
			try {
				String firstField = frmtdtxtfldNum.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = am.sqrt(txt2dbl1);
				frmtdtxtfldResult.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}
		}
			
		if (e.getSource() == btnToDegree){
			try {
				String firstField = frmtdtxtfldNum.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = am.toDegrees(txt2dbl1);
				frmtdtxtfldResult.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}	
		}
		
		if (e.getSource() == btnToRadians){
			try {
				String firstField = frmtdtxtfldNum.getText();
				double txt2dbl1 = Double.parseDouble(firstField);
				double res = am.toRadians(txt2dbl1);
				frmtdtxtfldResult.setText(""+res);
				} catch (Exception a) {
					a.getMessage();
				}
		}
		
		if (e.getSource() == btnAddition) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"+");
		}
		if (e.getSource() == btnSubtraction) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"-");
		}
		if (e.getSource() == btnMultiplication) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"*");
		}
		if (e.getSource() == btnDivision) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"/");
		}
		if (e.getSource() == button1) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"1");
		}
		if (e.getSource() == button2) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"2");
		}
		if (e.getSource() == button3) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"3");
		}
		if (e.getSource() == button4) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"4");
		}
		if (e.getSource() == button5) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"5");
		}
		if (e.getSource() == button6) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"6");
		}
		if (e.getSource() == button7) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"7");
		}
		if (e.getSource() == button8) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"8");
		}
		if (e.getSource() == button9) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"9");
		}
		if (e.getSource() == button0) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"0");
		}
		if (e.getSource() == buttonComma) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+",");
		}
		if (e.getSource() == btnClear) {
			frmtdtxtfldNum.setText("");
		}
		if (e.getSource() == buttonEquals) {
			mathInputString = frmtdtxtfldNum.getText();
			//Expression expr = Parser.parse(mathInputString);
		}
		
	}
}