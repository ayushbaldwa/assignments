public class Availability {
    BookDetails book;
    boolean isAvaialble;
    Availability(boolean isAvaialble){
        this.isAvaialble=isAvaialble;
    }
    Availability(BookDetails book){
        this.book=book;
    }
    Boolean searchBook() {
        return isAvaialble;
    }
}
