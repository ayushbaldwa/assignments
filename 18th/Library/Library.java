public class Library {
    public static void main(String args[]){
        BookDetails new_book= new BookDetails("Heros of Olympus","Rick Riordan");
        RentBook book=new RentBook();
        Availability avail=new Availability(true);
        book.take(avail);

    }
}
