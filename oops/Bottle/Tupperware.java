interface Tspec {
    public void bottomStorage(boolean storage);

    public void setLogo(String logo);
}

public class Tupperware extends Bottle implements Tspec {
    private double bodyRadius;
    private double bodyHeight;
    private double capRadius;
    private double capHeight;
    private String bodyColor;
    private String capColor;
    private String bodyMaterial;
    private String capMaterial;
    private String logo;

    //constructor
    public Tupperware() {
        bodyRadius = 0;
        bodyHeight = 0;
        capRadius = 0;
        capHeight = 0;
        bodyColor = null;
        capColor = null;
        bodyMaterial = null;
        capMaterial = null;
        logo = null;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void bodyDesign(String logo) {
        System.out.println("Tupperware bottle is created");
        System.out.println("Logo " + logo + " is printed on the body");

    }

    public void bodyDesign(String logo, boolean holder) {
        if (holder == true) {
            System.out.println("Tupperware bottle is created with holder");

        } else {

            System.out.println("Tupperware bottle is created without holder");
        }
    }

    public void bottomStorage(boolean storage) {
        if (storage == true) {
            System.out.println("Bottle with storage");
        } else {
            System.out.println("Bottle without storage");
        }
    }
}
