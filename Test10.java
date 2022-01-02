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
	System.out.println("sum3的值是："+sum3);
	System.out.println("sum3的整数部分是："+(int)sum3);
	double d4 = 4.0;
	int i4 = 435;
	int mul4 = (int)(d4 * i4);
	System.out.println("mul4的整数部分是："+mul4);
	*/
	/*
	int a1 = 10;
	int a2 = 11;
	System.out.print(a1+"是偶数？"+(a1%2==0));
	//System.out.print(a1%2==0?true:false);
	System.out.println(a2+"是偶数？"+(a1%2==0));
	//System.out.print(a2%2==0?true:false);
	int a3 = 12;
	int a4 = 11;
	System.out.println(a3+"是奇数？"+(a1%2!=0));
	System.out.println(a4+"是奇数？"+(a1%2!=0));
	*/
	/*
	int a = 20;
	int b = 20;
	boolean bo = (++a%3==0) && (a++%7==0);
	System.out.println("bo的值："+bo);
	System.out.println("a的值："+a);
	System.out.println("------------"); 
	boolean bo2 = ((b++ % 3) == 0) && ((++b % 7) == 0); 后者以前者为准
	  // 			20					21
	// boolean bo2 = ((++b % 7) == 0) && ((b++ % 3) == 0);
	System.out.println("bo2的值："+bo2);	
	System.out.println("b的值："+b);
	*/
	/*
	int hours = 89;
	int day = hours/24;
	int hour = hours%24;
	System.out.println("为抵抗洪水，战士连续作战"+hours+"小时:");
	System.out.println(hours+"是"+day+"天"+hour+"小时");
	*/
	/*
	int week = 2;
	    week += 100;
		week = week%7;
	System.out.println("今天是周2，100天以后是周"+(week==7?'日':week));
	*/	
	/*
	int x = 23;
	int y = 56;
	int z = 89;
	int max = x>y?x:y;
		max = max>z?max:z;
	System.out.println(x+","+y+","+z+","+"中最大值是："+max);
	*/
	
	/*
	int year = 2021 ;
	boolean result == year%4==0 && year%100!=0 || year%400 ==0;
	System.out.println(year + (result?"是闰年" : "不是闰年")
	*/
	/*
	double hua = 80;
	double she = (hua-32)/1.8;
	System.out.println("华氏度" + hua+"℉转为摄氏度是" +she+"℃");
	*/
	/*
	int i = 1;
	i *= 0.2;  //0.2 整数型取0；
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