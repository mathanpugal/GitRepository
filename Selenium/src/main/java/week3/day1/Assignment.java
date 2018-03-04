package week3.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		/*Assignment obj = new Assignment();
		obj.largestNumber(155, 5);*/
		//addDiagonal();
		//uiqueString();
		pascalTriangle();
	}

	public static void uiqueString()
	{
		String newStr = "Good Looking";
		int count = 0;
		String oneString = "";
		oneString = oneString + newStr.toLowerCase().charAt(0);
		for(int i = 0; i< newStr.length() ; i++)
		{
			for(int j = 0; j < oneString.length(); j++ )
			{
				if(newStr.toLowerCase().charAt(i)!=oneString.toLowerCase().charAt(j)) 
				{
					count = count + 1;
				}
			}
			if(count == oneString.length() && newStr.charAt(i) != ' ')
			{
				oneString = oneString.toLowerCase() + newStr.toLowerCase().charAt(i);
			}
			count = 0;
		}
		System.out.println(oneString);
	}

	public void largestNumber(int num, int dig)
	{
		String n = Integer.toString(num);
		String d = Integer.toString(dig);
		boolean boolRes = n.contains(d);
		while(boolRes == true)
		{
			num = num - 1;
			n = Integer.toString(num);
			d = Integer.toString(dig);
			boolRes = n.contains(d);
		}
		System.out.println(num);
	}
	public static void addDiagonal()
	{
		int[][] addArray = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int n = 0,n1=0;
		int sum1 = 0, sum2 = 0;
		List<Integer> newList1 = new ArrayList<>();
		int rowCount = addArray.length;
		for(int i = 0; i < rowCount ; i++)
		{
			int colCount = addArray[i].length;
			if(i < rowCount - 1)
			{
				for(int j = 0 ; j <= colCount - n; j++)
				{
					sum1 = sum1 + addArray[i][j];
					newList1.add(addArray[i][j]);
					n++;
				}
				n = i + 2;
			}
		}

		List<Integer> newList2 = new ArrayList<>();
		for(int i = rowCount - 1; i > 0 ; i--)
		{
			int colCount = addArray[i].length;
			for(int j = colCount - 1; j > n1 ; j--)
			{
				sum2 = sum2 + addArray[i][j];
				newList2.add(addArray[i][j]);
			}
			n1 = n1 + 1;
		}

		if(sum1 > sum2)
		{
			for(int l = 0 ; l < newList1.size() ; l++)
			{
				System.out.println(newList1.get(l)+" ");
			}
		}
		else if(sum2 > sum1)
		{
			for(int l = newList2.size()-1 ; l >= 0 ; l--)
			{
				System.out.print(newList2.get(l)+" ");
			}
		}
		else
		{
			System.out.println("Sum of both the values are same");
		}
	}

	public static void pascalTriangle()
	{
		int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);			
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
		for(i=0;i<r;i++)
		{
			for(k=r; k>i; k--)
			{
				System.out.print(" ");
			}
			number = 1;
			for(j=0;j<=i;j++)
			{
				System.out.print(number+ " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
