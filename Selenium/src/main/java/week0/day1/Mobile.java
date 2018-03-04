package week0.day1;

public class Mobile 
{
	int[] phoneNumber = {11,12,13,14,15};
	String[] fName = {"Ram","Magi","Raj","Venkat","Leo"};
	
	//To Return Name Based on phone number
	
	public String returnName(int mNumber)
	{
		if (mNumber == phoneNumber[0])
			return fName[0];
		
		else if (mNumber == phoneNumber[1])
			return fName[1];

		else if (mNumber == phoneNumber[2])
			return fName[2];
		
		else if (mNumber == phoneNumber[3])
			return fName[3];

		else if (mNumber == phoneNumber[4])
			return fName[4];

		else
			return addNumber(mNumber);
	}
	
	public String addNumber(int n)
	{
		return "Number " + n +  " Added To Contacts";
	}
	
	// To Check Whether We Have A Mobile
	public boolean haveMobile()
	{
		return true;
	}

	// To Do Call
	public void doCall(int phoneno)
	{
		System.out.println("Call Done");
	}

	// To Check For Missed Call
	public void missedCall()
	{
		System.out.println("Is Call Missed : True");
	}

	// To Pay Bill Online
	public int payBill(int a, int b)
	{
		//System.out.println("Amount Transfered : " +(a+b));
		return a + b;
	}

	// To send a Text message
	public static void doText()
	{
		System.out.println("Texting Done");
	}

	public static void main(String[] args) {
		/*int a = payBill(100,200);
		System.out.println("Transfered Amount : " +a);*/
	}
}