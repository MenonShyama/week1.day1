package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i;int m=0;
		int flag=0;
		int input =345679;
		m=input/2;
		if(input==0 || input==1)
		{
			System.out.println("It is not a Prime Number");
		}
		else
		{
			for(i=2;i<=m;i++)
			{
				if(input%i == 0)
				{
					System.out.println("It is not a Prime Number");
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println("It is a Prime Number");
			}
		}
	}

}
