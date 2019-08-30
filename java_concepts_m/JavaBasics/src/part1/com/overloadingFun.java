package part1.com;

public class overloadingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloadingFun obj =new overloadingFun();
		obj.sum(10);
		obj.sum(10,19);
		obj.sum();
		
	}
   public static void main(double m){
	   System.out.println(m);
   }
	
	
	public void sum(){
		System.out.println("aaaaaaaaahj");
	}
	public void sum(int n,int j){
		System.out.println("gssssssssssssjghj");
	}
	
    public void sum(int k){
    	System.out.println("gfhfggjghjghj");
	}
}
