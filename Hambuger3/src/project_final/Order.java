package project_final;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




//�������� Ŭ����
class Order{

	private static final long serialVersionUID = 1L;

	public Order() {
		Frame j = new Frame();
		j.setTitle("������");
		j.setBounds(400,50,600,800);
		j.setLayout(null);
		
		JButton homeBtn = new JButton("Ȯ��");
		homeBtn.setBounds(100, 600, 400, 150);
		
		j.add(homeBtn);
		
//		Menu.TA.append("������\n\n");
//
//		if(FrameMain.HG==true) {
//			Menu.TA.append("����\n");
//		}
//		else Menu.TA.append("����\n");
//		
//		Menu.TA.append(String.valueOf(BillTest.getcnt()));
//		BillTest.cntorder(true);
		
		homeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameMain();
				j.dispose();
			}
		});
		Font font2 = new Font("���� ���",Font.BOLD,20);
		
		//�������� Label
		//��ü�� �޾ƿ;��� *
		JLabel bill = new JLabel("���⿡ �ֹ� ��� �Է�");
		bill.setFont(font2);
		bill.setText("");
		bill.setSize(400, 450);
		bill.setLocation(100, 150);
		bill.setBackground(Color.ORANGE);
		
		j.add(bill);
		
		bill.setLayout(new FlowLayout());
		int cnt=0;
		int cnt2=0;
		for(int i =0;i<BillTest.getInstance().getProduct().length;i++) {
			if(BillTest.getInstance().getProduct()[i]!=null) {
				cnt++;
			}
		}
		int sum=0;
		
		JLabel[] show = new JLabel[cnt];
		for(int i =0;i<BillTest.getInstance().getProduct().length;i++) {
			if(BillTest.getInstance().getProduct()[i]!=null) {
				show[cnt2] =new JLabel(BillTest.getInstance().getProduct()[i].toString());
				show[cnt2].setPreferredSize(new Dimension(350,20));
				bill.add(show[cnt2]);
				cnt2++;
				sum+=BillTest.getInstance().getProduct()[i].getpay();
			}
		}
		
		JLabel here = new JLabel("�����ֹ��Դϴ�.");
		JLabel toGo = new JLabel("�����ֹ��Դϴ�.");
		here.setLayout(new FlowLayout());
		here.setSize(600, 20);
		toGo.setLayout(new FlowLayout());
		toGo.setSize(600, 20);
		if(FrameMain.HG==true)
			bill.add(here);
		else
			bill.add(toGo);
		bill.add(new JLabel("�Ѿ� : "+String.valueOf(sum)+"��"));
		

//		bill.setHorizontalAlignment(JLabel.CENTER);
		Label billTitle = new Label("                   ������");
		billTitle.setSize(600, 50);
		billTitle.setLocation(0, 50);
		billTitle.setBackground(Color.orange);
		j.add(billTitle);
		Font font = new Font(Font.SANS_SERIF,Font.PLAIN, 20);
		billTitle.setFont(font);
		
		j.setVisible(true);
		j.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				super.windowClosing(e);
			}
		});
	}

	
	
}


//�������� ���� Ŭ����
//ī��,������,����, ���� ���
//�߰� �гη� ����, ���� ������ >> ���������� pass
class Payment2 extends JFrame{

	private static final long serialVersionUID = 1L;

	public Payment2() {
		
		setTitle("����");
		setBounds(400,50,600,800);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel top = new JLabel("���� ����� �������ּ���.");
		top.setBounds(30, 60, 540, 100);
		top.setOpaque(true);
		top.setBackground(Color.orange);
		top.setForeground(Color.WHITE);
		top.setHorizontalAlignment(JLabel.CENTER);
		Font font = new Font("���� ���",Font.BOLD, 40);
		top.setFont(font);
		add(top);
		
		JButton btn1 = new JButton(new ImageIcon("�ſ�ī��.png"));
		add(btn1);
		btn1.setBounds(300, 180, 240, 400);
		btn1.setBorderPainted(false);
		
		JButton btn2 = new JButton(new ImageIcon("������.png"));
		add(btn2);
		btn2.setBounds(40, 180, 240, 400);
		btn2.setBorderPainted(false);
		
		btn1.setBackground(Color.white);
		btn2.setBackground(Color.white);
		
		JButton before = new JButton("��������");
		JButton frontp = new JButton("ó������");
		
		before.setBounds(60, 600, 200, 80);
		frontp.setBounds(320, 600, 200, 80);
		
		before.setFont(new Font("���� ���",Font.BOLD,30));
		frontp.setFont(new Font("���� ���",Font.BOLD,30));
		before.setForeground(Color.WHITE);
		frontp.setForeground(Color.WHITE);
		before.setBackground(Color.ORANGE);
		frontp.setBackground(Color.ORANGE);
		before.setBorderPainted(false);
		frontp.setBorderPainted(false);
		
		before.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Menu();
				dispose();
				
			}
		});

		frontp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new FrameMain();
				dispose();
				
			}
		});
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�ſ�ī�� ����");
				BillTest.getInstance().setpay(1);
				new Receipt2();
				dispose();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "������ ����");
				BillTest.getInstance().setpay(2);
				new Receipt2();
				dispose();
			}
		});
		
	
		
		add(before);
		add(frontp);
		
		
		
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				super.windowClosing(e);
			}
		});
		
		
		
	}
}
