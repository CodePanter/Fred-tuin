// S.Verbeek 23-2-2001
// Opdracht 3 Concurrent Programmeren: Botanische tuin

import java.awt.*;
import java.applet.*;

public class TuinApplet extends Applet
{
  // ...
  public Label aantalLabel;
  public Label aantalVrijLabel;
  
  public void init()
  {
    setLayout(null);
    setSize(466,191);
    setBackground(new Color(0,200,0));  //groene tuin
	
    InPanel in1Panel = new InPanel("1" );
    in1Panel.setLayout(null);
    in1Panel.setBounds(24,12,182,60);
    add(in1Panel);

    InPanel in2Panel = new InPanel("2" );
    in2Panel.setLayout(null);
    in2Panel.setBounds(24,96,181,62);
    add(in2Panel);

    Label label1 = new Label("AANTAL BEZOEKERS:",Label.CENTER);
    label1.setBounds(240,48,156,24);
    add(label1);
    aantalLabel = new Label("0",Label.CENTER);
    aantalLabel.setBounds(300,72,36,22);
    add(aantalLabel);

    Label label2 = new Label("AANTAL VRIJE PLAATSEN:");
    label2.setBounds(240,108,156,24);
    add(label2);
    //aantalVrijLabel = new Label(""+tuin.MAX_AANTAL_BEZOEKERS,Label.CENTER);
    aantalVrijLabel.setBounds(300,132,36,22);
    add(aantalVrijLabel);

    UitPanel uit1Panel = new UitPanel("1" );
    uit1Panel.setLayout(null);
    uit1Panel.setBounds(408,12,48,64);
    add(uit1Panel);

    UitPanel uit2Panel = new UitPanel("2" );
    uit2Panel.setLayout(null);
    uit2Panel.setBounds(408,96,48,64);
    add(uit2Panel);
  }
}