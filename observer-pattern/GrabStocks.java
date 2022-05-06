public class GrabStocks {
  public static void main(String[] args) {
    StockGrabber stockGrabber = new StockGrabber();

    new StockObserver(stockGrabber);

    stockGrabber.setIBMPrice(197);
    stockGrabber.setApplPrice(166);
    stockGrabber.setGooglePrice(200);

    new StockObserver(stockGrabber);

    stockGrabber.setIBMPrice(1000);
    stockGrabber.setApplPrice(700);
    stockGrabber.setGooglePrice(500);
  }
}
