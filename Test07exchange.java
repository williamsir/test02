class Test07exchange{
	public static void main(String[] args){
		int num1 = 10;
		int num2 = 20;
		System.out.println("����ǰnum1="+num1+"��num2="+num2);
		//��һ�ַ���������������
		int temp=num1;
			num1=num2;
			num2=temp;
		System.out.println("������num1="+num1+"��num2="+num2);
	   /*�ڶ��ַ���
		�� = ����1 + ����2
		����1 = �� - ����2
		����2 = ��- ����1
		*/
		num1 = 10;
		num2 = 20;
		num1=num1 + num2;
		num2=num1 - num2;
		num1=num1 - num2;
		System.out.println("������num1="+num1+"��num2="+num2);	
	
	}



}