package week1.day1;

public class Week1Assesments 
{
	public int numFactorial(int factorNumber)
	{
		int multipleNumber = 1;
		for(int i = 1; i<=factorNumber ; i++)
		{
			multipleNumber = multipleNumber * i;
		}
		if(factorNumber>=0)
			{
				return multipleNumber;
			}
		else
		{
			return -1;
		}
	}
	
	public void arithOperation(int num1,int num2,String operator)
	{
		switch(operator.toLowerCase())
		{
		case "add":
			System.out.println("Addition Of "+num1+" and "+num2+" : " + (num1+num2));
			break;
			
		case "subtract":
			System.out.println("Subraction Of "+num1+" and "+num2+" : " + (num1-num2));
			break;
			
		case "multiply":
			System.out.println("Multiplication Of "+num1+" and "+num2+" : " + (num1*num2));
			break;
			
		case "divide":
			if(num2!=0)
			{
				System.out.println("Division Of "+num1+" and "+num2+" : " + (num1/num2));
				break;
			}
			else
			{
				System.out.println("Enter Valid Number for division. Divider cant be 0");
				break;
			}
			
		default:
			System.out.println("Enter Valid Operator Value. Should be add or subract or multipy or divide");
			break;
		}
	}
	
	public void printNumbers(int a,int b)
	{
		int mod1 = 0, mod2 = 0;
		if(b >= a)
		{
			for(int i = a; i<=b; i++)
			{
				mod1 = i % 3;
				mod2 = i % 5;
				if(mod1 == 0 && mod2 == 0)
				{
					System.out.print(" FIZZBUZZ ");
				}
				else if(mod1 == 0)
				{
					System.out.print(" FIZZ ");
				}
				else if(mod2 == 0)
				{
					System.out.print(" BUZZ ");
				}
				else
				{
					System.out.print(" " +i+ " ");
				}
			}
		}
		else
		{
			System.out.println("Enter Valid input values. Int2 should by >= Int1");
		}
	}

	public void armstrongNumber()
	{
		int armstrongNo;
		int temp1 = 0 , temp2 = 0;
		for(int i = 100; i <= 1000 ; i++)
		{
			armstrongNo = i;
			while(armstrongNo > 0)
			{
				temp1 = armstrongNo % 10;
				armstrongNo = armstrongNo / 10;
				temp2 = temp2  + (temp1*temp1*temp1);
			}
			if(temp2 == armstrongNo)
			{
			 System.out.println("Armstrong Number : "+armstrongNo);	
			}
		}
	}
}
