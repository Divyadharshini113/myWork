package testpkg;

import org.testng.annotations.Test;

public class Reverse {

	String comp= "This is the world";
	String rev="";
	
	@Test
	public void Approach1() {
	char[] charArray = comp.toCharArray();
	for(int i=comp.length()-1; i >=0; i--) {
		rev=rev+charArray[i];}
	System.out.println(rev);
			}

	
	@Test
	public void Approach2() {
		String comp1= "This is the world";
		
		StringBuffer b= new StringBuffer(comp1);
		System.out.println(b.reverse());
		
	
		
	}
	


		
	}


