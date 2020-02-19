/*
Code taking an example of writing boards which can be of two types i.e., black and white 
 */
public abstract class Board {
    private double length;
    private double width;
    private String color;
    double getLength(){
        return length;
    }
    void setLength(double length){
        this.length=length;
    }
    double getWidth(){
        return width;
    }
    void setWidth(double width){
        this.width=width;
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color=color;
    }

    public abstract void write();
}
