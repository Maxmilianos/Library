package xyz.holomek;

import xyz.holomek.template.gui.Number1;
import xyz.holomek.utils.UtilFiles;

import java.io.IOException;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        try {
            UtilFiles.appendToFile("test.txt", "ahooj\nferaplace\nngl\njjj");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : UtilFiles.readFromFile("test.txt"))
            System.out.println("1 - " + s);

    }

}
