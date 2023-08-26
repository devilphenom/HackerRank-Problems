import java.util.Scanner;

public class LoopsTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of query : ");
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int series = 0;
        	System.out.println("Enter the values : ");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++) {
            	 if(j==0){
                     series=series+a+((int)Math.pow(2,j)*b); 
                 }else{
                 series=series+((int)Math.pow(2,j)*b);
                 }
            	 System.out.print(series+" ");
            }
            System.out.println();
        }
        
        in.close();
	}
}
