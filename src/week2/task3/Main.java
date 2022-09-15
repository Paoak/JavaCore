package week2.task3;

import java.util.*;

/*
        Task3
            Реализовать функцию нечеткого поиска

                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */

public class Main {

    public static void main(String[] args) {

        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel"));
        System.out.println(fuzzySearch("cwhl", "cartwheel"));
        System.out.println(fuzzySearch("cwhee", "cartwheel"));
        System.out.println(fuzzySearch("cartwheel", "cartwheel"));
        System.out.println(fuzzySearch("cwheeel", "cartwheel"));
        System.out.println(fuzzySearch("lw", "cartwheel"));
    }

    public static boolean fuzzySearch(String required, String given){
        if(required.isEmpty() || given.isEmpty()){
            throw new IllegalArgumentException();
        }
        char[] req = required.toCharArray();
        char[] giv = given.toCharArray();
        char[] res = new char[req.length];
        int count = 0;

        for(int i = 0; i < req.length; i++){
            for (int l = count; l< giv.length; l++){
                if(req[i] == giv[l]){
                    res[i] = req[i];
                    count = l;
                    giv[l] = 0;
                    break;
                }
            }
        }
        return Arrays.equals(req, res);
    }
}