package inmakesprojectswingawt;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class LoginForm extends JFrame
{
	JLabel lableFirstName, labelLastName;
	JLabel labelPassword;
	JLabel labelAge,labelGender, labelPlace, labelContactNumber;
	JTextField textFirstName, textLastName ,textAge, textGender, textContact;
	JPasswordField textPassword;
	JButton submit;
	JButton cancel;
	ImageIcon icon;
	
	TextArea textPlace;
	
	Checkbox checkMale, checkFemale;
	CheckboxGroup checkBoxGrp;
	
	
	
	
	public LoginForm() 
	{
		lableFirstName = new JLabel("FirstName: ",JLabel.CENTER);
		lableFirstName.setBounds(10,40,100,25);
		add(lableFirstName);
		
		/*
		 * labelPassword = new JLabel("Password: ",JLabel.CENTER);
		 * labelPassword.setBounds(10,40,100,25); add(labelPassword);
		 */
		
		textFirstName = new JTextField();
		textFirstName.setBounds(100, 10, 200, 25);
		textFirstName.setToolTipText("Enter FirstName");
		add(textFirstName);
		
		/*
		 * textPassword = new JPasswordField(); textPassword.setBounds(100, 10, 200,
		 * 25); textPassword.setToolTipText("Enter Password"); add(textPassword);
		 */
		
		labelLastName = new JLabel("LastName: ",JLabel.CENTER);
		labelLastName.setBounds(1100, 10, 200, 25);
		add(labelLastName);
		
		textLastName = new JTextField();
		textLastName.setBounds(100, 10, 200, 25);
		textLastName.setToolTipText("Enter LastName");
		add(textLastName);
		
		setLayout(null);
		labelAge = new JLabel("Age",JLabel.CENTER);  
		labelAge.setBounds(100, 10, 200, 25);
		add(labelAge);
 
		textAge=new JTextField();
		textAge.setBounds(100, 10, 200, 25);
		add(textAge);
 
		labelGender = new JLabel("Gender",JLabel.CENTER);  
		labelGender.setBounds(250,200,150,30);
		add(labelGender);
		
		checkBoxGrp = new CheckboxGroup();
		
		checkMale = new Checkbox("Male",checkBoxGrp,true);
		checkMale.setBounds(100, 10, 200, 25);
		add(checkMale);
		
		checkFemale = new Checkbox("Female",checkBoxGrp,false);
		checkFemale.setBounds(100, 10, 200, 25);
		add(checkFemale);
		
		labelPlace=new JLabel("Place");  
		labelPlace.setBounds(100, 10, 200, 25);
		add(labelPlace);
 
		textPlace=new TextArea(10,30);
		textPlace.setBounds(100, 10, 200, 25);
		add(textPlace);
		
		labelContactNumber=new JLabel("Contact Number");  
		labelContactNumber.setBounds(100, 10, 200, 25);
		add(labelContactNumber);
		
		textContact=new JTextField();
		textContact.setBounds(100, 10, 200, 25);
		add(textContact);
		
		
		submit = new JButton("submit");
		submit.setBounds(100, 10, 200, 25);
		submit.setMnemonic('S');
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setMnemonic('C');
		cancel.setBounds(100, 10, 200, 25);
		add(cancel);	
	}
	
	public static void main(String[] args) {
		
		LoginForm loginForm = new LoginForm();
		
		loginForm.setSize(10, 20);
		loginForm.setVisible(true);
		loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
