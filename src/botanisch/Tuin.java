// S.Verbeek 23-2-2001

// De Tuin klasse bevat alle elementen die rechtstreeks met de tuin
// hebben te maken (lokaliteitseis). Een aantal methoden is gesynchroniseerd
// omdat ze vanuit diverse threads aangeroepen worden.
// Voor het reserveren is een aparte BusyFlag gebruikt. Dit is nodig om
// een grotere lock scope te verkrijgen zonder dat andere threads geblokkeerd
// raken. Zie soortgelijk voorbeeld in Oaks (p62).

public class Tuin
{
  public int MAX_AANTAL_BEZOEKERS = 100;
  public int bezoekers = 0;

  public Tuin()
  {
   
  }
}