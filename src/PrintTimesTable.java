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
		
		if(low<hi) {
			int con=(hi-low)+1; 
			int vert=low;
			int vert2=low;
			int hori=low; 
			
			 System.out.print("\t\t");
				for (int x=low;x<=hi;x++) {
					System.out.print("\t"+x+"\t");	
					
				}  
				while (con>0) {
					 int con2=(hi-low)+1;
					 System.out.print("\n\n\t"+vert2+"\t");
					while (con2>0) {
						
						
						System.out.print("\t"+vert*hori+"\t");
						hori++;
						con2--;
						}
					vert2++;
					vert++;
					hori=low;
					con--;
				}
				
		} else {
			
			int con=(low-hi)+1;
			int vert=hi;
			int vert2=hi;
			int hori=hi;
			
			 System.out.print("\t\t");
				for (int x=hi;x<=low;x++) {
					System.out.print("\t"+x+"\t");	
					
				}  
				while (con>0) {
					 int con2=(low-hi)+1;
					 System.out.print("\n\n\t"+vert2+"\t");
					while (con2>0) {
						
						
						System.out.print("\t"+vert*hori+"\t");
						hori++;
						con2--;
						}
					vert2++;
					vert++;
					hori=hi;
					con--;
				}
				
		}
		
	
	}

}
