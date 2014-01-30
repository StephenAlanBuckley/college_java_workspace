package Buildings;

// St Peter's Basilica

import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;

import main.SketchupModelJAXB;


public class StPetersBuilding extends Building {
    
    private SketchupModelJAXB stPeters;

    public StPetersBuilding(GL2 gl, GLU glu) {
        stPeters = new SketchupModelJAXB("st peters.dae", gl, glu);
    }

    public void draw(GL2 gl, GLU glu) {
        
        stPeters.draw(gl, glu);
      
    }
}