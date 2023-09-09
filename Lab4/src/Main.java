import java.util.Date;

public class Main {

    public static void main(String[] args) {
        ItemCatalog itemCatalog = new ItemCatalog();
        FoodItem foodItem1 = new FoodItem("Milk", 89.99f, (short)5);
        FoodItem foodItem2 = new FoodItem("Butter", 259.99f, (short)5);
        FoodItem foodItem3 = new FoodItem("Bread", 39.99f, (short)5);
        FoodItem foodItem4 = new FoodItem("Chicken", 299.99f, (short)5);
        FoodItem foodItem5 = new FoodItem("Water", 39.99f, (short)5);
        FoodItem foodItem6 = new FoodItem("Juice", 89.99f, (short)5);
        FoodItem foodItem7 = new FoodItem("Cereal", 60.99f, (short)5);
        FoodItem foodItem8 = new FoodItem("Tomatoes", 124.99f, (short)5);
        FoodItem foodItem9 = new FoodItem("Oranges", 99.99f, (short)5);
        FoodItem foodItem10 = new FoodItem("Cola", 79.99f, (short)5);

        itemCatalog.addItem(foodItem1);
        itemCatalog.addItem(foodItem2);
        itemCatalog.addItem(foodItem3);
        itemCatalog.addItem(foodItem4);
        itemCatalog.addItem(foodItem5);
        itemCatalog.addItem(foodItem6);
        itemCatalog.addItem(foodItem7);
        itemCatalog.addItem(foodItem8);
        itemCatalog.addItem(foodItem9);
        itemCatalog.addItem(foodItem10);

        long begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            itemCatalog.findItemByID(10);
        long end = new Date().getTime();
        System.out.println("In HashMap: "+(end-begin));
        begin = new Date().getTime();
        for(int i=0; i<100000;i++)
            itemCatalog.findItemByIDAL(10);
        end = new Date().getTime();
        System.out.println("In ArrayList: "+(end-begin));

        CatalogStubLoader catalogStubLoader = new CatalogStubLoader();
        catalogStubLoader.load(itemCatalog);


    }
}