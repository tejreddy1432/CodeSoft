
public class Grades extends Avgpercentage {
	public  void grades() {
		if(per>90&&per<100) {
			System.out.print("Grade:'A'");
		}
		else if(per>80&&per<89){
				System.out.print("Grade:'B'");
				
			}
		else if(per>70&&per<79){
				System.out.print("Grade:'C'");
				
			}
		else if(per>60&&per<69){
				System.out.print("Grade:'D'");
				
			}
		 else
		 {
			 System.out.println("Grade:'f'");
		 }
	
		
	}
	

}
