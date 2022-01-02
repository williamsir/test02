class Test05siwei{
	public static void main(String[] args){
	
	int num = 5986;
	int qian , bai, shi, ge;
	qian = num/1000;
	bai = num%1000/100;
	shi = num%100/10;
	ge = num%10;
	
	System.out.println("5986的千位数是："+qian);
	System.out.println("5986的百位数是："+bai);
	System.out.println("5986的十位数是："+shi);
	System.out.println("5986的个位数是："+ge);
	
	}





}