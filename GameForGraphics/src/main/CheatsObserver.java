package main;

public interface CheatsObserver {
	public void godModeChanged(boolean turnOn);
	public void allWeaponsChanged(boolean turnOn);
	public void unlimitedAmmoChanged(boolean turnOn);
	public void speedChanged(boolean turnOn);
	public void oneShotChanged(boolean turnOn);
}
