package svkpcorejava;

public class Extendedforloop {

	public static void main(String[] args) {
		int number=8;
		boolean isprime=true;
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				isprime=false;
			}
		}
		if(isprime==true)
		{
			System.out.println("the number is a prime number");
			
		}
		else
		{
			System.out.println("the number is not a prime number");
		}

	}

}
