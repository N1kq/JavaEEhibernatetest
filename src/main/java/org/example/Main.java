package org.example;

public class Main {
    public static void main(String[] args) {
        DBfunctions db = new DBfunctions();
        db.connect_to_db("postgres","postgres","adminadmin");
    }
}