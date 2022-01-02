/*
	byte与byte  short与short做运算 
	或者char与char，或他们之间混合运算
	测试结果会变成int类型
*/
/*
	++ 	--
	a++; 后加加 先运算 再加1
	++a; 前加加 先加1 再运算
	
*/
class Test04yunsan{
	public static void main(String[] args){
		System.out.println(3+2);	// 输出结果5
		System.out.println(3-2);	// 输出结果1
		System.out.println(3*2);	// 输出结果6
		System.out.println(3/2);	// 输出结果1
		System.out.println(3.0/2);	// 输出结果1.5 小数默认double类型
		System.out.println(3%2);	// 输出结果1
		
		char a='A';
		char b='a';
		System.out.println(a);	// 输出结果A
		System.out.println((int)a);	// 输出结果65
		System.out.println(b);	//输出结果a
		System.out.println((int)b);	// 输出结果97
		System.out.println("a+b="+(a+b)); //输出结果162
	   
	    int c = 10;
		System.out.println(c++);	//输出结果为10
		System.out.println(c);		//输出结果为11
		
	    int d = 10;
		System.out.println(++d);	//输出结果为11
		
	    c = 10;
		d = 20;
		int result1 = c++ + d++;
		int result2 = result1 + ++c ;
		int result3 = result2 + ++d;
		System.out.println(result1); //输出结果为30
		System.out.println(result2); //输出结果为42
		System.out.println(result3); //输出结果为64
	    c = 10;
		d = 20;
		int result4 = c++ + d++ + ++c + ++d; //输出结果为64
	    System.out.println(result4);
	
	}



}