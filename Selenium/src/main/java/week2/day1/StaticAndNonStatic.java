package week2.day1;

public class StaticAndNonStatic {
	public static void main(String[] args) {
		//primeFactors(24);
		StaticAndNonStatic obj = new StaticAndNonStatic();
		//obj.factors(6);
		obj.sumOfMultiples(100);
	}
	public void factors(int num)
	{
		int n;
		for(int i=1;i<=num;i++)
		{
			n = num % i;
			if(n==0)
			{
				System.out.println("Factors Of "+num+" is : " +i);
			}
		}
	}

	public static void primeFactors(int num)
	{
		int n , count = 0;
		for(int i=1;i<=num;i++)
		{
			n = num % i;
			if(n==0)
			{
				if(i==1)
				{
					System.out.println("Prime Factors Of "+num+" is : " +i);
				}
				else
				{
					for(int j=1;j<=i;j++)
					{
						if(i%j == 0)
						{
							count = count + 1;
						}
					}
					if(count == 2)
					{
						if(num%i == 0)
						{
							System.out.println("Prime Factors Of "+num+" is : " +i);
						}
					}
				}
			}
			count =0;
		}
	}

	public void sumOfMultiples(int num)
	{
		int sum=0, three = 0, five = 0;
		if(num == 0)
		{
			System.out.print("Sum Of Multiple "+num+" is : "+sum);
		}
		else
		{
			for(int i = 1; i < num ; i++)
			{
				three = i%3;
				five = i%5;
				if(three==0||five==0)
				{
					System.out.print(i+" ");
					sum =sum + i;
				}
			}
			System.out.println("");
			System.out.print("Sum Of Multiple "+num+" is : "+sum);
		}
	}	
}

