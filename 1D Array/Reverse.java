
import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int og =0;
        while(num != 0){
            int rev=0;
            int temp = num%100;
            if(temp%4==0){
                int val = temp/10;
                rev = (val*10)+1;
                int reverse =0;
                while(rev!=0){
                    int val1 = rev%10;
                    reverse = (reverse*10)+val1;
                    rev /=10;
                }
                // System.out.println(reverse);
                og = (og*100)+reverse;
            }
            else{
                // System.out.println(temp);
                int reverse =0;
                while (temp!=0) {
                    int val = temp%10;
                    reverse = (reverse*10)+val;
                    temp/=10;
                }
                og = (og*100)+reverse;
            }
            num/=100;
        }

        int res=0;
        while(og!=0){
            int  temp = og%10;
            res = (res*10)+temp;
            og/=10;
        }

        System.out.println(res);

        sc.close();
    }

}
