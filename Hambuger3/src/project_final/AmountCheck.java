package project_final;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class AmountCheck {
	// ��ư�� �������� ��������� �� â�� ������ Ŭ����
	static int amount;

	AmountCheck(int g) {
		amount = 1;
		JFrame j = new JFrame();
		JPanel amountPanel = new JPanel();
		j.setTitle("����");
		j.add(amountPanel);
		j.setContentPane(amountPanel);

		Button decreaseButton = new Button("-");
		Button increaseButton = new Button("+");
		JButton oKButton = new JButton("Ȯ��");

		JTextField amountTextField = new JTextField(String.valueOf(amount));
		amountPanel.setBackground(Color.WHITE);
		amountTextField.setSize(80, 25);
		amountTextField.setLocation(210, 350);
		amountTextField.setHorizontalAlignment(JTextField.CENTER);

		decreaseButton.setBackground(Color.ORANGE);
		decreaseButton.setSize(50, 25);
		decreaseButton.setLocation(150, 350);
		increaseButton.setBackground(Color.ORANGE);
		increaseButton.setSize(50, 25);
		increaseButton.setLocation(300, 350);
		oKButton.setBorderPainted(false);
		oKButton.setBackground(Color.ORANGE);
		oKButton.setSize(100, 50);
		oKButton.setLocation(200, 400);

		amountPanel.add(decreaseButton);
		amountPanel.add(increaseButton);
		amountPanel.add(amountTextField);
		amountPanel.add(oKButton);

		ImageIcon img = new ImageIcon("�������.png");
		switch (g) {
		case 0:
			img = new ImageIcon("�������.png");
			
			break;
		case 1:
			img = new ImageIcon("ġŲ����.png");
			break;
		case 2:
			img = new ImageIcon("�������.png");
			break;
		case 3:
			img = new ImageIcon("����Ƣ��.png");
			break;
		case 4:
			img = new ImageIcon("�ؽú���.png");
			break;
		case 5:
			img = new ImageIcon("ġŲ�ʰ�.png");
			break;
		case 6:
			img = new ImageIcon("�ݶ�.png");
			break;
		case 7:
			img = new ImageIcon("Ŀ��.png");
			break;
		case 8:
			img = new ImageIcon("�ٴҶ���ũ.png");
			break;
		default:
			break;
		}
		JLabel imgl = new JLabel(img);
		JLabel lname=new JLabel(Menu.string[g]);
		imgl.setLocation(175, 100);
		imgl.setSize(150, 150);
		imgl.setOpaque(true);
		imgl.setBackground(Color.white);
		lname.setBounds(200,250,150,30);
		amountPanel.add(imgl);
		amountPanel.add(lname);

		j.setLayout(null);
		j.setSize(500, 500);
		j.setResizable(false);
		j.setVisible(true);

		// -��ư �׼�
		decreaseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				amount = Integer.parseInt(amountTextField.getText()); // ���� �ؽ�Ʈ�ʵ��� ���� �˾Ƴ���.
				amount--;
				if (amount > 0) {
					amountTextField.setText(String.valueOf(amount));
				} else
					amount = 1;
			}
		});

		// +��ư �׼�
		increaseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				amount = Integer.parseInt(amountTextField.getText());
				amount++;
				if (amount > 0) {
					amountTextField.setText(String.valueOf(amount));

				} else
					amount = 1;
			}
		});

		oKButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (BillTest.getInstance().getProduct()[g] == null) {
					BillTest.getInstance().setBill(new Product(g, amount), 2);
				} else {
					BillTest.getInstance().getProduct()[g].setcnt(amount);
				}

//				Menu.TA.append(String.valueOf(BillTest.getInstance().getProduct()[g])+"\n");
				Menu.TA.append(BillTest.getInstance().getProduct()[g].toString() + "\n");

				j.dispose();
			}
		});
		// �ؽ�Ʈ�ʵ忡 ������ �Է�
		amountTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				char c = arg0.getKeyChar();

				if (!Character.isDigit(c)) {
					arg0.consume();
					return;
				}

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
		j.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				amount = 0;
			}
		});
	}

	public int getAmount() {
		return amount;
	}
}
