//Header


package SketchupModels;
import javax.media.opengl.GL2;
import javax.media.opengl.glu.GLU;
import Buildings.Building;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import com.jogamp.opengl.util.GLBuffers;
import java.util.HashMap;
import java.util.Map;
public class PerryDresser
{
private int displayList = -1;
private Map<String, com.jogamp.opengl.util.texture.Texture> imageMap = new HashMap<String, com.jogamp.opengl.util.texture.Texture>(); // map of ID's to textures
public PerryDresser(GL2 gl, GLU glu) {
    generate(gl, glu);
}
public void draw(GL2 gl, GLU glu) {
  gl.glCallList(displayList);
}
private void generate(GL2 gl, GLU glu){

displayList = gl.glGenLists(1);
gl.glNewList(displayList, GL2.GL_COMPILE);
  gl.glPushAttrib(GL2.GL_POLYGON_BIT);
    gl.glFrontFace(GL2.GL_CCW);
    gl.glCullFace(GL2.GL_BACK);
    gl.glEnable(GL2.GL_CULL_FACE);
gl.glPushMatrix();
gl.glScaled(0.08333333333333333, 0.08333333333333333, 0.08333333333333333);
gl.glRotatef(-90,1,0,0);
ID2(gl);
ID10(gl);
ID16(gl);
ID22(gl);
ID28(gl);
ID34(gl);
ID44(gl);
ID50(gl);
ID56(gl);
       gl.glPopMatrix();
   gl.glPopAttrib();
gl.glEndList();
}
//Trailer


private void ID2(GL2 gl){
double[] positionsArray = {
68.3797213,162.2891899,-8.0722438,141.8172213,135.2086035,-8.0722438,68.3797213,135.2086035,-8.0722438,141.8172213,162.2891899,-8.0722438,68.3797213,162.2891899,31.2303029,68.3797213,135.2086035,-8.0722438,68.3797213,135.2086035,31.2303029,68.3797213,162.2891899,18.9463086,68.3797213,162.2891899,-8.0722438,68.3797213,162.2891899,5.4370324,68.3797213,162.2891899,-8.0722438,102.726161,162.2891899,-1.588533,141.8172213,162.2891899,-8.0722438,68.3797213,162.2891899,5.4370324,103.2437991,162.2891899,-1.6566813,102.2437991,162.2891899,-1.3887321,101.8295855,162.2891899,-1.0708949,101.5117483,162.2891899,-0.6566813,101.3119475,162.2891899,-0.1743194,101.2437991,162.2891899,0.3433187,101.3119475,162.2891899,0.8609567,101.5117483,162.2891899,1.3433187,101.8295855,162.2891899,1.7575322,102.2437991,162.2891899,2.0753695,102.726161,162.2891899,2.2751703,103.2437991,162.2891899,2.3433187,103.7614372,162.2891899,-1.588533,141.8172213,162.2891899,5.4370324,104.2437991,162.2891899,-1.3887321,104.6580127,162.2891899,-1.0708949,104.9758499,162.2891899,-0.6566813,105.1756508,162.2891899,-0.1743194,105.2437991,162.2891899,0.3433187,105.1756508,162.2891899,0.8609567,104.9758499,162.2891899,1.3433187,104.6580127,162.2891899,1.7575322,104.2437991,162.2891899,2.0753695,103.7614372,162.2891899,2.2751703,141.8172213,162.2891899,-8.0722438,141.8172213,162.2891899,5.4370324,141.8172213,135.2086035,-8.0722438,141.8172213,162.2891899,31.2303029,141.8172213,135.2086035,31.2303029,141.8172213,162.2891899,18.9463086,141.8172213,135.2086035,31.2303029,68.3797213,135.2086035,-8.0722438,141.8172213,135.2086035,-8.0722438,68.3797213,135.2086035,31.2303029,141.8172213,135.2086035,31.2303029,68.3797213,162.2891899,31.2303029,68.3797213,135.2086035,31.2303029,117.2412751,145.2148849,31.2303029,130.994564,145.2148849,31.2303029,130.994564,153.7148849,31.2303029,117.2412751,153.7148849,31.2303029,141.8172213,162.2891899,31.2303029,68.3797213,162.2891899,18.9463086,103.7429112,162.2891899,22.8010269,141.8172213,162.2891899,18.9463086,103.1794945,162.2891899,22.8752021,68.3797213,162.2891899,31.2303029,102.6544737,162.2891899,23.0926728,102.2036281,162.2891899,23.4386188,101.8576822,162.2891899,23.8894644,101.6402114,162.2891899,24.4144852,101.5660362,162.2891899,24.9779019,101.6402114,162.2891899,25.5413186,101.8576822,162.2891899,26.0663394,102.2036281,162.2891899,26.517185,102.6544737,162.2891899,26.8631309,103.1794945,162.2891899,27.0806017,103.7429112,162.2891899,27.1547769,141.8172213,162.2891899,31.2303029,104.3063279,162.2891899,22.8752021,104.8313487,162.2891899,23.0926728,105.2821943,162.2891899,23.4386188,105.6281403,162.2891899,23.8894644,105.845611,162.2891899,24.4144852,105.9197862,162.2891899,24.9779019,105.845611,162.2891899,25.5413186,105.6281403,162.2891899,26.0663394,105.2821943,162.2891899,26.517185,104.8313487,162.2891899,26.8631309,104.3063279,162.2891899,27.0806017,68.3797213,162.2891899,5.4370324,103.0527915,162.2891899,10.7111279,141.8172213,162.2891899,5.4370324,68.3797213,162.2891899,18.9463086,103.6016496,162.2891899,10.6388693,102.5413371,162.2891899,10.9229792,102.1021413,162.2891899,11.259986,101.7651345,162.2891899,11.6991818,101.5532832,162.2891899,12.2106362,101.4810246,162.2891899,12.7594943,101.5532832,162.2891899,13.3083525,101.7651345,162.2891899,13.8198068,102.1021413,162.2891899,14.2590027,102.5413371,162.2891899,14.5960095,103.0527915,162.2891899,14.8078608,103.6016496,162.2891899,14.8801193,104.1505078,162.2891899,10.7111279,141.8172213,162.2891899,18.9463086,104.6619621,162.2891899,10.9229792,105.101158,162.2891899,11.259986,105.4381648,162.2891899,11.6991818,105.6500161,162.2891899,12.2106362,105.7222746,162.2891899,12.7594943,105.6500161,162.2891899,13.3083525,105.4381648,162.2891899,13.8198068,105.101158,162.2891899,14.2590027,104.6619621,162.2891899,14.5960095,104.1505078,162.2891899,14.8078608,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.4039216, 0.172549, 0.1176471, 1.0);
int[] indices = {
0,1,2,1,0,3,4,5,6,5,4,7,5,7,8,8,7,9,10,11,12,11,10,13,12,11,14,11,13,15,15,13,16,16,13,17,17,13,18,18,13,19,19,13,20,20,13,21,21,13,22,22,13,23,23,13,24,24,13,25,12,26,27,26,12,14,27,26,28,27,28,29,27,29,30,27,30,31,27,31,32,27,32,33,27,33,34,27,34,35,27,35,36,27,36,37,27,37,25,27,25,13,38,39,40,40,41,42,41,40,39,41,39,43,44,45,46,45,44,47,48,49,50,49,48,51,51,48,52,52,48,53,49,54,55,54,49,51,55,54,53,55,53,48,56,57,58,57,56,59,59,56,60,59,60,61,61,60,62,62,60,63,63,60,64,64,60,65,65,60,66,66,60,67,67,60,68,68,60,69,69,60,70,70,60,71,71,60,72,58,73,72,73,58,57,72,73,74,72,74,75,72,75,76,72,76,77,72,77,78,72,78,79,72,79,80,72,80,81,72,81,82,72,82,83,72,83,71,84,85,86,85,84,87,86,85,88,85,87,89,89,87,90,90,87,91,91,87,92,92,87,93,93,87,94,94,87,95,95,87,96,96,87,97,97,87,98,98,87,99,86,100,101,100,86,88,101,100,102,101,102,103,101,103,104,101,104,105,101,105,106,101,106,107,101,107,108,101,108,109,101,109,110,101,110,111,101,111,99,101,99,87,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 312, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID10(GL2 gl){
double[] positionsArray = {
102.726161,162.2891899,-1.588533,103.7614372,162.2891899,-1.588533,103.2437991,162.2891899,-1.6566813,102.2437991,162.2891899,-1.3887321,104.2437991,162.2891899,-1.3887321,101.8295855,162.2891899,-1.0708949,104.6580127,162.2891899,-1.0708949,101.5117483,162.2891899,-0.6566813,104.9758499,162.2891899,-0.6566813,101.3119475,162.2891899,-0.1743194,105.1756508,162.2891899,-0.1743194,101.2437991,162.2891899,0.3433187,105.2437991,162.2891899,0.3433187,101.3119475,162.2891899,0.8609567,105.1756508,162.2891899,0.8609567,101.5117483,162.2891899,1.3433187,104.9758499,162.2891899,1.3433187,101.8295855,162.2891899,1.7575322,104.6580127,162.2891899,1.7575322,102.2437991,162.2891899,2.0753695,104.2437991,162.2891899,2.0753695,102.726161,162.2891899,2.2751703,103.7614372,162.2891899,2.2751703,103.2437991,162.2891899,2.3433187,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.4039216, 0.172549, 0.1176471, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,4,5,6,6,5,7,6,7,8,8,7,9,8,9,10,10,9,11,10,11,12,12,11,13,12,13,14,14,13,15,14,15,16,16,15,17,16,17,18,18,17,19,18,19,20,20,19,21,20,21,22,22,21,23,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 66, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID16(GL2 gl){
double[] positionsArray = {
103.0527915,162.2891899,10.7111279,104.1505078,162.2891899,10.7111279,103.6016496,162.2891899,10.6388693,102.5413371,162.2891899,10.9229792,104.6619621,162.2891899,10.9229792,102.1021413,162.2891899,11.259986,105.101158,162.2891899,11.259986,101.7651345,162.2891899,11.6991818,105.4381648,162.2891899,11.6991818,101.5532832,162.2891899,12.2106362,105.6500161,162.2891899,12.2106362,101.4810246,162.2891899,12.7594943,105.7222746,162.2891899,12.7594943,101.5532832,162.2891899,13.3083525,105.6500161,162.2891899,13.3083525,101.7651345,162.2891899,13.8198068,105.4381648,162.2891899,13.8198068,102.1021413,162.2891899,14.2590027,105.101158,162.2891899,14.2590027,102.5413371,162.2891899,14.5960095,104.6619621,162.2891899,14.5960095,103.0527915,162.2891899,14.8078608,104.1505078,162.2891899,14.8078608,103.6016496,162.2891899,14.8801193,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.4039216, 0.172549, 0.1176471, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,4,5,6,6,5,7,6,7,8,8,7,9,8,9,10,10,9,11,10,11,12,12,11,13,12,13,14,14,13,15,14,15,16,16,15,17,16,17,18,18,17,19,18,19,20,20,19,21,20,21,22,22,21,23,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 66, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID22(GL2 gl){
double[] positionsArray = {
103.1794945,162.2891899,22.8752021,104.3063279,162.2891899,22.8752021,103.7429112,162.2891899,22.8010269,102.6544737,162.2891899,23.0926728,104.8313487,162.2891899,23.0926728,102.2036281,162.2891899,23.4386188,105.2821943,162.2891899,23.4386188,101.8576822,162.2891899,23.8894644,105.6281403,162.2891899,23.8894644,101.6402114,162.2891899,24.4144852,105.845611,162.2891899,24.4144852,101.5660362,162.2891899,24.9779019,105.9197862,162.2891899,24.9779019,101.6402114,162.2891899,25.5413186,105.845611,162.2891899,25.5413186,105.6281403,162.2891899,26.0663394,101.8576822,162.2891899,26.0663394,102.2036281,162.2891899,26.517185,105.2821943,162.2891899,26.517185,102.6544737,162.2891899,26.8631309,104.8313487,162.2891899,26.8631309,103.1794945,162.2891899,27.0806017,104.3063279,162.2891899,27.0806017,103.7429112,162.2891899,27.1547769,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.4039216, 0.172549, 0.1176471, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,4,5,6,6,5,7,6,7,8,8,7,9,8,9,10,10,9,11,10,11,12,12,11,13,12,13,14,14,13,15,15,13,16,15,16,17,15,17,18,18,17,19,18,19,20,20,19,21,20,21,22,22,21,23,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 66, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID28(GL2 gl){
double[] positionsArray = {
130.994564,145.2148849,31.2303029,117.2412751,153.7148849,31.2303029,117.2412751,145.2148849,31.2303029,130.994564,153.7148849,31.2303029,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.4039216, 0.172549, 0.1176471, 1.0);
int[] indices = {
0,1,2,1,0,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID34(GL2 gl){
double[] positionsArray = {
117.2412751,145.2148849,52.8916632,130.994564,145.2148849,31.2303029,117.2412751,145.2148849,31.2303029,130.994564,145.2148849,52.8916632,130.994564,145.2148849,52.8916632,117.2412751,145.2148849,52.8916632,130.994564,145.2148849,31.2303029,117.2412751,145.2148849,31.2303029,117.2412751,153.7148849,31.2303029,117.2412751,145.2148849,52.8916632,117.2412751,145.2148849,31.2303029,117.2412751,153.7148849,52.8916632,117.2412751,153.7148849,46.126853,117.2412751,153.7148849,46.126853,117.2412751,153.7148849,31.2303029,117.2412751,153.7148849,52.8916632,117.2412751,145.2148849,52.8916632,117.2412751,145.2148849,31.2303029,122.1076634,153.7148849,52.8916632,117.2412751,145.2148849,52.8916632,117.2412751,153.7148849,52.8916632,130.994564,145.2148849,52.8916632,126.7896748,153.7148849,52.8916632,130.994564,153.7148849,52.8916632,130.994564,153.7148849,52.8916632,126.7896748,153.7148849,52.8916632,130.994564,145.2148849,52.8916632,122.1076634,153.7148849,52.8916632,117.2412751,145.2148849,52.8916632,117.2412751,153.7148849,52.8916632,130.994564,153.7148849,52.8916632,130.994564,145.2148849,31.2303029,130.994564,145.2148849,52.8916632,130.994564,153.7148849,31.2303029,130.994564,153.7148849,48.9963669,130.994564,153.7148849,43.2573391,130.994564,153.7148849,43.2573391,130.994564,153.7148849,48.9963669,130.994564,153.7148849,31.2303029,130.994564,153.7148849,52.8916632,130.994564,145.2148849,31.2303029,130.994564,145.2148849,52.8916632,130.994564,153.7148849,31.2303029,129.5450663,153.7148849,41.0304558,117.2412751,153.7148849,31.2303029,130.6904554,153.7148849,42.523156,130.994564,153.7148849,43.2573391,128.0523661,153.7148849,39.8850667,126.3140799,153.7148849,39.165045,124.4486691,153.7148849,38.919459,117.4868611,153.7148849,44.2614422,117.2412751,153.7148849,46.126853,118.2068828,153.7148849,42.523156,119.3522719,153.7148849,41.0304558,120.8449721,153.7148849,39.8850667,122.5832583,153.7148849,39.165045,124.4486691,153.7148849,38.919459,117.2412751,153.7148849,31.2303029,122.5832583,153.7148849,39.165045,120.8449721,153.7148849,39.8850667,119.3522719,153.7148849,41.0304558,118.2068828,153.7148849,42.523156,117.4868611,153.7148849,44.2614422,117.2412751,153.7148849,46.126853,126.3140799,153.7148849,39.165045,128.0523661,153.7148849,39.8850667,129.5450663,153.7148849,41.0304558,130.994564,153.7148849,43.2573391,130.994564,153.7148849,31.2303029,130.6904554,153.7148849,42.523156,117.4868611,153.7148849,47.9922639,117.2412751,153.7148849,52.8916632,117.2412751,153.7148849,46.126853,118.2068828,153.7148849,49.73055,119.3522719,153.7148849,51.2232502,120.8449721,153.7148849,52.3686393,122.1076634,153.7148849,52.8916632,122.1076634,153.7148849,52.8916632,120.8449721,153.7148849,52.3686393,117.2412751,153.7148849,52.8916632,119.3522719,153.7148849,51.2232502,118.2068828,153.7148849,49.73055,117.4868611,153.7148849,47.9922639,117.2412751,153.7148849,46.126853,130.994564,153.7148849,52.8916632,130.6904554,153.7148849,49.73055,130.994564,153.7148849,48.9963669,129.5450663,153.7148849,51.2232502,128.0523661,153.7148849,52.3686393,126.7896748,153.7148849,52.8916632,126.7896748,153.7148849,52.8916632,130.994564,153.7148849,52.8916632,128.0523661,153.7148849,52.3686393,129.5450663,153.7148849,51.2232502,130.6904554,153.7148849,49.73055,130.994564,153.7148849,48.9963669,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,8,9,10,9,8,11,11,8,12,18,19,20,19,18,21,21,18,22,21,22,23,30,31,32,31,30,33,33,30,34,33,34,35,42,43,44,43,42,45,45,42,46,44,43,47,44,47,48,44,48,49,44,50,51,50,44,52,52,44,53,53,44,54,54,44,55,55,44,49,70,71,72,71,70,73,71,73,74,71,74,75,71,75,76,84,85,86,85,84,87,87,84,88,88,84,89,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 102, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.4941176, 0.1921569, 0.1254902, 1.0);
int[] indices = {
4,5,6,7,6,5,13,14,15,15,14,16,17,16,14,24,25,26,25,27,26,26,27,28,29,28,27,36,37,38,37,39,38,38,39,40,41,40,39,56,57,58,58,57,59,59,57,60,60,57,61,61,57,62,63,62,57,56,64,57,64,65,57,65,66,57,67,68,69,69,68,66,57,66,68,77,78,79,78,80,79,80,81,79,81,82,79,83,79,82,90,91,92,92,91,93,93,91,94,95,94,91,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 102, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID44(GL2 gl){
double[] positionsArray = {
126.3140799,153.7148849,53.088661,122.1076634,153.7148849,52.8916632,126.7896748,153.7148849,52.8916632,122.5832583,153.7148849,53.088661,124.4486691,153.7148849,53.334247,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID50(GL2 gl){
double[] positionsArray = {
131.4104771,153.7148849,44.2614422,130.994564,153.7148849,48.9963669,130.994564,153.7148849,43.2573391,131.6560631,153.7148849,46.126853,131.4104771,153.7148849,47.9922639,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID56(GL2 gl){
double[] positionsArray = {
126.3140799,153.7148849,39.165045,122.5832583,153.7148849,39.165045,124.4486691,153.7148849,38.919459,128.0523661,153.7148849,39.8850667,120.8449721,153.7148849,39.8850667,129.5450663,153.7148849,41.0304558,119.3522719,153.7148849,41.0304558,130.6904554,153.7148849,42.523156,118.2068828,153.7148849,42.523156,130.994564,153.7148849,43.2573391,124.3789756,153.7148849,46.6373146,130.994564,153.7148849,48.9963669,119.3522719,153.7148849,51.2232502,130.6904554,153.7148849,49.73055,129.5450663,153.7148849,51.2232502,128.0523661,153.7148849,52.3686393,120.8449721,153.7148849,52.3686393,126.7896748,153.7148849,52.8916632,122.1076634,153.7148849,52.8916632,122.1076634,153.7148849,52.8916632,126.7896748,153.7148849,52.8916632,120.8449721,153.7148849,52.3686393,128.0523661,153.7148849,52.3686393,119.3522719,153.7148849,51.2232502,129.5450663,153.7148849,51.2232502,130.6904554,153.7148849,49.73055,130.994564,153.7148849,48.9963669,124.3789756,153.7148849,46.6373146,130.994564,153.7148849,43.2573391,118.2068828,153.7148849,42.523156,130.6904554,153.7148849,42.523156,119.3522719,153.7148849,41.0304558,129.5450663,153.7148849,41.0304558,120.8449721,153.7148849,39.8850667,128.0523661,153.7148849,39.8850667,122.5832583,153.7148849,39.165045,126.3140799,153.7148849,39.165045,124.4486691,153.7148849,38.919459,124.3789756,153.7148849,46.6373146,117.4868611,153.7148849,44.2614422,118.2068828,153.7148849,42.523156,117.2412751,153.7148849,46.126853,117.4868611,153.7148849,47.9922639,119.3522719,153.7148849,51.2232502,118.2068828,153.7148849,49.73055,118.2068828,153.7148849,49.73055,119.3522719,153.7148849,51.2232502,117.4868611,153.7148849,47.9922639,124.3789756,153.7148849,46.6373146,117.2412751,153.7148849,46.126853,117.4868611,153.7148849,44.2614422,118.2068828,153.7148849,42.523156,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,4,5,6,6,5,7,6,7,8,8,7,9,8,9,10,10,9,11,10,11,12,12,11,13,12,13,14,12,14,15,12,15,16,16,15,17,16,17,18,38,39,40,39,38,41,41,38,42,42,38,43,42,43,44,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 66, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 0.9803922, 0.6862745, 1.0);
int[] indices = {
19,20,21,20,22,21,21,22,23,22,24,23,24,25,23,25,26,23,23,26,27,26,28,27,27,28,29,28,30,29,29,30,31,30,32,31,31,32,33,32,34,33,33,34,35,34,36,35,37,35,36,45,46,47,46,48,47,47,48,49,49,48,50,51,50,48,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 66, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
}