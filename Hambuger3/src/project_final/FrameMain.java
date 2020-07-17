package project_final;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FrameMain{
	static boolean HG=true;
	FrameMain(){
	Frame f=new Frame("Hamburger");
	Font font = new Font("���� ���",Font.BOLD,40);
	
	f.setLayout(null);
	f.setBounds(400,50,600,800);
	
	JButton here = new JButton("����Ļ�");
	JButton toGo = new JButton("����");
	
	ImageIcon img = new ImageIcon("LOGO.png");
	JLabel mainPic = new JLabel(img);
	JLabel main = new JLabel("�ֹ��Ͻ÷��� �Ʒ� ��ư�� �����ּ���");
	
	here.setBounds(40, 600, 250, 100);
	toGo.setBounds(310, 600, 250, 100);
	mainPic.setBounds(60, 20, 480, 480);
	main.setBounds(125,425,400,200);
	
	here.setBorderPainted(false);
	toGo.setBorderPainted(false);
	here.setBackground(new Color(255,97,97));
	here.setForeground(Color.WHITE);
	toGo.setBackground(new Color(255,97,97));
	toGo.setForeground(Color.WHITE);
	
	here.setFont(font);
	toGo.setFont(font);
	main.setFont(new Font("���� ���",Font.BOLD,20));
	
	f.add(here);
	f.add(toGo);
	f.add(mainPic);
	f.add(main);

	f.setVisible(true);
	BillTest.resetBill();
	Menu.TA.setText("");
	AmountCheck.amount=0;
	f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
	
	here.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			f.setVisible(false);
			BillTest.setHall(true);
			new Menu();
		}
	});
	
	toGo.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			f.setVisible(false);

			BillTest.setHall(false);
			new Menu();
			
		}
	});
}
	public static boolean HGR() {
		return HG;
	}

	public static void main(String[] args) {
		new FrameMain();
		new BillTest();
	}
}