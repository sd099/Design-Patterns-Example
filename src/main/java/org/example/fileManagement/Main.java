package org.example.fileManagement;

public class Main {
    public static void main(String[] args) {
        //Composite design pattern example
        Directory dir = new Directory("root");
        Directory dir1 = new Directory("dir1");

        dir.add(new File("file1"));
        dir.add(new File("file2"));
        dir.add(new File("file3"));
        dir.add(new File("file4"));

        dir1.add(new File("file5"));
        dir1.add(new File("file6"));

        dir.add(dir1);

        dir.ls();
    }
}
