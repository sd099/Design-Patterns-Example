package org.example.fileManagement;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem{

    private String fileName;
    private List<IFileSystem> fileSystemList;

    public Directory(String fileName) {
        this.fileName = fileName;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(IFileSystem fileSystem) {
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println(fileName);
        for (IFileSystem fileSystem : fileSystemList) {
            fileSystem.ls();
        }
    }
}
