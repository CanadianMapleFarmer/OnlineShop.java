//Gerhard Kloppers
package Model;

public class Books {

    private String BookID;
    private String BookName;
    private int BookPrice;
    private String BookDiscription;
//    Creation of Book Attribute with characteristics
    public Books(String BookID, String BookName, int BookPrice, String BookDiscription) {
        this.BookID = BookID;
        this.BookName = BookName;
        this.BookPrice = BookPrice;
        this.BookDiscription = BookDiscription;
    }

    public String getBookDiscription() {
        return BookDiscription;
    }

    public void setBookDiscription(String BookDiscription) {
        this.BookDiscription = BookDiscription;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public int getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(int BookPrice) {
        this.BookPrice = BookPrice;
    }

    @Override
    public String toString() {
        return "Books{" + "BookID=" + BookID + ", BookName=" + BookName + ", BookPrice=" + BookPrice + ", BookDiscription=" + BookDiscription + '}';
    }

}
