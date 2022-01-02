/*
条件运算符：

语法规则： X?Y:Z;
  X: 是boolean类型的表达式
	当 X 为true的时候
	执行Y表达式
	
	当 X 为false的时候
	执行Z表达式
*/

class Test09sanmu{
	public static void main(String[] args){
	
		int age = 20;
		
		String result = age >= 18?"成年了":"未成年";
		System.out.println(result);
	//比较两数大小
	int num1 = 10;
	int num2 = 20;
	System.out.println("比较num1 = 10和num2 = 20 的大小");
	System.out.println("结果是：");	
	String result1 = num1 > num2?"num1大于num2":"num2大于num1";
	System.out.println(result1);
	String result2= num1 > num2?"较大数是"+num1:"较大数是"+num2;
	System.out.println(result2);
	
	//求三个数中最大数
	int a = 12;
	int b = 26;
	int c = 69;
	int result0 = a > b?a:b;
	int max = result0 > c?result0:c;

	System.out.println("最大数是："+max);
	
	}
	}