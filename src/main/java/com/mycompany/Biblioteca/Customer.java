/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Biblioteca;

/**
 *
 * @author elkin jimenez
 */
public class Customer extends Person {
    
    private String kindOfCustomer;
    private int id;

    public Customer(String kindOfCustomer, int id, String name, String cc, String age) {
        super(name, cc, age);
        this.kindOfCustomer = kindOfCustomer;
        this.id = id;
    }

    public String getKindOfCustomer() {
        return kindOfCustomer;
    }

    public void setKindOfCustomer(String kindOfCustomer) {
        this.kindOfCustomer = kindOfCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
