package part1.com;

public class ARRAY_2D_Demo {

	public static void main(String[] args) {
	String x[][]= new String[2][3];
	System.out.println(x.length);
	System.out.println(x[0].length);
	x[0][0]= "this";
	x[0][1]="that";
	x[0][2]="these";
	
	x[1][0]="is";
	x[1][1]="an";
	x[1][2]="or";
  for (int i=0;i<x.length;i++){
	  for(int j=0;j<x[0].length;j++)
	  {
		  System.out.println(x[i][j]+" line no"+i);
	  }
  }
	}

}
