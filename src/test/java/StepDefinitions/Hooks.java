package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.*;

public class Hooks {

    @Before
    public void before()
    {
        System.out.println("Senaryo başladı");
    }

    @After
    public void after()
    {
        // ekran görüntüsü al senaryo hatalı ise
        GWD.quitDriver();
    }

}
