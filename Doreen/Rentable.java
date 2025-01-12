package com.doreen;

public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
}