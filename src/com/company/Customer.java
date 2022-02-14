package com.company;

public class Customer {
    private int id;
    private String username;
    private String password;
    private int balance;


    public Customer(){

    }
    public Customer(int id, String username, String password, int balance){
        this.id=id;
        this.username=username;
        this.password=password;
        this.balance=balance;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUsername(){
        return username;

    }
    public void setUsername(String username){
       this.username=username;
    }

    public String getPassword(){
        return password;

    }
    public void setPassword(String password){
        this.password=password;
    }

    public int getBalance(){
        return balance;

    }
    public void setBalance(int balance){
        this.balance=balance;
    }




}
