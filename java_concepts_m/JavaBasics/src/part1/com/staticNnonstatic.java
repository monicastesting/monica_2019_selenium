package part1.com;

public class staticNnonstatic {

	
		String name ="tom";  //non static var
		 static int age = 30;
    
		 public static void main(String[] args) {
	
		 
		 sum();
		 staticNnonstatic.sum();
		 
		 System.out.println(age);
		 System.out.println(staticNnonstatic.age);
		 staticNnonstatic obj= new staticNnonstatic();
		 obj.sendsum();
		 obj.sum();// warning msg while accessing
		 
		 
		 
		 
		 }
public static void sum()
{ System.out.println("hello");
}

public void sendsum(){ //non static method
	System.out.println("hello");	
}
}
