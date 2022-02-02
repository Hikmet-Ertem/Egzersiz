package tests.day08;

import org.testng.annotations.Test;

public class C01_Priority {

    @Test(priority = 9)
    public void youtubeTesti(){
        System.out.println("youtube testi çalıştı");



    }

    @Test(priority = 8)
    public void amazonTesti(){
        System.out.println("amazon testi çalıştı");



    }
    @Test(priority =5)
    public void bestbuyerTesti(){
        System.out.println("bestbuy  testi çalıştı");



    }
}
