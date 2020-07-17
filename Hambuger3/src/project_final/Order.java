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




//결제내역 클래스
class Order{

	private static final long serialVersionUID = 1L;

	public Order() {
		Frame j = new Frame();
		j.setTitle("영수증");
		j.setBounds(400,50,600,800);
		j.setLayout(null);
		
		JButton homeBtn = new JButton("확인");
		homeBtn.setBounds(100, 600, 400, 150);
		
		j.add(homeBtn);
		
//		Menu.TA.append("영수증\n\n");
//
//		if(FrameMain.HG==true) {
//			Menu.TA.append("매장\n");
//		}
//		else Menu.TA.append("포장\n");
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
		Font font2 = new Font("맑은 고딕",Font.BOLD,20);
		
		//결제내역 Label
		//객체를 받아와야함 *
		JLabel bill = new JLabel("여기에 주문 목록 입력");
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
		
		JLabel here = new JLabel("매장주문입니다.");
		JLabel toGo = new JLabel("포장주문입니다.");
		here.setLayout(new FlowLayout());
		here.setSize(600, 20);
		toGo.setLayout(new FlowLayout());
		toGo.setSize(600, 20);
		if(FrameMain.HG==true)
			bill.add(here);
		else
			bill.add(toGo);
		bill.add(new JLabel("총액 : "+String.valueOf(sum)+"원"));
		

//		bill.setHorizontalAlignment(JLabel.CENTER);
		Label billTitle = new Label("                   영수증");
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


//결제수단 선택 클래스
//카드,페이코,이전, 결제 취소
//추가 패널로 띄우고, 선택 누르면 >> 영수증으로 pass
class Payment2 extends JFrame{

	private static final long serialVersionUID = 1L;

	public Payment2() {
		
		setTitle("결제");
		setBounds(400,50,600,800);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel top = new JLabel("결제 방법을 선택해주세요.");
		top.setBounds(30, 60, 540, 100);
		top.setOpaque(true);
		top.setBackground(Color.orange);
		top.setForeground(Color.WHITE);
		top.setHorizontalAlignment(JLabel.CENTER);
		Font font = new Font("맑은 고딕",Font.BOLD, 40);
		top.setFont(font);
		add(top);
		
		JButton btn1 = new JButton(new ImageIcon("신용카드.png"));
		add(btn1);
		btn1.setBounds(300, 180, 240, 400);
		btn1.setBorderPainted(false);
		
		JButton btn2 = new JButton(new ImageIcon("페이코.png"));
		add(btn2);
		btn2.setBounds(40, 180, 240, 400);
		btn2.setBorderPainted(false);
		
		btn1.setBackground(Color.white);
		btn2.setBackground(Color.white);
		
		JButton before = new JButton("이전으로");
		JButton frontp = new JButton("처음으로");
		
		before.setBounds(60, 600, 200, 80);
		frontp.setBounds(320, 600, 200, 80);
		
		before.setFont(new Font("맑은 고딕",Font.BOLD,30));
		frontp.setFont(new Font("맑은 고딕",Font.BOLD,30));
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
				JOptionPane.showMessageDialog(null, "신용카드 결제");
				BillTest.getInstance().setpay(1);
				new Receipt2();
				dispose();
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "페이코 결제");
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
