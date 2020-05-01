package src.com.swing.bag;

import java.util.ArrayList;
import java.util.List;

//  Склад предметов
public class StorageItems {
    public  final List<src.test.Item> ITEMS = new ArrayList<>();

    public StorageItems(src.test.Item...items) {
        for (Item item : items){
            ITEMS.add(item);
        }
    }

}
