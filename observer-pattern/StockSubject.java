import java.util.ArrayList;

public class StockSubject implements Subject {
  private ArrayList<Observer> observers;
  private double ibmPrice;
  private double applPrice;
  private double googlePrice;

  public StockSubject() {
    this.observers = new ArrayList<Observer>();
  }

  @Override
  public void register(Observer newObserver) {
    this.observers.add(newObserver);
  }

  @Override
  public void unregister(Observer observerToDelete) {
    int observerIdx = this.observers.indexOf(observerToDelete);
    this.observers.remove(observerIdx);

    System.out.println("Observer index to delete: " + observerIdx);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(this.ibmPrice, this.applPrice, this.googlePrice);
    }
  }

  public void setIBMPrice(double newIBMPrice) {
    this.ibmPrice = newIBMPrice;
    notifyObservers();
  }

  public void setApplPrice(double newApplPrice) {
    this.applPrice = newApplPrice;
    notifyObservers();
  }

  public void setGooglePrice(double newGooglePrice) {
    this.googlePrice = newGooglePrice;
    notifyObservers();
  }
}
