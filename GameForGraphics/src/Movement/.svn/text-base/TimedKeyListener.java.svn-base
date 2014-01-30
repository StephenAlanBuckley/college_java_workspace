package Movement;


/*
 * Code found on java Bug ID: 4153069 comments
 * Workaround for linux firing multiple keyRelease events when a key is held down
 * 
 * original code found: http://www.arco.in-berlin.de/keyevent.html
 * 
 * Modified to handle keyRelease event for more than one key released at the same time
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.Timer;

import main.Game;

public class TimedKeyListener implements KeyListener,ActionListener 
{
  private final ArrayList<Integer> set = new ArrayList<Integer>();
  private final ArrayList<Timer> timers = new ArrayList<Timer>();
  private final ArrayList<KeyEvent> releaseEvents = new ArrayList<KeyEvent>();
  
  private boolean gameModus = false;
  
  protected Eye eye;
  protected Game game;

  private void fireKeyReleased(KeyEvent e) {
	  	int index = getIndex(e.getKeyCode());
		if(index != -1)
		{
			timers.get(index).stop();
			if (set.remove(new Integer(e.getKeyCode()))) 
			{
				timers.remove(index);
			    KeyReleased(e);
			}
		}
  }
  
  private int getIndex(int code)
  {
	  	for (int i = 0; i<set.size(); i++)
	  	{
	  		if (set.get(i) == code)
	  			return i;
	  	}
	  	return -1;
  }
  
  public TimedKeyListener(Game game,Eye eye) {
	  this(false);
	  this.eye = eye;
	  this.game = game;
  }
  
  public TimedKeyListener(boolean gameModus) {
    this.gameModus = gameModus;
  }
  
  public void KeyPressed(KeyEvent e) {}
  public void KeyReleased(KeyEvent e) {}
  public void KeyTyped(KeyEvent e) {}
  
  public int getPressedCount() {
    return set.size();
  }
  
  public void keyPressed(KeyEvent e) {
	int index = getIndex(e.getKeyCode());
	if(index != -1)
	{
		releaseEvents.remove(e);
	    if (timers.get(index).isRunning()) 
	    {
	      timers.get(index).stop();
	    }
	}
    else 
    {
      if (set.add(new Integer(e.getKeyCode()))) {
    	  timers.add(new Timer(0,this));
        if (gameModus) {
          KeyPressed(e);
          return;
        }
      }
    }
    if (!gameModus) 
    {
    	KeyPressed(e);
    }
  }
  
  public void keyReleased(KeyEvent e) {
	int index = getIndex(e.getKeyCode());
	if(index != -1)
	{
	    if (timers.get(index).isRunning()) 
	    {
	    	
	      timers.get(index).stop();
	      fireKeyReleased(e);
	    }
	    else {
	      releaseEvents.add(index, e);
	      timers.get(index).restart();
	    }
	}
  }
  
  public void keyTyped(KeyEvent e) {
    KeyTyped(e);
  }
  
  public void actionPerformed(ActionEvent e) {
	  for (KeyEvent releaseEvent: releaseEvents)
		  fireKeyReleased(releaseEvent);
  }
}