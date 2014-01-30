package Weapons;

import java.util.LinkedList;
import java.util.List;

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

public class ProjectileManager {
	
	private static List<Projectile> list = new LinkedList<Projectile>();
	private static List<Projectile> deleteList = new LinkedList<Projectile>();
	private static List<ProjectileObserver> po = new LinkedList<ProjectileObserver>();
	

	public static void addProjectile(Projectile p)
	{
		list.add(p);
	}
	
	public static void updateProjectiles(GL2 gl, GLU glu)
	{
		if(!list.isEmpty())
		{
			for(Projectile p:list)
			{
				p.draw(gl,glu);
				for(ProjectileObserver i : po){
					i.updateProjectile(p.getX(),p.getY(), p.getZ());
				}
				p.move();
				if(p.notActive())
				{
					deleteList.add(p);
				}
			}
		}
		if(!deleteList.isEmpty())
		{
			for(Projectile p:deleteList)
			{
				list.remove(p);
			}
		}
	}
	
	public void addProjectileObserver(ProjectileObserver p){
		po.add(p);
	}
	
}
