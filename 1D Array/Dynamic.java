import java.util.*;
public class Dynamic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list= new ArrayList<>();

        String line= sc.nextLine();
        String [] arr=line.split(" ");
        for(String s : arr){
            list.add(Integer.parseInt(s));
        }

        System.out.print(list);

        sc.close();;
    }
}
