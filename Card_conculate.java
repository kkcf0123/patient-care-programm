package smu.example.mg;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Card_conculate {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=112,379
	 */
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel panel = new JPanel();
	private final JButton btnNewButton = new JButton("결 제");
	private final JButton btnNewButton_1 = new JButton("취 소");
	private final JPanel panel_1 = new JPanel();
	private final JTextField textField = new JTextField(15);
	private final JPanel panel_2 = new JPanel();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Card_conculate window = new Card_conculate();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Card_conculate() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("카드 결제");
		frame.setBounds(100, 100, 250, 180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("     결제 금액");
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		panel.add(btnNewButton);
		
		panel.add(btnNewButton_1);
		
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		textField.setColumns(10);
		
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.WEST;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 3;
		panel_1.add(textField, gbc_textField);
	}
	
}
