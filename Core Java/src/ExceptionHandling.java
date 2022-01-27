/* Define two exceptions “CardTypeException” and “AddressException”. Create a separate class
“ExceptionHandler” which contains one method “handleException”. The method takes input of cardType and address.
If cardType is “AMEX”, throw CardTypeException. If address is outside US, return AddressException, for other errors,
just return generic exception. Your exception should be caught and you should display message to tell
which exception is returned. */

import java.util.Objects;

class CardTypeException extends Exception {
    CardTypeException(String msg) {
        super(msg);
    }
}

class AddressException extends Exception {
    AddressException(String msg) {
        super(msg);
    }
}

class ExceptionHandler {
    public static void handleException(String cardType, String address) throws CardTypeException, AddressException {
        try{
            if (Objects.equals(cardType, "AMEX")) {
                throw new CardTypeException("Card type is AMEX!");
            }

            if (!address.equals("US")) {
                throw new AddressException("Address is outside US !");
            }
        }
        catch (CardTypeException || AddressException e) {
            System.out.println(e);
        }
    }
}
