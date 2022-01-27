import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

/* Define an interface “DatabaseConnection” and then define class “OracleConnection”, “MySqlConnection”,
“SqlServerConnection”. They should all implements the “getConnection” method from the interface.
The method should initialize data source and return a database connection.
 */
interface DatabaseConnection {
    Connection Connection();
}

public class OracleConnection implements DatabaseConnection {
    public Connection Connection() {
        return DriverManager.getConnection();
    }
}

public class MySqlConnection implements DatabaseConnection {
    public Connection Connection() {
        return DriverManager.getConnection();
    }
}

public class SqlServerConnection implements DatabaseConnection {
    public Connection Connection() {
        return DriverManager.getConnection();
    }
}


/*
Define an abstract class “CreditCard” which contains fields (holderName, cardNumber, accountBalance, cardType),
and not-implemented method “isCardAcceptable” with argument cardType, and implemented method “payBill(double bill)”.
Define two classes “VisaCard” and “MasterCard” both should inherit this “CreditCard” class and you should
define constructor for both classes and implement the “isCardAcceptable” method.
*/
abstract class CreditCard {
    String holderName;
    int cardNumber;
    Long accountBalance;
    String cardType;

    abstract Boolean isCardAcceptable(String cardType);

    double payBill(double bill) {
        return bill;
    }
}

abstract class VisaCard extends CreditCard {
    VisaCard(String holderName, int cardNumber, Long accountBalance, String cardType){
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }

    Boolean isCardAcceptable() {
        return Objects.equals(cardType, "Visa");
    }
}

abstract class MasterCard extends CreditCard {
    MasterCard(String holderName, int cardNumber, Long accountBalance, String cardType) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }

    Boolean isCardAcceptable() {
        return Objects.equals(cardType, "Master");
    }
}


/*
Implement static and dynamic polymorphism.
 */
