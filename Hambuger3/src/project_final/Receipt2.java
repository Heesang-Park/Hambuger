package project_final;

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

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Receipt2 {

	public Receipt2() {
		Frame j = new Frame();
//		j.setFont(new Font("맑은 고딕",Font.BOLD,20));
		j.setTitle("영수증");
		j.setBounds(400, 50, 600, 800);
		j.setLayout(null);

		// 영수증 출력
		JButton btn2 = new JButton("영수증 출력");

		j.add(btn2);
		btn2.setBounds(75, 700, 200, 60);
		btn2.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btn2.setBackground(Color.ORANGE);
		btn2.setForeground(Color.WHITE);
		btn2.setBorderPainted(false);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "영수증 출력");
				j.dispose();
				new FrameMain();

			}
		});

		// 영수증 생략
		JButton btn3 = new JButton("영수증 생략");

		j.add(btn3);
		btn3.setBounds(325, 700, 200, 60);
		btn3.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		btn3.setBackground(Color.ORANGE);
		btn3.setForeground(Color.WHITE);
		btn3.setBorderPainted(false);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "영수증 생략");
				j.dispose();
				new FrameMain();
			}
		});

		// 결제내역 Label
		// 객체를 받아와야함 *
		JLabel bill = new JLabel();
		bill.setSize(400, 300);
		bill.setLocation(100, 150);
		bill.setOpaque(true);
		bill.setBackground(Color.ORANGE);
		j.add(bill);

		// 객체 받아오는 곳
		bill.setLayout(new FlowLayout());
		int cnt = 0; // 주문 목록 줄 개수
		int cnt2 = 0;
		for (int i = 0; i < BillTest.getInstance().getProduct().length; i++) {
			if (BillTest.getInstance().getProduct()[i] != null) {
				cnt++;
			}
		}
		// 줄 개수에 따라서 라벨 생성
		JLabel[] show = new JLabel[cnt];

		int total = 0; // 총액
		for (int i = 0; i < BillTest.getInstance().getProduct().length; i++) {
			if (BillTest.getInstance().getProduct()[i] != null) {
				show[cnt2] = new JLabel(BillTest.getInstance().getProduct()[i].toString());
				show[cnt2].setPreferredSize(new Dimension(350, 20));
				bill.add(show[cnt2]);
				// 총액 += 가격*개수
				total += BillTest.getInstance().getProduct()[i].getpay()
						* BillTest.getInstance().getProduct()[i].getcnt();
				cnt2++;
			}
		}

		JLabel bill2 = new JLabel(BillTest.getBill2());
		bill2.setSize(400, 30);
		bill2.setLocation(100, 450);
		bill2.setOpaque(true);
		bill2.setBackground(Color.ORANGE);
		JLabel bill3 = new JLabel("총 액 ===================================" + total + "원");
		bill3.setSize(400, 60);
		bill3.setLocation(100, 540);
		bill3.setOpaque(true);
		bill3.setBackground(Color.ORANGE);
		
		JLabel bill4 = new JLabel("주문번호 : " + BillTest.getInstance().getcnt());
		bill4.setSize(400, 30);
		bill4.setLocation(100, 480);
		bill4.setOpaque(true);
		bill4.setBackground(Color.ORANGE);
		
		JLabel bill5 = new JLabel();
		bill5.setOpaque(true);
		bill5.setBackground(Color.ORANGE);
		if (BillTest.getInstance().getpay() == 1) {
			bill5.setText("결제수단 : 신용카드");
		} else
			bill5.setText("결제수단 : 페이코");
		bill5.setSize(400, 30);
		bill5.setLocation(100, 510);
	
		BillTest.getInstance().cntorder(true);

		j.add(bill4);
		j.add(bill3);
		j.add(bill2);
		j.add(bill5);
		// 타이틀 부분
		Label billTitle = new Label();
		billTitle.setText("영수증");
		billTitle.setSize(600, 50);
		billTitle.setLocation(0, 50);
		billTitle.setBackground(Color.orange);
		billTitle.setForeground(Color.WHITE);
		billTitle.setAlignment(Label.CENTER);

		j.add(billTitle);
		Font font = new Font(Font.MONOSPACED, Font.BOLD, 40);
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
