interface Parameters {
    public void setBodyColor(String bColor);

    public void setBodyHeight(double bHeight);

    public void setBodyRadius(double bRadius);

    public void setBodyMaterial(String bMaterial);

    public void setCapColor(String cColor);

    public void setCapHeight(double cHeight);

    public void setCapRadius(double cRadius);

    public void setCapMaterial(String cMaterial);
}

public class Bottle implements Parameters {
    private double bodyRadius;
    private double bodyHeight;
    private double capRadius;
    private double capHeight;
    private String bodyColor;
    private String capColor;
    private String bodyMaterial;
    private String capMaterial;

    //constructor
    public Bottle() {
        bodyRadius = 0;
        bodyHeight = 0;
        capRadius = 0;
        capHeight = 0;
        bodyColor = null;
        capColor = null;
        bodyMaterial = null;
        capMaterial = null;
    }

    //getters and setters
    public void setBodyColor(String bColor) {
        bodyColor = bColor;
    }

    public void setBodyHeight(double bHeight) {
        bodyHeight = bHeight;
    }

    public void setBodyRadius(double bRadius) {
        bodyRadius = bRadius;
    }

    public void setBodyMaterial(String bMaterial) {
        bodyMaterial = bMaterial;
    }

    public void setCapColor(String cColor) {
        capColor = cColor;
    }

    public void setCapHeight(double cHeight) {
        capHeight = cHeight;
    }

    public void setCapRadius(double cRadius) {
        capRadius = cRadius;
    }

    public void setCapMaterial(String cMaterial) {
        capMaterial = cMaterial;
    }

    public void bodyDesign() {
        System.out.println("Body for the bottle is created");
        System.out.println("Material used for body : " + bodyMaterial);
        System.out.println("Color for the body : " + bodyColor);
        System.out.println("Radius of the body : " + bodyRadius);
    }

    public void capDesign() {
        System.out.println("Cap for the bottle is created");
        System.out.println("Material used for cap : " + capMaterial);
        System.out.println("Color for the cap : " + capColor);
        System.out.println("Radius of the cap : " + capRadius);
    }
}

