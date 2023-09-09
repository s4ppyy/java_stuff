package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.*;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader
{
    GenericItem item1 = new GenericItem("Sony TV", 23000, Category.GENERAL);
    FoodItem item2 = new FoodItem("Bread", 12, new java.sql.Date(0), (short) 10);
    public void load(ItemCatalog catalog) throws CatalogLoadException {
        try {
            catalog.addItem(item1);
            catalog.addItem(item2); }
        catch(ItemAlreadyExistsException e) {
            e.printStackTrace();
            throw new CatalogLoadException();
        }
    }

}