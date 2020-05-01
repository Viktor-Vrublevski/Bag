package src.com.swing.bag;

import java.util.ArrayList;
import java.util.List;

//  Склад предметов
public class StorageItems {
    public  final List<Item> ITEMS = new ArrayList<>();

    public StorageItems(Item...items) {
        for (Item item : items){
            ITEMS.add(item);
        }
    }

}
