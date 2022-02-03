package com.interview.coding.course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Homework_OOP {

    public interface DatabaseConnection{
        public abstract Connection getConnection();
    }

    //Oracle db connection
    public class OracleConnection implements DatabaseConnection{

        public Connection getConnection() {
            String driverName = "oracle driver";
            String url = "oracle database url";
            String username = "test";
            String password = "test";
            Connection conn = null;
            try{
                conn = DriverManager.getConnection(url, username, password);
            }catch (SQLException e){;}
            finally {
                try {
                    if (conn != null) {
                        conn.close();
                        conn = null;
                    }
                }catch(Exception e){}
            }

            return conn;
        }
    }

    //MySQL db connection
    public class MySQLConnection implements DatabaseConnection{

        public Connection getConnection() {
            String driverName = "mysql driver";
            String url = "mysql database url";
            String username = "test";
            String password = "test";
            Connection conn = null;
            try{
                conn = DriverManager.getConnection(url, username, password);
            }catch (SQLException e){;}
            finally {
                try {
                    if (conn != null) {
                        conn.close();
                        conn = null;
                    }
                }catch(Exception e){}
            }

            return conn;
        }
    }

    //SQL SERVER db connection
    public class SQLServerConnection implements DatabaseConnection{

        public Connection getConnection() {
            String driverName = "sql server driver";
            String url = "sql server database url";
            String username = "test";
            String password = "test";
            Connection conn = null;
            try{
                conn = DriverManager.getConnection(url, username, password);
            }catch (SQLException e){;}
            finally {
                try {
                    if (conn != null) {
                        conn.close();
                        conn = null;
                    }
                }catch(Exception e){}
            }

            return conn;
        }
    }

    public DatabaseConnection getConnectionByDBName(String db){
        if("Oracle".equalsIgnoreCase(db)){
            return new OracleConnection();
        }
        if("MySQL".equalsIgnoreCase(db)){
            return new MySQLConnection();
        }
        if("SQLServer".equalsIgnoreCase(db)){
            return new SQLServerConnection();
        }
        return null;
    }


    /**
     * PROBLEM 2
     * 2)	Define an abstract class “CreditCard” which contains fields (holderName, cardNumber, accountBalance, cardType),
     * and not-implemented method “isCardAcceptable” with argument cardType, and implemented method “payBill(double bill)”.
     * Define two classes “VisaCard” and “MasterCard” both should inherit this “CreditCard” class
     * and you should define constructor for both classes and implement the “isCardAcceptable” method.
     */

    public abstract class CreditCard{
        private String holderName = "Jon Snow";
        private String cardNumber;
        private Double accountBalance = 30.0;
        private String cardType;

        public CreditCard() {
            System.out.println("Print Holder Name from Credit_Card class");
        }

        public abstract boolean isCardAcceptable(String cardType);

        public void payBill(double bill){
            this.accountBalance -= bill;
            System.out.println("Bill is paid with amount: " + bill + ". Your remaining balance is: " + this.accountBalance);
        }
    }


    public class VisaCard extends CreditCard{

        public VisaCard() {
            super();
            System.out.println(super.holderName + "has balance: " + super.accountBalance);
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
     * Problem 3: Polymorphism
     *
     * Ignored: Because everybody knows, too simple
     */



}
