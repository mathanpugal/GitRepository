package week5.day1;

public class stringExactDigit {
	public static void main(String[] args) {
		//exactDigit("1379",5);
		//perfectNumber(1);
		printSequence(4);
	}
	public static void exactDigit(String dig, int val)
	{
		int count = 0;
		for (int i = 0; i < dig.length(); i++)
		{
			int n1 = dig.charAt(i);
			if(n1>=49 && n1<=57)
			{
				count = count + 1;
			}
			else
			{
				break;
			}
		}
		if(count == val)
		{
			System.out.println("Given val : "+dig+" equal to "+val+" digits");
		}
		else
		{
			System.out.println("Given val : "+dig+" not equal to "+val+" digits");
		}
	}
	public static void perfectNumber(int num)
	{
		int count = 0;
		if(num != 0)
		{
			for (int i = 1; i < num; i++)
			{
				if(num%i==0)
					count = count + 1;	
			}
			if(count/2 == num)
				System.out.println(num+" - Is A Perfect Number");
			else
				System.out.println(num+" - Is Not A Perfect Number");
		}
		else
			System.out.println(num+" - Is Not A Perfect Number");
	}
	
	public static void printSequence(int num)
	{
		String num1 = "";
		if(num>0)
		{
			for(int i=1;i<=9;i++)
			{
				for(int j=0;j<num;j++)
				{
					num1=num1+i;
				}
				System.out.print(num1+" ");
				num1 = "";
			}
		}
		else
		{
			System.out.println("Entered Number Must Be greater Than 0");
		}
	}
		
}