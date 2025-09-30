/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pr2.model;

/**
 *
 * @author Student 2
 */
public class Product {
  private String name;
  private String category; 
  private int price;

public Product(String name, String category, int price) {
    this.name = name;
    this.category = category;
    this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

}

