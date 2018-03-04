package week1.day1;

import org.apache.poi.util.SystemOutLogger;

public class Week1Assesment2 {

	public void armstrongNumber() {
		int armstrongNo = 153;
		for(int i = 100; i <= 1000 ; i++)
		{
			int temp1, temp2 =0;
			armstrongNo = i;
			while(armstrongNo > 0)
			{
				temp1 = armstrongNo % 10;
				armstrongNo = armstrongNo / 10;
				temp2 = temp2  + (temp1*temp1*temp1);
			}
			if(temp2 == i)
			{
			 System.out.println("Armstrong Number : "+i);	
			}
		}
	}

	public void repetedNumbers()
	{
		int[] ary = {13,15,67,88,65,13,99,67,65,87,13};
		for(int i = 0; i<ary.length-1 ; i++)
		{
		int count=0;
		for(int j = i+1; j<ary.length ; j++)
			{
			if((ary[i] == ary[j]) && (i!=j))
				{
				 count=count+1;
				}
			}
		if(count == 1)
		{
			System.out.println("Duplicate Number : " +ary[i]);
		}
		}
	}
	
	public void reverseNumber(int iNum)
	{
		int num = iNum;
		int rNum = 0;
		while(num!=0)
		{
			rNum = rNum * 10;
			rNum = rNum + num % 10;
			num = num/10;
		}
		System.out.println("Reverse Of : "+iNum+" is : "+rNum);
	}
	
	public void addMatrix()
	{
		int[][] matrix1 = {{1,2},{3,4}};
		int[][] matrix2 = {{5,6},{7,8}};
		int[][] matrix3 = new int[2][2] ;
		if(matrix1.length == matrix2.length)
		{
			for(int row=0 ; row < matrix1.length ; row++)
			{
				if(matrix1[row].length == matrix2[row].length)
				{
					for(int column=0 ; column < matrix1[row].length ; column++)
					{
						matrix3[row][column]=matrix1[row][column]+matrix2[row][column];
						System.out.println("Matrix3 :"+matrix3[row][column]);
					}
				}
				else
				{
					System.out.println("Matrix Of Different Column Length Can Not Be Added.");
					System.out.println("Matrix1 Column Length : "+matrix1[row].length);
					System.out.println("Matrix2 Column Length : "+matrix2[row].length);
				}
			}
		}
		else
		{
			System.out.println("Matrix Of Different Row Length Can Not Be Added");
			System.out.println("Matrix2 Row Length : "+matrix1.length);
			System.out.println("Matrix2 Row Length : "+matrix2.length);
		}
	}
	
	public void largestSmallestArrayNumbers()
	{
		int[] ary = {32,43,53,54,32,65,63,98,43,23};
		int num = 0;
		int a, b = ary[1];
		int c = ary[1];
		while(num<ary.length)
		{
			a =  ary[num];
			if(a>=b)
			{
				b = a;
			}
			if(a<=c)
			{
				c = a;
			}
			num = num + 1;
		}
		System.out.println("Biggest Numbe In Array : "+b);
		System.out.println("Smallest Number In Array : "+c);
	}
	public void armstrongNumberInput(int Num) {
		int armstrongNo = Num;
		int temp1, temp2 =0;
		while(armstrongNo > 0)
		{
			temp1 = armstrongNo % 10;
			armstrongNo = armstrongNo / 10;
			temp2 = temp2  + (temp1*temp1*temp1);
		}
		if(temp2 == Num)
		{
			System.out.println(Num+ " - Is A Armstrong Number");	
		}
		else
		{
			System.out.println(Num+ " - Is Not A Armstrong Number");
		}
	}
	
	public void spiralMatrix()
	{

		int[][] matrix = {{1,2,3,4},
						  {5,6,7,8},
						  {9,10,11,12},
						  {13,14,15,16}};
		int rowStart = 0; 
		int rowEnd = matrix.length - 1;
		int columnStart = 0;
		int columnEnd = matrix[0].length - 1;
		while((rowStart<=rowEnd) && (columnStart<=columnEnd)) 
		{
			for(int i = rowStart;i<=rowEnd;i++)
			{
				System.out.println(matrix[rowStart][i]);
			}
			for(int j = rowStart + 1;j<=rowEnd;j++)
			{
				System.out.println(matrix[j][columnEnd]);
			}
			if(rowStart+1 <= rowEnd)
			{
				for(int k = columnEnd - 1;k>=columnStart;k--)
				{
					System.out.println(matrix[rowEnd][k]);
				}
			}
			if(columnStart+1 <= columnEnd)
			{
				for(int k = rowEnd - 1;k>rowStart;k--)
				{
					System.out.println(matrix[k][columnStart]);
				}
			}
			
			rowStart ++;
			rowEnd --;
			columnStart ++;
			columnEnd--;
		}
	}
}