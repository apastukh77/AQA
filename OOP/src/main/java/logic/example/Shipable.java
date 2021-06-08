package logic.example;

/**
 * @author Serhiy Dubovenko
 */
public interface Shipable {

      void driftOnSky();

   default  void driftOnWave(){
       System.out.println("have speed 10 miles/hour");
   }

}
