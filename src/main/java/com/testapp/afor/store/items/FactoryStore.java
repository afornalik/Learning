package main.java.com.testapp.afor.store.items;

import main.java.com.testapp.afor.store.items.interfacePackage.StoreItems;
import main.java.com.testapp.afor.store.items.interfacePackage.StoreItemsBrush;
import main.java.com.testapp.afor.store.items.interfacePackage.StoreItemsRoller;

public class FactoryStore {

    private StoreItems storeitems;

    public  StoreItems getitems(String kind) {
        switch (kind) {
            case"brush" :
                StoreItemsBrush sib = new StoreBrush();
                storeitems = sib;
                break;
            case"roller" :
                StoreItemsRoller sir = new StoreRoller();
                storeitems = sir;
                break;
            default:
                storeitems = null;

        }
        return storeitems;


    }
}
