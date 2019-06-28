import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.*;

public class Jacket {

    private String type;
    private String material;
    private String color;
    private Boolean waterProof;
    private String activity;

    public Jacket(){
    }

    public Jacket(String type, String material, String color, Boolean waterProof, String activity) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.waterProof = waterProof;
        this.activity = activity;

    }




    /**************/




    public Boolean getWaterProof() {
        return waterProof;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWaterProof(Boolean waterProof) {
        this.waterProof = waterProof;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

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
}
