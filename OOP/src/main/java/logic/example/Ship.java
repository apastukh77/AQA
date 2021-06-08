package logic.example;

/**
 * @author Serhiy Dubovenko
 */
public abstract class Ship implements Shipable{

    abstract public void driftOnSky();

  @Override
  public void driftOnWave(){
      System.out.println("have speed 20 miles/hour");
  }
}
