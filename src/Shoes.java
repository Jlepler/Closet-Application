public class Shoes {

    private String type;
    private String color;
    private Boolean waterproof;

    public Shoes (){
    }

    public Shoes(String type, String color, Boolean waterproof) {
        this.type = type;
        this.color = color;
        this.waterproof = waterproof;
    }


    /***************/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getWaterproof() {
        return waterproof;
    }

    public void setWaterproof(Boolean waterproof) {
        this.waterproof = waterproof;
    }
}
