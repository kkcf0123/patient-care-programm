package smu.kim.reg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculate extends JFrame{

	private static JButton cash;
	private static JButton card;
	
	private JButton cancel;
	
	private int giveMoney;
	private int getMoney;
	
	private JFrame fr;
	private JPanel jp;

	
	public Calculate(){
		
		gui();
		
	}
	
	
	public void gui(){
		
		fr = new JFrame("계산");
		fr.setVisible(true);
		fr.setSize(300, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jp = new JPanel(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		cash = new JButton("현금");
		card = new JButton("카드");
		cancel = new JButton("취소");
		
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 1;
		jp.add(cash, gbc);
		gbc.gridx = 0;
		gbc.gridx = 2;
		jp.add(card);
		gbc.gridx = 0;
		gbc.gridy = 3;
		jp.add(cancel, gbc);
		
		fr.add(jp);
	}


	public static void main(String[] args) {
	
		new Calculate();
		
	}
	
	public static JPanel btnLay(){
		
		JPanel jp1 = new JPanel();

		jp1.add(cash);
		jp1.add(card);
		
		return jp1;
	} 
	
}
