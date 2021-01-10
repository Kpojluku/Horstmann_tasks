package com.Goltsov.Interfaces_and_Lambda_Expressions;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/*
Using the listFiles(FileFilter) and isDirectory methods of the java.io.File
class, write a method that returns all subdirectories of a given directory.
Use a lambda expression instead of a FileFilter object. Repeat with a
method expression and an anonymous inner class.
 */
public class task11 {
    public static void main(String[] args) throws Exception {
        File[] files = getSubdirectoriesLambda("src\\com\\Goltsov");
        System.out.println("Directories are:");
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }

    public static File[] getSubdirectoriesLambda(String filesPath) {
        File[] dirs = new File(filesPath).listFiles(f -> f.isDirectory());
        return dirs;
    }
    public static File[] getSubdirectories(String filesPath){
        File[] dirs = new File(filesPath).listFiles(File::isDirectory);
        return dirs;
    }
    public static File[] getSubdirectoriesInnerClass(String filesPath) {
        File[] dirs = new File(filesPath).listFiles(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        });
        return dirs;
    }
}
