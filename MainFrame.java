package ȯ�ڰ���;
import javax.swing.*;
import java.awt.*;

//����ȭ�� ���� Ŭ����
public class MainFrame extends JFrame {
	private JTabbedPane tp; // 
	private AddPane ap; // UI Ŭ����
	
	
	public MainFrame() {
		tp = new JTabbedPane();
		ap = new AddPane();
		
		tp.addTab("ȯ�������Է�",ap);
		
		this.getContentPane().add(tp);
		this.setTitle("ȯ�� ���� ���α׷�");
		
		Dimension d = new Dimension(400,350);
		this.setSize(d);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
