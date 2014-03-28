// S.Verbeek 23-2-2001

// De Tuin klasse bevat alle elementen die rechtstreeks met de tuin
// hebben te maken (lokaliteitseis). Een aantal methoden is gesynchroniseerd
// omdat ze vanuit diverse threads aangeroepen worden.
// Voor het reserveren is een aparte BusyFlag gebruikt. Dit is nodig om
// een grotere lock scope te verkrijgen zonder dat andere threads geblokkeerd
// raken. Zie soortgelijk voorbeeld in Oaks (p62).

public class Tuin
{
  private final int MAX_AANTAL_BEZOEKERS = 100;
  private int aantalBezoekers = 0;
  private static BusyFlag reserveerFlag;

  public Tuin()
  {

  }
  
  public int getAantalBezoekers(){      
      return aantalBezoekers;
  }
  
  public int getAantalVrijePlaatsen(){      
      return MAX_AANTAL_BEZOEKERS - aantalBezoekers;
  }
  
  public boolean reserveer(int integer){
      
      return false;
  }
  
  public boolean bezoekerVertrek(){
      
      return false;
  }
  
  public void pasLabelsAan(){
      
  }
  
  public static void reserveerLock(){
      reserveerFlag.getBusyFlag();
  }
  
  public static void reserveerUnlock(){
      reserveerFlag.freeBusyFlag();
  }
  
  public Thread getReserveerFlagOwner(){
      
      return null;
  }
}