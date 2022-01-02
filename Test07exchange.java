class Test07exchange{
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 20;
		System.out.println("交换前num1="+num1+"，num2="+num2);
		//第一种方法，建立第三者
		int temp=num1;
			num1=num2;
			num2=temp;
		System.out.println("交换后num1="+num1+"，num2="+num2);
	   /*第二种方法
		和 = 加数1 + 加数2
		加数1 = 和 - 加数2
		加数2 = 和- 加数1
		*/
		num1 = 10;
		num2 = 20;
		num1=num1 + num2;
		num2=num1 - num2;
		num1=num1 - num2;
		System.out.println("交换后num1="+num1+"，num2="+num2);	
	
	}



}