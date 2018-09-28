package main.java.com.testapp.afor.store.items;

import main.java.com.testapp.afor.store.items.brush.StoreBrush;
import main.java.com.testapp.afor.store.items.roller.StoreRoller;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestStore {


    @Test
    public void checkRollerName(){
        StoreRoller storeroller = new StoreRoller();
        storeroller.compareName("Girpaint");
        assertEquals("girpaint",storeroller.getName());
    }

    @Test
    public void checkRollerSize(){
        StoreRoller storeroller = new StoreRoller();
        storeroller.setSize(25);
        assertEquals(25,storeroller.getSize());
    }

    @Test
    public void checkRollerCode(){
        StoreRoller storeroller = new StoreRoller();
        storeroller.setCode(3012);
        assertEquals(3012,storeroller.getCode());
    }

    @Test
    public void chekcAllVariables() {
        StoreRoller storeroller = new StoreRoller();
        storeroller.compareName("oRaNge");
        storeroller.setCode(3016);
        storeroller.setSize(25);
        assertEquals("orange 25 3016", storeroller.getName()+" "+storeroller.getSize()+" "+storeroller.getCode());

    }


    public static void main (String[] args) {

        StoreBrush sb = new StoreBrush();

        sb.compareName("A63");
        sb.setCode(4005);
        sb.setSize(63);

        System.out.println(sb.getName()+" "+sb.getSize()+"mm  "+sb.getCode());




      /*  StoreRoller storeroller = new StoreRoller();
        storeroller.compareName("microfibra_pl");
        storeroller.setCode(3094);
        storeroller.setSize(25);

        System.out.println(storeroller.toString());

        storeroller.compareName("microfibra_pl");
        storeroller.setCode(3093);
        storeroller.setSize(18);

        System.out.println(storeroller.toString());

        storeroller.compareName("Syntex");
        storeroller.setCode(3003);
        storeroller.setSize(18);

        System.out.println(storeroller.toString());

        storeroller.compareName("syntex");
        storeroller.setCode(3004);
        storeroller.setSize(25);

        System.out.println(storeroller.toString());

        storeroller.compareName("orange");
        storeroller.setCode(3015);
        storeroller.setSize(18);

        System.out.println(storeroller.toString());

        storeroller.compareName("orange");
        storeroller.setCode(3016);
        storeroller.setSize(25);

        System.out.println(storeroller.toString());*/
    }




}
