package main.java.com.testapp.afor.store.items.roller;

public class StoreRoller   implements StoreItemsRoller {

    private RollerName[] Rollername = RollerName.values();
    private String name;
    private int code,size;


    @Override
    public void compareName(String tempname) {

        for (RollerName rn : RollerName.values()){
            if(tempname.equalsIgnoreCase(rn.toString())) {
                this.name = tempname.toLowerCase();

            }
        }
        if (name == null) {
            this.name = "No Name";
        }
    }

    @Override
    public  String[] getAllNames() {
        return new String[0];
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
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return "| Wałek : " + name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+
                "   | Rozmiar : "+ size+
                "cm   | kod : "+code;
    }
}
