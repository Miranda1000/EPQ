// Create and add program to the package called calculator

package calculator;

// Import Java Swing package. This program will allow us to create a GUI

import javax.swing.*; // [https://docs.oracle.com/javase/tutorial/uiswing/start/about.html]

// Import the Java AWT package. This will allow us to customise the GUI

import java.awt.*;

// Import the action listener and action event classes which are necessary to read the user input

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Import the array list class to allow an array list to be created and used to store the user input of the buttons.

import java.util.ArrayList;





// Create a Java class
// The class should inherit attributes and methods from the JFrame class
// The class should implement the interface action listener

public class CalculatorV13 extends JFrame implements ActionListener {
	
	// Create a serial version user ID

	private static final long serialVersionUID = 1L;
	
	// Create variables outside the scope of the constructor to store the buttons
	
	// Numbers
	
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	// Operators
	
	JButton bPlus, bMinus, bMultiply, bDivide;
	
	// Other
	
	JButton bEquals, bDecimalPoint;
	
	// Clear
	
	JButton bC, bAC; 
	
	// Create a name for the text field outside the scope of the constructor to output the buttons pressed and the result
	// The variable TXT is static to make it a class variable so it has a scope of the whole class.
	
	static JTextField txt = new JTextField ("", 30); // [https://docs.oracle.com/javase/tutorial/uiswing/components/textfield.html]
	
	// Create an arrayList called calculations.
	// This will store the user input so the final calculation could take place.
	// An array list is used instead of an array as an array list is flexible and has no fixed size.
	// The array list calculations is static to make it a class variable so it has the scope of the whole class.
	
	static ArrayList<String> calculations = new ArrayList<String>(); 
	
	
	
	

	// Create a constructor to initialise attributes for the class
	
	public CalculatorV13 () {

		// Set a size for the window of 400 pixels by 500 pixels
		
		setSize (400, 500);
		
		// Set resizable to false.
		// This means the screen remains in a fixed position so the buttons don't move
		
		setResizable (false);  // [Source: https://stackoverflow.com/questions/1840113/is-there-any-way-to-make-a-window-fixed]
	
		// Set a title called calculator for the window
		
		setTitle ("Calculator");

		// Set the layout null for the window to allow the buttons to be placed manually
		
		setLayout(null);

		// Choose a close operation for the window. Exit on close means exit when the user presses X.
		
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		
		

		// Create the buttons and their icons
		
		// Each button is create with their icon
		// The font of each icon is ariel font, 20 pixels and is in bold.
		
		// Numbers
		
		JButton b0 = new JButton ("0");
		b0.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b1 = new JButton ("1");
		b1.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b2 = new JButton ("2");
		b2.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b3 = new JButton ("3");
		b3.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b4 = new JButton ("4");
		b4.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b5 = new JButton ("5");
		b5.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b6 = new JButton ("6");
		b6.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b7 = new JButton ("7");
		b7.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b8 = new JButton ("8");
		b8.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton b9 = new JButton ("9");
		b9.setFont(new Font("Ariel", Font.BOLD, 20));
		
		// Operators
		
		JButton bPlus = new JButton ("+");
		bPlus.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton bMinus = new JButton ("-");
		bMinus.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton bMultiply = new JButton ("*");
		bMultiply.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton bDivide = new JButton ("/");
		bDivide.setFont(new Font("Ariel", Font.BOLD, 20));
		
		// Other
		
		JButton bEquals = new JButton ("=");
		bEquals.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton bDecimalPoint = new JButton (".");
		bDecimalPoint.setFont(new Font("Ariel", Font.BOLD, 20));
		
		// Clear
		
		JButton bC = new JButton ("C");
		bC.setFont(new Font("Ariel", Font.BOLD, 20));
		JButton bAC = new JButton ("AC");
		bAC.setMargin(new Insets(0, 0, 0, 0));
		bAC.setFont(new Font("Ariel", Font.BOLD, 20));
		
		
		
		
		// Place each button in the correct place using the set bounds function
		// (x co-ordinate, y co-ordinate, width, height)
		
		// Numbers
		
		b0.setBounds (100, 380, 50, 50);
		b1.setBounds (30, 310, 50, 50);
		b2.setBounds (100, 310, 50, 50);
		b3.setBounds (170, 310, 50, 50);
		b4.setBounds (30, 240, 50, 50);
		b5.setBounds (100, 240, 50, 50);
		b6.setBounds (170, 240, 50, 50);
		b7.setBounds (30, 170, 50, 50);
		b8.setBounds (100, 170, 50, 50);
		b9.setBounds (170, 170, 50, 50);
		
		// Operators 
		
		bPlus.setBounds (240, 240, 50, 50);
		bMinus.setBounds (310, 240, 50, 50);
		bMultiply.setBounds (240, 310, 50, 50);
		bDivide.setBounds (310, 310, 50, 50);
		
		// Other
		
		bDecimalPoint.setBounds (240, 380, 50, 50);
		bEquals.setBounds (310, 380, 50, 50);
		
		// Clear
		
		bC.setBounds (240, 170, 50, 50);
		bAC.setBounds (310, 170, 50, 50);
		
		
		
		
		
		
		// Display the buttons by adding them to the JFrame
		
		add (b0);
		add (b1);
		add (b2);
		add (b3);
		add (b4);
		add (b5);
		add (b6);
		add (b7);
		add (b8);
		add (b9);
		
		add (bPlus);
		add (bMinus);
		add (bMultiply);
		add (bDivide);
		
		add (bDecimalPoint);
		add (bEquals);
		
		add (bC);
		add (bAC);
		
		
		
		// Create, position and display a text field
		
		txt.setBounds (30, 50, 330, 100);
		txt.setFont(new Font("Ariel", Font.BOLD, 20));
		txt.setEditable (false);
		txt.setBackground(Color.WHITE);
		add (txt);
		
		// Display the window
		
		setVisible (true);
		

		
		
		
		// Create an action listener for the button 0
		
		ActionListener num0 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "0"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/ 
				
				txt.setText(txt.getText() +"0");
				
				// Add "0" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("0");
				
			}
						
		};
		
		// Create an action listener for the button 1
		
		ActionListener num1 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "1"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText() + "1");
				
				// Add "1" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("1");
				
			}
		};
		
		// Create an action listener for the button 2
		
		ActionListener num2 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "2"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "2");
				
				// Add "2" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("2");
				
			}

		};
		
		// Create an action listener for the button 3
		
		ActionListener num3 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "3"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "3");
				
				// Add "3" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("3");
				
			}
			
		};
		
		// Create an action listener for the button 4
		
		ActionListener num4 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "4"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "4");
				
				// Add "4" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("4");
				
			}

		};
		
		// Create an action listener for the button 5
		
		ActionListener num5 = new ActionListener () {
					
			// Create a method for what to do for this action listener
					
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "5"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
						
				txt.setText(txt.getText()+ "5");
				
				// Add "5" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("5");
						
			}
					
		};
		
		// Create an action listener for the button 6
		
		ActionListener num6 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "6"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "6");
				
				// Add "6" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("6");
				
			}
		
		};
		
		// Create an action listener for the button 7

		ActionListener num7 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "7"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "7");
				
				// Add "7" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("7");
				
			}
		};
		
		// Create an action listener for the button 8

		ActionListener num8 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "8"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "8");
				
				// Add "8" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("8");
				
			}

		};
		
		// Create an action listener for the button 9

		ActionListener num9 = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the number "9"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "9");
				
				// Add "9" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("9");
				
			}

		};
		
		// Create an action listener for the plus button

		ActionListener plus = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the symbol "+"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "+");
				
				// Add "+" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("+");
				
				
			}
			
		};
		
		// Create an action listener for the minus button

		ActionListener minus = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the symbol "-"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "-");
				
				// Add "-" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("-");
				
			}
		};
		
		// Create an action listener for the multiply button

		ActionListener multiply = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the symbol "*"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "*");
				
				// Add "*" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("*");
				
			}
			
		};
		
		// Create an action listener for the divide button

		ActionListener divide = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the symbol "/"
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "/");
				
				// Add "/" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("/");
				
			}

		};
		
		// Create an action listener for the decimal point button

		ActionListener decimalPoint = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the symbol "."
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ ".");
				
				// Add "." to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add(".");
				
			}
		};
		
		// Create an action listener for the AC button

		ActionListener AC = new ActionListener () {
					
			// Create a method for what to do for this action listener
					
			public void actionPerformed (ActionEvent ae) {
				
				// Clear the screen
						
				txt.setText("");
						
				// Clear the calculations array 
				
				calculations.clear();
						
			}
		};
		
		// Create an action listener for the AC button

		ActionListener C = new ActionListener () {
							
			// Create a method for what to do for this action listener
							
			public void actionPerformed (ActionEvent ae) {
				
				// Find the length of the array list calculations
				
				int length = calculations.size();
				
				// Remove the last element in calculations array list
				
				calculations.remove(length-1);
				
				// Create a variable n to store the new text
				
				String n = ""; 
				
				// Create a for loop to add everything back into the variable n to display the new text to the user.
				
				for (int m = 0; m < calculations.size(); m++) {
					
					n = n + calculations.get(m);
				      
				}			
				
				// Display the new text in the variable n
				
				txt.setText(n);
								
				
								
			}
		};
				
		
		// Create an action listener for the equals button

		ActionListener equals = new ActionListener () {
			
			// Create a method for what to do for this action listener
			
			public void actionPerformed (ActionEvent ae) {
				
				// Display in the text field the text currently there and the symbol "="
				// For this line of code I adapted similar code from this website:
				// http://embscomputerart.com/java-gui-graphical-user-interface-calculator-program/
				
				txt.setText(txt.getText()+ "=");
				
				// Add "=" to the array list called calculations.
				// This will store the user input to allow the final calculation to take place.
				// I used this website below to use the right syntax to add to an array list.
				// Source: https://www.w3schools.com/java/java_arraylist.asp
				
				calculations.add("=");

				// Call the method perform calculation which will work out and output the answer.
				
				performCalculation ();
						
			}
		};
		
		
		
		
		
		
		// Link each button to their relevant action listeners

		b0.addActionListener (num0);
		b1.addActionListener (num1);
		b2.addActionListener (num2);
		b3.addActionListener (num3);
		b4.addActionListener (num4);
		b5.addActionListener (num5);
		b6.addActionListener (num6);
		b7.addActionListener (num7);
		b8.addActionListener (num8);
		b9.addActionListener (num9);
		bPlus.addActionListener (plus);
		bMinus.addActionListener (minus);
		bMultiply.addActionListener (multiply);
		bDivide.addActionListener (divide);
		bDecimalPoint.addActionListener (decimalPoint);
		bEquals.addActionListener (equals);
		bAC.addActionListener(AC);
		bC.addActionListener(C);
		
		
		
		
	} 
	
	// Create a method called performCalculation, which will carry out the calculation
	// A static method that does NOT need to be accessed by objects
	// Void method does NOT need to return a value
	
	static void performCalculation() {
		
		
		
		
		// Create some arrays and variables for this part of the method
		
		// Create an array of numbers
		
		String [] numbers = {"0","1","2","3","4","5","6","7","8","9"};
		
		// Create an array of operators
		
		String [] operators = {"+", "-", "*", "/", "="};
		
		// Create a variable to store the item
		
		String item = "";
		
		// Create a variable to store the previous item
		
		String previousItem = "";
		
		// Create a variable to store the index of the first digit of a number after an operator
		
		int firstNumberIndex = 0;
		
		// Create a variable to store the index of the last digit of a number before an operator
		
		int finalNumberIndex = 0;
		
		// Create a counter variable to control how many numbers are stored in the array
		
		int counter = 0;
		
		// Create a string num1 to store the string value of the first number
		
	    String num1 = "";
	    
	    // Create a string num2 to store the string value of the second number
	    
		String num2 = "";
		
		// Create a double variable number1 to store the decimal value of the first number 
		
		double number1 = 0;
		
		// Create a double variable number2 to store the decimal value of the second number
		
		double number2 = 0;
		
		// Create a double variable result to store the result of the calculation
		
		double result = 0;
		
		// Create a variable operatorPosition to store the position of the operator in the calculation.
		
		int operatorPositon = 0;
		
		
		
		
		
		
		
		
		// Create a for loop to loop through the calculations array.
		// This loops through the array storing the user input.
				
		for (int i = 0; i < calculations.size(); i++) {
			
			// Get the corresponding item in the array and save to the variable currentItem
			
			String currentItem = calculations.get(i);
			
			// Set the boolean foundUseOFItem to false
			
			boolean foundUseOfItem = false;
			
			
			
			
			// Create a while loop
			// The purpose of the while loop is to find out whether the item in the array is a number, an operator or a decimal point
			
			while  (foundUseOfItem == false) {
				
				
				
				// First of all, see if the element is a number
				// For each element in the array called numbers see if the element exists in the array.
				// If true, the element is a number
				// If false, the element is not a number 
				      
				for (String element : numbers) { 
					
					// If the element is found in the array called numbers
					
					if (element == currentItem) {
						
						// Set the value of previousItem to the value of the current item
						
						previousItem = item;
						
						// Set the item to a number
						
						item = "number";
					
				        // We have now found the use of the item. 
				        // We can now set foundUseOfItem to true to break the while loop
				        
				        foundUseOfItem = true;
					} 
					
		        } 
				
				
				
				
				// Now see if the element is a operator (+, -, *, /)
				// For each element in the array called operators see if the element exists in the array.
				// If true, the element is a operator
				// If false, the element is not a operator 
					
				for (String element : operators) {
					
					// If the element is found in the array called operators
					
					if (element == currentItem) {
						
						// Set the value of previousItem to the value of the current item
						
						previousItem = item;
						
						// Set the item to an operator
						
						item = "operator";
						
				        // We have now found the use of the item. 
				        // We can now set foundUseOfItem to true to break the while loop
						
				        foundUseOfItem = true;
				        
					} 
					
				}
				
				
				// If the item is a decimal point, then set the item to a decimal point and break out of the while loop
				
				if (currentItem.equals (".")) {
					
					item = "decimalPoint";
					foundUseOfItem = true;
					
				}
			
			}
			
			
			
			// If the item is a decimal point, nothing else needs to be done for this iteration of the for loop. 
			// Therefore, the program should continue to the next iteration of the for loop.
			
			if (item.equals("decimalPoint")) {
				
				continue;
				
			}
			
			
			
			

			// If the item is a number
			
			if (item.equals("number")) {
				
				// If the number is the first in the calculations array
				
				if (i==0) {
					
					// The firstNumberIndex of the first number is equals to i (0)
					
					firstNumberIndex = i;
					
				}
				
				// If the previous item was an operator
				
				if (previousItem.equals("operator")) {
					
					// This means that i is the start of the second number
					// The firstNumberIndex is set to 1
					
					firstNumberIndex = i;
					
				}
					
				}
			
			
				
			
			
				
				
				// If the item is an operator
				
				if (item.equals("operator")) {
					
					// If the result is not equals (is +, -, *, /)
					
					if (calculations.get(i).equals("+") || calculations.get(i).equals("-") || calculations.get(i).equals("*") || calculations.get(i).equals("/")) {
						
						// Find the position of the operator
						
						operatorPositon = i;
					
					}
					
					
					
					
					// If this is the first value in the calculations array
					
					if (i==0) {
						
						// As the first value cannot be an operator, print an error message (syntax error)
						
						txt.setText("Syntax error");
						
						// Break out of the while loop
						
						break;
						
						// This does causes some problems, as the minus sign is considered an operator, but is actually part of a number.
						// This means that the program cannot work with negative numbers.
						// This could be an area for improvement.
					
						
					}
					
					
					
					// If the previous item was an operator
						
					else if (previousItem.equals("operator")) {
						
						// As there cannot be two operators in a row, print an error message (syntax error)
						
						txt.setText("Syntax error");
						
						// Break out of the while loop
						
						break;
						
					}
					
					
					
					
					else {
						
						// The number before the operator index indicates the final position of the number. Therefore, set the finalNumberIndex
						
						finalNumberIndex = i - 1;
						
						
						
						
						// Convert the user input in an array into a string
						
						// Create a string builder object
						
						StringBuilder sb = new StringBuilder();
						
						// Set the starting index of the number
						
						int a = firstNumberIndex;
						
						// Convert the array list to an array
						
						String[] array = calculations.toArray(new String[0]);
						
						// Create a for loop to add the entire number to the string
						
						for (a = firstNumberIndex; a < finalNumberIndex + 1; a++) {
							
							// If there is an operator, stop the building of the string
							
							if ((array[a].equals("+") || array [a].equals("-") || array[a].equals("*") || array[a].equals("/"))) {
							
								break;
							
							}
							
							// Add the number to the string
							
							sb.append(array[a]);
							
						}
						
						// Convert the object into a string

						String singleString = sb.toString();
						
						
						
						// Increment the counter by 1 as a number has been created
						
						counter++;
						
						
						// If the counter is 1 (this is the first number)
						
						if (counter == 1) {
							
							// Store the string in the string variable num1
							
							num1 = singleString;
							
							// Cast the string to a double and store in the variable number1 to perform the calculation
							
							number1 = Double.parseDouble(num1);
							
						}
						
						
						// If the counter is 2 (this is the second number)
						
						if (counter == 2) {
							
							// Store the string in the string variable num2
							
							num2 = singleString;
							
							// Cast the string to a double and store in the variable number2 to perform the calculation
							
							number2 = Double.parseDouble(num2);
							
							
							// If the operator is a plus
							
							if (calculations.get(operatorPositon).equals("+")) {
									
								// Add the two numbers and store the answer in the variable result
									
								result = number1 + number2;
								
							}
							
							// If the operator is a minus
								
							if (calculations.get(operatorPositon).equals("-")) {
								
								// Subtract the number2 from number1 and store the answer in the variable result
									
								result = number1 - number2;
								
							}
							
							// If the operator is a multiplication sign
								
							if (calculations.get(operatorPositon).equals("*")) {
								
								// Multiply the two number and store the answer in the variable result
									
								result = number1 * number2;
									
							}
							
							// If the operator is a division sign
								
							if (calculations.get(operatorPositon).equals("/")) {
								
								// If the second number is a zero
								
								if (number2 == 0) {
									
									// Display a maths error as division by zero is impossible
									
									txt.setText("Maths Error");
									
									// Return (stop) the method
									
									return;
								}
								
								else {
									
									// Divide number1 by number2 and store the answer in the variable result
									
									result = number1 / number2;
								
								}
									
							}
							
							
							
							// Display the current text in the text field and the result
							
							
							txt.setText(txt.getText()+ result + "");
								
								
						}
							
					}
	
				}
				
			}
		
		}
	

	// Create main method
	
	public static void main (String args[]) {

		// Run the GUI
		
		new CalculatorV13 ();
		
	}
	
	// Overide of the action performed method

	@Override
	public void actionPerformed(ActionEvent ae) {
		
	}

}

