public class RentBook {
    public void take(Availability book) {
        if (book.searchBook()) {
            System.out.println("Give the book");
            book.isAvaialble = false;
        } else
            System.out.println("Not available");
    }
        public void Return(Availability book){
            System.out.println("Take the book back");
            book.isAvaialble = true;
        }
    }

