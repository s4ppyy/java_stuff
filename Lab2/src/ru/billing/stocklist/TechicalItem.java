package ru.billing.stocklist;

public class TechicalItem extends GenericItem {

    private short warrantyTime;

    public TechicalItem(String newName, float newPrice, short newWarrantyTime) {
        super(newName, newPrice);
        warrantyTime = newWarrantyTime;
    }

    public TechicalItem(String newName, float newPrice, Category newCategory, short newWarrantyTime) {
        super(newName, newPrice, newCategory);
        warrantyTime = newWarrantyTime;
    }

    public short getWarrantyTime(){
        return warrantyTime;
    }

    public void setWarrantyTime(short newWarrantyTime){
        warrantyTime = newWarrantyTime;
    }

    @Override
    public void printAll(){
        System.out.printf("ID: %d , Name: %-20s , Price: %5.2f, ru.billing.stocklist.Category: %s, Warranty Time: %d\n", getID(), getName(),
                getPrice(), getCategory(), warrantyTime);

    }

    public boolean equals(Object o){
        if (o instanceof TechicalItem){
            TechicalItem temp = (TechicalItem) o;
            if (temp.getID() == this.getID() && temp.getName().equals(this.getName()) &&
                    temp.getCategory().equals(this.getCategory()) &&
                    temp.getPrice() == this.getPrice() &&
                    temp.warrantyTime == this.warrantyTime)
                return true;
        }
        return false;
    }

    public Object clone(){
        return new TechicalItem(this.getName(), this.getPrice(), this.getCategory(), this.warrantyTime);
    }

    @Override
    public String toString() {
        return "ru.billing.stocklist.TechicalItem{" +
                "warrantyTime=" + warrantyTime +
                '}';
    }
}
