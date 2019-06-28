import java.util.ArrayList;

public class Items {


    private ArrayList<ArrayList<String>> itemsArrayList = new ArrayList<ArrayList<String>>();

    Jacket jacketOne = new Jacket ("Windbreaker","Synthetic","Red",true,"Hiking,Snowboarding");
    Jacket jacketTwo = new Jacket ("Parka","Wool","Black",true,"Leisure");
    Jacket jacketThree = new Jacket ("North Face","Cotton/Synthetic","Hot Pink",false,"Hiking,Leisure");
    Shirt shirtOne = new Shirt ("Button","Synthetic Blend","Blue","Long-sleeve");
    Shirt shirtTwo = new Shirt ("Polo","Polyester","White","Short-sleeve");
    Shirt shirtThree = new Shirt ("Activewear","Lycra","Black","Short-sleeve");
    Shoes shoesOne = new Shoes ("Running", "Blue", false);
    Shoes shoesTwo = new

    public ArrayList placeToItemsArray (ArrayList jacket, ArrayList shirt, ArrayList shoes, ArrayList pants){

        itemsArrayList.add(jacket);
        itemsArrayList.add(shirt);
        itemsArrayList.add(shoes);
        itemsArrayList.add(pants);

        return placeToItemsArray(jacket,shirt, shoes, pants);
    }



}
