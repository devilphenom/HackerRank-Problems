import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            String str = "";
            int x=sc.nextInt();
            //Complete this line
            String number = String.valueOf(x);
            if(number.length() <= 1){
                str = "00" + number;
            }
            else if(number.length() <= 2){
                str = "0" + number;
            }
            else{
                str = number;
            }
            System.out.printf("%-15s%s",s1,str).println();
        }
        System.out.println("================================");
        sc.close();
	}

}
