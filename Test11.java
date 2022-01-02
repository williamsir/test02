class Test11{
	public static void main(String[] args){
	
	int i = 2;
	int j = 2;
	int x = 2;
	int y = 2;
    if(i++>=2 & --x>=2)
	i++;
	System.out.println("i="+i+"x="+x); // i=3 x=1
	if(j++<2 && --y>=2) //短路与 前面false则不需要看后面
	j--;
	System.out.println("j="+j+"y="+y); //j=3 y=2
	
	
	
	
	}




}