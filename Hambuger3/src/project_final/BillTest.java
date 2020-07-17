package project_final;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class BillTest {
	private static BillTest billtest = new BillTest();
	private Product[] line = new Product[9];
	//����Ļ�
	private static boolean hall = false;
	//�ֹ���ȣ
	private static int orderCnt=1;
	//��������
	private int pay = 0;
	
	public void setBill(Product line,int pay) {
		int a = line.num;
		this.line[a]=line;
		this.pay = pay;
	}
	
	public void setpay(int pay) {
		this.pay = pay;
	}
	public int getpay() {
		return pay;
	}
	
	public void cntorder(boolean a) {
		if(a==true) {
			orderCnt++;
		}
	}
	public int getcnt() {
		return orderCnt;
	}
	
	public static void setHall(boolean a) {
		hall = a;
	}
	public boolean getHall() {
		return hall;
	}

	//product �߰�
	public void setProduct(Product pro) {
		int n = pro.num;
		line[n] = pro;
	}
	public void setLine(Product[] line) {
		this.line = line;
	}
	public Product[] getProduct() {
		return line;
	}
	
	public static void resetBill() {
		billtest.setLine(new Product[9]);
		hall=false;
		billtest.pay=0;
	}
	public static String getBill2() {
		if(hall==false) {
			return "���� �ֹ��Դϴ�.";
		}
		else {
			return "���� �ֹ��Դϴ�.";
		}
	}
	public static BillTest getInstance() {
        return billtest;
    }
}
