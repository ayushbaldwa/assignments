abstract public class Watch {
    private String size;
    private String color;
    private boolean hasLedDisplay;
    void setColor(){
        this.color=color;
    }
    String getColor(String color){
        return color;
    }
    void setSize(){
        this.size=size;
    }
    String getSize(String size)
    {
        return size;
    }
   abstract public void showTime();
 abstract  public void changeTime();



}
