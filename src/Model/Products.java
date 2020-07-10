//Gerhard Kloppers
package Model;

public class Products {

    private String ProductID;
    private String ProductName;
    private int ProductPrice;
    private String ProductDescription;

    public Products(String ProductID, String ProductName, int ProductPrice, String ProductDescription) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductDescription = ProductDescription;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public void setProductDescription(String PeoductDescription) {
        this.ProductDescription = PeoductDescription;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    @Override
    public String toString() {
        return "Products{" + "ProductName=" + ProductName + ", ProductPrice=" + ProductPrice + ", ProductID=" + ProductID + ", PeoductDescription=" + ProductDescription + '}';
    }

}
