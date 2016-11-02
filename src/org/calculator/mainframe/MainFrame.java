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
import java.awt.Font;

public class MainFrame implements ActionListener {

	private JFrame frame;
	private JButton btnAddition = new JButton("+");
	private JButton btnSubtraction = new JButton("-");
	private JButton btnMultiplication = new JButton("X");
	private JButton btnDivision = new JButton("/");
	private JButton btnClear = new JButton("C");
	private BasicMethods bm = new BasicMethods();
	private JFormattedTextField frmtdtxtfldNum = new JFormattedTextField();
	private JFormattedTextField frmtdtxtfldNum_1 = new JFormattedTextField();
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
	private final JButton button = new JButton("1");
	private final JButton button_1 = new JButton("2");
	private final JButton button_2 = new JButton("3");
	private final JButton button_3 = new JButton("4");
	private final JButton button_4 = new JButton("5");
	private final JButton button_5 = new JButton("6");
	private final JButton button_6 = new JButton("7");
	private final JButton button_7 = new JButton("8");
	private final JButton button_8 = new JButton("9");
	private final JButton button_9 = new JButton(",");
	private final JButton button_10 = new JButton("0");
	private final JButton button_11 = new JButton("=");
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
		
		btnAddition.setBounds(420, 339, 50, 25);
		frame.getContentPane().add(btnAddition);
		

		btnSubtraction.setBounds(420, 301, 50, 25);
		frame.getContentPane().add(btnSubtraction);
		

		btnMultiplication.setVerticalAlignment(SwingConstants.TOP);

		btnMultiplication.setBounds(420, 263, 50, 25);
		frame.getContentPane().add(btnMultiplication);
		

		btnDivision.setBounds(420, 225, 50, 25);
		frame.getContentPane().add(btnDivision);
		

		frmtdtxtfldNum.setText("");
		frmtdtxtfldNum.setBounds(70, 50, 360, 30);
		frame.getContentPane().add(frmtdtxtfldNum);
		
		frmtdtxtfldNum_1.setText("");
		frmtdtxtfldNum_1.setBounds(70, 100, 360, 30);
		frame.getContentPane().add(frmtdtxtfldNum_1);
		frmtdtxtfldResult.setText("");
		frmtdtxtfldResult.setBounds(70, 143, 360, 30);
		
		frame.getContentPane().add(frmtdtxtfldResult);
		lblResultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblResultLabel.setBounds(12, 143, 50, 30);
		
		frame.getContentPane().add(lblResultLabel);
		

		lblSecondNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSecondNumber.setBounds(2, 107, 56, 16);
		frame.getContentPane().add(lblSecondNumber);
		

		lblth.setHorizontalAlignment(SwingConstants.RIGHT);
		lblth.setBounds(6, 57, 56, 16);
		frame.getContentPane().add(lblth);
		

		btnClear.setBounds(291, 339, 60, 25);
		frame.getContentPane().add(btnClear);
		btnPi.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnPi.setBounds(12, 225, 50, 25);
		
		frame.getContentPane().add(btnPi);
		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnExp.setBounds(12, 263, 50, 25);
		
		frame.getContentPane().add(btnExp);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.setBounds(12, 301, 50, 25);
		
		frame.getContentPane().add(btnNewButton);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.setBounds(69, 225, 50, 25);
		
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2.setBounds(69, 263, 50, 25);
		
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_3.setBounds(69, 301, 50, 25);
		
		frame.getContentPane().add(btnNewButton_3);
		button.setBounds(147, 225, 60, 25);
		
		frame.getContentPane().add(button);
		button_1.setBounds(219, 225, 60, 25);
		
		frame.getContentPane().add(button_1);
		button_2.setBounds(291, 225, 60, 25);
		
		frame.getContentPane().add(button_2);
		button_3.setBounds(147, 263, 60, 25);
		
		frame.getContentPane().add(button_3);
		button_4.setBounds(219, 263, 60, 25);
		
		frame.getContentPane().add(button_4);
		button_5.setBounds(291, 263, 60, 25);
		
		frame.getContentPane().add(button_5);
		button_6.setBounds(147, 301, 60, 25);
		
		frame.getContentPane().add(button_6);
		button_7.setBounds(219, 301, 60, 25);
		
		frame.getContentPane().add(button_7);
		button_8.setBounds(291, 301, 60, 25);
		
		frame.getContentPane().add(button_8);
		button_9.setBounds(147, 339, 60, 25);
		
		frame.getContentPane().add(button_9);
		button_10.setBounds(219, 339, 60, 25);
		
		frame.getContentPane().add(button_10);
		button_11.setBounds(420, 390, 50, 50);
		
		frame.getContentPane().add(button_11);
		frame.setVisible(true);
	}
	public void addActionListener() {
		btnAddition.addActionListener(this);
		btnSubtraction.addActionListener(this);
		btnMultiplication.addActionListener(this);
		btnDivision.addActionListener(this);
		btnClear.addActionListener(this);
		
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
		if (e.getSource() == btnAddition) {
			frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"+");
			
		}
		
	}
}
