package com.prasanth.modal;

/**
 * Created by batman on 7/10/17.
 */
public class Demo {

    private int id;
    private String name;

    public Demo(int id, String name){

        this.id = id;
        this.name = name;
    }

    /*
    Default constructor for JSON binding
     */
    public Demo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
