public class GrabStocks {
  public static void main(String[] args) {
    StockSubject stockSubject = new StockSubject();

    new StockObserver(stockSubject);

    stockSubject.setIBMPrice(197);
    stockSubject.setApplPrice(166);
    stockSubject.setGooglePrice(200);

    new StockObserver(stockSubject);

    stockSubject.setIBMPrice(1000);
    stockSubject.setApplPrice(700);
    stockSubject.setGooglePrice(500);
  }
}
