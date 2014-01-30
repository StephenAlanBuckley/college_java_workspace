package Movement;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;

public interface ControlBehavior extends KeyListener, MouseListener, MouseWheelListener {

	public void update(); //called by Game every frame
	public void startListening();
	public void stopListening();
	public void setImmobile();
	public void setDefaultStepSize();
	public int getForwardMotion();
	public int getForG();
}
