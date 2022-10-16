package ssdnumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DurationsTest {
    @Test
    public void test1(){
        //A
        Duration d1 = new Duration(1,2);
        Duration d2 = new Duration(2,4);
        Boolean test1 = d1 == d2;
        System.out.println(test1 + ", when compare d1 == d2");

        //B
        Duration d3 = new Duration(1,2);
        Duration d4 = new Duration(1,2);
        Boolean test2 = d3 == d4;
        System.out.println(test2 + ", when compare d3 == d4");

        //C
        Object a1 = new DurationSame(1, 2);
        DurationSame D11 = (DurationSame) a1;
        Duration D121 = (Duration) a1;
        System.out.println(D11.getLength());
        System.out.println(D121.getLength());

    }

    @Test
    public void test2(){
        Duration d1 = new Duration(1,2);
        DurationSub ds1 = new DurationSub(0, 1, 2);
        Boolean test1 = d1.equals(ds1);
        Boolean test2 = ds1.equals(d1);
        System.out.println(test1 + ", d1.equals(ds1);");
        System.out.println(test2 + ", ds1.equals(d1);");

    }

    @Test
    public void test3(){
        Duration d1 = new Duration(1,2);
        DurationSub ds1 = new DurationSub(0, 1, 2);
        Boolean test1 = d1.equals(ds1);
        Boolean test2 = ds1.equals(d1);
        System.out.println(test1 + ", d1.equals(ds1);");
        System.out.println(test2 + ", ds1.equals(d1);");
    }

    @Test
    public void test4(){
        Duration d1 = new Duration(1,2);
        DurationSub ds1 = new DurationSub(0, 1, 2);
        DurationSubSub dss1 = new DurationSubSub(0, 0, 1, 2);

        Boolean test1 = dss1.equals(ds1);
        Boolean test2 = ds1.equals(d1);
        Boolean test3 = dss1.equals(d1);
        System.out.println(test1 + ", dss1.equals(ds1);");
        System.out.println(test2 + ", ds1.equals(d1);");
        System.out.println(test3 + ", dss1.equals(d1);");
    }

}