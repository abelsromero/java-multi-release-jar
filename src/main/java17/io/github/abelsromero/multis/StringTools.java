package io.github.abelsromero.multis;

public class StringTools {

    // For Java 17 +
    public String concat(String a, String b) {
        int javaVersion = Runtime.version().feature();
        return a + b + " (j17, " + javaVersion + ")";
    }
}
