/*
 ��������ı�׼����������һ�����ɣ�
 1.�ܱ�4�������ܱ�100����
 
 2.�ܱ�400����
*/
import java.util.*;
class Runnian{
	public static void main(String[] args)
	Scanner input = new Scanner(System.in);
	System.out.print("��������Ҫ�жϵ���ݣ�");
	int year = input.nextInt();
	if(year%4==0 && year%100!=0 || year%400==0)
	System.out.println("����������Ϊ��"+year+"��\t"+"�жϽ��Ϊ����");
	System.out.println("����������Ϊ��"+year+"��\t"+"�жϽ����������");
	
	





}