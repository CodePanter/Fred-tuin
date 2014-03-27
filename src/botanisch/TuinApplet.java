// S.Verbeek 23-2-2001
// Opdracht 3 Concurrent Programmeren: Botanische tuin

import java.awt.*;
import java.applet.*;

public class TuinApplet extends Applet
{
  // ...
  public Label aantalLabel;
  public Label aantalVrijLabel;
  public Tuin tuin = new Tuin();
  
  public void init()
  {
    setLayout(null);
    setSize(466,191);
    //setBackground(new Color(0,200,0));  //groene tuin
	
    Ingang Ingang1 = new Ingang("1", tuin );
    Ingang1.setLayout(null);
    Ingang1.setBounds(24,12,182,60);
    add(Ingang1);

    Ingang Ingang2 = new Ingang("2", tuin );
    Ingang2.setLayout(null);
    Ingang2.setBounds(24,96,181,62);
    add(Ingang2);

    Label Bezoekers = new Label("AANTAL BEZOEKERS:",Label.CENTER);
    Bezoekers.setBounds(240,48,156,24);
    add(Bezoekers);
    aantalLabel = new Label("" + tuin.getAantalBezoekers(),Label.CENTER);
    aantalLabel.setBounds(300,72,36,22);
    add(aantalLabel);

    Label Plaatsen = new Label("AANTAL VRIJE PLAATSEN:");
    Plaatsen.setBounds(240,108,156,24);
    add(Plaatsen);
    aantalVrijLabel = new Label("" + tuin.getAantalVrijePlaatsen(),Label.CENTER);
    aantalVrijLabel.setBounds(300,132,36,22);
    add(aantalVrijLabel);

    Uitgang Uitgang1 = new Uitgang("1" );
    Uitgang1.setLayout(null);
    Uitgang1.setBounds(408,12,48,64);
    add(Uitgang1);

    Uitgang Uitgang2 = new Uitgang("2" );
    Uitgang2.setLayout(null);
    Uitgang2.setBounds(408,96,48,64);
    add(Uitgang2);
  }
}