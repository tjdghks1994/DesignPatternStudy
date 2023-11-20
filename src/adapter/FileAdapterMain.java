package adapter;

import java.io.IOException;

public class FileAdapterMain {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();

        try {
            fileIO.readFromFile("file.txt");
            fileIO.setValue("width", "1024");
            fileIO.setValue("height", "512");
            fileIO.setValue("depth", "32");
            fileIO.writeToFile("file.txt");
            fileIO.writeToFile("newFile.txt");
            System.out.println("newFile.txt is created");

            String width = fileIO.getValue("width");
            System.out.println("width = " + width);
            String height = fileIO.getValue("height");
            System.out.println("height = " + height);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }
}
