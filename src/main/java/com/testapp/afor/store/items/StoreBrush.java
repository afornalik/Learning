package main.java.com.testapp.afor.store.items;

import main.java.com.testapp.afor.store.items.brush.*;
import main.java.com.testapp.afor.store.items.interfacePackage.StoreItemsBrush;

public class StoreBrush implements StoreItemsBrush {

    private String[] allnames = new String[BrushNameEnglish.values().length+ BrushNameHalfEnglish.values().length+ BrushNameRadiator.values().length+ BrushNameVarnished.values().length+ BrushNameWallpapers.values().length+BrushNameWide.values().length];
    private String name;
    private int code,size;




    @Override
    public String[] getFamilyNames() {

        return new String[0];
    }

    @Override
    public  String[] getAllNames() {

        int i = 0;
        for (BrushNameEnglish bne: BrushNameEnglish.values()){

            allnames[i] = bne.toString();
            ++i;
        }

        for (BrushNameHalfEnglish bnhe: BrushNameHalfEnglish.values()){

            allnames[i] = bnhe.toString();
            ++i;
        }

        for (BrushNameRadiator bnr: BrushNameRadiator.values()){

            allnames[i] = bnr.toString();
            ++i;
        }


        for (BrushNameVarnished bnv: BrushNameVarnished.values()){

            allnames[i] = bnv.toString();
            ++i;
        }

        for (BrushNameWallpapers bnwp: BrushNameWallpapers.values()){

            allnames[i] = bnwp.toString();
            ++i;
        }

        for (BrushNameWide bnw: BrushNameWide.values()){

            allnames[i] = bnw.toString();
            ++i;

        }


        return  allnames;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public void compareName(String name) {
        this.getAllNames();
        for (String an : allnames) {


            if (an.toLowerCase().equals(name.toLowerCase())) {
                this.name = name;
                break;
            } else {
                this.name = "some kind of brush";
            }
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}


