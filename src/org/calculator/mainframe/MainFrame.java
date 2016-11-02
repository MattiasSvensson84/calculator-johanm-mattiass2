package org.calculator.mainframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.calculator.classes.BasicMethods;
import javax.swing.JLabel;

public class MainFrame implements ActionListener {

	private BasicMethods bm = new BasicMethods();
	private JFrame frame;
	
	private JButton btnAddition = new JButton("+");
	private JButton btnSubtraction = new JButton("-");
	private JButton btnMultiplication = new JButton("X");
	private JButton btnDivision = new JButton("/");
	private JButton btnClear = new JButton("Clear");
	
	private JFormattedTextField frmtdtxtInputNum1 = new JFormattedTextField();
	private JFormattedTextField frmtdtxtInputNum2 = new JFormattedTextField();
	private JFormattedTextField frmtdtxtfldResult = new JFormattedTextField();

	private JLabel lblResultLabel = new JLabel("Result: ");
	private JLabel lblth = new JLabel("1st:");
	private JLabel lblSecondNumber = new JLabel("2nd:");
	private final JButton btnPi = new JButton("PI");
	private final JButton btnExp = new JButton("exp");
	private final JButton btnNewButton = new JButton("pow");
	private final JButton btnNewButton_1 = new JButton("sqrt");
	private final JButton btnNewButton_2 = new JButton("radians");
	private final JButton btnNewButton_3 = new JButton("degrees");
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

		btnMultiplication.setBounds(420, 263, 50, 25);
		
		frame.getContentPane().add(btnMultiplication);
		frame.getContentPane().add(btnDivision);
		frame.getContentPane().add(frmtdtxtInputNum1);
		frame.getContentPane().add(frmtdtxtInputNum2);
		frame.getContentPane().add(frmtdtxtfldResult);
		frame.getContentPane().add(lblResultLabel);
		frame.getContentPane().add(lblSecondNumber);
		frame.getContentPane().add(lblth);
		frame.getContentPane().add(btnClear);
		frame.setVisible(true);
		
		btnAddition.setBounds(420, 339, 50, 25);
		btnSubtraction.setBounds(420, 301, 50, 25);
		btnMultiplication.setBounds(420, 263, 50, 25);
		btnDivision.setBounds(420, 225, 50, 25);
		btnClear.setBounds(373, 415, 97, 25);
		
		frmtdtxtInputNum1.setText("");
		frmtdtxtInputNum1.setBounds(70, 50, 360, 30);
			
		frmtdtxtInputNum2.setText("");
		frmtdtxtInputNum2.setBounds(70, 100, 360, 30);
		
		frmtdtxtfldResult.setText("");
		frmtdtxtfldResult.setBounds(70, 143, 360, 30);
		
		
		lblResultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultLabel.setBounds(12, 143, 50, 30);
		
		lblSecondNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSecondNumber.setBounds(2, 107, 56, 16);
		
		lblth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblth.setBounds(6, 57, 56, 16);
		
		frame.getContentPane().add(btnNewButton_3);
		button1.setBounds(147, 225, 60, 25);
		
		frame.getContentPane().add(button1);
		button2.setBounds(219, 225, 60, 25);
		
		frame.getContentPane().add(button2);
		button3.setBounds(291, 225, 60, 25);
		
		frame.getContentPane().add(button3);
		button4.setBounds(147, 263, 60, 25);
		
		frame.getContentPane().add(button4);
		button5.setBounds(219, 263, 60, 25);
		
		frame.getContentPane().add(button5);
		button6.setBounds(291, 263, 60, 25);
		
		frame.getContentPane().add(button6);
		button7.setBounds(147, 301, 60, 25);
		
		frame.getContentPane().add(button7);
		button8.setBounds(219, 301, 60, 25);
		
		frame.getContentPane().add(button8);
		button9.setBounds(291, 301, 60, 25);
		
		frame.getContentPane().add(button9);
		buttonComma.setBounds(147, 339, 60, 25);
		
		frame.getContentPane().add(buttonComma);
		button0.setBounds(219, 339, 60, 25);
		
		frame.getContentPane().add(button0);
		buttonEquals.setBounds(420, 390, 50, 50);
		
		frame.getContentPane().add(buttonEquals);
		frame.setVisible(true);

		
		
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
		
	}

	public void actionPerformed(ActionEvent e) {
		/*if (e.getSource() == btnAddition) {
			try {
			String firstField = frmtdtxtInputNum1.getText();
			String secondField = frmtdtxtInputNum2.getText();
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
			String firstField = frmtdtxtInputNum1.getText();
			String secondField = frmtdtxtInputNum2.getText();
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
			String firstField = frmtdtxtInputNum1.getText();
			String secondField = frmtdtxtInputNum2.getText();
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
			String firstField = frmtdtxtInputNum1.getText();
			String secondField = frmtdtxtInputNum2.getText();
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
				frmtdtxtInputNum1.setText("");
				frmtdtxtInputNum2.setText("");
				frmtdtxtfldResult.setText("");
			} catch (Exception a) {
				a.getMessage();
			}

		}*/
		if (e.getSource() == btnAddition) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"+");
		}
		if (e.getSource() == btnSubtraction) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"-");
		}
		if (e.getSource() == btnMultiplication) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"*");
		}
		if (e.getSource() == btnDivision) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"/");
		}
		if (e.getSource() == button1) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"1");
		}
		if (e.getSource() == button2) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"2");
		}
		if (e.getSource() == button3) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"3");
		}
		if (e.getSource() == button4) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"4");
		}
		if (e.getSource() == button5) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"5");
		}
		if (e.getSource() == button6) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"6");
		}
		if (e.getSource() == button7) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"7");
		}
		if (e.getSource() == button8) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"8");
		}
		if (e.getSource() == button9) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"9");
		}
		if (e.getSource() == button0) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+"0");
		}
		if (e.getSource() == buttonComma) {
			frmtdtxtInputNum1.setText(frmtdtxtInputNum1.getText()+",");
		}
		if (e.getSource() == btnClear) {
			frmtdtxtInputNum1.setText("");
		}
		if (e.getSource() == buttonEquals) {
			frmtdtxtInputNum1.getText();

		}
		
	}
}
