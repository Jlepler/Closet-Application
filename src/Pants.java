import java.util.ArrayList;

public class Pants {

    private String material;
    private String color;
    private String activity;
    private String length;

    public Pants(){
    }

    public Pants(String material, String color, String activity, String length) {
        this.material = material;
        this.color = color;
        this.activity = activity;
        this.length = length;
    }

    public String jacketArray[] = {material, color, activity, length};



    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}


