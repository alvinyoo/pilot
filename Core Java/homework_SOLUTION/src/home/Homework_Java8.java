package com.interview.coding.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Homework_Java8 {

    /**
     * PROBLEM 1
     * Define an abstract class “CreditCard” which contains fields (holderName, cardNumber, accountBalance, cardType),
     * and not-implemented method “isCardAcceptable” with argument cardType, and implemented method “payBill(double bill)”.
     * Define two classes “VisaCard” and “MasterCard” both should inherit this “CreditCard” class
     * and you should define constructor for both classes and implement the “isCardAcceptable” method.
     */

    public interface CreditCard{
       /* private String holderName;
        private String cardNumber;
        private Double accountBalance;
        private String cardType;*/

        public abstract boolean isCardAcceptable(String cardType);

        default void payBill(double bill){
            System.out.println("Bill is paid with amount: " + bill);
        }

        static void refund(double amount){
            System.out.println("refund is applied to account");
        }
    }


    public class VisaCard implements CreditCard{

        public VisaCard() {
            super();
        }

        @Override
        public boolean isCardAcceptable(String cardType) {
            if("visa".equalsIgnoreCase(cardType)){
                return true;
            }else{
                return false;
            }
        }
    }



    /**
     * Self-implement functional interface and stream.map()
     */
    @FunctionalInterface
    public interface MyFunctionalInterface{
        public int apply(int num);
    }

    @FunctionalInterface
    public interface MyFunctionalInterface2{
        public boolean filter(int num);
    }

    public class MyStream{
        public List<Integer> myMap(List<Integer> list, MyFunctionalInterface myFunctionalInterface){
            List<Integer> result = new ArrayList<>();
            for(int num : list){
                result.add(myFunctionalInterface.apply(num));
            }
            return result;
        }

        public List<Integer> myFilter(List<Integer> list, MyFunctionalInterface2 myFunctionalInterface){
            List<Integer> result = new ArrayList<>();
            for(int num: list){
                if(myFunctionalInterface.filter(num)){
                    result.add(num);
                }
            }
            return result;
        }
    }

    //MyMap(lambda)
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        MyStream myStream = new Homework_Java8().new MyStream();
//        List<Integer> result = myStream.myMap(list, o -> o * o);
        List<Integer> result = myStream.myFilter(list, o -> o > 3);
        System.out.println(result);
    }

    /**
     * 3)	"walabcwalexywalxzsfwalmx”  -- replace "wal" with "sams"
     */
    public static String replace(String str){
        return Arrays.asList(str.split("wal")).stream().collect(Collectors.joining("sams"));
    }

    /**
     * 4)	"Eclipse eclipse Eclipse eclipse amc clip ECLIPSE" –
     * count the occurrence of each unique word (ignore case),
     * return result as a map. For example (eclipse->5, amc->1, clip->1)
     */
    public void count(String str){
        Arrays.asList(str.toLowerCase().split("\\s+"))
                .stream().
                collect(Collectors.groupingBy(o->o, Collectors.summingInt(o->1)));
    }

}
