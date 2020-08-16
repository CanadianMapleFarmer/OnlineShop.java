package Model;
/**
 * This is the Books Model Object that has characteristics and stores all the data read from persistent storage.
 * This Object is called and the data is extracted in the MainScreen.java
 * 
 * @author Gerhard Kloppers
 * @version 1.15.0
 * @see java.lang.System
**/
public class Books {
/**
 * The book class has characteristics and a constructor used to assign those characteristics.
 * @params args (The book characteristics. These are used to assign the values.)
 * @returns (returns a constructor that holds data arrays)
**/
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
