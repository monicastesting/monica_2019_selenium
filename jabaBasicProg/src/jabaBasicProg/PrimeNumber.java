package jabaBasicProg;

public class PrimeNumber {

	public static boolean isPrimeNum(int num)
	{
		if(num<=1)
		{ return false;
		}
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{return false;
			}
			
		}
		return true;
	}
	
	public static void range(int numrange)
	{
		for (int i=2;i<=numrange;i++){
			if(isPrimeNum(i)){
			System.out.println(i+"  is ::"+isPrimeNum(i));
		}
			}
	}
	
	
	public static void main(String[] args) {
		
		range(31);
	}

}