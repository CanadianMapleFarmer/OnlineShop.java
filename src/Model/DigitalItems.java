
package Model;


public class DigitalItems {
    private String DigitalItemID;
    private String DigitalItemName;
    private int DigitalItemPrice;
    private String DigitalItemDescription;

    public DigitalItems(String DigitalItemID, String DigitalItemName, int DigitalItemPrice, String DigitalItemDescription) {
        this.DigitalItemID = DigitalItemID;
        this.DigitalItemName = DigitalItemName;
        this.DigitalItemPrice = DigitalItemPrice;
        this.DigitalItemDescription = DigitalItemDescription;
    }

    public String getDigitalItemDescription() {
        return DigitalItemDescription;
    }

    public void setDigitalItemDescription(String DigitalItemDescription) {
        this.DigitalItemDescription = DigitalItemDescription;
    }

    public String getDigitalItemID() {
        return DigitalItemID;
    }

    public void setDigitalItemID(String DigitalItemID) {
        this.DigitalItemID = DigitalItemID;
    }

    public String getDigitalItemName() {
        return DigitalItemName;
    }

    public void setDigitalItemName(String DigitalItemName) {
        this.DigitalItemName = DigitalItemName;
    }

    public int getDigitalItemPrice() {
        return DigitalItemPrice;
    }

    public void setDigitalItemPrice(int DigitalItemPrice) {
        this.DigitalItemPrice = DigitalItemPrice;
    }

    @Override
    public String toString() {
        return "DigitalItems{" + "DigitalItemID=" + DigitalItemID + ", DigitalItemName=" + DigitalItemName + ", DigitalItemPrice=" + DigitalItemPrice + ", DigitalItemDescription=" + DigitalItemDescription + '}';
    }
    
    
}
