package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("HelloWorldx")));
    }

    public static String[] solution(String s) {
        char[] charArray = s.toCharArray();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < charArray.length;i+=2) {
            if(i == charArray.length - 1 && charArray.length % 2 == 1) {
                String withUnderScore = Character.toString(charArray[i]) + "_";
                list.add(withUnderScore);
                break;
            }
            list.add(Character.toString(charArray[i]) + Character.toString(charArray[i + 1]));
        }
        return list.toArray((new String[0]));
    }
}