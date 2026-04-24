import java.util.Scanner;

class Main{
    public static void main(String [] args){
        Scanner sc =    new Scanner(System.in);
        int  num = sc.nextInt();
        int rev=0;
        for(;num!=0;){
            int id=num%10;
            rev=rev*10+id;
            num=num/10;
        }
        
        System.out.println("Reverse : "+rev);
    }
}
