/*
�����������

�﷨���� X?Y:Z;
  X: ��boolean���͵ı��ʽ
	�� X Ϊtrue��ʱ��
	ִ��Y���ʽ
	
	�� X Ϊfalse��ʱ��
	ִ��Z���ʽ
*/

class Test09sanmu{
	public static void main(String[] args){
	
		int age = 20;
		
		String result = age >= 18?"������":"δ����";
		System.out.println(result);
	//�Ƚ�������С
	int num1 = 10;
	int num2 = 20;
	System.out.println("�Ƚ�num1 = 10��num2 = 20 �Ĵ�С");
	System.out.println("����ǣ�");	
	String result1 = num1 > num2?"num1����num2":"num2����num1";
	System.out.println(result1);
	String result2= num1 > num2?"�ϴ�����"+num1:"�ϴ�����"+num2;
	System.out.println(result2);
	
	//���������������
	int a = 12;
	int b = 26;
	int c = 69;
	int result0 = a > b?a:b;
	int max = result0 > c?result0:c;

	System.out.println("������ǣ�"+max);
	
	}
	}