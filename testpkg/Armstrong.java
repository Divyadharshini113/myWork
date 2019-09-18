package testpkg;

public class Armstrong {

	public static void main(String[] args) {

		int calc=0,  remainder;
		int n=153;
		int original = n;
		while(n>0) {
			remainder=n%10;	
			calc=calc+(remainder*remainder*remainder);
			n=n/10;
		}
		if(original== calc)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
	}

}

