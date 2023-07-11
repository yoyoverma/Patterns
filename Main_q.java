package patterns;
import java.util.*;

public class Main_q {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int row = 0;
            int nsp = 0;
            int nst = num/2;
            while(row<num){
                for(int i = 0; i<nst+1; i++){
                    System.out.print("*     ");
                }
                for(int i = 0; i<nsp; i++){
                    System.out.print("      ");
                }
                for(int i = 0; i<nst+1; i++){
                    System.out.print("*     ");
                }
                if(row<num/2) {
                    nst--;
                    nsp +=2;
                }else{
                    nst++;
                    nsp -=2;
                }
                System.out.println();
                row++;
            }
        }
    }
}