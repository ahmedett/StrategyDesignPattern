package com.aettoumi.designpattern.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ahmed.ettoumi@gmail.com
 *
 */
public class ShoppingList {

  private List<Item> selectedItems;
  private PaymentStrategy payment;

  public ShoppingList(PaymentStrategy payment) {
    super();
    this.payment = payment;
  }

  private List<Item> getSelectedItems() {
    if (selectedItems == null) {
      selectedItems = new ArrayList<>();
    }
    return selectedItems;
  }

  public void addItem(Item item) {
    getSelectedItems().add(item);
  }

  public void removeItem(Item item) {
    getSelectedItems().remove(item);
  }

  public double amountToPay() {
    double sum = 0;
    for (Item item : selectedItems) {
      sum += item.getPrice();
    }
    return sum;
  }

  public void payShoppingItems(double amount) {
    payment.pay(amount);
  }

}
