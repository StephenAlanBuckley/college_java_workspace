package Environment;

import java.util.ArrayList;
import java.util.List;

import Buildings.BaldoniBuilding;
import Buildings.Building;
import Buildings.CerboneBuilding;
import Buildings.ChengBuilding;
import Buildings.ColeBuilding;
import Buildings.DeMaioBuilding;
import Buildings.DonnellyBuilding;
import Buildings.EndresBuilding;
import Buildings.EpsteinBuilding;
import Buildings.FothergillBuilding;
import Buildings.GolderBuilding;
import Buildings.HernandezBuilding;
import Buildings.JengBuilding;
import Buildings.JungBuilding;
import Buildings.JungBuildings;
import Buildings.KayeBuilding;
import Buildings.KeemonBuilding;
import Buildings.KieltykaBuilding;
import Buildings.LuoBuilding;
import Buildings.MahonBuilding;
import Buildings.MahonTower;
import Buildings.MartinBuilding;
import Buildings.MccannBuilding;
import Buildings.MecheryBuilding;
import Buildings.MelvinTower;
import Buildings.ParkBuilding;
import Buildings.PerryBuilding;
import Buildings.RusBuilding;
import Buildings.Step;
import Buildings.StephanBuilding;
import Buildings.WestBuilding;
import Buildings.ZhangBuilding;
import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Movement.*;

public class CityGrid {
	private List<Building> buildings;
	private ArrayList<Step> stepList;
	public CityGrid(List<Building> buildings_,ArrayList<Step> stepList_) {
		buildings = buildings_;
		stepList=stepList_;
	}
	public void draw(GL2 gl,GLU glu,Eye eye) {
		float xt = 0;
		float yt = 0;
		float zt = 0; 
		
		gl.glPushMatrix();
		int buildingNumber = 0;
		for (Building building : buildings) {
			building.drawWithDisplayList(gl, glu);
			// building.draw(gl, glu); // if not using display lists
			building.measuredDrawMoving(gl, glu, eye.getX(), eye.getY(),
					eye.getZ());
			building.drawSteps(gl, glu, eye, stepList, xt, 0, zt);
			gl.glTranslated(100, 0, 0);
			xt += 100;
			++buildingNumber;
			if (buildingNumber % 6 == 0)// 6 buildings per row
			{
				gl.glTranslatef(-600, 0, 100); // start new column
				xt -= 600;
				zt += 100;
			}
		}
		gl.glPopMatrix();
	}
}

