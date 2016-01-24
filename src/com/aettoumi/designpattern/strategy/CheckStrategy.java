package com.aettoumi.designpattern.strategy;

/**
 * 
 * @author ahmed.ettoumi@gmail.com
 *
 */
public class CheckStrategy implements PaymentStrategy {
  private String number;
  private String owner;

  public CheckStrategy(String number, String owner) {
    super();
    this.number = number;
    this.owner = owner;
  }

  @Override
  public void pay(double amount) {
    System.out.println(amount + " paid using check");
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

}
