package project_final;


class Product{
	//메뉴 식별자
	int num =0;
	//메뉴 수량
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
			name ="더블버거";
			break;
		case 1:
			name ="치킨버거";
			break;
		case 2:
			name ="새우버거";
			break;
		case 3:
			name ="감자튀김";
			break;
		case 4:
			name ="해쉬브라운";
			break;
		case 5:
			name ="치킨너겟";
			break;
		case 6:
			name ="콜라";
			break;
		case 7:
			name ="커피";
			break;
		case 8:
			name ="바닐라쉐이크";
			break;
		default:
			name="";
			break;
		}
		//return name+"         "+price+"원             "+cnt+"개";
		return String.format("%s\t\t%d원\t %s개", name, getpay(), String.valueOf(cnt));
	}
}