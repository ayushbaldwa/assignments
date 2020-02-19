public class WhiteBoard extends Board {
    WhiteBoard(double length,double width) {
        setLength(length);
        setWidth(width);
        setColor("white");
    }
    @Override
    public void write() {
        System.out.println("Requires marker to write");
    }
}
