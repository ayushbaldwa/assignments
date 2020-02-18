public class Manufacture {
    public static void main(String args[]) {
        String bColor = "blue";
        String bMaterial = "plastic";
        double bHeight = 10.0;
        double bRadius = 1.5;
        String cColor = "black";
        String cMaterial = "plastic";
        double cHeight = 2.0;
        double cRadius = 1.5;
        String logo = "tw";

        Tupperware tp = new Tupperware();
        tp.bodyDesign(logo, true);
        tp.bottomStorage(false);
        tp.bodyDesign(logo, false);
    }
}
