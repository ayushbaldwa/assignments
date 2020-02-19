public class BoardMain {
    public static void main(String args[]){
    Board board=new BlackBoard(13,12);
    System.out.println(board.getLength());
    System.out.println(board.getWidth());
    System.out.println(board.getColor());
    board.write();
    Board board1=new WhiteBoard(22.3,13.1);
    System.out.println(board1.getLength());
    System.out.println(board1.getWidth());
    System.out.println(board1.getColor());
    board1.write();
    }
}
