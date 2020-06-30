package modals;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTests {

    @Test
    public void test1 (){
        var menuPage = homePage.clickContextMenu();
        menuPage.clickDerecho();

        Assert.assertEquals(menuPage.validarTextoModal(), "You selected a context menu", "Mensaje incorrecto");

        menuPage.botonAceptar();
        System.out.println("Pop up aceptado!");
    }

}
