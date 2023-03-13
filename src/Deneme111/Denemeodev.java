package Deneme111;

public class Denemeodev {

    public static void main(String[] args) {
        method(null);
    }

    private static void method(Object o) {
        System.out.println("Object method");
    }
    private static void method(String s) {
        System.out.println("String method");
}}
