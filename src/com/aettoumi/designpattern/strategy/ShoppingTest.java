package com.aettoumi.designpattern.strategy;


/**
 * 
 * @author ahmed.ettoumi@gmail.com
 *
 */
public class ShoppingTest {

  public static void main(String[] args) {
    Item item1 = new Item("AAA-01", 12.5);
    Item item2 = new Item("AAA-02", 33.0);

    ShoppingList shopping =
        new ShoppingList(new CreditCardStrategy("Ahmed Toumi", "XXXX XXXX XXXX XXXX", "YYY",
            "MM/YYYY"));

    shopping.addItem(item1);
    shopping.addItem(item2);

    shopping.payShoppingItems(shopping.amountToPay());
  }


}
