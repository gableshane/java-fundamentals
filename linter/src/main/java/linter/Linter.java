package linter;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Linter {

    public static String linter(Path path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path.toUri()));
        String result = "";
        int currentLine = 1;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
//            System.out.println(line + "       This is line: " + currentLine);
            if(!line.isEmpty()
                    && !line.endsWith("{")
                    && !line.endsWith("}")
                    && !line.contains("if")
                    && !line.contains("else")
                    && !line.endsWith(";")){
                result += String.format( "\nLine: %d missing semicolon.",currentLine);
            }
            currentLine++;
        }
        return result;
    }
}
