public class BlackBoard extends Board{

    BlackBoard(double length,double width) {
    setLength(length);
    setWidth(width);
    setColor("black");
    }


    @Override
    public void write() {
        System.out.println("Requires chalk to write");
    }
}
