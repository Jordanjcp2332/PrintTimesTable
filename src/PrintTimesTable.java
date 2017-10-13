import java.util.Scanner;
public class PrintTimesTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int hi;
		int low;
		System.out.println("Highest Number: ");
		hi=in.nextInt();
		System.out.println("Lowest Number: ");
		low=in.nextInt();
		
		int tab=(hi-low); 
		int nump;
		
		
		for (int x=low;x<=hi;x++) {
			System.out.print("\t"+x+"\t");	
			
		}  
		
		
		
		
		

	}

}
