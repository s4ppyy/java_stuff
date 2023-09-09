package ru.billing.stocklist;

public class GenericItem {
    private int ID;
    private static int currentID;
    private String name;
    private float price;
    private GenericItem analogItem;
    private Category category;

    public GenericItem(String newName, float newPrice){
        name = newName;
        price = newPrice;
        category = Category.GENERAL;
        this.ID = currentID++;
    }

    public GenericItem(String newName, float newPrice, Category newCategory){
        name = newName;
        price = newPrice;
        category = newCategory;
        this.ID = currentID++;
    }

    public GenericItem(String newName, float newPrice, GenericItem analog){
        name = newName;
        price = newPrice;
        analogItem = analog;
        this.ID = currentID++;
    }

    public GenericItem(String newName){
        name = newName;
    }

    public GenericItem(){};

    public int getID(){
        return ID;
    }

    public void setID(int newID){
        ID = newID;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float newPrice){
        price = newPrice;
    }

    public GenericItem getAnalogItem(){
        return analogItem;
    }

    public void setAnalogItem(GenericItem newAnalogItem){
        analogItem = newAnalogItem;
    }

    public Category getCategory(){
        return category;
    }

    public void setCategory(Category newCategory){
        category = newCategory;
    }

    public void printAll(){
        System.out.printf("ID: %d , Name: %-20s , Price: %5.2f, ru.billing.stocklist.Category: %s\n", ID, name, price, category.name());
        if (analogItem != null) {
            System.out.println("Analog Item Info:");
            analogItem.printAll();
        }
    }

    public boolean equals(Object o){
        if (o instanceof GenericItem){
            GenericItem temp = (GenericItem) o;
            if (temp.ID == this.ID && temp.name.equals(this.name) && temp.category.equals(this.category) &&
            temp.price == this.price && temp.analogItem.equals(this.analogItem))
                return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return "ru.billing.stocklist.GenericItem{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", analogItem=" + analogItem +
                ", category=" + category +
                '}';
    }
}
