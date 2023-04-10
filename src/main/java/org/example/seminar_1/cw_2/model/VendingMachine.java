package org.example.seminar_1.cw_2.model;

import java.util.ArrayList;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
