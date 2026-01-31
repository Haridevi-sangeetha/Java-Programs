import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
            int sum =0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            int count=0;
            for(int k=1;k<=sum;k++){
                if(sum%k==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}