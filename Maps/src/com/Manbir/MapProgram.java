package com.Manbir;


import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level");
        languages.put("Python", "a interpreted OO high level programming language");
        languages.put("Algol", "an algorithmic language ");
        System.out.println(languages.put("BASIC", "Beginners language ")); // gives null value, which means its the first input ever of BASIC
        languages.put("Lisp", "Hell ");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            System.out.println(languages.put("Java", "JAVAAAAA"));
        }
       // languages.remove("Lisp");
        if (languages.remove("Algol", "sdqwdqed"));
        System.out.println("======================================================================");
        System.out.println(languages.replace("Lisp", "new value"));
        System.out.println(languages.replace("Scala", "new value2222"));

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
}
    }
}
