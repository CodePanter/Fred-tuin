// S.Verbeek 23-2-2001
import java.awt.*;
import java.applet.*;

// De Uitgang klasse bestaat uit een label een (draai)hek.
// Klasse Hek is innig verbonden met de Uitgang klasse en is
// daarom als binnenklasse opgenomen.

public class Uitgang extends Panel implements Runnable
{
  // ...
  Label uitLabel;
  Hek hek;

  public Uitgang(String nr)
  {
    // ...
  
    uitLabel = new Label("UIT " + nr);
    uitLabel.setBounds(12,0,36,20);
    add(uitLabel);
    hek = new Hek();
    hek.setBounds(0,24,40,40);
    add(hek);
    
    // ...
  }
  
    public void run()
    {
        
    }
  // ...

  class Hek extends Canvas
  {
    private boolean open = false;

    public Hek()
    {
      setSize(24,24);
    }
    
    public void setOpen()
    {
      open = true;
      repaint();
    }
    
    public void setDicht()
    {
      open = false;
      repaint();
    }
    
    public void openPuls()  //Zet het hekje gedurende 1 s open.
    {
        
    }
    
    public void paint(Graphics g)
    {
      g.setColor(getBackground());
      g.fillRect(0,0,40,40);
      g.setColor(Color.blue);
      if (open)
        g.fillRect(0,0,40,6);
      else
        g.fillRect(0,0,6,40);
    }
  }
}
