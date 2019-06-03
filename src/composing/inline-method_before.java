class PizzaDelivery {
  // ...
  int getRating() {
    return numberOfFiveLateDeliveries > 5 ? 2 : 1;
  }
}