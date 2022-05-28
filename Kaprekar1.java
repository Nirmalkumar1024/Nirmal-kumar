class  Kaprekar1
{
	public static void main(String[] args) 
	{
		Kaprekar();
	}
	public static void Kaprekar()
	{
		int given=45;
		int exp=given*given;
		int kar=exp;
		int temp=1;
		int count=0;
		int sum=0;
		int sum1=0;
        
		while (exp>0)
		{
			int rem=exp%10;
			rem=rem+exp;
			exp=exp/10;
			count++;
		}
		//System.out.println(count);
          if (count%2==0)
          {
			  count=count/2;
          }
		  else
			  count=(count/2)+1;
		for (int j=count;j>0 ;j-- )
		{
			  temp=temp*10;
		}
		//System.out.println(temp);
		//System.out.println(exp);
		sum=kar%temp;
		sum1=kar/temp;
		//System.out.println(sum);
		//System.out.println(sum1);
		if ((sum+sum1)==given)
		{
			System.out.println("this "+given+" is kaprekar");
		}
		else 
			System.out.println("this "+given+" is not kaprekar");
		
	}
}
