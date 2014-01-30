package Bats;
public interface FlyBehavior{
      public void setPlayer(float playX, float playY, float playZ);
      public void setBat(float batX, float batY, float batZ);
      public void move();
      public float getX();
      public float getY();
      public float getZ();
      public float getAngle();
      public boolean getAttack();
      public int healing();
}