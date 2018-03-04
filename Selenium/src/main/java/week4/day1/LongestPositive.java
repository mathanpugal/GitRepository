package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class LongestPositive {

	public static void main(String[] args) {
		largePoisitive();
	}
	public static void largePoisitive()
	{
		int intArray[]= {-1,2,-3,-4,5,6,7,8,-9,10};
		List<Integer> newList = new ArrayList<Integer>();
		List<Integer> newList1 = new ArrayList<Integer>();
		int count = 0;
		for(int i = 0 ; i < intArray.length ; i++)
		{
			if(intArray[i] >=0)
			{
				newList.add(count, intArray[i]);
				//System.out.println("Count : " +count+" Value : "+intArray[i]);
				count++;
			}
		}
		for(int j=0 ; j < newList.size() -1 ; j++)
		{
			if((newList.get(j+1) - newList.get(j)) == 1)
			{
				if(newList1.size()==0)
				{
					newList1.add(newList1.size(),newList.get(j));
					newList1.add(newList1.size(),newList.get(j+1));
				}
				if(newList.get(j+1) - newList1.get(newList1.size() - 1) == 1)
				{
					newList1.add(newList1.size(),newList.get(j+1));
				}
			}
		}
		System.out.print("Output : ");
		for(int k = 0 ; k < newList1.size() ; k++)
		{
				System.out.print(newList1.get(k));
		}
		System.out.println("");
		System.out.print("Sequence Length : "+newList1.size());
	}
}
