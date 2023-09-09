package ru.billing.stocklist;

import java.util.Date;

public class FoodItem extends GenericItem {

    private Date dateOfIncome;
    private short expires;
    public FoodItem(String newName, float newPrice, Date newDateOfIncome, short newExpires) {
        super(newName, newPrice);
        dateOfIncome =newDateOfIncome;
        expires = newExpires;
    }

    public FoodItem(String newName, float newPrice, Category newCategory, Date newDateOfIncome, short newExpires) {
        super(newName, newPrice, newCategory);
        dateOfIncome =newDateOfIncome;
        expires = newExpires;
    }

    public FoodItem(String name, float price, FoodItem analog, Date date, short newExpires){
        super(name, price, analog);
        dateOfIncome = date;
        expires = newExpires;
    }

    public FoodItem(String name, float price, short newExpires){
        super(name, price);
        expires = newExpires;
        dateOfIncome = new Date();
    }

    public FoodItem(String name){
        super(name);
    }

    public Date getDateOfIncome(){
        return dateOfIncome;
    }

    public void setDateOfIncome(Date newDate){
        dateOfIncome = newDate;
    }

    public short getExpires(){
        return expires;
    }

    public void setExpires(short newExpires){
        expires = newExpires;
    }

    @Override
    public void printAll(){
        System.out.printf("ID: %d , Name: %-20s , Price: %5.2f, ru.billing.stocklist.Category: %s, Date Of Income: %s, Expires: %d\n",
                getID(), getName(), getPrice(), getCategory(), dateOfIncome.toString(), expires);
    }

    public boolean equals(Object o){
        if (o instanceof FoodItem){
            FoodItem temp = (FoodItem) o;
            if (temp.getID() == this.getID() && temp.getName().equals(this.getName()) &&
                    temp.getCategory().equals(this.getCategory()) &&
                    temp.getPrice() == this.getPrice() && temp.getAnalogItem().equals(this.getAnalogItem()) &&
                    temp.dateOfIncome.equals(this.dateOfIncome) && temp.expires == this.expires)
                return true;
        }
        return false;
    }

    public Object clone(){
        return new FoodItem(this.getName(), this.getPrice(), this.getCategory(), this.dateOfIncome,
                this.expires);
    }

    public String toString(){
        return "ID: " + getID() +", Name: " + getName() + ", Price: " + getPrice() + ", ru.billing.stocklist.Category: " + getCategory().toString() +
                ", Date of Income: " + this.dateOfIncome + ", Expires: " + this.expires;
    }
}
