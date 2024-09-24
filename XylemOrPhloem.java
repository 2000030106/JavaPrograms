class XylemOrPhloem 
{
	public static void main(String[] args) 
	{
		int num=51242;
		int ld=num%10;
		int sum1=0; int sum2=0;
		num/=10;
		sum1=sum1+ld;
		while(num>9)
		{
			ld=num%10;
			sum2=sum2+ld;
			num/=10;
		}
		sum1+=num;
		if(sum1==sum2)
		{
			System.out.println("Given Number is Xylem Number");
		}
		else{
			System.out.println("Given Number is Pholem Number");
		}


	}
}




		 
		
	