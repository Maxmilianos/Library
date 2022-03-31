package xyz.holomek.ulohy.prevodCifer;

import xyz.holomek.utils.UtilFiles;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Prevod {

    // zakladni metoda na volani pres main
    public void startFromFile() {

        /*
        System.out.println("Number 1021005: " + de("x   xx x     xxxxx")); //cislo 1021005
        System.out.println("Number 35211: " + de("xxx xxxxx xx x x")); //cislo 35211
        */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String row = null;
        /*System.out.println("Moznosti (napiste cislo):");
        System.out.println(" 1  -  Ukoly 1-6");
        System.out.println(" 2  -  Ukoly 7-8");
        while ((row = bufferedReader.readLine()) != null) {
            if (row.equalsIgnoreCase("1")) {
                ukoly16();
            } else if (row.equalsIgnoreCase("2")) {
                ukoly18();
            } else {
                System.out.println("Neplatne.");
            }
        }*/

        /*
        Pak odkom
         */
        JFileChooser fileChooser = new JFileChooser(".");
        int result = fileChooser.showOpenDialog(new JFrame());
        if (result != JFileChooser.APPROVE_OPTION) {
            System.out.println("Nezvolen subor");
            return;
        }
        File selectedFile = fileChooser.getSelectedFile();
        System.out.println("Subor: " + selectedFile.getAbsolutePath());

        ArrayList<String> lines = UtilFiles.readFromFile(selectedFile);
        System.out.println("Prvnich pet:");
        for (String line : ((ArrayList<String>) lines.clone())) {
            System.out.println(de(line));
        }

    }

    //neumi to jeste ty nuly na konci, potom to dodelaj
    private String de(String s) {
        String ret = "";
        if (s.startsWith(" ")) {
            return "Kod nemuze zacinat mezerou. - '" + s + "'";
        }
        String[] split = s.split(" ");
        int mez = 0;
        for (String spl : split) {
            //System.out.println("New split - "+ spl);
            if (!spl.contains("x")) {
                mez += 1;
            } else {
                int xs = 0;
                for (int i = 0; i < spl.length(); i++) {
                    String act = "" + spl.charAt(i);
                    //System.out.println("char " + i + " - '" + act + "'");
                    if (act.equalsIgnoreCase("x")) {
                        //System.out.println("Contains " + i + "-" + xs);
                        xs += 1;
                    }
                }
                ret += xs;
            }
            //System.out.println("mezer: " + mez);
            if (mez == 2) {
                ret += "0";
                mez = 0;
            }
        }
        return ret;
    }

}
