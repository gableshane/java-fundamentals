package linter;

import org.junit.*;

import java.io.*;
import java.nio.file.*;

public class LinterTest {
    @Test
    public void testLinterManyErrors() throws FileNotFoundException {
        Path filePath = Paths.get("src/main/resources/gates.js");
        String expected = "\nLine: 3 missing semicolon.\n" +
                "Line: 5 missing semicolon.\n" +
                "Line: 11 missing semicolon.\n" +
                "Line: 13 missing semicolon.\n" +
                "Line: 15 missing semicolon.\n" +
                "Line: 26 missing semicolon.\n" +
                "Line: 28 missing semicolon.\n" +
                "Line: 32 missing semicolon.\n" +
                "Line: 36 missing semicolon.\n" +
                "Line: 40 missing semicolon.\n" +
                "Line: 41 missing semicolon.\n" +
                "Line: 50 missing semicolon.\n" +
                "Line: 51 missing semicolon.\n" +
                "Line: 59 missing semicolon.\n" +
                "Line: 60 missing semicolon.\n" +
                "Line: 61 missing semicolon.\n" +
                "Line: 62 missing semicolon.\n" +
                "Line: 64 missing semicolon.\n" +
                "Line: 70 missing semicolon.\n" +
                "Line: 71 missing semicolon.\n" +
                "Line: 72 missing semicolon.\n" +
                "Line: 73 missing semicolon.\n" +
                "Line: 74 missing semicolon.\n" +
                "Line: 76 missing semicolon.\n" +
                "Line: 77 missing semicolon.\n" +
                "Line: 78 missing semicolon.\n" +
                "Line: 79 missing semicolon.\n" +
                "Line: 80 missing semicolon.\n" +
                "Line: 82 missing semicolon.\n" +
                "Line: 83 missing semicolon.\n" +
                "Line: 84 missing semicolon.\n" +
                "Line: 85 missing semicolon.\n" +
                "Line: 86 missing semicolon.\n" +
                "Line: 88 missing semicolon.\n" +
                "Line: 89 missing semicolon.\n" +
                "Line: 90 missing semicolon.\n" +
                "Line: 91 missing semicolon.\n" +
                "Line: 92 missing semicolon.\n" +
                "Line: 94 missing semicolon.\n" +
                "Line: 95 missing semicolon.\n" +
                "Line: 96 missing semicolon.\n" +
                "Line: 97 missing semicolon.\n" +
                "Line: 98 missing semicolon.\n" +
                "Line: 99 missing semicolon.\n" +
                "Line: 100 missing semicolon.\n" +
                "Line: 101 missing semicolon.";
        Assert.assertEquals("File full of errors",expected,Linter.linter(filePath));
    }
    @Test
    public void testLinterNoError() throws FileNotFoundException {
        Path filePath = Paths.get("src/main/resources/noErrors.js");
        String expected = "";
        Assert.assertEquals("Contains no errors",expected,Linter.linter(filePath));

    }
    @Test
    public void testLinterOneError() throws FileNotFoundException {
        Path filePath = Paths.get("src/main/resources/oneError.js");
        String expected = "\nLine: 89 missing semicolon.";
        Assert.assertEquals("Line 89 is missing a semicolon",expected,Linter.linter(filePath));
    }
    @Test
    public void testLinterFewErrors()throws FileNotFoundException {
        Path filePath = Paths.get("src/main/resources/fewErrors.js");
        String expected = "\nLine: 70 missing semicolon.\n" +
                "Line: 89 missing semicolon.\n" +
                "Line: 96 missing semicolon.\n" +
                "Line: 98 missing semicolon.";
        Assert.assertEquals("Contains few errors",expected,Linter.linter(filePath));
    }
    @Test
    public void testLinterEmptyFile() throws FileNotFoundException {
        Path filePath = Paths.get("src/main/resources/empty.js");
        String expected = "";
        Assert.assertEquals("Empty file no errors",expected,Linter.linter(filePath));
    }
}