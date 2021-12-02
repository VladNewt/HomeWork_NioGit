package pack;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("file.txt");

        String text = "Lorem ipsum dolor sit amet.";

        //Запись в файл
        try {
            Files.write(path,text.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Чтение из файла
        try {
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
