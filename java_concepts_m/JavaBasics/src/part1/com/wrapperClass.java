package part1.com;

public class wrapperClass {
    //data conversion class
	
	public static void main(String[] args){
		String i= "100";
		System.out.println(i+20);
		
		int ii=Integer.parseInt(i);
		System.out.println(ii+20);
		
		Double i1=Double.parseDouble(i);
	System.out.println(i1);
	
	
		String a="A";
		boolean b=Boolean.parseBoolean(a);
		System.out.println(b);
		
		int w=100;
		String w1= String.valueOf(w);
		System.out.println("aasdd"+w1);
	}
}
