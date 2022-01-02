/*
	赋值运算符:
	=
	+=
	-=
	*=
	/=
	%=
注意：不会发生数据类型转换
*/
class Test06fuzhi{
	public static void main(String[] args){
		int age = 10;
		int result = 6+4;
		System.out.println(age);
		System.out.println(result);
		 byte b = 10;
		 byte b1 = 20;
		 b+=b1; //数据类型不会改变
		 //b=b+b1; 数据类型会发生改变为int，输出b会报错
		 System.out.println(b);
	 
	}



}