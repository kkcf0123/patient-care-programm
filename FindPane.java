package 환자관리;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.EtchedBorder;
//환자 정보 조회를 위한 UI와 검색처리
public class FindPane extends JPanel implements ActionListener {
	private JPanel[] jp = new JPanel[7];
	private JLabel[] jl = new JLabel[6];
	private JTextField[] tf = new JTextField[6];
	private JButton okb;
	private JButton rsb;
	
	String[] caption = {"사 번 :","이 름 :","생 일 :","메 일 :","번 호 :","성 별 :"};
	
	public FindPane() {
		this.setLayout(new GridLayout(8,1));
		EtchedBorder eb = new EtchedBorder();
		this.setBorder(eb);
		
		int size = caption.length;
		
		for(int i=0;i<size;i++) {
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i] = new JPanel();
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			this.add(jp[i]);
			
			tf[i].setEditable(false);
			if(i==0 || i==1) {
				tf[i].setEditable(true);
			}
		}
		jp[size] = new JPanel();
		okb = new JButton("환자조회");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);
		jp[size].add(okb);
		jp[size].add(rsb);
		this.add(jp[size]);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;
		if(ae_type.equals(okb.getText())) {
			try {
				edvo = new EmployeeDAO();
				String sno = tf[0].getText().trim();
				String sname = tf[1].getText().trim();
				
				if(!sno.equals("") && !sname.equals("")) {
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no,sname);
				}else if(!sno.equals("") && sname.equals("")) {
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				}else if(sno.equals("") && !sname.equals("")) {
					evo = edvo.getEmployeeName(sname);
				}
			}catch (Exception e) {
				System.out.println("e=["+e+"]");
			}
			if(evo != null) {
				tf[0].setText(evo.getNo()+"");
				tf[1].setText(evo.getName());
				tf[2].setText(evo.getBirth());
				tf[3].setText(evo.getEmail());
				tf[4].setText(evo.getPhone());
				tf[5].setText(evo.getSex());
			} else {
				JOptionPane.showMessageDialog(this,"검색 실패");
			}
		} else if(ae_type.equals(rsb.getText())) {
			int size=caption.length;
			
			for(int i=0;i<size;i++) {
				tf[i].setText("");
			}
		}
	}
}
