package net.mf;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import unittesting.*;

public class FlynnsTabletsTest extends UnitTestClassBase {

    public FlynnsTabletsTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new FlynnsTabletsTest();
        globalSetup(FlynnsTabletsTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void xenia(){
        System.out.println("Executing test: "+new Object(){}.getClass().getEnclosingMethod().getName());
    }
    @Test
    public void pam(){
        System.out.println("Executing test: "+new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void alan() throws GeneralLeanFtException, InterruptedException {
        System.out.println("Executing test: "+new Object(){}.getClass().getEnclosingMethod().getName());
//        Verify.areEqual(2,2);
//        Browser browser = BrowserFactory.launch (BrowserType.CHROME);
//        browser.navigate("www.advantageonlineshopping.com");
//        AOSModel aosModel = new AOSModel(browser);
//
//        aosModel.advantageShoppingPage().tABLETSLink().click();
//        Thread.sleep(2000);
//        browser.back();
//        Thread.sleep(2000);
//        aosModel.advantageShoppingPage().hEADPHONESLink().click();
//        browser.close();
    }

}