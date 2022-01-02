/*
 满足闰年的标准，两者满足一个即可；
 1.能被4整除不能被100整除
 
 2.能被400整除
*/
import java.util.*;
class Runnian{
	public static void main(String[] args)
	Scanner input = new Scanner(System.in);
	System.out.print("请输入你要判断的年份：");
	int year = input.nextInt();
	if(year%4==0 && year%100!=0 || year%400==0)
	System.out.println("你输入的年份为："+year+"年\t"+"判断结果为闰年");
	System.out.println("你输入的年份为："+year+"年\t"+"判断结果不是闰年");
	
	





}