package testpkg;

import org.testng.annotations.Test;

public class Fibonacci {

	//public static void main(String[] args) {

	@Test(priority=1)
	public void Fibonacci1() {

		int n1=0, n2= 1, n3;
			int count = 10;

		System.out.print(n1+ " "+n2);

		for(int i=2; i<=count; i++)
		{
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);

		}


	}

	@Test(priority=2)
	public void Fib() {
		int t1=0, t2=1,t3, i=0, count=10;
System.out.println(" ");
		while(i<=count) {
			System.out.print(t1+" ");

			t3= t1 + t2;
			t1=t2;
			t2=t3;

			i++;

		}

	}

}
