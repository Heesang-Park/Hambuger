package project_final;


class Product{
	//�޴� �ĺ���
	int num =0;
	//�޴� ����
	int cnt =0;
	
	public Product(int a, int b) {
		this.num = a;
		this.cnt = b;
	}
	public void setpro(int a, int b) {
		this.num = a;
		this.cnt = b;
	}
	
	public int getnum() {
		return num;
	}
	
	public int getcnt() {
		return cnt;
	}
	
	public void setbill() {
	}
	public void setcnt(int cnt) {
		this.cnt += cnt;
	}
	public void setnum(int num) {
		this.num = num;
	}
	public int getpay() {
		int price=0;
		switch(num){
		case 0:
			price = 4900;
			break;
		case 1:
			price = 4500;
			break;
		case 2:
			price = 4200;
			break;
		case 3:
			price = 2000;
			break;
		case 4:
			price = 1800;
			break;
		case 5:
			price = 300;
			break;
		case 6:
			price = 1800;
			break;
		case 7:
			price = 2000;
			break;
		case 8:
			price = 2500;
			break;
		}
		return price;
	}

	@Override
	public String toString() {
		String name;
		switch(num){
		case 0:
			name ="�������";
			break;
		case 1:
			name ="ġŲ����";
			break;
		case 2:
			name ="�������";
			break;
		case 3:
			name ="����Ƣ��";
			break;
		case 4:
			name ="�ؽ�����";
			break;
		case 5:
			name ="ġŲ�ʰ�";
			break;
		case 6:
			name ="�ݶ�";
			break;
		case 7:
			name ="Ŀ��";
			break;
		case 8:
			name ="�ٴҶ���ũ";
			break;
		default:
			name="";
			break;
		}
		//return name+"         "+price+"��             "+cnt+"��";
		return String.format("%s\t\t%d��\t %s��", name, getpay(), String.valueOf(cnt));
	}
}