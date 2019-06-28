import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args){

//        Jacket jacketOne = new Jacket("Windbreaker", "Synthetic", "Red", true, "Hiking,Snowboarding");
//        Jacket jacketTwo = new Jacket("Parka", "Wool", "Black", true, "Leisure");
//        Jacket jacketThree = new Jacket("North Face", "Cotton/Synthetic", "Hot Pink", false, "Hiking,Leisure");
//        Shirt shirtOne = new Shirt("Button", "Synthetic Blend", "Blue", "Long-sleeve");
//        Shirt shirtTwo = new Shirt("Polo", "Polyester", "White", "Short-sleeve");
//        Shirt shirtThree = new Shirt("Active Wear", "Lycra", "Black", "Short-sleeve");
//        Shoes shoesOne = new Shoes("Running", "Blue", false);
//        Shoes shoesTwo = new Shoes("Dress", "Black", false);
//        Shoes shoesThree = new Shoes("Flip Flop", "Green", false);
//        Pants pantsOne = new Pants("Cotton", "Black", "Dress", "Long");
//        Pants pantsTwo = new Pants("Synthetic", "Yellow", "Active Wear", "Short");
//        Pants pantsThree = new Pants("Fabric Blend", "Brown", "Hiking", "Long");


//        System.out.println("Closet One:");
//        Iterator iterJack = jacketOne.jArray().iterator();
//        Iterator iterShir = shirtOne.sArray().iterator();
//        Iterator iterShoe = shoesOne.shArray().iterator();
//        Iterator iterPant = pantsOne.pArray().iterator();

        String closetOne[][];
//        for (int i = 0; i < ; )

//        System.out.println("Jacket: " + jacketOne.jArray().toString().replace('[',' ').replace(']',' '));
        System.out.println("Shirt: " + shirtOne.sArray().toString());
        System.out.println("Pants: " + pantsOne.pArray().toString());
        System.out.println();


        Closet c = new Closet();
        for (Jacket j : c.getMyJackets()){
            System.out.println("Jacket info: " + j.toString());
            System.out.println("Jecket's material info: " + j.getMaterial());

        }








    }
}
