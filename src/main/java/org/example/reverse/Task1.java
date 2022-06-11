package org.example.reverse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
    private File file;
    private ArrayList<String> stringFile = new ArrayList<>();

    public Task1() {
    }

    public Task1(String path) throws FileNotFoundException {
        this.file = new File(path);
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            stringFile.add(scan.nextLine());
        }
    }

    public Task1(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void reverseFile() throws IOException {
        Collections.reverse(stringFile);
        FileWriter fileWriter = new FileWriter("task1.txt");
        for (String str : stringFile) {
            fileWriter.write(str + "\n");
        }
        fileWriter.close();
    }
}
