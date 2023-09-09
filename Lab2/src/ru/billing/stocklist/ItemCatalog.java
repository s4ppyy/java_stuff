package ru.billing.stocklist;

import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stocklist.GenericItem;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemCatalog{
    private HashMap<Integer,GenericItem> catalog =
            new HashMap<Integer,GenericItem>();
    private ArrayList<GenericItem> ALCatalog =
            new ArrayList<GenericItem>();

    public void addItem(GenericItem item) throws ItemAlreadyExistsException {
        if (catalog.containsValue(item) || ALCatalog.contains(item))
            throw new ItemAlreadyExistsException();
        catalog.put(item.getID(), item); // Добавляем товар в HashMap
        ALCatalog.add(item); // Добавляем тот же товар в ArrayList
    }

    public void printItems(){
        for(GenericItem i : ALCatalog){
            i.printAll();
        }
    }

    public GenericItem findItemByID(int id){
        if(!catalog.containsKey(id)) {
            return null;
        } else {
            return catalog.get(id);
        }
    }

    public GenericItem findItemByIDAL(int id) {
        for(GenericItem i : ALCatalog) {
            if(i.getID() == id)
                return i;
        }
        return null;
    }
}

