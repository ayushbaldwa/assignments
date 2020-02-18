public class BookDetails {
    private String title;
    private String author;
    BookDetails(String title,String author){
        this.title=title;
        this.author=author;
    }
    String getTitle(){
        return title;
    }
    void setTitle() {
        this.title=title;
    }
    String getAuthor() {
        return author;
    }
    void setAuthor(){
        this.author=author;
    }
}
