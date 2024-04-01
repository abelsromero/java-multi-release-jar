package io.github.abelsromero.multis;

public class StringTools {

    // Default implementation (Java < 17)
    public String concat(String a, String b) {
        int javaVersion = Runtime.version().feature();
        return a + b + " (default, " + javaVersion + ")";
    }
}
