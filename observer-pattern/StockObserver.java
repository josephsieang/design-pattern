public class StockObserver implements Observer {
  private double ibmPrice;
  private double applPrice;
  private double googPrice;

  private static int observerIdTracker = 0;

  private int observerId;

  private Subject stockGrabber;

  public StockObserver(Subject stockGrabber) {
    this.stockGrabber = stockGrabber;
    this.observerId = ++observerIdTracker;
    this.stockGrabber.register(this);

    System.out.println("New observer Id: " + this.observerId);
  }

  @Override
  public void update(double ibmPrice, double applPrice, double googlePrice) {
    this.ibmPrice = ibmPrice;
    this.applPrice = applPrice;
    this.googPrice = googlePrice;

    this.printStockPrices();
  }

  public void printStockPrices() {
    System.out.println(
        this.observerId + "\nIBM: " + this.ibmPrice + "\nAPPL: " + this.applPrice + "\nGOOGLE: " + this.googPrice);
  }
}
