package project_final;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class Menu extends Frame {

	Frame c = new Frame("메뉴 선택");
	static JTextArea TA = new JTextArea();
	static String[] string = {"더블버거      4900원","치킨버거      4500원","새우버거      4200원","감자튀김      2000원","해쉬브라운      1800원","치킨너겟      300원","콜라      1800원","커피      2000원","바닐라쉐이크      2500원"};

	Menu() {
		
		JLabel l1 = new JLabel(string[0]);
		l1.setBounds(50, 350, 150, 30);
		l1.setHorizontalAlignment(JLabel.CENTER);
		JLabel l2 = new JLabel(string[1]);
		l2.setBounds(225, 350, 150, 30);
		l2.setHorizontalAlignment(JLabel.CENTER);
		JLabel l3 = new JLabel(string[2]);
		l3.setBounds(400, 350, 150, 30);
		l3.setHorizontalAlignment(JLabel.CENTER);
		JLabel l4 = new JLabel(string[3]);
		l4.setBounds(50, 350, 150, 30);
		l4.setHorizontalAlignment(JLabel.CENTER);
		JLabel l5 = new JLabel(string[4]);
		l5.setBounds(225, 350, 150, 30);
		l5.setHorizontalAlignment(JLabel.CENTER);
		JLabel l6 = new JLabel(string[5]);
		l6.setBounds(400, 350, 150, 30);
		l6.setHorizontalAlignment(JLabel.CENTER);
		JLabel l7= new JLabel(string[6]);
		l7.setBounds(50, 350, 150, 30);
		l7.setHorizontalAlignment(JLabel.CENTER);
		JLabel l8 = new JLabel(string[7]);
		l8.setBounds(225, 350, 150, 30);
		l8.setHorizontalAlignment(JLabel.CENTER);
		JLabel l9 = new JLabel(string[8]);
		l9.setBounds(400, 350, 150, 30);
		l9.setHorizontalAlignment(JLabel.CENTER);

		c.setSize(600, 800);
		c.setLocation(400, 50);
		c.setLayout(null);
		c.setResizable(false);
		Button H = new Button("햄버거");
		Button S = new Button("사이드");
		Button D = new Button("음료");
		JButton home = new JButton("처음으로");
		JButton order = new JButton("주문하기");

		H.setFont(new Font("궁서", Font.BOLD, 30));
		S.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		D.setFont(new Font("맑은 고딕", Font.BOLD, 30));

		home.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		order.setFont(new Font("맑은 고딕", Font.BOLD, 30));

		JButton H1 = new JButton(new ImageIcon("더블버거.png"));
		JButton H2 = new JButton(new ImageIcon("치킨버거.png"));
		JButton H3 = new JButton(new ImageIcon("새우버거.png"));
		H1.setBackground(Color.white);
		H2.setBackground(Color.white);
		H3.setBackground(Color.white);
		H1.setBorderPainted(false);
		H2.setBorderPainted(false);
		H3.setBorderPainted(false);

		JButton S1 = new JButton(new ImageIcon("감자튀김.png"));
		JButton S2 = new JButton(new ImageIcon("해시브라운.png"));
		JButton S3 = new JButton(new ImageIcon("치킨너겟.png"));
		S1.setBackground(Color.white);
		S2.setBackground(Color.white);
		S3.setBackground(Color.white);
		S1.setBorderPainted(false);
		S2.setBorderPainted(false);
		S3.setBorderPainted(false);

		JButton D1 = new JButton(new ImageIcon("콜라.png"));
		JButton D2 = new JButton(new ImageIcon("커피.png"));
		JButton D3 = new JButton(new ImageIcon("바닐라쉐이크.png"));
		D1.setBackground(Color.white);
		D2.setBackground(Color.white);
		D3.setBackground(Color.white);
		D1.setBorderPainted(false);
		D2.setBorderPainted(false);
		D3.setBorderPainted(false);

		H1.setLocation(50, 200);
		H2.setLocation(225, 200);
		H3.setLocation(400, 200);
		S1.setLocation(50, 200);
		S2.setLocation(225, 200);
		S3.setLocation(400, 200);
		D1.setLocation(50, 200);
		D2.setLocation(225, 200);
		D3.setLocation(400, 200);

		H1.setSize(150, 150);
		H2.setSize(H1.getSize());
		H3.setSize(H1.getSize());
		S1.setSize(H1.getSize());
		S2.setSize(H1.getSize());
		S3.setSize(H1.getSize());
		D1.setSize(H1.getSize());
		D2.setSize(H1.getSize());
		D3.setSize(H1.getSize());

		TA.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		TA.setBackground(Color.ORANGE);
		H.setBounds(0, 50, 200, 50);
		S.setBounds(200, 50, 200, 50);
		D.setBounds(400, 50, 200, 50);
		TA.setBounds(50, 400, 500, 260);
		home.setBounds(75, 700, 200, 60);
		order.setBounds(325, 700, 200, 60);

		home.setBackground(Color.ORANGE);
		home.setForeground(Color.WHITE);
		order.setBackground(Color.ORANGE);
		order.setForeground(Color.WHITE);
		home.setBorderPainted(false);
		order.setBorderPainted(false);

		//// 평면에 끌로 판듯이 외곽선 효과를 내는 것이고 양각의 효과를 준다.

		// (new EtchedBorder(EtchedBorder.RAISED));

		H.setEnabled(false);
		S.setEnabled(true);
		D.setEnabled(true);

		H.setBackground(Color.ORANGE);
		S.setBackground(new Color(255, 232, 151));
		D.setBackground(new Color(255, 232, 151));

		c.add(H1);
		c.add(H2);
		c.add(H3);
		c.add(S1);
		c.add(S2);
		c.add(S3);
		c.add(D1);
		c.add(D2);
		c.add(D3);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		c.add(l7);
		c.add(l8);
		c.add(l9);
		c.add(H);
		c.add(S);
		c.add(D);
		c.add(TA);
		c.add(home);
		c.add(order);
		c.setVisible(true);
		
		S1.setVisible(false);
		S2.setVisible(false);
		S3.setVisible(false);
		D1.setVisible(false);
		D2.setVisible(false);
		D3.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
		l6.setVisible(false);
		l7.setVisible(false);
		l8.setVisible(false);
		l9.setVisible(false);
		
		
		H.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				H.setEnabled(false);
				S.setEnabled(true);
				D.setEnabled(true);

				H.setBackground(Color.ORANGE);
				S.setBackground(new Color(255, 232, 151));
				D.setBackground(new Color(255, 232, 151));
				
				H1.setVisible(true);
				H2.setVisible(true);
				H3.setVisible(true);
				l1.setVisible(true);
				l2.setVisible(true);
				l3.setVisible(true);
				S1.setVisible(false);
				S2.setVisible(false);
				S3.setVisible(false);
				D1.setVisible(false);
				D2.setVisible(false);
				D3.setVisible(false);
				l4.setVisible(false);
				l5.setVisible(false);
				l6.setVisible(false);
				l7.setVisible(false);
				l8.setVisible(false);
				l9.setVisible(false);

			}
		});
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				H.setEnabled(true);
				S.setEnabled(false);
				D.setEnabled(true);

				H.setBackground(new Color(255, 232, 151));
				S.setBackground(Color.ORANGE);
				D.setBackground(new Color(255, 232, 151));
				
				H1.setVisible(false);
				H2.setVisible(false);
				H3.setVisible(false);
				l1.setVisible(false);
				l2.setVisible(false);
				l3.setVisible(false);
				S1.setVisible(true);
				S2.setVisible(true);
				S3.setVisible(true);
				D1.setVisible(false);
				D2.setVisible(false);
				D3.setVisible(false);
				l4.setVisible(true);
				l5.setVisible(true);
				l6.setVisible(true);
				l7.setVisible(false);
				l8.setVisible(false);
				l9.setVisible(false);
			}
		});

		D.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				H.setEnabled(true);
				S.setEnabled(true);
				D.setEnabled(false);

				H.setBackground(new Color(255, 232, 151));
				S.setBackground(new Color(255, 232, 151));
				D.setBackground(Color.ORANGE);

				H1.setVisible(false);
				H2.setVisible(false);
				H3.setVisible(false);
				l1.setVisible(false);
				l2.setVisible(false);
				l3.setVisible(false);
				S1.setVisible(false);
				S2.setVisible(false);
				S3.setVisible(false);
				D1.setVisible(true);
				D2.setVisible(true);
				D3.setVisible(true);
				l4.setVisible(false);
				l5.setVisible(false);
				l6.setVisible(false);
				l7.setVisible(true);
				l8.setVisible(true);
				l9.setVisible(true);
			}
		});
		H1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(0);

			}
		});
		H2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(1);

			}
		});
		H3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(2);

			}
		});
		S1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(3);
			}
		});
		S2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(4);

			}
		});
		S3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(5);

			}
		});
		D1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(6);

			}
		});
		D2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(7);

			}
		});
		D3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AmountCheck(8);

			}
		});

		c.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});
		home.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameMain();
				c.dispose();

			}
		});
		order.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (AmountCheck.amount != 0) {
					new Payment2();
					c.dispose();
				} else {
					JOptionPane.showMessageDialog(null, "주문이 없습니다.");
				}

			}
		});

	}

}