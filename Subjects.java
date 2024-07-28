import java.util.Scanner;
public class Subjects {
public	int eng;
public	int soc;
public	int sci;
public	int hin;
public	int math;
public	int tel;
	public void Subject() {
		Subjects sub=new Subjects();
	Scanner in=new Scanner(System.in);
	System.out.print("enter english marks:");
	  eng= in.nextInt();
	 System.out.print("enter Social marks:");
	  soc=in.nextInt();
	 System.out.print("enter maths marks:");
	  math=in.nextInt();
	 System.out.print("enter  science marks:");
	  sci=in.nextInt();
	 System.out.print("enter hindi marks:");
	  hin=in.nextInt();
	 System.out.print("enter telugu marks:");
	  tel =in.nextInt();
	}
	
	

}
