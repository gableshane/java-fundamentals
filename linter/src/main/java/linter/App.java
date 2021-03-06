/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.*;
import java.nio.file.*;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) throws FileNotFoundException {
        Path filePath = Paths.get("src/main/resources/gates.js");
        String result = Linter.linter(filePath);
        System.out.println(result);
    }
}
