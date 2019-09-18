package testpkg;

import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class MinMaxArray {

	Integer[] array = {1, 45, 77, 88, 33, 23, 4};

	@Test(priority=1)
	public void sort() {

		Arrays.sort(array);
		System.out.println("Minimum number in Array "+array[0]);
		System.out.println("Maximum number in Array "+array[array.length-1]);
	}



	@Test(priority=2)
	public void usingCollection() {
		Integer max= Collections.max(Arrays.asList(array));


		Integer min= Collections.min(Arrays.asList(array));
		System.out.println("Min:"+min);	
		System.out.println("Max:"+max);
	}

	@Test(priority=3)
	public void usingForLoop() {
		int min=array[0];
		int max=array[0];

		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
			else if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("Min:"+min);
		System.out.println("Max:"+max);
	}

}

