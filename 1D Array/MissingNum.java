import java.util.*;

public class MissingNum {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size-1;i++){
            int value = arr[i]+1;
            if(arr[i+1]!=value){
                System.out.println(value);
            }
        }
    }    
}