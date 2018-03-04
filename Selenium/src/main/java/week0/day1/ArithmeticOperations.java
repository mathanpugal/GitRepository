package week0.day1;

public class ArithmeticOperations {
	int a = 0;
	int b = 1;
	int c = 0;
	public void oddNumbers()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
				System.out.println("Odd Number : "+i);
			else
				System.out.println("Even Number : "+i);
		}
	}
	
	public void fibo()
	{
		System.out.println("Fibonacci Series");
		System.out.println(a);
		System.out.println(b);
		for(int j=1;j<=100;j++)
		{
			c = a + b;
			if(c>100)
				break;
			else
			{
				System.out.println(c);
				a = b;
				b = c;
			}
		}
	}
	// ASSIGNMENT 26-12-2017
	public void multiply(int m)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+ " * "+ m + " = " + (m*i));
		}
	}
	
	public void primeNumber(int Num)
	{
		int Count=0;
		for(int i=1;i<=Num;i++)
		{
			if(Num%i==0)
			{
				Count = Count + 1;
			}
		}
		
		if(Num==1)
			System.out.println("Number "+Num+ " Is Prime");
		else 
		{
			if(Count==2)
				System.out.println("Number "+Num+ " Is Prime");
			else
				System.out.println("Number "+Num+ " Is Not Prime");
		}
	}
	
	public void arrayOneD()
	{
		int[] intArray = {1,2,3,4,5};
		for(int i=0;i<intArray.length;i++)
		{
			System.out.println("Array - "+i+" : " +intArray[i]);
		}
	}
	
	public void arrayTwoD()
	{
		int[][] intArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
/*		System.out.println("Length : "+intArray.length );
		System.out.println("Length : "+intArray[0].length);*/
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=0;j<intArray[i].length;j++)
			{
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void arithmeticOperators()
	{
		int n1 = 5;
		int n2 = 3;
		boolean flag = true;
		
		System.out.println("n1++ : "+ n1++);
		System.out.println("n1 : "+n1);
		System.out.println("++n1 : "+ ++n1);
		System.out.println("n1 : "+n1);
		System.out.println("n2-- : "+ n2--);
		System.out.println("n2 : "+ n2);
		System.out.println("--n2 : "+ --n2);
		System.out.println("n2 : "+ n2);
		System.out.println("flag : "+flag);
		System.out.println("!flag : "+!flag);
	}
	public static void main(String[] args) {
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i]);
		}
	}
}
