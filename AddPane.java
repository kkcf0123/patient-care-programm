package 환자관리;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

//사원추가를 위한 UI 등록 및 처리
public class AddPane extends JPanel implements ActionListener {
	
	private JPanel[] jp = new JPanel[6];
	private JLabel[] jl = new JLabel[5];
	private JTextField[] tf = new JTextField[10];
	private JButton okb;
	private JButton rsb;
	
	String[] caption = {"이 름 : ","생일 : ","메 일 :","번 호 :","성 별 :"};
	
	public AddPane() {
		this.setLayout(new GridLayout(7,1));
		EtchedBorder eb = new EtchedBorder();
		this.setBorder(eb);
		
		int size = caption.length;
		
		int i;
		for(i=0;i<=size-1;i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			this.add(jp[i]);
		}
	
		jp[size] = new JPanel();
		okb = new JButton("저장하기");
		okb.addActionListener(this);
		jp[size].add(okb);
		add(jp[size]);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String e_type = e.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		
		if(e_type.equals(okb.getText())) { //저장하기를 클릭했을 경우 , DAO 객체 생성 후 데이터베이스 추가.
			try {
				evo = new EmployeeVO(0,tf[0].getText(),tf[1].getText(),tf[2].getText(),tf[3].getText(),tf[4].getText());
				edvo = new EmployeeDAO();
				edvo.getEmployeeregiste(evo);
			} catch(Exception ae) {
				System.out.println("e=["+ae+"]");
			}
			
			if(edvo != null) {
				JOptionPane.showMessageDialog(this,tf[0].getText()+"님이 성공적으로 추가됨");
			} 	
		}
	}

}
