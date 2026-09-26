package com.example.SpringAOP;


public class InventoryServiceImp implements InventoryService {

	@Override
	public int inventoryCheck(String skr) {
		System.out.printf("{ %s } Inventory Quantity = 30\n", skr);
		return 30;
	}

	@Override
	public void reserveStock(String skr, int quantity) {
		if (quantity > 100)
			throw new IllegalStateException("Quantity Can't Be Greater Than 100!");

		System.out.printf("{ %s } Inventory Have { %d }Item.\n", skr, quantity);
	}

}
