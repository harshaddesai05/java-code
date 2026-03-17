package com.exp5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BankTransaction {

    public static void main(String[] args) {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "harshad@1205");

            System.out.println("Connected Successfully ✅");

            con.setAutoCommit(false);

            PreparedStatement ps1 = con.prepareStatement(
                    "UPDATE account SET balance = balance - ? WHERE acc_no = ?");

            ps1.setDouble(1, 1000);
            ps1.setInt(2, 101);

            PreparedStatement ps2 = con.prepareStatement(
                    "UPDATE account SET balance = balance + ? WHERE acc_no = ?");

            ps2.setDouble(1, 1000);
            ps2.setInt(2, 102);

            ps1.executeUpdate();
            ps2.executeUpdate();

            con.commit();

            System.out.println("Transaction Successful ✅");

        } catch (Exception e) {

            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }

            System.out.println("Transaction Failed ❌");
            System.out.println(e);
        }
    }
}
