package week0.day1;

public class AssignmentWeek1 {
	String dayString=null;
	public String dayInWeek(String day)
	{
		if(day==null)
		{
			return "Null Value Entered";
		}
		switch(day.toLowerCase())
		{
			case "sunday":
				dayString="1st Day Of Week";
				break;
			case "monday":
				dayString="2nd Day Of Week";
				break;
			case "tuesday":
				dayString="3rd Day Of Week";
				break;
			case "wednesday":
				dayString="4th Day Of Week";
				break;
			case "thursday":
				dayString="5th Day Of Week";
				break;
			case "friday":
				dayString="6th Day Of Week";
				break;
			case "saturday":
				dayString="7th Day Of Week";
				break;
			default:
				dayString="In Valid Day Entered";
				break;
		}
		return dayString;
	}
	
	public void stringValidation(String Str1,String Str2,String Str3,String Str4,String Str5){
		
		if(Str1==Str2)
			System.out.println("String1 And String2 Are Equal");
		else
			System.out.println("String1 And String2 Are Not Equal");
		
		if(Str1.equals(Str2))
			System.out.println("String1 And String2 Are Equal");
		else
			System.out.println("String1 And String2 Are Not Equal");
		
		if(Str1==Str3)
			System.out.println("String1 And String3 Are Equal");
		else
			System.out.println("String1 And String3 Are Not Equal");
		
		if(Str1.equals(Str3))
			System.out.println("String1 And String3 Are Equal");
		else
			System.out.println("String1 And String3 Are Not Equal");
		
		if(Str1.equalsIgnoreCase(Str4))
			System.out.println("String1 And String4 Are Equal");
		else
			System.out.println("String1 And String4 Are Not Equal");
		
		if(Str3.contains(Str5))
			System.out.println("String3 Contains String5");
		else
			System.out.println("String3 Does Not Contains String5");
	}
	public void Palindrome(String Val)
	{
		System.out.println(Val.length());
		String[] alphabets = Val.split("");
		//Val.getBytes()
		for(String alphabet : alphabets)
		    {
		    System.out.println(alphabet);
		    }
	}
	
	public void SumOfDigits(int n)
	{
		int a = 0;
		//int b = 0;
		int c = 0;
		while(n%10 > 0)
		{
			//Remainder
			a = n % 10;
			//quotient
			n = n/10;
			c  = a+n;
			
		}
	}
	
}