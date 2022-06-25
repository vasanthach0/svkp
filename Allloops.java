package svkpcorejava;

public class Allloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop
		for(int i=1,j=1;i<10||j<10;i++,j++)
		{
			j++;
			System.out.println(i+j);
		}
		//while loop
		System.out.println("while loop");
		int i=1,j=1;
		while(i<10||j<10)
		{
			i++;j++;
			System.out.println(i+j);
		}
		//do while
		System.out.println("do while loop");
		
		do
		{
			i++;j++;
			System.out.println(i+j);
		}while(i<=10||j<=10);
		}

	}
