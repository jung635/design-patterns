package me.whiteship.designpatterns._01_creational_patterns._01_singleton;

public class RuntimeExample {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime(); //실행하는 환경
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
