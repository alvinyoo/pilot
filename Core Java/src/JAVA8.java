import java.util.*;
import java.util.function.UnaryOperator;

/* Define an interface “CreditCard” which contains fields (holderName, cardNumber, accountBalance, cardType),
and not-implemented method “isCardAcceptable” with argument cardType. Define two classes “VisaCard”
and “MasterCard” both should inherit this “CreditCard” interface and you should define constructor for both
classes and implement the “isCardAcceptable” method. Now Add a default method “payBill(double bill)” and static
method “refund(double amount)” to the interface. Verify that VisaCard and MasterCard class can read these two
methods (use Main method to verify). */
interface CreditCard {
    String holderName;
    int cardNumber;
    Long accountBalance;
    String cardType;
    boolean isCardAcceptable(String cardType);
}

class VisaCard implements CreditCard {
    public VisaCard(String holderName, int cardNumber, Long accountBalance, String cardType) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }

    boolean isCardAcceptable(String cardType) {
        return cardType == "Visa";
    }
}

class MasterCard implements CreditCard {
    public MasterCard(String holderName, int cardNumber, Long accountBalance, String cardType) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }

    boolean isCardAcceptable(String cardType) {
        return cardType == "Master";
    }
}


/* Use functional interface to implement Java 8 stream.map() function. Define a “MyStream” class containing a
functional interface and a static method “MyMap”. In main method, test your code by
calling: MyStream.MyMap(list, o -> o *3) to multiple each element in the “list” by 3. */
public class MyStream {
    public static List<Integer> myMap(List<Integer> list, UnaryOperator<Integer> uo) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            res.add(uo.apply(list.get(i));
        }
        return res;
    }
}


/* "walabcwalexywalxzsfwalmx”  -- replace "wal" with "sams" */
class replacestr {
    public String replacestr(String str) {
        return str.replace("wal", "sams");
    }

    public void main(String[] args) {
        String str ="walabcwalexywalxzsfwalmx";
        System.out.println(replacestr(str));
    }
}


/* "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE" – count the occurrence of each unique
word (ignore case), return result as a map. For example (eclipse->5, amc->1, clip->1) */
class Counter {
    public Map<String, Integer> counter(String str) {
        HashMap<String, Integer> cnt = new HashMap<>();
        for (String word: str.split(" ")) {
            if (cnt.containsKey(word.toLowerCase())) {
                cnt.put(word, cnt.get(word.toLowerCase()) + 1);
            }
            else {
                cnt.put(word.toLowerCase(), 1);
            }
        }

        return cnt;
    }
}
