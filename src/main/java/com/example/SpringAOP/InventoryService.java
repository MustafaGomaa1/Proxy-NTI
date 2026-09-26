package com.example.SpringAOP;

public interface InventoryService {

    int inventoryCheck(String skr);

    void reserveStock(String skr,int quantity);
}
