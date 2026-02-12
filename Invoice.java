package week03.invoice;

public class Invoice {
    private String partNum, desc;
    private int qty;
    private double price;

    public Invoice(String partNum, String desc, int qty, double price) {
        this.partNum = partNum; this.desc = desc;
        setQuantity(qty); setPricePerItem(price);
    }
    public String getPartNumber() {return partNum;}
    public void setPartNumber(String partNum) {this.partNum = partNum;}

    public String getPartDescription() {return desc;}
    public void setPartDescription(String desc) {this.desc = desc;}

    public int getQuantity() {return qty;}
    public void setQuantity(int qty) {this.qty = Math.max(qty, 0);}

    public double getPricePerItem() {return price;}
    public void setPricePerItem(double price) {this.price = Math.max(price, 0.0);}
}
