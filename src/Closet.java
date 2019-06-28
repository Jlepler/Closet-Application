import java.util.ArrayList;
import java.util.Collections;

public class Closet {

    private ArrayList<Jacket> myJackets;
    private ArrayList<Shirt> myShirts;

    public String[] toCloset(Jacket jacket, Shirt shirt, Pants pants, Shoes shoes){
        String closet[] = {jacket.toString(), shirt.toString(), pants.toString(), shoes.toString()};
        return closet;
    }





    public Closet(){
        myJackets = new ArrayList<>();
        myShirts = new ArrayList<>();

        Jacket jacketOne = new Jacket("Windbreaker", "Synthetic", "Red", true, "Hiking,Snowboarding");
        Jacket jacketTwo = new Jacket("Parka", "Wool", "Black", true, "Leisure");
        Jacket jacketThree = new Jacket("North Face", "Cotton/Synthetic", "Hot Pink", false, "Hiking,Leisure");
        Collections.addAll(myJackets, jacketOne, jacketTwo, jacketThree);
    }


    public ArrayList<Jacket> getMyJackets() {
        return myJackets;
    }

    public void setMyJackets(ArrayList<Jacket> myJackets) {
        this.myJackets = myJackets;
    }

    public ArrayList<Shirt> getMyShirts() {
        return myShirts;
    }

    public void setMyShirts(ArrayList<Shirt> myShirts) {
        this.myShirts = myShirts;
    }
}
