package com.interview.coding.course;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Homework
 * -- JavDoc
 */
public class Homework_String {


    /**
     * 1) Given string “Algorithms”, return  “go” and “Algo” using substring
     * @Author
     * @Parameter
     * @Return
     *
     */
    public void findSubString(){
        String input = "Algorithms";
        System.out.println(input.substring(2,4) + "," + input.substring(0, 4));
    }

    /**
     * 2) Given two strings, compare if these two strings are equal by comparing each character
     */
    public boolean isEqual(String s1, String s2){
        if(s1 == null || s2 == null){
            return false;
        }
        if(s1.length() != s2.length()){
            return false;
        }

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    /**
     * 3) Given string “https://www.amazon.com/demo?test=abc”,
     * return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]
     */
    public String[] splitString(String str){
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":/.?=");
        List<String> list = new ArrayList<>();
        while(stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            if(token != null || token.length() != 0){
                list.add(token);
            }
        }
        String[] result = new String[list.size()];
        int j = 0;
        for(int i=0; i<list.size(); i++){
            result[j++] = list.get(i);
        }


        //return str.split(":/.?=");

        //list.toArray();

        return result;
    }

    /**
     * @Description:
     * @Author
     * @param input
     * @return string
     */
    public String combine(List<String[]> input){
        StringBuilder stringBuilder = new StringBuilder();
        for(String[] arr: input){
            for(String str : arr){
                stringBuilder.append(str).append(" ");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }


}
