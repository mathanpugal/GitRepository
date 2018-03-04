package week2.day1;

public class DailyAssesment {
	public void verifyPassword()
	{
		String pwd = "Jaypmk1967";
		int charCount = 0, numCount = 0, capsCount = 0;
		boolean valid = true;
		if(pwd.length() < 10)
		{
			System.out.println("Password Must Have Atleast 10 Characters");
		}
		else
		{
			for(int i = 0; i<pwd.length() ; i++)
			{
				char seperateChar = pwd.charAt(i);
				if(('a'<= seperateChar && 'z' >= seperateChar)||('A'<= seperateChar && 'Z' >= seperateChar))
				{
					charCount = charCount + 1;
				}
				if('0'<= seperateChar && '9' >= seperateChar)
				{
					numCount = numCount + 1;
				}
				if('A'<= seperateChar && 'Z' >= seperateChar)
				{
					capsCount = capsCount + 1;	
				}
				if(('a'<= seperateChar && 'z' >= seperateChar)||('A'<= seperateChar && 'Z' >= seperateChar)||('0'<= seperateChar && '9' >= seperateChar))
				{
					valid = true;
				}
				else
				{
					valid = false;
					System.out.println("Only Letters And Digits Are Acceptable");
					break;
				}
			}
			if(valid == true)
			{
				if(charCount < 2)
				{
					System.out.println("Atleast 2 Letters Should Be Entered");
				}
				if(numCount < 2)
				{
					System.out.println("Atleast 2 Numbers Should Be Entered");
				}
				if(capsCount == 0)
				{
					System.out.println("Atleast 1 Capital Letter Should Be Entered");
				}
			}
			if((valid==true) && (numCount >= 2) && (charCount >= 2) && (capsCount>=1))
			{
				System.out.println("Password Accepted");
			}
			else
			{
				System.out.println("Password Not Accepted");
			}
		}
	}
}
