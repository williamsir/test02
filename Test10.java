class Test10{
	public static void main(String[] args){
	/*char ch = 'J';
	char ch1 = (char)(ch+32);
	System.out.println(ch1);
	char ch2 = 'a';
	ch2-=32;
	System.out.println(ch2);
	double d3 = 0.5;
	int i3 = 103;
	double sum3 = d3 + i3;
	System.out.println("sum3��ֵ�ǣ�"+sum3);
	System.out.println("sum3�����������ǣ�"+(int)sum3);
	double d4 = 4.0;
	int i4 = 435;
	int mul4 = (int)(d4 * i4);
	System.out.println("mul4�����������ǣ�"+mul4);
	*/
	/*
	int a1 = 10;
	int a2 = 11;
	System.out.print(a1+"��ż����"+(a1%2==0));
	//System.out.print(a1%2==0?true:false);
	System.out.println(a2+"��ż����"+(a1%2==0));
	//System.out.print(a2%2==0?true:false);
	int a3 = 12;
	int a4 = 11;
	System.out.println(a3+"��������"+(a1%2!=0));
	System.out.println(a4+"��������"+(a1%2!=0));
	*/
	/*
	int a = 20;
	int b = 20;
	boolean bo = (++a%3==0) && (a++%7==0);
	System.out.println("bo��ֵ��"+bo);
	System.out.println("a��ֵ��"+a);
	System.out.println("------------"); 
	boolean bo2 = ((b++ % 3) == 0) && ((++b % 7) == 0); ������ǰ��Ϊ׼
	  // 			20					21
	// boolean bo2 = ((++b % 7) == 0) && ((b++ % 3) == 0);
	System.out.println("bo2��ֵ��"+bo2);	
	System.out.println("b��ֵ��"+b);
	*/
	/*
	int hours = 89;
	int day = hours/24;
	int hour = hours%24;
	System.out.println("Ϊ�ֿ���ˮ��սʿ������ս"+hours+"Сʱ:");
	System.out.println(hours+"��"+day+"��"+hour+"Сʱ");
	*/
	/*
	int week = 2;
	    week += 100;
		week = week%7;
	System.out.println("��������2��100���Ժ�����"+(week==7?'��':week));
	*/	
	/*
	int x = 23;
	int y = 56;
	int z = 89;
	int max = x>y?x:y;
		max = max>z?max:z;
	System.out.println(x+","+y+","+z+","+"�����ֵ�ǣ�"+max);
	*/
	
	/*
	int year = 2021 ;
	boolean result == year%4==0 && year%100!=0 || year%400 ==0;
	System.out.println(year + (result?"������" : "��������")
	*/
	/*
	double hua = 80;
	double she = (hua-32)/1.8;
	System.out.println("���϶�" + hua+"�HתΪ���϶���" +she+"��");
	*/
	/*
	int i = 1;
	i *= 0.2;  //0.2 ������ȡ0��
	System.out.println("i=" + i);
	i++;
	System.out.println("i=" + i);
	*/
	
	int i = 2;
    int n= 2;
	n = n++;
	System.out.println("n=" + n);
	n = n+2;
	i *= i++;

int j = 2;
j *= j+1; 

int k = 2;
k *= ++k;
System.out.println("n=" + n);
System.out.println("i=" + i);//i=4
System.out.println("j=" + j);//i=6
System.out.println("k=" + k);//i=6
	}





}