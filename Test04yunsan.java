/*
	byte��byte  short��short������ 
	����char��char��������֮��������
	���Խ������int����
*/
/*
	++ 	--
	a++; ��Ӽ� ������ �ټ�1
	++a; ǰ�Ӽ� �ȼ�1 ������
	
*/
class Test04yunsan{
	public static void main(String[] args){
		System.out.println(3+2);	// ������5
		System.out.println(3-2);	// ������1
		System.out.println(3*2);	// ������6
		System.out.println(3/2);	// ������1
		System.out.println(3.0/2);	// ������1.5 С��Ĭ��double����
		System.out.println(3%2);	// ������1
		
		char a='A';
		char b='a';
		System.out.println(a);	// ������A
		System.out.println((int)a);	// ������65
		System.out.println(b);	//������a
		System.out.println((int)b);	// ������97
		System.out.println("a+b="+(a+b)); //������162
	   
	    int c = 10;
		System.out.println(c++);	//������Ϊ10
		System.out.println(c);		//������Ϊ11
		
	    int d = 10;
		System.out.println(++d);	//������Ϊ11
		
	    c = 10;
		d = 20;
		int result1 = c++ + d++;
		int result2 = result1 + ++c ;
		int result3 = result2 + ++d;
		System.out.println(result1); //������Ϊ30
		System.out.println(result2); //������Ϊ42
		System.out.println(result3); //������Ϊ64
	    c = 10;
		d = 20;
		int result4 = c++ + d++ + ++c + ++d; //������Ϊ64
	    System.out.println(result4);
	
	}



}