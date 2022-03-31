package xyz.holomek;

import xyz.holomek.template.gui.Number1;
import xyz.holomek.ulohy.pexeso.Pexeso;
import xyz.holomek.ulohy.prevodCifer.Prevod;
import xyz.holomek.ulohy.prvocisla.PrvoCisla;
import xyz.holomek.utils.UtilFiles;

import java.io.IOException;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        /*
        MELO BY BYT VSE
        Uloha 1 - převod cifer

        Prevod prevod = new Prevod(); // vyuzivame u vsech trech metod, NUTNE
        prevod.startFromFile(); // pro soubory
        try {
            prevod.startFromConsoleSe(); // pro zasifrovani cisla
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            prevod.startFromConsoleDe(); // pro desifrovani kodu
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        /*
        MELO BY BYT VSE
        Uloha cislo 2 - pexeso

        Pexeso pexeso = new Pexeso();
        pexeso.initializace();
        */

        /*
        NENI MOC
        Uloha cislo 3 - prvocisla
        */
        PrvoCisla prvoCisla = new PrvoCisla();
        prvoCisla.start();


    }

}
