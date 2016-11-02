package org.calculator.mainframe;

import java.awt.Font;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.calculator.classes.BasicMethods;

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
	private String mathInputString;
	private Object result;
	private KeyboardFocusManager manager2 = KeyboardFocusManager.getCurrentKeyboardFocusManager();
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
		manager2.addKeyEventDispatcher(new MyDispatcher());
		frmtdtxtfldNum.setFocusable(false);
		frmtdtxtfldNum_1.setFocusable(false);
		frmtdtxtfldResult.setFocusable(false);
		btnAddition.setFocusable(false);
		btnClear.setFocusable(false);
		btnDivision.setFocusable(false);
		btnExp.setFocusable(false);
		btnMultiplication.setFocusable(false);
		btnNewButton.setFocusable(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_2.setFocusable(false);
		btnNewButton_3.setFocusable(false);
		button1.setFocusable(false);
		button2.setFocusable(false);
		button3.setFocusable(false);
		button4.setFocusable(false);
		button5.setFocusable(false);
		button6.setFocusable(false);
		button7.setFocusable(false);
		button8.setFocusable(false);
		button9.setFocusable(false);
		button0.setFocusable(false);
		buttonComma.setFocusable(false);
		buttonEquals.setFocusable(false);
		btnPi.setFocusable(false);
		btnSubtraction.setFocusable(false);
		frame.setVisible(true);
	}
/*	public void addKeyListener() {
		button1.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_1) {
					frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"1");					
				}
			}

		});
	}*/
	public class MyDispatcher implements KeyEventDispatcher {

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"1");
			}
			if (e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"2");
			}
			if (e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"3");
			}
			if (e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"4");
			}
			if (e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"5");
			}
			if (e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"6");
			}
			if (e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"7");
			}
			if (e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"8");
			}
			if (e.getKeyCode() == KeyEvent.VK_9 || e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"9");
			}
			if (e.getKeyCode() == KeyEvent.VK_0 || e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"0");
			}
			if (e.getKeyCode() == KeyEvent.VK_COMMA) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+",");
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				equalButtonMethod();				
			}
			if (e.getKeyCode() == KeyEvent.VK_PLUS || e.getKeyCode() == KeyEvent.VK_ADD) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"+");
			}
			if (e.getKeyCode() == KeyEvent.VK_MINUS || e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"-");
			}
			if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"*");
			}
			if (e.getKeyCode() == KeyEvent.VK_DIVIDE) {
				frmtdtxtfldNum.setText(frmtdtxtfldNum.getText()+"/");
			}
			if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
				frmtdtxtfldNum.setText("");
			}
			if (e.getKeyCode() == KeyEvent.VK_DELETE) {
				frmtdtxtfldNum.setText("");
				frmtdtxtfldNum_1.setText("");
				frmtdtxtfldResult.setText("");
			}
		}
		
		return false;
	}
		
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
	public void equalButtonMethod () {
		mathInputString = frmtdtxtfldNum.getText();
		try {
			result = engine.eval(mathInputString);
			frmtdtxtfldResult.setText(""+result);
		} catch(Exception s) {
			s.getMessage();
		}
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
			equalButtonMethod();
		}
		
	}
}