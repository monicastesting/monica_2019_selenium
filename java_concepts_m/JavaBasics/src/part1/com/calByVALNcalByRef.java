package part1.com;

public class calByVALNcalByRef {

	public static void main(String[] args) {
		calByVALNcalByRef obj= new calByVALNcalByRef();
		int a=10;
		int b=20;
		obj.testsum(a, b);

	}
public int testsum(int a, int b){
	int c =a+b;
	return c;
}
	
	
	
	
}
