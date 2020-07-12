package liep11.uzduotis4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class IO {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("text.txt");
        List<String> fileLines = Files.readAllLines(path);
        wordsCout(fileLines);

        countSpecialSigns(fileLines);
    }

    private static void countSpecialSigns(List<String> fileLines) {

        String str = String.join("",fileLines);
        int length = str.replaceAll("(\\w)","").length();
        System.out.println(length);

        long count = fileLines.stream()
                .flatMapToInt(String::chars)
                .filter(x -> x == ' ' || x == ',' || x == '.' || x == '\n')
                .count();
        System.out.println("Spec simboliu skaicius: " + count);
    }

    private static void wordsCout(List<String> fileLines) {
        int summ = fileLines.stream().filter(x -> x.length() > 0)
                .mapToInt(x -> x.split(" ").length).sum();
        System.out.println("Su stream: " + summ);

//        List<String> temp = fileLines.stream().filter(x -> x.length() > 0)
//                .collect(Collectors.toList());
//        int sum = 0;
//        for (String line : temp) {
//            sum += line.split(" ").length;
//        }
//        System.out.println("Su ciklu: " + sum);
    }
}

/*
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("lorel.txt");
        List<String> lines = Files.readAllLines(path);
        int wordsCount = 0;
        for (String line : lines) {
            if (line.length() > 0) {
                wordsCount += line.split(" ").length;
            }
        }
        System.out.println(wordsCount);
        int specialCharactersCount = 0;
        int letters = 0;
        int numbers = 0;
        for (String line : lines) {
            char[] chars = line.toCharArray();
            for (char symbol : chars) {
                if (symbol >= 'a' && symbol <= 'z') {
                    letters++;
                } else if (symbol >= 'A' && symbol <= 'Z') {
                    letters++;
                } else if (symbol >= '0' && symbol <= '9') {
                    numbers++;
                }
                else {
                    specialCharactersCount++;
                }
            }
        }
        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Special characters: " + specialCharactersCount);
    }*/
