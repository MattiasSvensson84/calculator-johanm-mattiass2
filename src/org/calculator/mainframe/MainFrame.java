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
		
		
		
	}
	public void addActionListener() {
		btnAddition.addActionListener(this);
		btnSubtraction.addActionListener(this);
		btnMultiplication.addActionListener(this);
		btnDivision.addActionListener(this);
		btnClear.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAddition) {
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
		}
		
	}
}
