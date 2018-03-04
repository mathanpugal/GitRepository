package week4.day1;

import java.awt.image.VolatileImage;

public class swapString {
	public static void main(String[] args) {
		//stringSwap();
		//stringConversion();
		swap();
	}
	public static void stringSwap()
	{
		String name1 = "Mathan";
		String name2 = "Jeevan";
		System.out.print("Before Swap :- ");
		System.out.print("Name1 : "+name1);
		System.out.println(", Name2 : "+name2);
		name1 = name2+name1;
		name2=name1.substring(name2.length(), name1.length());
		name1=name1.substring(0, name2.length());
		System.out.print("After Swap :- ");
		System.out.print("Name1 : "+name1);
		System.out.print(", Name2 : "+name2);
	}
	public static void stringConversion() 
	{
		String str1 = "TestLeaf";
		String str2 = "";
		int asciiVal;
		System.out.println("String Before Conversion : " +str1);
		for(int i = 0 ; i < str1.length() ; i++)
		{
			asciiVal = (int) str1.charAt(i);
			if(asciiVal > 96 && asciiVal < 123)
			{
				str2 = str2 + (char) (asciiVal-32);
			}
			else
			{
				str2 = str2 + (char) asciiVal;
			}
		}
		System.out.print("String After Conversion : " +str2);
	}
	
	public static void swap()
	{
		Integer num = 123;
		String strnum = num.toString();
		System.out.println(strnum);
		String temp,temp1="";
		for(int i = 0 ; i < strnum.length() ; i++)
		{
			temp = strnum.charAt(i)+"";
			for(int j = 0 ; j < strnum.length()-1 ; j++)
			{
				if(i!=j)
				{
					temp1 = temp1 + strnum.charAt(j)+temp;
				}
				System.out.println(temp1);
			}
			temp1 = "";
		}
	}
}