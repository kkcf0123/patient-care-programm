package 환자관리;
import javax.swing.*;
import java.awt.*;

//메인화면 구성 클래스
public class MainFrame extends JFrame {
	private JTabbedPane tp; // 
	private AddPane ap; // UI 클래스
	
	
	public MainFrame() {
		tp = new JTabbedPane();
		ap = new AddPane();
		
		tp.addTab("환자정보입력",ap);
		
		this.getContentPane().add(tp);
		this.setTitle("환자 관리 프로그램");
		
		Dimension d = new Dimension(400,350);
		this.setSize(d);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
