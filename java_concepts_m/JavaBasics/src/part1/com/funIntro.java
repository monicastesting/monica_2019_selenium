package part1.com;

public class funIntro {

	public static void main(String[] args) {
		funIntro obj= new funIntro();
		
		obj.abc();
	
		String s1=	obj.efg();
		System.out.println(s1);
		
		obj.test();
		
		int z1=obj.div(15, 3);
		System.out.println(z1);
	}
public void test()
{ System.out.println("no ip no op");
}

public int abc()
{ int a=10,b=20,c=a+b;
System.out.println( "hi"+ c);
return c;
}
public String efg()
{   String s= "selenium";
return s;
}
public int div(int s,int y)
{ int z= s/y;
return z;
}

}
