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
	private BasicMethods bm = new BasicMethods();
	private JFormattedTextField frmtdtxtfldNum = new JFormattedTextField();
	private JFormattedTextField frmtdtxtfldNum_1 = new JFormattedTextField();
	private JFormattedTextField frmtdtxtfldResult = new JFormattedTextField();
	private JLabel lblResultLabel = new JLabel("result label:");
	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
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
		

		frmtdtxtfldNum.setText("num1");
		frmtdtxtfldNum.setBounds(41, 50, 389, 30);
		frame.getContentPane().add(frmtdtxtfldNum);
		
		frmtdtxtfldNum_1.setText("num2");
		frmtdtxtfldNum_1.setBounds(41, 100, 389, 30);
		frame.getContentPane().add(frmtdtxtfldNum_1);
		frmtdtxtfldResult.setText("result");
		frmtdtxtfldResult.setBounds(41, 151, 389, 30);
		
		frame.getContentPane().add(frmtdtxtfldResult);
		lblResultLabel.setBounds(41, 203, 184, 47);
		
		frame.getContentPane().add(lblResultLabel);
		frame.setVisible(true);
	}
	public void addActionListener() {
		btnAddition.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAddition) {
			String firstField = frmtdtxtfldNum.getText();
			String secondField = frmtdtxtfldNum_1.getText();
			double txt2dbl1 = Double.parseDouble(firstField);
			double txt2dbl2 = Double.parseDouble(secondField);
			double res = bm.add(txt2dbl1, txt2dbl2);
			lblResultLabel.setText("Result: "+res);
			System.out.println("Testresultat"+res);
		}
		
	}
}
