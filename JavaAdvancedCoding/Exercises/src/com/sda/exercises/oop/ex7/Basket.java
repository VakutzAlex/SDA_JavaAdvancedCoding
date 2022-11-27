package com.sda.exercises.oop.ex7;

import com.sda.exercises.oop.ex6.BasketEmptyException;
import com.sda.exercises.oop.ex6.BasketFullException;

import java.util.ArrayList;
import java.util.List;

/**
 * Change the BasketFullException and BasketEmptyException exceptions from runtime exception type to checked exception type. Handle them.
 */

public class Basket {

    private final List<String> products = new ArrayList<>();

    private final int maxSize;

    public Basket(int maxSize) {
        this.maxSize = maxSize;
    }

    public void addToBasket(String product){
        if(products.size()<maxSize){
            products.add(product);
        }else {
            throw new BasketFullException("Full basket: " + maxSize);
        }
    }

    public void removeFromBasket(String product){
        if(products.size()>0){
            products.remove(product);
        }else {
            //throw new BasketEmptyException();
        }
    }
}
