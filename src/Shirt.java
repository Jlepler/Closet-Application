public class Shirt {

    private String material;
    private String color;
    private String type;
    private String Length;

    public Shirt(){
    }

    public Shirt(String type, String material, String color, String length) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.Length = length;
    }



    /*************/

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

    public String getType() {
        return type;
    }

    public void setType(String activity) {
        this.type = type;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }
}

