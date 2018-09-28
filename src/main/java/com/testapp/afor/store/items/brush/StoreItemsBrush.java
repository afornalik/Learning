package main.java.com.testapp.afor.store.items.brush;

import main.java.com.testapp.afor.store.items.StoreItems;

public interface StoreItemsBrush extends StoreItems {

    String[] getFamilyNames();



    void setSize(int size);

    int getSize();
}
