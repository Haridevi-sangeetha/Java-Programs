import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        FoodOrder F1 = new FoodOrder();
        F1.OrderId = 1234;
        F1.CustomerName = "Hari";
        F1.FoodItem = "Biriyani";
        F1.price = 100;
        FoodOrder F2 = new FoodOrder();
        F2.OrderId = 4567;
        F2.CustomerName = "Kanmani";
        F2.FoodItem = "CurdRice";
        F2.price = 50;
        FoodOrder F3 = new FoodOrder();
        F3.OrderId = 7890;
        F3.CustomerName = "Kathija";
        F3.FoodItem = "Poori";
        F3.price = 80;
        int highest = 0;
        String Item ="";
        if(F1.price > F2.price && F1.price > F3.price){
            highest = F1.price;
            Item = F1.FoodItem;
        }
        else if(F2.price > F1.price && F2.price > F3.price){
            highest = F2.price;
            Item = F2.FoodItem;
        }
        else{
            highest = F3.price;
            Item = F3.FoodItem;
        }
        
        System.out.println("OrderId : "+F1.OrderId+" CustomerName :  "+F1.CustomerName+" FoodItem :  "+F1.FoodItem+" Price :  "+F1.price);
        System.out.println("OrderId : "+F2.OrderId+" CustomerName :  "+F2.CustomerName+" FoodItem :  "+F2.FoodItem+" Price :  "+F2.price);
        System.out.println("OrderId : "+F3.OrderId+" CustomerName :  "+F3.CustomerName+" FoodItem :  "+F3.FoodItem+" Price :  "+F3.price);
        
        System.out.println("\nhighest Price ");
        
        System.out.println (Item +" : "+ highest);
    }
}

class FoodOrder{
    int OrderId;
    String CustomerName;
    String FoodItem;
    int price;
}
