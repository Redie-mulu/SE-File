package com.luisfelipedejesusm.finalexam.app;

public enum AccountType {
    CHECKING("Checking"), SAVING("Saving");

    private final String name;
    AccountType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
