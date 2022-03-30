package xyz.holomek.utils;

import java.io.*;

public class UtilFiles {

    public static void copyDir(File source, File target) throws IOException {
        if(source.isDirectory()) {
            if(!target.exists())
                target.mkdir();
            String files[] = source.list();
            for (String file : files) {
                File srcFile = new File(source, file);
                File destFile = new File(target, file);
                copyDir(srcFile, destFile);
            }
        } else {
            InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(target);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0)
                out.write(buffer, 0, length);
            in.close();
            out.close();
        }
    }

}
