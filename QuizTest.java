package com.Quiz.App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
//Importing Swing Application
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizTest extends JFrame implements ActionListener {
	
	
	JLabel label;
	JRadioButton radioButtons[] = new JRadioButton[5];
	JButton btnNext, btnResult;
	ButtonGroup bg;
	
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];
	
	QuizTest(String s){
		super(s);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for(int i=0; i<5; i++) {
			radioButtons[i] = new JRadioButton();
			add(radioButtons[i]);
			bg.add(radioButtons[i]);
		}
		
		btnNext = new JButton("Next");
		btnResult = new JButton("Result");
		btnResult.setVisible(false);
		btnResult.addActionListener(this);
		btnNext.addActionListener(this);
		add(btnNext);
		add(btnResult);
		setData();
		label.setBounds(30, 40, 450, 20);
		radioButtons[0].setBounds(50, 80, 450, 20);
		radioButtons[1].setBounds(50,110, 200, 20);
		radioButtons[2].setBounds(50,140, 200, 20);
		radioButtons[3].setBounds(50,170, 200, 20);
		btnNext.setBounds(100, 240, 100, 30);
		btnResult.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600, 350);
		
		
	}
	
	void setData() {
		
		radioButtons[4].setSelected(true);
		if(current==0) {
			label.setText("Q 1 - What is the Capital of Australia? ");
			radioButtons[0].setText("Sydeny");
			radioButtons[1].setText("Melbourne");
			radioButtons[2].setText("Canberra");
			radioButtons[3].setText("Adelaide");
			
		}
		
		if(current==1) {
			label.setText("Q 2 - Who is the prime minister of India?");
			radioButtons[0].setText("Rahul Gandhi");
			radioButtons[1].setText("Narendra Modi");
			radioButtons[2].setText("Kejriwal");
			radioButtons[3].setText("Manmohan Singh");
			
		}
		
		if(current==2) {
			label.setText("Q 3 - Who is Sachin Tendulkar?");
			radioButtons[0].setText("Cricketer");
			radioButtons[1].setText("Actor");
			radioButtons[2].setText("Musician");
			radioButtons[3].setText("Painter");
			
		}
		
		if(current==3) {
			label.setText("Q 4-Which one of the following is 7th Wonder?");
			radioButtons[0].setText("Taj Mahal");
			radioButtons[1].setText("Universal Studios");
			radioButtons[2].setText("The Eiffel Tower");
			radioButtons[3].setText("Burj Khalifa");
			
		}
		
		if(current==4) {
			label.setText("Q 5-What is the 5th Element of Periodice table?");
			radioButtons[0].setText("Nitrogen");
			radioButtons[1].setText("Oxygen");
			radioButtons[2].setText("Carbon");
			radioButtons[3].setText("Boron");
			
		}
		
		if(current==5) {
			label.setText("Q 6-When did India got Independece?");
			radioButtons[0].setText("15th August 1947");
			radioButtons[1].setText("2nd October 1948");
			radioButtons[2].setText("26th January 1950");
			radioButtons[3].setText("05th May 1939");
			
		}
		
		if(current==6) {
			label.setText("Q 7-What is the Fullform of WWW.?");
			radioButtons[0].setText("World Wildlife Watch ");
			radioButtons[1].setText("World wide welfare ");
			radioButtons[2].setText("World wide web");
			radioButtons[3].setText("None of the above");
			
		}
		
		if(current==7) {
			label.setText("Q 8-Who is the national bird of India?");
			radioButtons[0].setText("Parrot");
			radioButtons[1].setText("Peacock");
			radioButtons[2].setText("Pigeon");
			radioButtons[3].setText("Penguin");
			
		}
		
		if(current==8) {
			label.setText("Q 9-Which gas do plants absorb from the atmosphere?");
			radioButtons[0].setText("Oxygen");
			radioButtons[1].setText("Carbon dioxide");
			radioButtons[2].setText("Nitrogen");
			radioButtons[3].setText("Heleium");
			
		}
		
		if(current==9) {
			label.setText("Q 10-Who is the largest ocean on Earth?");
			radioButtons[0].setText("Pacific Ocean");
			radioButtons[1].setText("Indian Ocean");
			radioButtons[2].setText("Atlantic Ocean");
			radioButtons[3].setText("Arcitic Ocean");
			
		}
		label.setBounds(30, 40, 450, 20);
		for (int i=0,j=0; i<=90; i+=30, j++) {
			radioButtons[j].setBounds(50, 80+i, 200, 20);
			
		}
	}
	
	boolean checkAns() {
		
		if(current==0) {
			return (radioButtons[2].isSelected());
		}
		
		if(current==1){
			return (radioButtons[1].isSelected());
		}
		
		if(current==2) {
			return (radioButtons[0].isSelected());
		}
		
		if(current==3) {
			return (radioButtons[1].isSelected());
		}
		
		if(current==4) {
			return (radioButtons[2].isSelected());
		}
		
		if(current==5) {
			return (radioButtons[0].isSelected());
		}
		if(current==6) {
			return (radioButtons[2].isSelected());
		}
		if(current==7) {
			return (radioButtons[1].isSelected());
		}
		if(current==8) {
			return (radioButtons[1].isSelected());
		}
		if(current==9) {
			return (radioButtons[0].isSelected());
		}
		
		
		return false;
	}
	public static void main(String[] args) {
		
new QuizTest("Simple Quiz App");
		
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btnNext) {
			
			if(checkAns())
				count = count +1;
			current++;
				setData();
				
				if(current==9) {
					btnNext.setEnabled(false);
					btnNext.setVisible(true);
					btnNext.setText("Result");
					
				}
		}
		
		if(e.getActionCommand().equals("Result")) {
			if(checkAns())
				count = count+1;
			current++;
			JOptionPane.showMessageDialog(this, "Correct Answers are "+ count);
		
			System.exit(0);
				
		}
	}

}
