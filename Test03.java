/*基本类型数据转换
	1.自动类型提升
		小的数据类型可以自动转换为大的数据类型
	2.强制类型转换；
		大的数据类型可以转换为小的数据类型，但有损失 
		小的数据类型 标识符 = （小的数据类型） 大的数据类型的值
*/
class Test03{
	
	public static void main(String[] args){
	
			byte b = 20; //0-127

			int i = b; //小范围转大范围，imt最大数在21亿左右
	
			System.out.println(i); 
	
			char c1 = 'A'; //两个字符
			System.out.println("===>>"+c1);
			int Num = c1; //四个字符
			System.out.println("===>>"+Num);
			//以上为自动类型提升、
	
			double d = 3.14;
			int x = (int)d; //小的数据类型 标识符 = （小的数据类型） 大的数据类型的值
			System.out.println(x);//输出结果为3
			
			float e = 6.66F;
			byte Y = (byte)e;
			System.out.println(Y);//输出结果为6
			
			int f=200; //四个字符
			byte Z = (byte)f; //一个字符，最高127
			/* 200二进制为1100 1000 byte最大127 故首位为符号-
			        原码: 1100 1000
					反码：1011 0111 首位不变，其余互补为1
					补码：1011 1000 = -56  末尾加1，遇2进1
						   
			System.out.println(Z);//输出结果为-56
	
	}
}