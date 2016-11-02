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

	private JFrame frame;
	private JButton btnAddition = new JButton("+");
	private JButton btnSubtraction = new JButton("-");
	private JButton btnMultiplication = new JButton("X");
	private JButton btnDivision = new JButton("/");
	private JButton btnClear = new JButton("Clear");
	private BasicMethods bm = new BasicMethods();
	private JFormattedTextField frmtdtxtfldNum = new JFormattedTextField();
	private JFormattedTextField frmtdtxtfldNum_1 = new JFormattedTextField();
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
		

		btnClear.setBounds(373, 415, 97, 25);
		frame.getContentPane().add(btnClear);
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
		if (e.getSource() == btnAddition) {
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
		}
		
	}
}
