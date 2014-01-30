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
public class MahonTower2
{
private int displayList = -1;
private Map<String, com.jogamp.opengl.util.texture.Texture> imageMap = new HashMap<String, com.jogamp.opengl.util.texture.Texture>(); // map of ID's to textures
public MahonTower2(GL2 gl, GLU glu) {
    generate(gl, glu);
}
public void draw(GL2 gl, GLU glu) {
  gl.glCallList(displayList);
}
private com.jogamp.opengl.util.texture.Texture ID10;
private com.jogamp.opengl.util.texture.Texture ID25;
private com.jogamp.opengl.util.texture.Texture ID156;
private com.jogamp.opengl.util.texture.Texture ID190;
private com.jogamp.opengl.util.texture.Texture ID824;
private void generate(GL2 gl, GLU glu){
ID10 = Building.setupTexture(gl, "mahonTower2/texture0.jpg", "SketchupModels");
ID25 = Building.setupTexture(gl, "mahonTower2/texture1.png", "SketchupModels");
ID156 = Building.setupTexture(gl, "mahonTower2/texture2.jpg", "SketchupModels");
ID190 = Building.setupTexture(gl, "mahonTower2/texture3.jpg", "SketchupModels");
ID824 = Building.setupTexture(gl, "mahonTower2/texture4.png", "SketchupModels");

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
ID17(gl);
ID32(gl);
ID40(gl);
ID48(gl);
ID56(gl);
ID64(gl);
ID72(gl);
ID80(gl);
ID88(gl);
ID96(gl);
ID104(gl);
ID114(gl);
ID120(gl);
ID128(gl);
ID136(gl);
ID142(gl);
ID150(gl);
ID163(gl);
ID171(gl);
ID179(gl);
ID187(gl);
ID200(gl);
ID208(gl);
ID216(gl);
ID224(gl);
ID232(gl);
ID242(gl);
ID250(gl);
ID260(gl);
ID268(gl);
ID276(gl);
ID284(gl);
ID290(gl);
ID296(gl);
ID304(gl);
ID310(gl);
ID318(gl);
ID324(gl);
ID330(gl);
ID336(gl);
ID342(gl);
ID348(gl);
ID354(gl);
ID360(gl);
ID366(gl);
ID372(gl);
ID378(gl);
ID384(gl);
ID390(gl);
ID396(gl);
ID402(gl);
ID408(gl);
ID414(gl);
ID420(gl);
ID426(gl);
ID432(gl);
ID438(gl);
ID444(gl);
ID450(gl);
ID456(gl);
ID462(gl);
ID470(gl);
ID476(gl);
ID484(gl);
ID490(gl);
ID498(gl);
ID506(gl);
ID514(gl);
ID520(gl);
ID528(gl);
ID536(gl);
ID542(gl);
ID548(gl);
ID554(gl);
ID560(gl);
ID566(gl);
ID572(gl);
ID578(gl);
ID584(gl);
ID590(gl);
ID596(gl);
ID602(gl);
ID608(gl);
ID614(gl);
ID620(gl);
ID626(gl);
ID632(gl);
ID638(gl);
ID644(gl);
ID650(gl);
ID656(gl);
ID662(gl);
ID668(gl);
ID674(gl);
ID680(gl);
ID686(gl);
ID692(gl);
ID698(gl);
ID704(gl);
ID710(gl);
ID716(gl);
ID722(gl);
ID728(gl);
ID734(gl);
ID740(gl);
ID746(gl);
ID752(gl);
ID758(gl);
ID764(gl);
ID770(gl);
ID776(gl);
ID782(gl);
ID788(gl);
ID794(gl);
ID800(gl);
ID806(gl);
ID812(gl);
ID818(gl);
ID831(gl);
ID839(gl);
ID847(gl);
ID855(gl);
ID863(gl);
ID871(gl);
ID879(gl);
ID887(gl);
ID895(gl);
ID903(gl);
ID911(gl);
ID919(gl);
ID927(gl);
ID935(gl);
ID943(gl);
ID951(gl);
ID959(gl);
ID967(gl);
ID975(gl);
ID983(gl);
ID989(gl);
ID995(gl);
ID1001(gl);
ID1007(gl);
ID1013(gl);
ID1019(gl);
ID1025(gl);
ID1031(gl);
ID1037(gl);
ID1043(gl);
ID1049(gl);
ID1055(gl);
ID1061(gl);
ID1067(gl);
ID1073(gl);
ID1079(gl);
ID1085(gl);
ID1091(gl);
ID1097(gl);
ID1103(gl);
ID1109(gl);
ID1115(gl);
ID1121(gl);
ID1127(gl);
ID1133(gl);
ID1139(gl);
ID1145(gl);
ID1151(gl);
ID1157(gl);
ID1165(gl);
ID1173(gl);
ID1179(gl);
ID1185(gl);
ID1191(gl);
ID1197(gl);
ID1203(gl);
ID1209(gl);
ID1215(gl);
ID1221(gl);
ID1227(gl);
ID1233(gl);
ID1239(gl);
ID1245(gl);
ID1251(gl);
ID1257(gl);
ID1263(gl);
ID1269(gl);
ID1275(gl);
ID1281(gl);
ID1287(gl);
ID1293(gl);
ID1299(gl);
ID1305(gl);
ID1311(gl);
ID1317(gl);
ID1323(gl);
ID1329(gl);
ID1335(gl);
ID1341(gl);
ID1345(gl);
ID1349(gl);
ID1353(gl);
ID1357(gl);
ID1361(gl);
ID1365(gl);
ID1369(gl);
ID1373(gl);
ID1377(gl);
ID1381(gl);
ID1385(gl);
ID1389(gl);
ID1393(gl);
ID1397(gl);
ID1401(gl);
ID1405(gl);
ID1409(gl);
       gl.glPopMatrix();
   gl.glPopAttrib();
gl.glEndList();
}
//Trailer


private void ID2(GL2 gl){
double[] positionsArray = {
499.0909375,899.1728644,122.319375,499.0909375,818.2473066,122.319375,358.9237598,818.2473066,122.319375,639.2581152,818.2473066,122.319375,639.2581152,818.2473066,122.319375,499.0909375,899.1728644,122.319375,499.0909375,818.2473066,122.319375,358.9237598,818.2473066,122.319375,639.2581152,818.2473066,137.39375,499.0909375,818.2473066,122.319375,639.2581152,818.2473066,122.319375,499.0909375,818.2473066,137.39375,499.0909375,818.2473066,137.39375,639.2581152,818.2473066,137.39375,499.0909375,818.2473066,122.319375,639.2581152,818.2473066,122.319375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.2705882, 0.5843137, 0.3529412, 1.0);
int[] indices = {
0,1,2,1,0,3,8,9,10,9,8,11,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 12, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-5.327151f,17.04682f,-4.159091f,18.732767f,-4.159091f,17.04682f,-2.9910314f,17.04682f,4.159091f,2.8623698f,5.327151f,2.8623698f,4.159091f,2.5483203f,5.327151f,2.5483203f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,12,4,13,5,14,6,15,7,14,6,13,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID17(GL2 gl){
double[] positionsArray = {
685.9805078,251.768402,50.285,499.0909375,251.768402,0.0,685.9805078,251.768402,0.0,499.0909375,251.768402,81.824375,685.9805078,251.768402,81.824375,685.9805078,251.768402,81.824375,685.9805078,251.768402,50.285,499.0909375,251.768402,81.824375,499.0909375,251.768402,0.0,685.9805078,251.768402,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
19.055014f,2.2728994f,19.055014f,1.3968056f,13.863637f,2.2728994f,13.863637f,0.0f,19.055014f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
5,0,6,1,7,2,7,2,6,1,8,3,9,4,8,3,6,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID32(GL2 gl){
double[] positionsArray = {
685.9805078,251.768402,50.285,872.8700781,359.6691458,0.0,685.9805078,251.768402,0.0,872.8700781,359.6691458,21.526875,872.8700781,359.6691458,50.285,872.8700781,359.6691458,50.285,685.9805078,251.768402,50.285,872.8700781,359.6691458,21.526875,872.8700781,359.6691458,0.0,685.9805078,251.768402,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-25.993395f,1.3968056f,-19.998909f,1.3968056f,-25.993395f,0.5979687f,-25.993395f,-0.0f,-19.998909f,-0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
5,0,6,1,7,2,7,2,6,1,8,3,9,4,8,3,6,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID40(GL2 gl){
double[] positionsArray = {
779.425293,737.3217488,107.0225,779.425293,413.6195176,107.0225,779.425293,575.4706332,107.0225,872.8700781,575.4706332,107.0225,872.8700781,575.4706332,107.0225,779.425293,737.3217488,107.0225,779.425293,413.6195176,107.0225,779.425293,575.4706332,107.0225,779.425293,737.3217488,107.0225,872.8700781,575.4706332,81.824375,872.8700781,575.4706332,107.0225,779.425293,737.3217488,81.824375,779.425293,737.3217488,81.824375,779.425293,737.3217488,107.0225,872.8700781,575.4706332,81.824375,872.8700781,575.4706332,107.0225,779.425293,575.4706332,122.319375,779.425293,413.6195176,107.0225,779.425293,413.6195176,122.319375,779.425293,575.4706332,107.0225,779.425293,575.4706332,107.0225,779.425293,575.4706332,122.319375,779.425293,413.6195176,107.0225,779.425293,413.6195176,122.319375,872.8700781,791.2721207,81.824375,779.425293,737.3217488,81.824375,685.9805078,899.1728644,81.824375,872.8700781,575.4706332,81.824375,872.8700781,575.4706332,81.824375,872.8700781,791.2721207,81.824375,779.425293,737.3217488,81.824375,685.9805078,899.1728644,81.824375,709.3417041,454.0822965,122.319375,779.425293,413.6195176,122.319375,639.2581152,332.6939598,122.319375,779.425293,575.4706332,122.319375,779.425293,575.4706332,122.319375,709.3417041,454.0822965,122.319375,779.425293,413.6195176,122.319375,639.2581152,332.6939598,122.319375,872.8700781,791.2721207,81.824375,685.9805078,899.1728644,50.285,872.8700781,791.2721207,50.285,685.9805078,899.1728644,81.824375,685.9805078,899.1728644,81.824375,872.8700781,791.2721207,81.824375,685.9805078,899.1728644,50.285,872.8700781,791.2721207,50.285,709.3417041,454.0822965,137.39375,639.2581152,332.6939598,122.319375,639.2581152,332.6939598,137.39375,709.3417041,454.0822965,122.319375,709.3417041,454.0822965,122.319375,709.3417041,454.0822965,137.39375,639.2581152,332.6939598,122.319375,639.2581152,332.6939598,137.39375,748.2770313,1007.0736081,50.285,685.9805078,899.1728644,50.285,499.0909375,1007.0736081,50.285,872.8700781,791.2721207,50.285,872.8700781,791.2721207,50.285,748.2770313,1007.0736081,50.285,685.9805078,899.1728644,50.285,499.0909375,1007.0736081,50.285,604.2163208,393.3881282,137.39375,639.2581152,332.6939598,137.39375,499.0909375,332.6939598,137.39375,709.3417041,454.0822965,137.39375,709.3417041,454.0822965,137.39375,604.2163208,393.3881282,137.39375,639.2581152,332.6939598,137.39375,499.0909375,332.6939598,137.39375,748.2770313,1007.0736081,50.285,499.0909375,1007.0736081,21.526875,748.2770313,1007.0736081,21.526875,499.0909375,1007.0736081,50.285,499.0909375,1007.0736081,50.285,748.2770313,1007.0736081,50.285,499.0909375,1007.0736081,21.526875,748.2770313,1007.0736081,21.526875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,8,9,10,9,8,11,16,17,18,17,16,19,24,25,26,25,24,27,32,33,34,33,32,35,40,41,42,41,40,43,48,49,50,49,48,51,56,57,58,57,56,59,64,65,66,65,64,67,72,73,74,73,72,75,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 60, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-7.273917f,11.988972f,-6.4952106f,15.360869f,-6.4952106f,8.617073f,-6.4952106f,11.988972f,-2.073556f,1.7046745f,-2.073556f,2.2296355f,-0.5161429f,1.7046745f,-0.5161429f,2.2296355f,-4.7955885f,2.2296355f,-4.7955885f,2.5483203f,-3.4468293f,2.2296355f,-3.4468293f,2.5483203f,-7.273917f,16.484837f,-5.716504f,18.732767f,-5.911181f,9.460048f,-5.327151f,6.931124f,1.2040843f,1.7046745f,3.00243f,1.7046745f,1.2040843f,1.0476042f,3.00243f,1.0476042f,-6.232647f,2.5483203f,-6.232647f,2.8623698f,-5.064587f,2.5483203f,-5.064587f,2.8623698f,-6.235642f,20.9807f,-4.159091f,20.9807f,-5.035136f,8.195586f,-4.159091f,6.931124f,4.159091f,1.0476042f,6.235642f,1.0476042f,4.159091f,0.4484766f,6.235642f,0.4484766f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,12,4,13,5,14,6,15,7,14,6,13,5,20,8,21,9,22,10,23,11,22,10,21,9,28,0,29,12,30,1,31,13,30,1,29,12,36,3,37,14,38,2,39,15,38,2,37,14,44,16,45,17,46,18,47,19,46,18,45,17,52,20,53,21,54,22,55,23,54,22,53,21,60,12,61,24,62,13,63,25,62,13,61,24,68,14,69,26,70,15,71,27,70,15,69,26,76,28,77,29,78,30,79,31,78,30,77,29,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID48(GL2 gl){
double[] positionsArray = {
166.8428125,1150.9412664,0.0,249.9048438,1007.0736081,0.0,0.71875,863.2059498,0.0,499.0909375,1150.9412664,0.0,499.0909375,1150.9412664,0.0,166.8428125,1150.9412664,0.0,249.9048438,1007.0736081,0.0,0.71875,863.2059498,0.0,499.0909375,1150.9412664,21.526875,249.9048438,1007.0736081,0.0,499.0909375,1150.9412664,0.0,249.9048438,1007.0736081,21.526875,249.9048438,1007.0736081,21.526875,499.0909375,1150.9412664,21.526875,249.9048438,1007.0736081,0.0,499.0909375,1150.9412664,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,8,9,10,9,8,11,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 12, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-4.159091f,23.977943f,-1.3903568f,23.977943f,-2.0825405f,20.9807f,-0.0059896f,17.983458f,5.999673f,0.4484766f,8.397468f,0.4484766f,5.999673f,0.0f,8.397468f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,12,4,13,5,14,6,15,7,14,6,13,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID56(GL2 gl){
double[] positionsArray = {
709.3417041,696.8589699,146.96125,709.3417041,575.4706332,146.96125,604.2163208,757.5531383,146.96125,604.2163208,757.5531383,146.96125,709.3417041,575.4706332,146.96125,709.3417041,696.8589699,146.96125,598.2163208,747.1608334,146.96125,526.4272437,602.8069394,146.96125,518.420625,608.9506341,146.96125,532.5709383,594.8003207,146.96125,536.4330262,585.4764157,146.96125,537.7503125,575.4706332,146.96125,598.2163208,747.1608334,146.96125,537.7503125,575.4706332,146.96125,536.4330262,585.4764157,146.96125,532.5709383,594.8003207,146.96125,526.4272437,602.8069394,146.96125,518.420625,608.9506341,146.96125,709.3417041,575.4706332,165.54,537.7503125,575.4706332,146.96125,709.3417041,575.4706332,146.96125,537.7503125,575.4706332,165.54,537.7503125,575.4706332,165.54,709.3417041,575.4706332,165.54,537.7503125,575.4706332,146.96125,709.3417041,575.4706332,146.96125,604.2163208,757.5531383,165.54,518.420625,608.9506341,146.96125,518.420625,608.9506341,165.54,598.2163208,747.1608334,146.96125,604.2163208,757.5531383,146.96125,604.2163208,757.5531383,146.96125,604.2163208,757.5531383,165.54,598.2163208,747.1608334,146.96125,518.420625,608.9506341,146.96125,518.420625,608.9506341,165.54,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,6,7,8,7,6,9,9,6,10,10,6,11,11,6,1,1,6,2,18,19,20,19,18,21,26,27,28,27,26,29,29,26,30,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-5.035136f,15.782357f,-5.911181f,11.988972f,-5.911181f,14.517895f,-4.985136f,15.56585f,-4.4812527f,11.988972f,-4.4702754f,12.197425f,-4.4380913f,12.391673f,-4.3868937f,12.558478f,-4.320172f,12.686472f,4.4812527f,3.44875f,5.911181f,3.44875f,4.4812527f,3.0616927f,5.911181f,3.0616927f,-7.984737f,3.0616927f,-7.984737f,3.44875f,-7.884737f,3.0616927f,-6.5548086f,3.0616927f,-6.5548086f,3.44875f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,0,4,1,5,2,3,0,12,3,4,1,4,1,12,3,13,4,13,4,12,3,14,5,14,5,12,3,15,6,15,6,12,3,16,7,17,8,16,7,12,3,22,9,23,10,24,11,25,12,24,11,23,10,31,13,32,14,33,15,33,15,32,14,34,16,35,17,34,16,32,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID64(GL2 gl){
double[] positionsArray = {
393.9655542,757.5531383,146.96125,288.8401709,575.4706332,146.96125,288.8401709,696.8589699,146.96125,288.8401709,696.8589699,146.96125,288.8401709,575.4706332,146.96125,393.9655542,757.5531383,146.96125,300.8401709,575.4706332,146.96125,460.4315625,575.4706332,146.96125,461.7488488,585.4764157,146.96125,465.6109367,594.8003207,146.96125,471.7546313,602.8069394,146.96125,479.76125,608.9506341,146.96125,479.76125,608.9506341,146.96125,471.7546313,602.8069394,146.96125,465.6109367,594.8003207,146.96125,461.7488488,585.4764157,146.96125,460.4315625,575.4706332,146.96125,300.8401709,575.4706332,146.96125,393.9655542,757.5531383,146.96125,479.76125,608.9506341,165.54,479.76125,608.9506341,146.96125,393.9655542,757.5531383,165.54,393.9655542,757.5531383,165.54,393.9655542,757.5531383,146.96125,479.76125,608.9506341,165.54,479.76125,608.9506341,146.96125,460.4315625,575.4706332,165.54,300.8401709,575.4706332,146.96125,460.4315625,575.4706332,146.96125,288.8401709,575.4706332,146.96125,288.8401709,575.4706332,165.54,291.3444164,575.4706332,165.54,291.3444164,575.4706332,165.54,460.4315625,575.4706332,165.54,288.8401709,575.4706332,165.54,288.8401709,575.4706332,146.96125,300.8401709,575.4706332,146.96125,460.4315625,575.4706332,146.96125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,0,6,1,6,0,7,7,0,8,8,0,9,9,0,10,10,0,11,18,19,20,19,18,21,26,27,28,27,26,29,29,26,30,30,26,31,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 39, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-2.4070015f,14.517895f,-2.4070015f,11.988972f,-3.2830462f,15.782357f,-3.9980104f,12.686472f,-3.9312887f,12.558478f,-3.8800912f,12.391673f,-3.847907f,12.197425f,-3.8369298f,11.988972f,-2.5070014f,11.988972f,3.8256457f,3.44875f,3.8256457f,3.0616927f,2.3957174f,3.44875f,2.3957174f,3.0616927f,2.42787f,3.44875f,3.8369298f,3.44875f,2.4070015f,3.44875f,2.4070015f,3.0616927f,2.5070014f,3.0616927f,3.8369298f,3.0616927f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,0,4,1,5,2,12,3,5,2,13,4,13,4,5,2,14,5,14,5,5,2,15,6,15,6,5,2,16,7,16,7,5,2,17,8,4,1,17,8,5,2,22,9,23,10,24,11,25,12,24,11,23,10,32,13,33,14,34,15,34,15,33,14,35,16,35,16,33,14,36,17,37,18,36,17,33,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID72(GL2 gl){
double[] positionsArray = {
685.9805078,251.768402,50.285,748.2770312,143.8676583,50.285,499.0909375,143.8676583,50.285,872.8700781,359.6691458,50.285,872.8700781,359.6691458,50.285,685.9805078,251.768402,50.285,748.2770312,143.8676583,50.285,499.0909375,143.8676583,50.285,499.0909375,143.8676583,81.824375,685.9805078,251.768402,50.285,499.0909375,143.8676583,50.285,685.9805078,251.768402,81.824375,685.9805078,251.768402,81.824375,499.0909375,143.8676583,81.824375,685.9805078,251.768402,50.285,499.0909375,143.8676583,50.285,872.8700781,359.6691458,50.285,748.2770312,143.8676583,21.526875,748.2770312,143.8676583,50.285,872.8700781,359.6691458,21.526875,872.8700781,359.6691458,21.526875,872.8700781,359.6691458,50.285,748.2770312,143.8676583,21.526875,748.2770312,143.8676583,50.285,499.0909375,251.768402,81.824375,499.0909375,143.8676583,81.824375,312.2013672,251.768402,81.824375,685.9805078,251.768402,81.824375,685.9805078,251.768402,81.824375,499.0909375,251.768402,81.824375,499.0909375,143.8676583,81.824375,312.2013672,251.768402,81.824375,872.8700781,359.6691458,21.526875,997.463125,287.7353166,21.526875,748.2770312,143.8676583,21.526875,997.463125,575.4706332,21.526875,997.463125,575.4706332,21.526875,872.8700781,359.6691458,21.526875,997.463125,287.7353166,21.526875,748.2770312,143.8676583,21.526875,997.463125,575.4706332,21.526875,997.463125,287.7353166,0.0,997.463125,287.7353166,21.526875,997.463125,575.4706332,0.0,997.463125,575.4706332,0.0,997.463125,575.4706332,21.526875,997.463125,287.7353166,0.0,997.463125,287.7353166,21.526875,997.463125,863.2059498,0.0,997.463125,287.7353166,0.0,997.463125,575.4706332,0.0,1163.5871875,575.4706332,0.0,1163.5871875,575.4706332,0.0,997.463125,863.2059498,0.0,997.463125,287.7353166,0.0,997.463125,575.4706332,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,8,9,10,9,8,11,16,17,18,17,16,19,24,25,26,25,24,27,32,33,34,33,32,35,40,41,42,41,40,43,48,49,50,49,48,51,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-7.273917f,7.4931073f,-5.716504f,5.245175f,-6.235642f,2.997243f,-4.159091f,2.997243f,-5.999673f,1.7046745f,-4.2013273f,1.7046745f,-5.999673f,1.0476042f,-4.2013273f,1.0476042f,-6.232647f,0.4484766f,-6.232647f,1.0476042f,-4.1560965f,0.4484766f,-4.1560965f,1.0476042f,-4.159091f,5.245175f,-2.6016781f,5.245175f,-8.312193f,11.988972f,-8.312193f,5.994486f,-4.7955885f,0.0f,-4.7955885f,0.4484766f,-2.3977942f,0.0f,-2.3977942f,0.4484766f,-9.69656f,11.988972f,-8.312193f,17.983458f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,12,4,13,5,14,6,15,7,14,6,13,5,20,8,21,9,22,10,23,11,22,10,21,9,28,1,29,12,30,3,31,13,30,3,29,12,36,14,37,0,38,15,39,2,38,15,37,0,44,16,45,17,46,18,47,19,46,18,45,17,52,20,53,21,54,15,55,14,54,15,53,21,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID80(GL2 gl){
double[] positionsArray = {
685.9805078,899.1728644,0.0,779.425293,737.3217488,81.824375,779.425293,737.3217488,0.0,685.9805078,899.1728644,81.824375,685.9805078,899.1728644,50.285,685.9805078,899.1728644,50.285,685.9805078,899.1728644,0.0,685.9805078,899.1728644,81.824375,779.425293,737.3217488,81.824375,779.425293,737.3217488,0.0,779.425293,737.3217488,0.0,779.425293,575.4706332,107.0225,779.425293,575.4706332,0.0,779.425293,737.3217488,107.0225,779.425293,737.3217488,81.824375,779.425293,737.3217488,81.824375,779.425293,737.3217488,0.0,779.425293,737.3217488,107.0225,779.425293,575.4706332,107.0225,779.425293,575.4706332,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.8660254,0.5,0.0,0.8660254,0.5,0.0,0.8660254,0.5,0.0,0.8660254,0.5,0.0,0.8660254,0.5,0.0,-0.8660254,-0.5,-0.0,-0.8660254,-0.5,-0.0,-0.8660254,-0.5,-0.0,-0.8660254,-0.5,-0.0,-0.8660254,-0.5,-0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,10,11,12,11,10,13,13,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
12.10323f,1.3968056f,12.10323f,-0.0f,12.10323f,2.2728994f,6.9118533f,2.2728994f,6.9118533f,-0.0f,20.48116f,2.2728994f,20.48116f,-0.0f,20.48116f,2.9728472f,15.985295f,2.9728472f,15.985295f,-0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
5,0,6,1,7,2,7,2,6,1,8,3,9,4,8,3,6,1,15,5,16,6,17,7,17,7,16,6,18,8,19,9,18,8,16,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID88(GL2 gl){
double[] positionsArray = {
125.3117969,791.2721207,50.285,125.3117969,575.4706332,81.824375,125.3117969,575.4706332,50.285,125.3117969,791.2721207,81.824375,125.3117969,791.2721207,81.824375,125.3117969,791.2721207,50.285,125.3117969,575.4706332,81.824375,125.3117969,575.4706332,50.285,125.3117969,791.2721207,81.824375,218.756582,737.3217488,81.824375,125.3117969,575.4706332,81.824375,312.2013672,899.1728644,81.824375,312.2013672,899.1728644,81.824375,125.3117969,791.2721207,81.824375,218.756582,737.3217488,81.824375,125.3117969,575.4706332,81.824375,125.3117969,791.2721207,50.285,125.3117969,359.6691458,50.285,0.71875,575.4706332,50.285,125.3117969,575.4706332,50.285,125.3117969,575.4706332,50.285,125.3117969,791.2721207,50.285,125.3117969,359.6691458,50.285,0.71875,575.4706332,50.285,312.2013672,899.1728644,81.824375,218.756582,737.3217488,107.0225,218.756582,737.3217488,81.824375,312.2013672,899.1728644,107.0225,312.2013672,899.1728644,107.0225,312.2013672,899.1728644,81.824375,218.756582,737.3217488,107.0225,218.756582,737.3217488,81.824375,0.71875,575.4706332,21.526875,125.3117969,359.6691458,50.285,125.3117969,359.6691458,21.526875,0.71875,575.4706332,50.285,0.71875,575.4706332,50.285,0.71875,575.4706332,21.526875,125.3117969,359.6691458,50.285,125.3117969,359.6691458,21.526875,312.2013672,899.1728644,107.0225,358.9237598,818.2473066,107.0225,218.756582,737.3217488,107.0225,499.0909375,899.1728644,107.0225,499.0909375,899.1728644,107.0225,312.2013672,899.1728644,107.0225,358.9237598,818.2473066,107.0225,218.756582,737.3217488,107.0225,0.71875,287.7353166,21.526875,125.3117969,359.6691458,21.526875,249.9048437,143.8676583,21.526875,0.71875,575.4706332,21.526875,0.71875,575.4706332,21.526875,0.71875,287.7353166,21.526875,125.3117969,359.6691458,21.526875,249.9048437,143.8676583,21.526875,499.0909375,899.1728644,122.319375,358.9237598,818.2473066,107.0225,499.0909375,899.1728644,107.0225,358.9237598,818.2473066,122.319375,358.9237598,818.2473066,122.319375,499.0909375,899.1728644,122.319375,358.9237598,818.2473066,107.0225,499.0909375,899.1728644,107.0225,0.71875,287.7353166,21.526875,249.9048437,143.8676583,0.0,0.71875,287.7353166,0.0,249.9048437,143.8676583,21.526875,249.9048437,143.8676583,21.526875,0.71875,287.7353166,21.526875,249.9048437,143.8676583,0.0,0.71875,287.7353166,0.0,249.9048437,143.8676583,0.0,166.8428125,0.0,0.0,0.71875,287.7353166,0.0,499.0909375,0.0,0.0,499.0909375,0.0,0.0,249.9048437,143.8676583,0.0,166.8428125,0.0,0.0,0.71875,287.7353166,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,8,9,10,9,8,11,16,17,18,17,16,19,24,25,26,25,24,27,32,33,34,33,32,35,40,41,42,41,40,43,48,49,50,49,48,51,56,57,58,57,56,59,64,65,66,65,64,67,72,73,74,73,72,75,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 60, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
6.5939345f,1.7046745f,6.5939345f,1.0476042f,4.7955885f,1.7046745f,4.7955885f,1.0476042f,-2.6016781f,18.732767f,-1.044265f,16.484837f,-1.8229715f,15.360869f,-1.044265f,11.988972f,-1.044265f,11.988972f,-1.044265f,16.484837f,-1.044265f,7.4931073f,-0.0059896f,11.988972f,7.79006f,2.2296355f,7.79006f,1.7046745f,6.232647f,2.2296355f,6.232647f,1.7046745f,4.150107f,1.0476042f,4.150107f,0.4484766f,2.073556f,1.0476042f,2.073556f,0.4484766f,-4.159091f,18.732767f,-2.9910314f,17.04682f,-0.0059896f,11.988972f,-0.0059896f,5.994486f,-1.044265f,7.4931073f,-2.0825405f,2.997243f,5.999673f,2.5483203f,7.348432f,2.5483203f,5.999673f,2.2296355f,7.348432f,2.2296355f,-1.2040843f,0.4484766f,1.19371f,0.4484766f,-1.2040843f,0.0f,1.19371f,0.0f,-4.159091f,0.0f,-1.3903568f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,12,4,13,5,14,6,15,7,14,6,13,5,20,8,21,9,22,10,23,11,22,10,21,9,28,12,29,13,30,14,31,15,30,14,29,13,36,16,37,17,38,18,39,19,38,18,37,17,44,20,45,4,46,21,47,6,46,21,45,4,52,22,53,23,54,24,55,25,54,24,53,23,60,26,61,27,62,28,63,29,62,28,61,27,68,30,69,31,70,32,71,33,70,32,69,31,76,34,77,25,78,35,79,23,78,35,77,25,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID96(GL2 gl){
double[] positionsArray = {
685.9805078,899.1728644,50.285,499.0909375,1007.0736081,0.0,685.9805078,899.1728644,0.0,499.0909375,1007.0736081,21.526875,499.0909375,1007.0736081,50.285,499.0909375,1007.0736081,50.285,685.9805078,899.1728644,50.285,499.0909375,1007.0736081,21.526875,499.0909375,1007.0736081,0.0,685.9805078,899.1728644,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-1.9808716f,1.3968056f,4.013614f,1.3968056f,-1.9808716f,0.5979687f,-1.9808716f,0.0f,4.013614f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
5,0,6,1,7,2,7,2,6,1,8,3,9,4,8,3,6,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID104(GL2 gl){
double[] positionsArray = MahonTower2Coordinates.getID104PositionsArray();
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = MahonTower2Coordinates.getID104NoramlsArray();
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = MahonTower2Coordinates.getID104TexCoordinatesArray();
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,2,4,8,5,9,6,8,5,2,4,1,7,12,8,13,9,14,10,13,9,12,8,15,11,15,11,12,8,16,2,16,2,12,8,17,0,0,12,24,13,3,14,24,13,0,12,25,15,9,16,28,17,29,18,28,17,9,16,8,19,15,20,32,21,33,22,32,21,15,20,34,23,34,23,15,20,16,4,14,24,38,25,39,26,38,25,14,24,13,27,42,28,43,29,44,30,43,29,42,28,12,8,12,31,48,32,17,33,48,32,12,31,49,34,49,34,12,31,50,35,50,35,12,31,42,36,13,27,54,22,55,25,54,22,13,27,15,20,25,37,58,38,24,39,58,38,25,37,59,40,59,40,25,37,60,41,64,42,65,43,66,44,65,43,64,42,28,45,28,45,64,42,29,46,32,47,70,48,71,49,70,48,32,47,72,50,72,50,32,47,73,51,73,51,32,47,34,52,33,53,78,54,79,55,78,54,33,53,32,56,39,57,82,58,83,59,82,58,39,57,38,60,44,61,86,62,87,63,86,62,44,61,43,64,90,65,91,30,92,66,91,30,90,65,93,28,90,67,50,68,93,36,50,68,90,67,98,69,50,70,100,71,49,72,100,71,50,70,101,73,101,73,50,70,102,74,102,74,50,70,103,75,103,75,50,70,98,76,103,75,98,76,104,77,55,60,110,78,111,58,110,78,55,60,54,79,114,80,115,81,116,82,115,81,114,80,117,83,117,83,114,80,118,84,59,85,124,86,58,87,124,86,59,85,125,88,66,89,128,90,129,91,128,90,66,89,130,92,130,92,66,89,65,93,70,94,134,95,135,96,134,95,70,94,72,97,71,98,138,99,139,100,138,99,71,98,70,101,79,102,142,103,143,104,142,103,79,102,78,105,146,106,83,107,147,108,147,108,148,109,149,110,148,109,147,108,150,111,150,111,147,108,82,112,82,112,147,108,83,107,146,113,86,114,83,115,86,114,146,113,87,116,92,117,156,63,157,118,156,63,92,117,91,61,160,119,161,66,162,120,161,66,160,119,163,65,160,121,98,122,163,67,98,122,160,121,104,123,103,124,168,125,102,126,168,125,103,124,169,127,169,127,103,124,170,128,170,128,103,124,171,129,171,129,103,124,172,130,178,131,103,132,179,133,103,132,178,131,172,134,111,135,182,136,150,137,182,136,111,135,110,138,117,139,184,140,115,141,184,140,117,139,185,125,125,142,188,143,124,144,188,143,125,142,189,145,129,146,192,147,193,148,192,147,129,146,128,149,135,150,196,151,197,152,196,151,135,150,134,153,139,154,200,155,201,156,200,155,139,154,138,157,143,158,201,159,204,160,201,159,143,158,142,161,149,162,206,163,207,164,206,163,149,162,148,165,210,166,211,167,212,168,211,167,210,166,147,169,216,170,210,171,217,172,210,171,216,170,146,173,146,173,216,170,156,174,156,174,216,170,157,175,146,173,147,176,210,171,148,177,220,178,221,179,220,178,148,177,222,180,222,180,148,177,204,181,204,181,148,177,182,182,182,182,148,177,150,183,226,184,216,185,227,186,216,185,226,184,228,187,216,185,228,187,157,188,157,188,228,187,161,189,161,189,228,187,229,190,161,189,229,190,162,191,234,192,162,120,229,193,162,120,234,192,235,119,234,194,179,195,235,121,179,195,234,194,178,196,169,197,238,198,168,199,238,198,169,197,239,200,242,201,171,129,243,202,171,129,242,201,244,203,171,204,248,205,170,206,248,205,171,204,249,207,249,207,171,204,250,208,250,208,171,204,244,209,250,208,244,209,251,210,170,211,256,212,169,213,256,212,170,211,257,214,260,215,243,216,261,131,243,216,260,215,242,217,185,199,264,218,184,219,264,218,185,199,238,198,189,220,266,221,188,222,266,221,189,220,267,223,267,223,189,220,268,224,272,225,192,226,273,227,192,226,272,225,193,228,193,228,272,225,274,229,197,230,278,231,279,232,278,231,197,230,196,233,222,234,282,235,283,236,282,235,222,234,279,237,279,237,222,234,200,238,200,238,222,234,204,239,200,238,204,239,201,240,207,241,286,242,287,243,286,242,207,241,206,244,212,245,290,246,291,247,290,246,212,245,211,248,217,249,294,250,295,251,294,250,217,249,210,252,226,253,298,254,299,255,298,254,226,253,227,256,216,257,298,254,227,256,221,258,302,259,303,260,302,259,221,258,220,261,220,261,306,262,307,259,306,262,220,261,222,263,310,264,311,265,312,266,311,265,310,264,228,267,316,268,310,269,317,270,310,269,316,268,228,271,228,271,316,268,229,193,229,193,316,268,318,272,318,272,316,268,319,273,319,274,261,275,318,194,261,275,319,274,260,276,239,277,324,278,238,279,324,278,239,277,325,280,328,281,244,282,329,201,244,282,328,281,251,283,332,284,250,285,333,286,250,285,332,284,334,287,250,288,338,289,249,290,338,289,250,288,339,291,339,291,250,288,340,292,340,292,250,288,341,293,341,293,250,288,334,294,249,290,346,295,248,296,346,295,249,290,347,289,257,297,350,280,256,277,350,280,257,297,351,298,354,299,329,217,355,215,329,217,354,299,328,300,238,279,358,301,264,302,358,301,238,279,324,278,358,303,360,304,361,305,360,304,358,303,362,306,362,306,358,303,324,307,362,306,324,307,325,308,267,309,366,310,266,311,366,310,267,309,367,312,370,313,273,314,371,315,273,314,370,313,272,316,374,317,375,318,376,319,375,318,374,317,377,320,377,320,374,317,378,321,378,321,374,317,379,322,378,323,278,324,377,325,278,324,378,323,279,326,279,326,378,323,282,327,282,327,378,323,386,328,282,327,386,328,387,329,390,330,282,331,391,332,282,331,390,330,283,333,394,334,286,335,395,336,286,335,394,334,287,337,291,338,398,339,399,340,398,339,291,338,290,341,295,342,402,343,403,344,402,343,295,342,294,345,299,346,406,347,407,348,406,347,299,346,298,349,312,350,410,351,411,352,410,351,312,350,311,353,414,354,303,355,302,356,303,355,414,354,395,357,416,358,306,359,417,360,306,359,416,358,307,361,317,362,420,363,421,364,420,363,317,362,310,365,424,366,425,270,426,367,425,270,424,366,316,268,316,368,355,369,319,274,355,369,316,368,354,370,354,370,316,368,430,371,430,371,316,368,431,372,431,372,316,368,424,373,434,374,333,375,435,281,333,375,434,374,332,376,438,377,439,287,440,284,439,287,438,377,441,378,441,379,341,293,439,294,341,293,441,379,446,380,341,381,448,382,340,383,448,382,341,381,449,384,449,384,341,381,450,385,450,385,341,381,446,386,450,385,446,386,451,387,340,388,456,389,339,390,456,389,340,388,457,391,339,390,460,392,338,393,460,392,339,390,461,389,347,393,464,394,351,395,464,394,347,393,465,392,351,395,362,396,350,397,362,396,351,395,468,394,354,299,434,398,435,300,434,398,354,299,430,399,360,400,470,401,471,402,470,401,360,400,468,403,468,403,360,400,362,404,366,405,474,406,475,407,474,406,366,405,367,408,478,409,371,410,479,411,371,410,478,409,370,412,482,413,374,414,483,415,374,414,482,413,379,416,486,417,378,418,487,419,378,418,486,417,386,420,490,421,374,422,376,423,374,422,490,421,491,424,374,422,491,424,492,425,374,422,492,425,493,415,498,426,386,427,499,428,386,427,498,426,387,429,502,430,391,429,498,426,391,429,502,430,390,431,504,432,414,433,505,434,414,433,504,432,395,435,395,435,504,432,394,436,394,436,504,432,506,437,506,437,504,432,507,438,394,439,399,440,398,441,399,440,394,439,506,442,399,440,506,442,512,443,512,443,506,442,513,444,512,443,513,444,514,445,518,446,512,447,519,448,512,447,518,446,399,449,399,449,518,446,402,450,402,450,518,446,520,451,402,450,520,451,521,452,402,450,521,452,403,453,407,454,403,455,521,456,403,455,407,454,406,457,411,458,526,348,527,459,526,348,411,458,410,346,421,460,530,461,531,462,530,461,421,460,420,463,505,464,417,465,534,466,417,465,505,464,416,467,426,468,536,364,537,469,536,364,426,468,425,362,540,470,541,367,542,471,541,367,540,470,543,472,540,473,431,474,543,373,431,474,540,473,548,475,431,476,550,477,430,399,550,477,431,476,551,478,551,478,431,476,552,479,552,479,431,476,548,480,552,479,548,480,553,481,551,482,440,376,550,374,440,376,551,482,438,483,558,484,441,378,559,377,441,378,558,484,560,485,560,486,446,380,441,379,446,380,560,486,451,487,564,488,450,489,565,490,450,489,564,488,566,491,566,491,564,488,567,492,572,493,573,494,574,495,449,496,574,495,575,497,574,495,449,496,572,493,572,493,449,496,566,498,566,498,449,496,450,499,567,500,572,493,566,498,448,501,580,502,581,503,580,502,448,501,449,504,456,505,584,503,585,506,584,503,456,505,457,501,460,507,588,506,589,508,588,506,460,507,461,505,464,403,589,508,470,401,589,508,464,403,465,507,471,509,592,510,593,511,592,510,471,509,588,512,588,512,471,509,470,513,588,512,470,513,589,514,475,515,596,516,597,517,596,516,475,515,474,518,600,519,601,520,602,521,601,520,600,519,479,522,479,522,600,519,478,523,606,524,483,525,607,526,483,525,606,524,482,527,610,528,487,416,611,413,487,416,610,528,486,529,614,526,492,530,615,531,492,530,614,526,493,525,618,532,490,533,619,534,490,533,618,532,491,535,491,535,618,532,620,536,615,531,491,535,620,536,491,535,615,531,492,530,624,537,499,529,625,528,499,529,624,537,498,538,628,539,498,538,624,537,498,538,628,539,502,540,630,541,504,542,631,543,504,542,630,541,507,544,634,545,506,546,635,547,506,546,634,545,513,548,638,549,534,550,628,551,534,550,638,549,505,552,505,552,638,549,504,542,504,542,638,549,639,553,504,542,639,553,631,543,642,554,513,555,643,556,513,555,642,554,514,557,646,558,512,559,647,560,512,559,646,558,519,561,519,561,646,558,648,562,652,563,653,564,654,565,653,564,652,563,520,566,520,566,652,563,521,567,521,567,652,563,655,568,655,568,526,569,521,567,526,569,655,568,527,570,660,571,661,572,662,573,652,574,527,575,655,576,527,575,652,574,662,573,527,575,662,573,530,577,530,577,662,573,661,572,530,577,661,572,531,578,537,579,531,580,661,581,531,580,537,579,536,582,542,583,666,584,667,585,666,584,542,583,541,586,670,587,671,471,672,588,671,471,670,587,673,470,670,589,548,475,673,590,548,475,670,589,553,591,678,592,552,593,679,594,552,593,678,592,680,595,680,595,678,592,681,596,552,597,559,598,551,599,559,598,552,597,558,600,558,600,552,597,686,601,686,601,552,597,687,602,687,602,552,597,680,603,687,602,680,603,688,604,686,605,692,606,558,607,692,606,686,605,693,608,693,609,565,487,692,486,565,487,693,609,564,610,696,611,697,612,698,613,697,612,696,611,699,614,697,615,704,616,572,617,704,616,697,615,699,618,573,619,706,620,707,621,706,620,573,619,708,622,708,622,573,619,709,623,709,623,573,619,572,624,709,623,572,624,704,625,574,626,714,627,715,628,714,627,574,626,573,629,575,630,718,631,719,632,718,631,575,630,574,633,581,634,722,632,723,635,722,632,581,634,580,630,585,636,726,635,592,637,726,635,585,636,584,634,593,638,728,639,729,640,728,639,593,638,730,641,730,641,593,638,726,642,726,642,593,638,592,643,597,644,734,645,735,646,734,645,597,644,596,647,738,648,602,649,739,650,602,649,738,648,600,651,742,652,607,653,743,654,607,653,742,652,606,655,746,656,611,527,747,524,611,527,746,656,610,657,743,654,615,658,750,659,615,658,743,654,614,653,752,660,618,661,753,662,618,661,752,660,620,663,756,664,619,651,757,648,619,651,756,664,618,661,618,661,756,664,758,665,618,661,758,665,759,662,764,659,620,663,752,660,620,663,764,659,615,658,746,666,624,667,625,668,624,667,746,666,766,669,624,667,766,669,628,670,628,670,766,669,638,671,638,671,766,669,767,672,638,671,767,672,768,673,772,674,631,675,773,676,631,675,772,674,630,677,776,678,635,544,777,541,635,544,776,678,634,679,780,676,639,680,781,681,639,680,780,676,631,675,784,681,638,682,785,683,638,682,784,681,639,680,788,678,642,684,643,679,642,684,788,678,789,685,792,686,647,687,793,688,647,687,792,686,646,689,646,689,792,686,794,690,798,691,660,692,662,693,799,694,667,695,798,691,660,692,666,696,661,697,666,696,660,692,798,691,666,696,798,691,667,695,802,698,799,699,798,700,799,699,671,701,667,702,671,701,799,699,802,698,671,701,802,698,803,703,671,701,803,703,672,704,806,705,672,588,803,706,672,588,806,705,807,587,807,587,806,705,808,707,808,708,679,709,807,710,679,709,808,708,678,711,678,711,808,708,812,712,814,713,815,714,816,715,815,714,814,713,817,716,817,716,814,713,818,717,818,718,824,719,817,720,824,719,818,718,687,721,687,721,818,718,825,722,687,723,828,724,686,725,828,724,687,723,829,726,829,726,687,723,830,727,830,727,687,723,825,728,830,727,825,728,831,729,831,729,825,728,832,730,829,731,698,732,828,733,698,732,829,731,696,734,838,735,839,614,840,611,839,614,838,735,841,736,839,618,709,737,704,616,709,737,839,618,841,738,846,739,847,740,708,741,847,740,846,739,848,742,706,743,852,744,853,745,852,744,706,743,854,746,854,746,706,743,847,747,847,747,706,743,708,748,854,746,855,749,852,744,707,750,860,751,861,752,860,751,707,750,706,753,715,754,864,752,865,755,864,752,715,754,714,750,719,756,868,755,869,757,868,755,719,756,718,754,723,642,869,757,730,641,869,757,723,642,722,756,728,758,872,759,873,760,872,759,728,758,874,761,874,761,728,758,868,762,868,762,728,758,730,763,868,762,730,763,869,764,735,765,878,766,879,767,878,766,735,765,880,768,880,768,735,765,734,769,884,770,739,771,885,772,739,771,884,770,738,773,738,773,884,770,886,774,890,775,750,776,891,777,750,776,890,775,743,778,743,778,890,775,742,779,742,779,890,775,892,780,892,780,890,775,893,781,892,782,747,783,742,784,747,783,892,782,746,785,746,785,892,782,766,786,766,786,892,782,898,787,766,786,898,787,899,788,902,789,753,790,903,791,753,790,902,789,752,792,906,793,758,794,756,795,758,794,906,793,907,796,910,797,758,794,911,796,758,794,910,797,759,798,891,799,752,792,914,789,752,792,891,799,764,800,916,801,766,802,917,803,766,802,916,801,767,804,767,804,916,801,768,805,920,806,773,807,921,808,773,807,920,806,772,809,924,810,777,677,925,674,777,677,924,810,776,811,921,812,781,813,928,814,781,813,921,812,780,815,930,814,785,816,931,817,785,816,930,814,784,813,934,818,788,819,924,820,788,819,934,818,789,821,789,821,934,818,935,822,935,822,934,818,936,823,935,822,936,823,937,824,937,824,936,823,938,825,935,826,793,827,789,828,793,827,935,826,792,829,792,829,935,826,944,830,946,831,803,706,802,832,803,706,946,831,947,705,947,705,946,831,948,707,946,833,952,834,948,835,952,834,946,833,816,836,816,836,946,833,814,837,830,838,840,839,829,840,840,839,830,838,838,841,838,841,830,838,954,842,954,842,830,838,955,843,955,843,830,838,956,844,955,843,956,844,957,845,955,843,957,845,958,846,955,843,958,846,831,847,955,843,831,847,959,848,959,848,831,847,832,849,959,848,832,849,960,850,954,851,968,852,838,853,968,852,954,851,969,854,968,738,848,855,846,737,848,855,968,738,969,856,972,857,973,858,974,740,973,858,972,857,975,859,974,860,980,861,854,862,980,861,974,860,973,863,855,864,982,865,983,866,982,865,855,864,984,867,984,867,855,864,985,868,985,868,855,864,854,869,985,868,854,869,980,870,852,871,990,872,991,873,990,872,852,871,855,874,853,875,994,876,995,877,994,876,853,875,852,878,861,879,998,877,999,880,998,877,861,879,860,875,865,762,1002,880,874,761,1002,880,865,762,864,879,872,881,1004,882,1005,883,1004,882,872,881,1006,884,1006,884,872,881,1007,885,1007,885,872,881,1002,886,1002,886,872,881,874,887,873,888,1012,889,1013,890,1012,889,873,888,872,891,879,892,1016,890,1017,893,1016,890,879,892,878,888,1017,894,884,895,885,896,884,895,1017,894,1016,897,1020,898,893,899,890,900,893,899,1020,898,1021,901,1024,902,892,903,1025,904,892,903,1024,902,898,905,1006,906,891,907,914,908,891,907,1006,906,890,909,890,909,1006,906,1028,910,1028,910,1006,906,1007,911,1028,910,1007,911,1029,912,1032,913,898,905,1033,902,898,905,1032,913,899,914,1004,915,902,916,903,917,902,916,1004,915,1006,918,1013,897,907,919,906,895,907,919,1013,897,1012,920,1005,921,910,922,911,923,910,922,1005,921,1004,924,1036,925,917,914,1037,913,917,914,1036,925,916,926,1040,927,928,928,1041,929,928,928,1040,927,921,930,921,930,1040,927,920,931,920,931,1040,927,1042,932,1042,932,1040,927,1043,933,1042,932,1043,933,1044,934,1042,935,925,936,920,937,925,936,1042,935,924,938,924,938,1042,935,934,939,934,939,1042,935,1044,940,934,939,1044,940,936,941,1041,942,931,926,1050,925,931,926,1041,942,930,943,954,944,1052,945,1053,946,1052,945,954,944,955,947,1052,945,955,947,1054,948,1054,948,955,947,959,949,1054,948,959,949,1055,950,1055,950,959,949,1056,951,1056,951,959,949,960,952,1053,856,975,953,972,855,975,953,1053,856,1052,954,1062,955,1063,956,1064,858,1063,956,1062,955,1065,957,1064,863,985,958,980,861,985,958,1064,863,1063,959,983,960,1070,961,1071,962,1070,961,983,960,982,963,1074,964,1075,965,984,966,1075,965,1074,964,1076,967,1076,967,1074,964,1077,968,982,969,1082,970,1083,971,1082,970,982,969,1084,972,1084,972,982,969,1085,973,1085,973,982,969,1075,974,1075,974,982,969,984,975,1084,972,1086,976,1082,970,991,977,1021,962,1020,978,1021,962,991,977,990,960,995,979,1028,978,1029,980,1028,978,995,979,994,977,999,981,1029,982,1007,983,1029,982,999,981,998,984,1071,901,1024,985,1025,899,1024,985,1071,901,1070,986,1083,986,1032,987,1033,985,1032,987,1083,986,1082,988,1082,989,1036,990,1037,991,1036,990,1082,989,1086,992,1086,993,1041,994,1050,995,1041,994,1086,993,1040,996,1040,996,1092,997,1043,998,1092,997,1040,996,1086,993,1092,997,1086,993,1084,999,1094,1000,1095,1001,1065,1002,1052,1003,1065,1002,1062,1004,1065,1002,1052,1003,1094,1000,1094,1000,1052,1003,1055,1005,1055,1005,1052,1003,1054,1006,1056,1007,1094,1000,1055,1005,1065,1008,1098,1009,1099,1010,1098,1009,1065,1008,1100,1011,1100,1011,1065,1008,1095,1012,1099,1013,1077,1014,1074,1015,1077,1014,1099,1013,1104,1016,1104,1016,1099,1013,1098,1017,1106,1018,1107,1019,1108,1020,1107,1019,1106,1018,1109,1021,1109,1021,1106,1018,1110,1022,1116,1023,1092,1024,1084,1025,1092,1024,1116,1023,1107,1026,1107,1026,1116,1023,1108,1027,1118,1028,1094,1029,1119,1030,1094,1029,1118,1028,1120,1031,1094,1029,1120,1031,1095,1032,1124,1033,1109,1034,1110,1035,1109,1034,1124,1033,1119,1036,1119,1036,1124,1033,1118,1037,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
4,5,6,7,6,5,6,7,10,11,10,7,18,19,20,20,19,21,21,19,22,23,22,19,26,5,27,4,27,5,10,11,30,31,30,11,20,21,35,35,21,36,37,36,21,22,23,40,41,40,23,19,45,46,47,46,45,45,19,51,51,19,52,52,19,53,18,53,19,21,22,56,57,56,22,61,26,62,62,26,63,27,63,26,31,67,30,30,67,68,69,68,67,35,36,74,74,36,75,75,36,76,77,76,36,36,37,80,81,80,37,40,41,84,85,84,41,46,47,88,89,88,47,94,95,96,97,96,95,99,95,51,94,51,95,105,99,106,99,51,106,106,51,107,107,51,108,108,51,109,52,109,51,56,57,112,113,112,57,119,120,121,121,120,122,123,122,120,126,62,127,63,127,62,68,69,131,131,69,132,133,132,69,75,76,136,137,136,76,76,77,140,141,140,77,80,81,144,145,144,81,85,151,84,84,151,152,152,151,153,154,153,151,151,85,155,89,155,88,85,88,155,96,97,158,159,158,97,164,165,166,167,166,165,105,165,99,164,99,165,173,106,174,174,106,175,175,106,176,176,106,177,107,177,106,173,180,106,181,106,180,112,113,183,152,183,113,186,121,187,122,187,121,190,126,191,127,191,126,132,133,194,195,194,133,136,137,198,199,198,137,140,141,202,203,202,141,144,145,203,205,203,145,153,154,208,209,208,154,151,213,214,215,214,213,213,151,155,159,218,158,158,218,155,155,218,213,219,213,218,152,153,183,183,153,205,205,153,223,223,153,224,225,224,153,167,230,166,230,231,166,166,231,159,159,231,218,231,232,218,233,218,232,236,237,167,230,167,237,180,237,181,236,181,237,240,176,241,177,241,176,245,246,174,247,174,246,252,245,253,245,174,253,253,174,254,254,174,255,175,255,174,258,175,259,176,259,175,246,262,247,263,247,262,241,186,265,187,265,186,269,190,270,270,190,271,191,271,190,275,276,195,195,276,194,277,194,276,198,199,280,281,280,199,203,205,202,205,223,202,202,223,281,281,223,284,285,284,223,208,209,288,289,288,209,214,215,292,293,292,215,213,219,296,297,296,219,233,300,218,233,232,300,301,300,232,224,225,304,305,304,225,223,224,308,309,308,224,231,313,314,315,314,313,320,321,322,322,321,230,230,321,231,231,321,313,323,313,321,262,320,263,322,263,320,326,240,327,241,327,240,252,330,245,331,245,330,335,336,253,337,253,336,335,253,342,342,253,343,343,253,344,344,253,345,254,345,253,348,254,349,255,349,254,352,258,353,259,353,258,330,356,331,357,331,356,327,241,359,265,359,241,326,327,363,327,359,363,363,359,364,365,364,359,368,270,369,271,369,270,276,372,277,373,277,372,380,381,382,382,381,383,383,381,384,385,384,381,388,389,284,389,382,284,284,382,281,281,382,280,383,280,382,285,392,284,393,284,392,289,396,288,397,288,396,292,293,400,401,400,293,296,297,404,405,404,297,300,301,408,409,408,301,314,315,412,413,412,315,397,415,305,304,305,415,309,418,308,419,308,418,313,323,422,423,422,323,321,427,428,429,428,427,427,321,432,432,321,433,433,321,356,356,321,357,320,357,321,336,436,337,437,337,436,442,443,444,445,444,443,447,442,342,444,342,442,452,447,453,447,342,453,453,342,454,454,342,455,343,455,342,458,343,459,344,459,343,462,344,463,345,463,344,466,348,467,349,467,348,469,352,363,353,363,352,433,356,436,437,436,356,363,364,469,469,364,472,473,472,364,368,369,476,477,476,369,372,480,373,481,373,480,380,484,381,485,381,484,389,488,382,489,382,488,494,495,381,495,496,381,496,497,381,385,381,497,388,500,389,501,389,500,392,503,393,500,393,503,508,509,510,510,509,396,396,509,397,397,509,415,511,415,509,515,516,517,516,510,517,517,510,401,510,396,401,400,401,396,405,522,404,522,523,404,523,524,404,404,524,401,401,524,517,525,517,524,408,409,405,522,405,409,412,413,528,529,528,413,422,423,532,533,532,423,418,511,419,535,419,511,428,429,538,539,538,429,544,545,546,547,546,545,549,545,432,544,432,545,554,549,555,549,432,555,555,432,556,556,432,557,433,557,432,443,556,445,557,445,556,561,562,442,563,442,562,452,561,447,442,447,561,568,569,570,570,569,453,571,453,569,570,576,568,453,454,570,570,454,576,576,454,577,578,577,454,577,579,576,454,455,582,583,582,455,458,459,586,587,586,459,462,463,590,591,590,463,466,467,591,472,591,467,591,472,590,472,473,590,590,473,594,595,594,473,476,477,598,599,598,477,480,603,481,481,603,604,605,604,603,484,608,485,609,485,608,488,612,489,613,489,612,494,616,495,617,495,616,621,622,496,496,622,497,623,497,622,495,617,496,621,496,617,500,626,501,627,501,626,503,629,500,626,500,629,508,632,509,633,509,632,516,636,510,637,510,636,633,640,509,640,641,509,509,641,511,511,641,535,629,535,641,515,644,516,645,516,644,649,650,525,525,650,517,651,517,650,529,656,528,522,528,656,656,657,522,522,657,523,523,657,658,659,658,657,533,663,532,663,664,532,532,664,529,664,657,529,656,529,657,664,663,665,538,539,533,663,533,539,546,547,668,669,668,547,674,675,676,677,676,675,554,675,549,674,549,675,682,683,684,684,683,555,685,555,683,689,684,690,684,555,690,690,555,691,691,555,562,562,555,563,556,563,555,694,691,695,562,695,691,569,694,571,695,571,694,700,701,702,703,702,701,700,702,705,576,705,702,705,576,710,576,579,710,710,579,711,711,579,712,713,712,579,579,577,716,717,716,577,577,578,720,721,720,578,582,583,724,725,724,583,586,587,727,594,727,587,594,595,727,727,595,731,731,595,732,733,732,595,598,599,736,737,736,599,603,740,605,741,605,740,608,744,609,745,609,744,612,748,613,749,613,748,616,745,617,751,617,745,621,754,622,755,622,754,760,761,622,761,762,622,622,762,623,763,623,762,617,765,621,754,621,765,769,770,641,770,771,641,641,771,629,629,771,626,771,748,626,627,626,748,632,774,633,775,633,774,636,778,637,779,637,778,633,782,640,783,640,782,640,786,641,787,641,786,790,791,644,645,644,791,795,796,650,650,796,651,797,651,796,669,800,668,800,665,668,663,668,665,800,669,801,664,665,800,677,804,676,804,805,676,805,801,676,669,676,801,800,801,805,809,810,811,811,810,677,804,677,810,813,809,683,683,809,685,811,685,809,819,820,821,821,820,822,823,822,820,826,819,690,690,819,827,821,827,819,833,826,834,834,826,835,826,690,835,835,690,836,836,690,837,691,837,690,701,836,703,837,703,836,842,843,844,845,844,843,842,844,710,705,710,844,849,850,851,711,851,850,856,857,858,711,712,851,851,712,858,858,712,856,859,856,712,712,713,862,863,862,713,716,717,866,867,866,717,720,721,870,871,870,721,724,725,871,731,871,725,871,731,870,731,732,870,870,732,875,875,732,876,877,876,732,736,737,881,881,737,882,883,882,737,887,888,740,740,888,741,889,741,888,894,895,896,896,895,744,744,895,745,745,895,751,897,751,895,900,901,771,901,896,771,771,896,748,748,896,749,744,749,896,754,904,755,905,755,904,908,909,761,762,761,909,760,912,761,913,761,912,765,897,754,915,754,897,769,918,770,770,918,771,919,771,918,774,922,775,923,775,922,778,926,779,927,779,926,782,923,783,929,783,923,786,932,787,933,787,932,939,940,941,941,940,942,940,943,942,942,943,790,790,943,791,926,791,943,945,942,796,796,942,797,790,797,942,949,950,951,951,950,804,805,804,950,820,950,823,823,950,953,949,953,950,961,833,962,833,834,962,962,834,963,834,964,963,964,965,963,965,966,963,966,835,963,963,835,967,967,835,843,843,835,845,836,845,835,970,967,971,843,971,967,970,971,849,850,849,971,976,977,978,979,978,977,978,979,981,858,981,979,981,858,986,858,857,986,986,857,987,987,857,988,989,988,857,857,856,992,993,992,856,856,859,996,997,996,859,862,863,1000,1001,1000,863,866,867,1003,875,1003,867,875,876,1003,1003,876,1008,1008,876,1009,1009,876,1010,1011,1010,876,876,877,1014,1015,1014,877,882,883,1018,1019,1018,883,1018,1019,888,889,888,1019,1022,1023,894,895,894,1023,901,1026,896,1027,896,1026,1030,1008,1031,1008,1009,1031,1031,1009,895,895,1009,897,915,897,1009,900,1034,901,1035,901,1034,1009,1010,904,905,904,1010,1014,1015,908,909,908,1015,1010,1011,912,913,912,1011,918,1038,919,1039,919,1038,1045,1046,1047,1046,1048,1047,1047,1048,922,922,1048,923,923,1048,929,1049,929,1048,940,1045,943,1045,1047,943,943,1047,926,926,1047,927,922,927,1047,932,1049,933,1051,933,1049,961,962,1057,1057,962,1058,1058,962,1059,962,963,1059,1059,963,1060,963,967,1060,1061,1060,967,1060,1061,976,977,976,1061,1066,1067,1068,1069,1068,1067,1068,1069,986,981,986,1069,988,989,1072,1073,1072,989,1078,1079,1080,1080,1079,1081,987,1081,1079,1087,1088,1089,987,988,1081,1081,988,1090,1090,988,1089,1089,988,1087,1091,1087,988,992,993,1022,1023,1022,993,996,997,1031,1030,1031,997,1000,1001,1030,1008,1030,1001,1072,1073,1026,1027,1026,1073,1087,1091,1034,1035,1034,1091,1088,1087,1038,1039,1038,1087,1089,1088,1093,1088,1048,1093,1046,1093,1048,1048,1088,1049,1051,1049,1088,1058,1096,1057,1059,1060,1058,1058,1060,1096,1096,1060,1066,1067,1066,1060,1066,1097,1096,1097,1066,1101,1101,1066,1102,1103,1102,1066,1102,1103,1105,1105,1103,1078,1079,1078,1103,1111,1112,1113,1113,1112,1114,1115,1114,1112,1115,1117,1114,1114,1117,1093,1089,1093,1117,1097,1121,1096,1121,1122,1096,1123,1096,1122,1122,1125,1123,1123,1125,1113,1111,1113,1125,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 2121, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID114(GL2 gl){
double[] positionsArray = {
536.5801368,566.5822666,645.639375,536.0017198,564.4235848,645.639375,536.4330262,565.4648507,645.639375,536.4330262,565.4648507,645.639375,536.0017198,564.4235848,645.639375,536.5801368,566.5822666,645.639375,537.7503125,575.4706332,645.639375,537.1629897,568.7575032,645.639375,536.5801368,584.3589998,645.639375,537.1629897,582.1837632,645.639375,536.0017198,586.5176816,645.639375,536.4330262,585.4764157,645.639375,535.4188669,562.2483482,645.639375,532.5709383,556.1409457,645.639375,532.5709383,594.8003207,645.639375,535.4188669,588.6929182,645.639375,535.4188669,588.6929182,645.639375,532.5709383,594.8003207,645.639375,536.0017198,586.5176816,645.639375,532.5709383,556.1409457,645.639375,535.4188669,562.2483482,645.639375,536.4330262,585.4764157,645.639375,536.5801368,584.3589998,645.639375,537.1629897,582.1837632,645.639375,537.7503125,575.4706332,645.639375,537.1629897,568.7575032,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,3,4,5,6,7,5,6,8,9,5,3,4,8,10,11,4,12,13,10,14,15,16,17,18,19,20,1,21,18,22,1,2,0,23,22,24,0,25,24,22,21,18,10,11,8,24,23,22,8,9,6,24,0,25,7,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 60, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID120(GL2 gl){
double[] positionsArray = {
639.2581152,818.2473066,137.39375,604.2163208,757.5531383,137.39375,499.0909375,818.2473066,137.39375,709.3417041,696.8589699,137.39375,709.3417041,696.8589699,137.39375,639.2581152,818.2473066,137.39375,604.2163208,757.5531383,137.39375,499.0909375,818.2473066,137.39375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-5.911181f,14.517895f,-5.327151f,17.04682f,-5.035136f,15.782357f,-4.159091f,17.04682f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID128(GL2 gl){
double[] positionsArray = MahonTower2Coordinates.getID128PositionsArray();
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = MahonTower2Coordinates.getID128NoramlsArray();
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = MahonTower2Coordinates.getID128TexCoordinatesArray();
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,3,2,4,1,5,0,6,3,7,4,8,5,7,4,6,3,9,6,10,6,11,3,12,4,13,5,12,4,11,3,14,7,15,8,16,9,15,8,14,7,17,10,18,10,19,7,20,8,21,9,20,8,19,7,22,11,23,12,24,13,23,12,22,11,25,14,26,14,27,11,28,12,29,13,28,12,27,11,30,15,31,16,32,17,33,17,34,16,35,15,36,18,37,19,38,20,37,19,36,18,39,21,40,21,41,18,42,19,43,20,42,19,41,18,44,22,45,23,46,24,45,23,44,22,47,25,48,25,49,22,50,23,51,24,50,23,49,22,52,26,53,27,54,28,53,27,52,26,55,29,55,29,52,26,56,30,56,30,52,26,57,31,57,31,52,26,58,32,59,32,60,26,61,31,61,31,60,26,62,30,62,30,60,26,63,29,63,29,60,26,64,27,65,28,64,27,60,26,24,13,66,33,67,34,66,33,24,13,23,12,28,12,29,13,68,33,69,34,68,33,29,13,70,35,71,36,72,37,71,36,70,35,73,38,74,38,75,35,76,36,77,37,76,36,75,35,78,39,79,40,80,41,79,40,78,39,81,42,82,42,83,39,84,40,85,41,84,40,83,39,86,43,87,44,88,45,87,44,86,43,89,46,90,46,91,43,92,44,93,45,92,44,91,43,94,47,95,48,96,49,97,49,98,48,99,47,50,50,100,51,101,52,100,51,50,50,51,53,46,53,45,50,102,51,103,52,102,51,45,50,104,54,105,55,106,56,105,55,104,54,107,57,108,57,109,54,110,55,111,56,110,55,109,54,112,58,113,59,114,60,115,60,116,59,117,58,118,61,119,59,120,62,119,59,118,61,121,60,121,60,118,61,122,63,123,63,124,61,125,60,125,60,124,61,126,59,127,62,126,59,124,61,128,64,129,61,130,62,129,61,128,64,131,63,132,63,133,64,134,61,135,62,134,61,133,64,136,65,137,64,138,62,137,64,136,65,139,63,139,63,136,65,140,66,139,63,140,66,141,67,142,67,143,66,144,63,143,66,145,65,144,63,144,63,145,65,146,64,147,62,146,64,145,65,148,68,149,69,150,70,149,69,148,68,151,71,151,71,148,68,152,72,153,72,154,68,155,71,155,71,154,68,156,69,157,70,156,69,154,68,158,73,159,74,160,75,159,74,158,73,161,76,162,76,163,73,164,74,165,75,164,74,163,73,166,77,167,78,168,79,167,78,166,77,169,80,169,80,166,77,170,81,171,81,172,77,173,80,173,80,172,77,174,78,175,79,174,78,172,77,176,82,177,83,178,84,177,83,176,82,179,85,180,85,181,82,182,83,183,84,182,83,181,82,184,58,185,86,186,59,185,86,184,58,187,87,188,87,189,58,190,86,191,59,190,86,189,58,192,88,193,89,194,90,193,89,192,88,195,91,196,91,197,88,198,89,199,90,198,89,197,88,200,92,201,93,202,94,201,93,200,92,203,95,203,95,200,92,204,96,204,96,200,92,205,97,205,97,200,92,206,98,207,98,208,92,209,97,209,97,208,92,210,96,210,96,208,92,211,95,211,95,208,92,212,93,213,94,212,93,208,92,214,99,215,100,216,101,215,100,214,99,217,102,218,102,219,99,220,100,221,101,220,100,219,99,222,103,223,66,224,65,223,66,222,103,225,67,226,67,227,103,228,66,229,65,228,66,227,103,230,104,231,105,232,106,231,105,230,104,233,107,233,107,230,104,234,108,233,107,234,108,235,109,235,109,234,108,236,110,237,110,238,108,239,109,239,109,238,108,240,107,238,108,241,104,240,107,240,107,241,104,242,105,243,106,242,105,241,104,244,111,245,112,246,113,245,112,244,111,190,18,185,18,247,111,248,112,249,113,248,112,247,111,250,114,251,115,252,116,253,116,254,115,255,114,256,111,257,112,258,113,257,112,256,111,36,18,41,18,259,111,260,112,261,113,260,112,259,111,262,2,263,117,264,118,265,118,266,117,267,2,268,119,269,120,270,121,269,120,268,119,271,122,272,122,273,119,274,120,275,121,274,120,273,119,276,123,277,124,278,125,277,124,276,123,279,126,280,126,281,123,282,124,283,125,282,124,281,123,284,127,285,128,286,129,285,128,284,127,287,117,287,117,284,127,288,118,289,118,290,127,291,117,291,117,290,127,292,128,293,129,292,128,290,127,294,130,295,131,296,132,295,131,294,130,297,133,298,133,299,130,300,131,301,132,300,131,299,130,302,121,303,134,304,135,303,134,302,121,305,120,306,120,307,121,308,134,309,135,308,134,307,121,310,136,311,137,312,138,311,137,310,136,313,139,313,139,310,136,314,140,315,140,316,136,317,139,317,139,316,136,318,137,319,138,318,137,316,136,320,141,161,76,158,73,161,76,320,141,321,142,322,142,323,141,162,76,163,73,162,76,323,141,324,143,190,18,325,144,190,18,324,143,326,145,327,145,328,143,185,18,329,144,185,18,328,143,330,146,331,147,332,148,331,147,330,146,333,149,334,149,335,146,336,147,337,148,336,147,335,146,338,86,339,150,340,151,339,150,338,86,341,152,342,152,343,86,344,150,345,151,344,150,343,86,346,153,347,154,348,155,347,154,346,153,349,82,350,82,351,153,352,154,353,155,352,154,351,153,354,156,355,157,356,158,355,157,354,156,357,159,357,159,354,156,358,160,359,160,360,156,361,159,361,159,360,156,362,157,363,158,362,157,360,156,364,161,365,162,366,163,367,163,368,162,369,161,370,164,220,165,371,166,220,165,370,164,218,167,217,167,372,164,215,165,373,166,215,165,372,164,374,168,375,169,376,170,375,169,374,168,377,90,378,90,379,168,380,169,381,170,380,169,379,168,382,171,383,103,384,65,383,103,385,172,386,67,385,172,383,103,387,173,387,173,383,103,382,171,388,171,389,103,390,173,390,173,389,103,391,172,392,67,391,172,389,103,393,65,389,103,388,171,394,174,395,175,396,171,395,175,394,174,397,176,395,175,398,177,399,172,398,177,395,175,397,176,400,176,401,175,402,177,403,172,402,177,401,175,400,176,404,174,401,175,405,171,401,175,404,174,406,175,407,173,408,171,407,173,406,175,409,172,410,172,411,175,412,173,413,171,412,173,411,175,414,178,415,179,416,180,415,179,414,178,417,181,418,181,419,178,420,179,421,180,420,179,419,178,422,182,416,180,423,183,416,180,422,182,414,178,419,178,424,182,421,180,425,183,421,180,424,182,426,184,427,185,428,186,429,186,430,185,431,184,432,187,433,188,434,189,433,188,432,187,435,190,436,190,437,187,438,188,439,189,438,188,437,187,440,191,441,192,442,193,443,193,444,192,445,191,446,194,447,195,448,196,447,195,446,194,449,197,450,197,451,194,452,195,453,196,452,195,451,194,454,112,455,198,456,199,455,198,454,112,457,200,458,200,459,112,460,198,461,199,460,198,459,112,462,201,463,202,464,203,465,203,466,202,467,201,468,112,469,198,470,199,469,198,468,112,471,200,472,200,473,112,474,198,475,199,474,198,473,112,476,204,477,205,478,206,479,206,480,205,481,204,482,207,483,208,484,209,483,208,482,207,485,210,486,210,487,207,488,208,489,209,488,208,487,207,490,211,491,212,492,213,491,212,490,211,493,214,494,214,495,211,496,212,497,213,496,212,495,211,498,213,499,215,500,216,499,215,498,213,501,212,502,212,503,213,504,215,505,216,504,215,503,213,506,217,507,218,508,219,507,218,506,217,509,220,509,220,506,217,510,221,511,221,512,217,513,220,513,220,512,217,514,218,515,219,514,218,512,217,516,222,517,208,518,223,517,208,516,222,519,209,520,209,521,222,522,208,523,223,522,208,521,222,524,201,525,224,526,225,525,224,524,201,527,226,527,226,524,201,528,227,529,227,530,201,531,226,531,226,530,201,532,224,533,225,532,224,530,201,534,228,535,229,536,230,535,229,534,228,537,231,538,231,539,228,540,229,541,230,540,229,539,228,542,232,543,233,544,234,543,233,542,232,545,235,546,235,547,232,548,233,549,234,548,233,547,232,550,236,551,237,552,238,551,237,550,236,553,239,553,239,554,240,555,241,554,240,553,239,550,236,554,240,550,236,556,242,557,242,558,236,559,240,558,236,560,239,559,240,561,241,559,240,560,239,560,239,558,236,562,237,563,238,562,237,558,236,564,243,565,244,566,245,565,244,564,243,567,246,568,246,569,243,570,244,571,245,570,244,569,243,572,174,573,177,574,176,573,177,572,174,575,247,576,247,577,174,578,177,579,176,578,177,577,174,580,248,581,249,582,250,581,249,580,248,583,251,581,249,583,251,584,252,581,249,584,252,585,253,585,253,584,252,586,254,587,254,588,252,589,253,589,253,588,252,590,249,588,252,591,251,590,249,591,251,592,248,590,249,593,250,590,249,592,248,594,255,595,256,596,257,595,256,594,255,597,258,598,258,599,255,600,256,601,257,600,256,599,255,602,259,603,260,604,261,603,260,602,259,605,262,606,262,607,259,608,260,609,261,608,260,607,259,610,263,611,264,612,265,611,264,610,263,613,266,614,266,615,263,616,264,617,265,616,264,615,263,618,267,619,268,620,269,621,269,622,268,623,267,624,200,625,270,626,271,625,270,624,200,627,272,628,272,629,200,630,270,631,271,630,270,629,200,618,267,632,273,619,268,632,273,618,267,633,274,633,274,618,267,634,275,635,275,623,267,636,274,636,274,623,267,637,273,622,268,637,273,623,267,638,276,639,277,640,278,641,278,642,277,643,276,644,279,645,280,646,281,645,280,644,279,647,282,648,282,649,279,650,280,651,281,650,280,649,279,652,283,653,284,654,285,653,284,652,283,655,286,656,286,657,283,658,284,659,285,658,284,657,283,660,287,661,288,662,289,661,288,660,287,663,290,663,290,660,287,664,291,665,291,666,287,667,290,667,290,666,287,668,288,669,289,668,288,666,287,670,281,671,292,672,293,671,292,670,281,673,294,674,294,675,281,676,292,677,293,676,292,675,281,678,286,679,295,680,284,679,295,678,286,681,296,682,296,683,286,684,295,685,284,684,295,683,286,686,297,687,247,688,174,687,247,686,297,689,298,687,247,690,299,691,177,690,299,687,247,689,298,692,298,693,247,694,299,695,177,694,299,693,247,692,298,696,297,693,247,697,174,693,247,696,297,698,300,699,301,700,302,699,301,698,300,701,303,702,303,703,300,704,301,705,302,704,301,703,300,706,304,707,302,708,305,707,302,706,304,709,300,710,300,711,304,712,302,713,305,712,302,711,304,714,306,715,307,716,308,717,308,718,307,719,306,720,309,721,310,722,311,721,310,720,309,723,312,724,312,725,309,726,310,727,311,726,310,725,309,728,313,729,314,730,297,731,315,732,316,733,299,732,316,731,315,730,297,732,316,730,297,729,314,734,314,735,297,736,316,735,297,737,315,736,316,738,299,736,316,737,315,735,297,734,314,739,313,740,297,741,299,742,298,741,299,740,297,743,315,744,315,745,297,746,299,747,298,746,299,745,297,748,317,749,318,750,319,749,318,748,317,751,320,752,320,753,317,754,318,755,319,754,318,753,317,756,321,757,319,758,322,757,319,756,321,759,323,760,323,761,321,762,319,763,322,762,319,761,321,764,324,765,325,766,326,767,326,768,325,769,324,770,327,771,328,772,329,771,328,770,327,773,330,774,330,775,327,776,328,777,329,776,328,775,327,778,331,779,332,780,333,779,332,778,331,781,334,782,334,783,331,784,332,785,333,784,332,783,331,786,335,787,266,788,336,787,266,786,335,789,337,790,337,791,335,792,266,793,336,792,266,791,335,794,338,795,339,796,340,797,340,798,339,799,338,800,272,801,341,802,342,801,341,800,272,803,343,804,343,805,272,806,341,807,342,806,341,805,272,808,344,809,345,810,346,809,345,808,344,811,347,812,347,813,344,814,345,815,346,814,345,813,344,816,348,817,349,818,350,817,349,816,348,819,351,820,351,821,348,822,349,823,350,822,349,821,348,824,352,825,353,826,354,825,353,824,352,827,355,828,355,829,352,830,353,831,354,830,353,829,352,832,356,833,350,834,357,833,350,832,356,835,348,836,348,837,356,838,350,839,357,838,350,837,356,840,358,841,359,842,360,841,359,840,358,843,361,843,361,840,358,844,362,845,362,846,358,847,361,847,361,846,358,848,359,849,360,848,359,846,358,850,363,851,364,852,365,851,364,850,363,853,366,854,366,855,363,856,364,857,365,856,364,855,363,858,367,859,368,860,369,859,368,858,367,861,370,861,370,858,367,862,371,861,370,862,371,863,372,864,372,865,371,866,370,865,371,867,367,866,370,866,370,867,367,868,368,869,369,868,368,867,367,870,373,871,374,872,375,871,374,870,373,873,376,874,376,875,373,876,374,877,375,876,374,875,373,878,377,879,378,880,379,879,378,878,377,881,380,882,380,883,377,884,378,885,379,884,378,883,377,886,313,887,316,888,314,887,316,886,313,889,381,890,381,891,313,892,316,893,314,892,316,891,313,894,382,895,383,896,384,895,383,894,382,897,385,898,385,899,382,900,383,901,384,900,383,899,382,902,386,903,387,904,388,905,388,906,387,907,386,908,389,909,390,910,391,909,390,908,389,911,392,912,392,913,389,914,390,915,391,914,390,913,389,916,393,917,394,918,395,917,394,916,393,919,396,920,396,921,393,922,394,923,395,922,394,921,393,924,397,925,398,926,399,927,399,928,398,929,397,930,400,931,401,932,402,931,401,930,400,933,403,933,403,930,400,934,404,935,404,936,400,937,403,937,403,936,400,938,401,939,402,938,401,936,400,940,405,941,406,942,337,941,406,940,405,943,407,944,407,945,405,946,406,947,337,946,406,945,405,948,408,949,409,950,410,949,409,948,408,951,411,949,409,951,411,952,412,953,412,954,411,955,409,954,411,956,408,955,409,957,410,955,409,956,408,958,413,959,414,960,415,959,414,958,413,961,416,962,416,963,413,964,414,965,415,964,414,963,413,966,417,967,418,968,419,969,419,970,418,971,417,972,420,973,421,974,422,973,421,972,420,975,423,976,423,977,420,978,421,979,422,978,421,977,420,980,424,981,425,982,426,981,425,980,424,983,427,984,427,985,424,986,425,987,426,986,425,985,424,988,428,989,429,990,430,989,429,988,428,991,431,992,431,993,428,994,429,995,430,994,429,993,428,996,431,997,432,998,429,997,432,996,431,999,433,1000,433,1001,431,1002,432,1003,429,1002,432,1001,431,1004,434,1005,435,1006,436,1007,436,1008,435,1009,434,1010,437,1011,438,1012,439,1011,438,1010,437,1013,440,1014,440,1015,437,1016,438,1017,439,1016,438,1015,437,1018,441,1019,439,1020,442,1019,439,1018,441,1021,437,1022,437,1023,441,1024,439,1025,442,1024,439,1023,441,1026,443,1027,444,1028,445,1027,444,1026,443,1029,446,1030,446,1031,443,1032,444,1033,445,1032,444,1031,443,1034,447,1035,448,1036,449,1037,449,1038,448,1039,447,1040,449,1041,450,1042,451,1041,450,1040,449,1043,448,1044,448,1045,449,1046,450,1047,451,1046,450,1045,449,1048,452,1049,453,1050,406,1049,453,1048,452,1051,454,1052,454,1053,452,1054,453,1055,406,1054,453,1053,452,1056,455,1057,456,1058,457,1057,456,1056,455,1059,458,1060,458,1061,455,1062,456,1063,457,1062,456,1061,455,1064,459,1065,460,1066,461,1067,461,1068,460,1069,459,1070,462,1071,463,1072,464,1071,463,1070,462,1073,465,1074,465,1075,462,1076,463,1077,464,1076,463,1075,462,1078,466,1079,467,1080,453,1079,467,1078,466,1081,468,1082,468,1083,466,1084,467,1085,453,1084,467,1083,466,1086,469,1087,470,1088,471,1087,470,1086,469,1089,472,1090,472,1091,469,1092,470,1093,471,1092,470,1091,469,1094,473,1095,474,1096,475,1097,475,1098,474,1099,473,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID136(GL2 gl){
double[] positionsArray = {
462.581275,368.4140482,394.15875,499.0909375,365.2198666,371.296875,317.0084325,470.3452499,371.296875,317.0084325,470.3452499,371.296875,499.0909375,365.2198666,371.296875,462.581275,368.4140482,394.15875,462.581275,368.4140482,394.15875,317.0084325,470.3452499,371.296875,301.5198436,503.5606359,394.15875,301.5198436,503.5606359,394.15875,317.0084325,470.3452499,371.296875,462.581275,368.4140482,394.15875,499.0909375,365.2198666,371.296875,338.0295061,440.3240455,348.435,317.0084325,470.3452499,371.296875,317.0084325,470.3452499,371.296875,338.0295061,440.3240455,348.435,499.0909375,365.2198666,371.296875,427.1809402,377.8995393,417.020625,462.581275,368.4140482,394.15875,301.5198436,503.5606359,394.15875,301.5198436,503.5606359,394.15875,462.581275,368.4140482,394.15875,427.1809402,377.8995393,417.020625,499.0909375,365.2198666,371.296875,535.6006,368.4140482,348.435,338.0295061,440.3240455,348.435,338.0295061,440.3240455,348.435,535.6006,368.4140482,348.435,499.0909375,365.2198666,371.296875,292.0343525,538.9609707,417.020625,427.1809402,377.8995393,417.020625,301.5198436,503.5606359,394.15875,301.5198436,503.5606359,394.15875,427.1809402,377.8995393,417.020625,292.0343525,538.9609707,417.020625,535.6006,368.4140482,348.435,363.9443498,414.4092018,325.573125,338.0295061,440.3240455,348.435,338.0295061,440.3240455,348.435,363.9443498,414.4092018,325.573125,535.6006,368.4140482,348.435,292.0343525,538.9609707,417.020625,393.9655542,393.3881282,439.8825,427.1809402,377.8995393,417.020625,427.1809402,377.8995393,417.020625,393.9655542,393.3881282,439.8825,292.0343525,538.9609707,417.020625,535.6006,368.4140482,348.435,571.0009348,377.8995393,325.573125,363.9443498,414.4092018,325.573125,363.9443498,414.4092018,325.573125,571.0009348,377.8995393,325.573125,535.6006,368.4140482,348.435,288.8401709,575.4706332,439.8825,393.9655542,393.3881282,439.8825,292.0343525,538.9609707,417.020625,292.0343525,538.9609707,417.020625,393.9655542,393.3881282,439.8825,288.8401709,575.4706332,439.8825,288.8401709,575.4706332,439.8825,363.9443498,414.4092018,462.744375,393.9655542,393.3881282,439.8825,393.9655542,393.3881282,439.8825,363.9443498,414.4092018,462.744375,288.8401709,575.4706332,439.8825,292.0343525,611.9802957,462.744375,363.9443498,414.4092018,462.744375,288.8401709,575.4706332,439.8825,288.8401709,575.4706332,439.8825,363.9443498,414.4092018,462.744375,292.0343525,611.9802957,462.744375,292.0343525,611.9802957,462.744375,338.0295061,440.3240455,485.60625,363.9443498,414.4092018,462.744375,363.9443498,414.4092018,462.744375,338.0295061,440.3240455,485.60625,292.0343525,611.9802957,462.744375,301.5198436,647.3806305,485.60625,338.0295061,440.3240455,485.60625,292.0343525,611.9802957,462.744375,292.0343525,611.9802957,462.744375,338.0295061,440.3240455,485.60625,301.5198436,647.3806305,485.60625,301.5198436,647.3806305,485.60625,317.0084325,470.3452499,508.468125,338.0295061,440.3240455,485.60625,338.0295061,440.3240455,485.60625,317.0084325,470.3452499,508.468125,301.5198436,647.3806305,485.60625,317.0084325,680.5960165,508.468125,317.0084325,470.3452499,508.468125,301.5198436,647.3806305,485.60625,301.5198436,647.3806305,485.60625,317.0084325,470.3452499,508.468125,317.0084325,680.5960165,508.468125,317.0084325,680.5960165,508.468125,301.5198436,503.5606359,531.33,317.0084325,470.3452499,508.468125,317.0084325,470.3452499,508.468125,301.5198436,503.5606359,531.33,317.0084325,680.5960165,508.468125,338.0295061,710.6172209,531.33,301.5198436,503.5606359,531.33,317.0084325,680.5960165,508.468125,317.0084325,680.5960165,508.468125,301.5198436,503.5606359,531.33,338.0295061,710.6172209,531.33,338.0295061,710.6172209,531.33,292.0343525,538.9609707,554.191875,301.5198436,503.5606359,531.33,301.5198436,503.5606359,531.33,292.0343525,538.9609707,554.191875,338.0295061,710.6172209,531.33,363.9443498,736.5320646,554.191875,292.0343525,538.9609707,554.191875,338.0295061,710.6172209,531.33,338.0295061,710.6172209,531.33,292.0343525,538.9609707,554.191875,363.9443498,736.5320646,554.191875,363.9443498,736.5320646,554.191875,290.4371827,557.2160074,565.6228677,292.0343525,538.9609707,554.191875,288.8401709,575.4706332,577.05375,288.8401709,575.4706332,577.05375,363.9443498,736.5320646,554.191875,290.4371827,557.2160074,565.6228677,292.0343525,538.9609707,554.191875,393.9655542,757.5531383,577.05375,288.8401709,575.4706332,577.05375,363.9443498,736.5320646,554.191875,363.9443498,736.5320646,554.191875,288.8401709,575.4706332,577.05375,393.9655542,757.5531383,577.05375,393.9655542,757.5531383,577.05375,292.0343525,611.9802957,599.915625,288.8401709,575.4706332,577.05375,288.8401709,575.4706332,577.05375,292.0343525,611.9802957,599.915625,393.9655542,757.5531383,577.05375,427.1809402,773.0417271,599.915625,292.0343525,611.9802957,599.915625,393.9655542,757.5531383,577.05375,393.9655542,757.5531383,577.05375,292.0343525,611.9802957,599.915625,427.1809402,773.0417271,599.915625,427.1809402,773.0417271,599.915625,301.5198436,647.3806305,622.7775,292.0343525,611.9802957,599.915625,292.0343525,611.9802957,599.915625,301.5198436,647.3806305,622.7775,427.1809402,773.0417271,599.915625,301.5198436,647.3806305,622.7775,427.1809402,773.0417271,599.915625,462.581275,782.5272182,622.7775,462.581275,782.5272182,622.7775,427.1809402,773.0417271,599.915625,301.5198436,647.3806305,622.7775,317.0084325,680.5960165,645.639375,301.5198436,647.3806305,622.7775,462.581275,782.5272182,622.7775,462.581275,782.5272182,622.7775,301.5198436,647.3806305,622.7775,317.0084325,680.5960165,645.639375,317.0084325,680.5960165,645.639375,462.581275,782.5272182,622.7775,499.0909375,785.7213998,645.639375,499.0909375,785.7213998,645.639375,462.581275,782.5272182,622.7775,317.0084325,680.5960165,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.4139466,0.7169766,0.5608857,0.4139466,0.7169766,0.5608857,0.4139466,0.7169766,0.5608857,-0.4139466,-0.7169766,-0.5608857,-0.4139466,-0.7169766,-0.5608857,-0.4139466,-0.7169766,-0.5608857,0.5321595,0.634203,-0.5608857,0.5321595,0.634203,-0.5608857,0.5321595,0.634203,-0.5608857,-0.5321595,-0.634203,0.5608857,-0.5321595,-0.634203,0.5608857,-0.5321595,-0.634203,0.5608857,0.4139466,0.7169766,-0.5608857,0.4139466,0.7169766,-0.5608857,0.4139466,0.7169766,-0.5608857,-0.4139466,-0.7169766,0.5608857,-0.4139466,-0.7169766,0.5608857,-0.4139466,-0.7169766,0.5608857,0.5321595,0.634203,0.5608857,0.5321595,0.634203,0.5608857,0.5321595,0.634203,0.5608857,-0.5321595,-0.634203,-0.5608857,-0.5321595,-0.634203,-0.5608857,-0.5321595,-0.634203,-0.5608857,0.2831562,0.7779652,0.5608857,0.2831562,0.7779652,0.5608857,0.2831562,0.7779652,0.5608857,-0.2831562,-0.7779652,-0.5608857,-0.2831562,-0.7779652,-0.5608857,-0.2831562,-0.7779652,-0.5608857,0.634203,0.5321595,-0.5608857,0.634203,0.5321595,-0.5608857,0.634203,0.5321595,-0.5608857,-0.634203,-0.5321595,0.5608857,-0.634203,-0.5321595,0.5608857,-0.634203,-0.5321595,0.5608857,0.2831562,0.7779652,-0.5608857,0.2831562,0.7779652,-0.5608857,0.2831562,0.7779652,-0.5608857,-0.2831562,-0.7779652,0.5608857,-0.2831562,-0.7779652,0.5608857,-0.2831562,-0.7779652,0.5608857,0.634203,0.5321595,0.5608857,0.634203,0.5321595,0.5608857,0.634203,0.5321595,0.5608857,-0.634203,-0.5321595,-0.5608857,-0.634203,-0.5321595,-0.5608857,-0.634203,-0.5321595,-0.5608857,0.1437622,0.8153157,0.5608857,0.1437622,0.8153157,0.5608857,0.1437622,0.8153157,0.5608857,-0.1437622,-0.8153157,-0.5608857,-0.1437622,-0.8153157,-0.5608857,-0.1437622,-0.8153157,-0.5608857,0.7169766,0.4139466,-0.5608857,0.7169766,0.4139466,-0.5608857,0.7169766,0.4139466,-0.5608857,-0.7169766,-0.4139466,0.5608857,-0.7169766,-0.4139466,0.5608857,-0.7169766,-0.4139466,0.5608857,0.7169766,0.4139466,0.5608857,0.7169766,0.4139466,0.5608857,0.7169766,0.4139466,0.5608857,-0.7169766,-0.4139466,-0.5608857,-0.7169766,-0.4139466,-0.5608857,-0.7169766,-0.4139466,-0.5608857,0.7779652,0.2831562,-0.5608857,0.7779652,0.2831562,-0.5608857,0.7779652,0.2831562,-0.5608857,-0.7779652,-0.2831562,0.5608857,-0.7779652,-0.2831562,0.5608857,-0.7779652,-0.2831562,0.5608857,0.7779652,0.2831562,0.5608857,0.7779652,0.2831562,0.5608857,0.7779652,0.2831562,0.5608857,-0.7779652,-0.2831562,-0.5608857,-0.7779652,-0.2831562,-0.5608857,-0.7779652,-0.2831562,-0.5608857,0.8153157,0.1437622,-0.5608857,0.8153157,0.1437622,-0.5608857,0.8153157,0.1437622,-0.5608857,-0.8153157,-0.1437622,0.5608857,-0.8153157,-0.1437622,0.5608857,-0.8153157,-0.1437622,0.5608857,0.8153157,0.1437622,0.5608857,0.8153157,0.1437622,0.5608857,0.8153157,0.1437622,0.5608857,-0.8153157,-0.1437622,-0.5608857,-0.8153157,-0.1437622,-0.5608857,-0.8153157,-0.1437622,-0.5608857,0.8278933,-0.0,-0.5608857,0.8278933,-0.0,-0.5608857,0.8278933,-0.0,-0.5608857,-0.8278933,0.0,0.5608857,-0.8278933,0.0,0.5608857,-0.8278933,0.0,0.5608857,0.8278933,-0.0,0.5608857,0.8278933,-0.0,0.5608857,0.8278933,-0.0,0.5608857,-0.8278933,0.0,-0.5608857,-0.8278933,0.0,-0.5608857,-0.8278933,0.0,-0.5608857,0.8153157,-0.1437622,-0.5608857,0.8153157,-0.1437622,-0.5608857,0.8153157,-0.1437622,-0.5608857,-0.8153157,0.1437622,0.5608857,-0.8153157,0.1437622,0.5608857,-0.8153157,0.1437622,0.5608857,0.8153157,-0.1437622,0.5608857,0.8153157,-0.1437622,0.5608857,0.8153157,-0.1437622,0.5608857,-0.8153157,0.1437622,-0.5608857,-0.8153157,0.1437622,-0.5608857,-0.8153157,0.1437622,-0.5608857,0.7779652,-0.2831562,-0.5608857,0.7779652,-0.2831562,-0.5608857,0.7779652,-0.2831562,-0.5608857,-0.7779652,0.2831562,0.5608857,-0.7779652,0.2831562,0.5608857,-0.7779652,0.2831562,0.5608857,0.7779651,-0.2831563,0.5608858,0.7779651,-0.2831563,0.5608858,0.7779651,-0.2831563,0.5608858,0.7779651,-0.2831563,0.5608858,-0.7779651,0.2831563,-0.5608858,-0.7779651,0.2831563,-0.5608858,-0.7779651,0.2831563,-0.5608858,-0.7779651,0.2831563,-0.5608858,0.7169766,-0.4139466,-0.5608857,0.7169766,-0.4139466,-0.5608857,0.7169766,-0.4139466,-0.5608857,-0.7169766,0.4139466,0.5608857,-0.7169766,0.4139466,0.5608857,-0.7169766,0.4139466,0.5608857,0.7169766,-0.4139466,0.5608857,0.7169766,-0.4139466,0.5608857,0.7169766,-0.4139466,0.5608857,-0.7169766,0.4139466,-0.5608857,-0.7169766,0.4139466,-0.5608857,-0.7169766,0.4139466,-0.5608857,0.634203,-0.5321595,-0.5608857,0.634203,-0.5321595,-0.5608857,0.634203,-0.5321595,-0.5608857,-0.634203,0.5321595,0.5608857,-0.634203,0.5321595,0.5608857,-0.634203,0.5321595,0.5608857,0.634203,-0.5321595,0.5608857,0.634203,-0.5321595,0.5608857,0.634203,-0.5321595,0.5608857,-0.634203,0.5321595,-0.5608857,-0.634203,0.5321595,-0.5608857,-0.634203,0.5321595,-0.5608857,0.5321595,-0.634203,-0.5608857,0.5321595,-0.634203,-0.5608857,0.5321595,-0.634203,-0.5608857,-0.5321595,0.634203,0.5608857,-0.5321595,0.634203,0.5608857,-0.5321595,0.634203,0.5608857,0.5321595,-0.634203,0.5608857,0.5321595,-0.634203,0.5608857,0.5321595,-0.634203,0.5608857,-0.5321595,0.634203,-0.5608857,-0.5321595,0.634203,-0.5608857,-0.5321595,0.634203,-0.5608857,0.4139466,-0.7169766,-0.5608857,0.4139466,-0.7169766,-0.5608857,0.4139466,-0.7169766,-0.5608857,-0.4139466,0.7169766,0.5608857,-0.4139466,0.7169766,0.5608857,-0.4139466,0.7169766,0.5608857,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,121,120,123,124,125,126,127,126,125,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 174, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID142(GL2 gl){
double[] positionsArray = {
748.2770313,1007.0736081,0.0,872.8700781,791.2721207,50.285,872.8700781,791.2721207,0.0,748.2770313,1007.0736081,50.285,748.2770313,1007.0736081,21.526875,748.2770313,1007.0736081,21.526875,748.2770313,1007.0736081,0.0,748.2770313,1007.0736081,50.285,872.8700781,791.2721207,50.285,872.8700781,791.2721207,0.0,499.0909375,1150.9412664,21.526875,748.2770313,1007.0736081,0.0,499.0909375,1150.9412664,0.0,748.2770313,1007.0736081,21.526875,748.2770313,1007.0736081,21.526875,499.0909375,1150.9412664,21.526875,748.2770313,1007.0736081,0.0,499.0909375,1150.9412664,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,10,11,12,11,10,13,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
13.833689f,0.5979688f,13.833689f,0.0f,13.833689f,1.3968056f,6.9118533f,1.3968056f,6.9118533f,0.0f,-4.013614f,0.5979687f,3.9790335f,0.5979687f,-4.013614f,0.0f,3.9790335f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
5,0,6,1,7,2,7,2,6,1,8,3,9,4,8,3,6,1,14,5,15,6,16,7,17,8,16,7,15,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID150(GL2 gl){
double[] positionsArray = {
312.2013672,251.768402,107.0225,499.0909375,251.768402,81.824375,312.2013672,251.768402,81.824375,499.0909375,251.768402,107.0225,499.0909375,251.768402,107.0225,312.2013672,251.768402,107.0225,499.0909375,251.768402,81.824375,312.2013672,251.768402,81.824375,358.9237598,332.6939598,107.0225,312.2013672,251.768402,107.0225,218.756582,413.6195176,107.0225,499.0909375,251.768402,107.0225,499.0909375,251.768402,107.0225,358.9237598,332.6939598,107.0225,312.2013672,251.768402,107.0225,218.756582,413.6195176,107.0225,218.756582,413.6195176,122.319375,358.9237598,332.6939598,107.0225,218.756582,413.6195176,107.0225,358.9237598,332.6939598,122.319375,358.9237598,332.6939598,122.319375,218.756582,413.6195176,122.319375,358.9237598,332.6939598,107.0225,218.756582,413.6195176,107.0225,218.756582,575.4706332,122.319375,358.9237598,332.6939598,122.319375,218.756582,413.6195176,122.319375,288.8401709,454.0822965,122.319375,288.8401709,454.0822965,122.319375,218.756582,575.4706332,122.319375,358.9237598,332.6939598,122.319375,218.756582,413.6195176,122.319375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,8,9,10,9,8,11,16,17,18,17,16,19,24,25,26,25,24,27,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 24, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID156.bind();
texcoordArray = new float[] {
-4.159091f,2.2296355f,-2.6016781f,2.2296355f,-4.159091f,1.7046745f,-2.6016781f,1.7046745f,-4.159091f,5.245175f,-2.9910314f,6.931124f,-2.6016781f,5.245175f,-1.8229715f,8.617073f,-1.2040843f,2.5483203f,0.144675f,2.5483203f,-1.2040843f,2.2296355f,0.144675f,2.2296355f,-2.4070015f,9.460048f,-1.8229715f,11.988972f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,12,4,13,5,14,6,15,7,14,6,13,5,20,8,21,9,22,10,23,11,22,10,21,9,28,12,29,13,30,5,31,7,30,5,29,13,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID163(GL2 gl){
double[] positionsArray = {
479.76125,541.9906324,146.96125,604.2163208,393.3881282,146.96125,393.9655542,393.3881282,146.96125,489.085155,538.1285445,146.96125,499.0909375,536.8112582,146.96125,509.09672,538.1285445,146.96125,598.2163208,403.780433,146.96125,518.420625,541.9906324,146.96125,518.420625,541.9906324,146.96125,509.09672,538.1285445,146.96125,598.2163208,403.780433,146.96125,604.2163208,393.3881282,146.96125,499.0909375,536.8112582,146.96125,489.085155,538.1285445,146.96125,479.76125,541.9906324,146.96125,393.9655542,393.3881282,146.96125,479.76125,541.9906324,165.54,393.9655542,393.3881282,146.96125,393.9655542,393.3881282,165.54,479.76125,541.9906324,146.96125,479.76125,541.9906324,146.96125,479.76125,541.9906324,165.54,393.9655542,393.3881282,146.96125,393.9655542,393.3881282,165.54,598.2163208,403.780433,146.96125,604.2163208,393.3881282,165.54,604.2163208,393.3881282,146.96125,602.9527385,395.5767169,165.54,518.420625,541.9906324,165.54,518.420625,541.9906324,146.96125,518.420625,541.9906324,146.96125,598.2163208,403.780433,146.96125,518.420625,541.9906324,165.54,602.9527385,395.5767169,165.54,604.2163208,393.3881282,165.54,604.2163208,393.3881282,146.96125,604.2163208,393.3881282,146.96125,499.0909375,332.6939598,146.96125,393.9655542,393.3881282,146.96125,393.9655542,393.3881282,146.96125,499.0909375,332.6939598,146.96125,604.2163208,393.3881282,146.96125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,6,5,7,16,17,18,17,16,19,24,25,26,25,24,27,27,24,28,28,24,29,36,37,38,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 39, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-4.320172f,11.2914715f,-4.2424726f,11.211011f,-4.985136f,8.412092f,-5.035136f,8.195586f,-4.159091f,11.183568f,-4.07571f,11.211011f,-3.9980104f,11.2914715f,-3.2830462f,8.195586f,-5.9104857f,3.0616927f,-5.9104857f,3.44875f,-4.4805574f,3.0616927f,-4.4805574f,3.44875f,1.7513945f,3.0616927f,0.4214663f,3.0616927f,1.7513945f,3.44875f,0.342526f,3.44875f,0.3214663f,3.44875f,0.3214663f,3.0616927f,-4.159091f,6.931124f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
8,0,9,1,10,2,10,2,9,1,11,3,9,1,12,4,11,3,12,4,13,5,11,3,13,5,14,6,11,3,15,7,11,3,14,6,20,8,21,9,22,10,23,11,22,10,21,9,30,12,31,13,32,14,32,14,31,13,33,15,33,15,31,13,34,16,35,17,34,16,31,13,39,7,40,18,41,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID171(GL2 gl){
double[] positionsArray = {
218.756582,575.4706332,122.319375,288.8401709,454.0822965,137.39375,288.8401709,454.0822965,122.319375,218.756582,575.4706332,137.39375,218.756582,575.4706332,137.39375,218.756582,575.4706332,122.319375,288.8401709,454.0822965,137.39375,288.8401709,454.0822965,122.319375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.2705882, 0.5843137, 0.3529412, 1.0);
int[] indices = {
0,1,2,1,0,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
3.2416158f,2.8623698f,3.2416158f,2.5483203f,2.073556f,2.8623698f,2.073556f,2.5483203f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID179(GL2 gl){
double[] positionsArray = {
499.0909375,536.8112582,758.690625,489.085155,538.1285445,748.4,499.0909375,536.8112582,748.4,489.085155,538.1285445,758.690625,489.085155,538.1285445,758.690625,499.0909375,536.8112582,758.690625,489.085155,538.1285445,748.4,499.0909375,536.8112582,748.4,479.76125,541.9906324,748.4,479.76125,541.9906324,758.690625,479.76125,541.9906324,758.690625,479.76125,541.9906324,748.4,471.7546313,548.134327,748.4,471.7546313,548.134327,758.690625,471.7546313,548.134327,758.690625,471.7546313,548.134327,748.4,465.6109367,556.1409457,758.690625,465.6109367,556.1409457,748.4,465.6109367,556.1409457,748.4,465.6109367,556.1409457,758.690625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.1305262,-0.9914449,-0.0,-0.258819,-0.9659258,-0.0,-0.1305262,-0.9914449,-0.0,-0.258819,-0.9659258,-0.0,0.258819,0.9659258,0.0,0.1305262,0.9914449,0.0,0.258819,0.9659258,0.0,0.1305262,0.9914449,0.0,-0.5,-0.8660254,-0.0,-0.5,-0.8660254,-0.0,0.5,0.8660254,0.0,0.5,0.8660254,0.0,-0.7071068,-0.7071068,-0.0,-0.7071068,-0.7071068,-0.0,0.7071068,0.7071068,0.0,0.7071068,0.7071068,0.0,-0.7933533,-0.6087614,-0.0,-0.7933533,-0.6087614,-0.0,0.7933533,0.6087614,0.0,0.7933533,0.6087614,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
11.7987f,21.07474f,11.518364f,20.788889f,11.7987f,20.788889f,11.518364f,21.07474f,6.831191f,21.07474f,6.5508547f,20.788889f,6.831191f,20.788889f,6.5508547f,21.07474f,1.4077f,21.07474f,1.1273632f,20.788889f,1.4077f,20.788889f,1.1273632f,21.07474f,-4.3825083f,21.07474f,-4.1021714f,20.788889f,-4.1021714f,21.07474f,-4.3825083f,20.788889f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,3,4,8,5,1,6,8,5,3,4,9,7,9,8,12,9,8,10,12,9,9,8,13,11,16,12,12,13,13,14,12,13,16,12,17,15,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
4,5,6,7,6,5,10,4,11,6,11,4,14,10,15,11,15,10,18,19,15,14,15,19,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 24, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID187(GL2 gl){
double[] positionsArray = {
288.8401709,696.8589699,137.39375,288.8401709,575.4706332,146.96125,288.8401709,575.4706332,137.39375,288.8401709,696.8589699,146.96125,288.8401709,696.8589699,146.96125,288.8401709,696.8589699,137.39375,288.8401709,575.4706332,146.96125,288.8401709,575.4706332,137.39375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID190.bind();
texcoordArray = new float[] {
8.29594f,1.6356399f,6.850841f,1.7495387f,6.850841f,1.6356399f,8.29594f,1.7495387f,5.807158f,3.0616927f,5.807158f,2.8623698f,4.7955885f,3.0616927f,4.7955885f,2.8623698f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
8.29594f,1.6356399f,6.850841f,1.7495387f,6.850841f,1.6356399f,8.29594f,1.7495387f,5.807158f,3.0616927f,5.807158f,2.8623698f,4.7955885f,3.0616927f,4.7955885f,2.8623698f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,4,5,5,6,6,7,7,6,6,5,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID200(GL2 gl){
double[] positionsArray = {
288.8401709,696.8589699,137.39375,288.8401709,454.0822965,137.39375,218.756582,575.4706332,137.39375,288.8401709,575.4706332,137.39375,288.8401709,575.4706332,137.39375,288.8401709,696.8589699,137.39375,288.8401709,454.0822965,137.39375,218.756582,575.4706332,137.39375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-2.4070015f,11.988972f,-2.4070015f,14.517895f,-2.4070015f,9.460048f,-1.8229715f,11.988972f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID208(GL2 gl){
double[] positionsArray = {
499.0909375,1150.9412664,21.526875,499.0909375,1007.0736081,21.526875,249.9048438,1007.0736081,21.526875,748.2770313,1007.0736081,21.526875,748.2770313,1007.0736081,21.526875,499.0909375,1150.9412664,21.526875,499.0909375,1007.0736081,21.526875,249.9048438,1007.0736081,21.526875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.7411765, 0.4431373, 0.0, 1.0);
int[] indices = {
4,5,6,7,6,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID216(GL2 gl){
double[] positionsArray = {
604.2163208,757.5531383,146.96125,709.3417041,696.8589699,137.39375,604.2163208,757.5531383,137.39375,709.3417041,696.8589699,146.96125,709.3417041,696.8589699,146.96125,604.2163208,757.5531383,146.96125,709.3417041,696.8589699,137.39375,604.2163208,757.5531383,137.39375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-1.2040843f,3.0616927f,-2.215654f,2.8623698f,-1.2040843f,2.8623698f,-2.215654f,3.0616927f,-3.1652198f,1.7495387f,-1.7201204f,1.7495387f,-3.1652198f,1.6356399f,-1.7201204f,1.6356399f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID190.bind();
texcoordArray = new float[] {
-1.2040843f,3.0616927f,-2.215654f,2.8623698f,-1.2040843f,2.8623698f,-2.215654f,3.0616927f,-3.1652198f,1.7495387f,-1.7201204f,1.7495387f,-3.1652198f,1.6356399f,-1.7201204f,1.6356399f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,4,5,5,6,6,7,7,6,6,5,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID224(GL2 gl){
double[] positionsArray = {
288.8401709,575.4706332,137.39375,288.8401709,454.0822965,122.319375,288.8401709,454.0822965,137.39375,288.8401709,454.0822965,0.0,288.8401709,575.4706332,0.0,288.8401709,575.4706332,0.0,288.8401709,575.4706332,137.39375,288.8401709,454.0822965,0.0,288.8401709,454.0822965,122.319375,288.8401709,454.0822965,137.39375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-15.985295f,0.0f,-15.985295f,3.816493f,-12.613397f,0.0f,-12.613397f,3.3977604f,-12.613397f,3.816493f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
5,0,6,1,7,2,7,2,6,1,8,3,9,4,8,3,6,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID232(GL2 gl){
double[] positionsArray = {
461.7488488,585.4764157,0.0,461.7488488,565.4648507,0.0,460.4315625,575.4706332,0.0,465.6109367,594.8003207,0.0,465.6109367,556.1409457,0.0,471.7546313,548.134327,0.0,471.7546313,602.8069394,0.0,479.76125,608.9506341,0.0,479.76125,541.9906324,0.0,489.085155,612.812722,0.0,489.085155,538.1285445,0.0,499.0909375,536.8112582,0.0,499.0909375,614.1300082,0.0,509.09672,612.812722,0.0,509.09672,538.1285445,0.0,518.420625,608.9506341,0.0,518.420625,541.9906324,0.0,526.4272437,602.8069394,0.0,526.4272437,548.134327,0.0,532.5709383,556.1409457,0.0,532.5709383,594.8003207,0.0,536.4330262,565.4648507,0.0,536.4330262,585.4764157,0.0,537.7503125,575.4706332,0.0,537.7503125,575.4706332,0.0,536.4330262,585.4764157,0.0,536.4330262,565.4648507,0.0,532.5709383,594.8003207,0.0,532.5709383,556.1409457,0.0,526.4272437,602.8069394,0.0,526.4272437,548.134327,0.0,518.420625,541.9906324,0.0,518.420625,608.9506341,0.0,509.09672,538.1285445,0.0,509.09672,612.812722,0.0,499.0909375,536.8112582,0.0,499.0909375,614.1300082,0.0,489.085155,612.812722,0.0,489.085155,538.1285445,0.0,479.76125,541.9906324,0.0,479.76125,608.9506341,0.0,471.7546313,548.134327,0.0,471.7546313,602.8069394,0.0,465.6109367,594.8003207,0.0,465.6109367,556.1409457,0.0,461.7488488,565.4648507,0.0,461.7488488,585.4764157,0.0,460.4315625,575.4706332,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,5,3,6,5,6,7,5,7,8,8,7,9,8,9,10,10,9,11,11,9,12,11,12,13,11,13,14,14,13,15,14,15,16,16,15,17,16,17,18,18,17,19,19,17,20,19,20,21,21,20,22,21,22,23,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 66, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.3176471, 0.3176471, 0.3176471, 1.0);
int[] indices = {
24,25,26,25,27,26,26,27,28,27,29,28,28,29,30,30,29,31,29,32,31,31,32,33,32,34,33,33,34,35,34,36,35,36,37,35,35,37,38,38,37,39,37,40,39,39,40,41,40,42,41,42,43,41,41,43,44,44,43,45,43,46,45,47,45,46,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 66, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID242(GL2 gl){
double[] positionsArray = {
499.0909375,332.6939598,146.96125,604.2163208,393.3881282,137.39375,499.0909375,332.6939598,137.39375,604.2163208,393.3881282,146.96125,604.2163208,393.3881282,146.96125,499.0909375,332.6939598,146.96125,604.2163208,393.3881282,137.39375,499.0909375,332.6939598,137.39375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-16.627012f,4.082257f,-19.998909f,3.816493f,-16.627012f,3.816493f,-19.998909f,4.082257f,-5.999673f,3.0616927f,-4.9881034f,3.0616927f,-5.999673f,2.8623698f,-4.9881034f,2.8623698f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID10.bind();
texcoordArray = new float[] {
-16.627012f,4.082257f,-19.998909f,3.816493f,-16.627012f,3.816493f,-19.998909f,4.082257f,-5.999673f,3.0616927f,-4.9881034f,3.0616927f,-5.999673f,2.8623698f,-4.9881034f,2.8623698f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,4,5,5,6,6,7,7,6,6,5,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID250(GL2 gl){
double[] positionsArray = {
463.0394856,588.5922886,211.26375,325.760695,509.9039306,211.26375,303.0965811,646.806745,211.26375,338.0295061,440.3240455,211.26375,461.7488488,585.4764157,211.26375,460.4315625,575.4706332,211.26375,465.6109367,556.1409457,211.26375,469.7015246,550.8099877,211.26375,461.7488488,565.4648507,211.26375,460.4315625,575.4706332,211.26375,338.0295061,440.3240455,211.26375,461.7488488,565.4648507,211.26375,465.6109367,556.1409457,211.26375,469.7015246,550.8099877,211.26375,461.7488488,585.4764157,211.26375,463.0394856,588.5922886,211.26375,325.760695,509.9039306,211.26375,303.0965811,646.806745,211.26375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,3,4,5,3,6,7,6,3,8,8,3,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,11,10,12,13,12,10,9,14,10,14,15,10,10,15,16,17,16,15,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID260(GL2 gl){
double[] positionsArray = {
709.3417041,454.0822965,122.319375,604.2163208,393.3881282,0.0,709.3417041,454.0822965,0.0,604.2163208,393.3881282,137.39375,709.3417041,454.0822965,137.39375,709.3417041,454.0822965,137.39375,709.3417041,454.0822965,122.319375,604.2163208,393.3881282,137.39375,604.2163208,393.3881282,0.0,709.3417041,454.0822965,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
23.370808f,3.816493f,23.370808f,3.3977604f,19.998909f,3.816493f,19.998909f,0.0f,23.370808f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
5,0,6,1,7,2,7,2,6,1,8,3,9,4,8,3,6,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID268(GL2 gl){
double[] positionsArray = MahonTower2Coordinates.getID268PositionsArray();
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = MahonTower2Coordinates.getID268NoramlsArray();
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = MahonTower2Coordinates.getID268TexCoordinatesArray();
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,3,2,4,1,5,0,6,3,7,4,8,5,7,4,6,3,9,6,10,6,11,3,12,4,13,5,12,4,11,3,14,7,15,8,16,9,15,8,14,7,17,10,18,10,19,7,20,8,21,9,20,8,19,7,22,10,23,11,24,12,23,11,22,10,25,13,26,13,27,10,28,11,29,12,28,11,27,10,30,14,31,15,32,16,33,16,34,15,35,14,36,17,37,18,38,19,37,18,36,17,39,20,40,20,41,17,42,18,43,19,42,18,41,17,44,21,45,22,46,23,45,22,44,21,47,24,48,24,49,21,50,22,51,23,50,22,49,21,52,25,53,26,54,27,53,26,52,25,55,28,53,26,55,28,56,29,53,26,56,29,57,30,58,30,59,29,60,26,59,29,61,28,60,26,61,28,62,25,60,26,63,27,60,26,62,25,64,31,65,32,66,33,65,32,64,31,67,34,68,34,69,31,70,32,71,33,70,32,69,31,72,35,73,36,74,37,73,36,72,35,75,38,76,38,77,35,78,36,79,37,78,36,77,35,80,39,81,40,82,41,81,40,80,39,83,42,84,42,85,39,86,40,87,41,86,40,85,39,88,43,89,44,90,45,89,44,88,43,91,46,92,46,93,43,94,44,95,45,94,44,93,43,96,47,97,48,98,49,99,49,100,48,101,47,102,50,103,51,104,52,103,51,102,50,105,53,106,53,107,50,108,51,109,52,108,51,107,50,110,54,111,55,112,56,111,55,110,54,113,57,114,57,115,54,116,55,117,56,116,55,115,54,118,58,119,59,120,60,120,60,121,61,122,62,121,61,120,60,119,59,123,59,124,60,125,61,126,62,125,61,124,60,124,60,123,59,127,58,128,58,129,61,130,59,129,61,128,58,131,63,132,63,133,58,134,61,135,59,134,61,133,58,136,64,137,65,138,58,139,63,140,66,141,61,140,66,139,63,138,58,140,66,138,58,137,65,142,65,143,58,144,66,143,58,145,63,144,66,146,61,144,66,145,63,143,58,142,65,147,64,148,67,149,68,150,69,149,68,148,67,151,70,151,70,148,67,152,71,153,71,154,67,155,70,155,70,154,67,156,68,157,69,156,68,154,67,158,72,159,73,160,74,159,73,158,72,161,75,161,75,158,72,162,76,163,76,164,72,165,75,165,75,164,72,166,73,167,74,166,73,164,72,168,77,169,78,170,79,169,78,168,77,171,80,172,80,173,77,174,78,175,79,174,78,173,77,176,81,177,82,178,83,177,82,176,81,179,84,180,84,181,81,182,82,183,83,182,82,181,81,184,85,185,62,186,86,185,62,184,85,187,60,188,60,189,85,190,62,191,86,190,62,189,85,192,87,193,88,194,89,193,88,192,87,195,90,196,90,197,87,198,88,199,89,198,88,197,87,200,91,201,92,202,93,201,92,200,91,203,94,203,94,200,91,204,95,203,94,204,95,205,96,203,94,205,96,206,97,207,97,208,96,209,94,208,96,210,95,209,94,210,95,211,91,209,94,209,94,211,91,212,92,213,93,212,92,211,91,214,98,215,99,216,100,215,99,214,98,217,101,218,101,219,98,220,99,221,100,220,99,219,98,222,64,223,66,224,65,223,66,222,64,225,102,226,102,227,64,228,66,229,65,228,66,227,64,230,103,231,104,232,105,231,104,230,103,233,106,233,106,230,103,234,107,233,106,234,107,235,108,233,106,235,108,236,109,237,109,238,108,239,106,238,108,240,107,239,106,240,107,241,103,239,106,239,106,241,103,242,104,243,105,242,104,241,103,189,18,244,110,245,111,244,110,189,18,246,112,247,112,184,18,248,110,249,111,248,110,184,18,37,18,250,110,251,111,250,110,37,18,252,112,253,112,42,18,254,110,255,111,254,110,42,18,256,113,257,71,258,67,259,67,260,71,261,113,262,114,263,115,264,116,265,116,266,115,267,114,268,117,269,118,270,119,269,118,268,117,271,120,272,120,273,117,274,118,275,119,274,118,273,117,276,121,277,122,278,123,277,122,276,121,279,124,280,124,281,121,282,122,283,123,282,122,281,121,284,125,285,126,286,127,285,126,284,125,287,128,287,128,284,125,288,129,289,129,290,125,291,128,291,128,290,125,292,126,293,127,292,126,290,125,294,130,295,119,296,131,295,119,294,130,297,117,298,117,299,130,300,119,301,131,300,119,299,130,302,124,303,132,304,122,303,132,302,124,305,133,306,133,307,124,308,132,309,122,308,132,307,124,310,134,311,135,312,136,311,135,310,134,189,18,184,18,313,134,314,135,315,136,314,135,313,134,316,137,317,138,318,139,317,138,316,137,319,140,320,140,321,137,322,138,323,139,322,138,321,137,324,141,325,142,326,143,325,142,324,141,327,85,328,85,329,141,330,142,331,143,330,142,329,141,332,144,333,83,334,145,333,83,332,144,335,81,336,81,337,144,338,83,339,145,338,83,337,144,171,80,340,146,169,78,340,146,171,80,341,147,342,147,172,80,343,146,174,78,343,146,172,80,344,148,345,149,346,150,345,149,344,148,347,151,347,151,344,148,348,152,349,152,350,148,351,151,351,151,350,148,352,149,353,150,352,149,350,148,354,153,355,154,356,155,355,154,354,153,357,156,357,156,354,153,358,157,359,157,360,153,361,156,361,156,360,153,362,154,363,155,362,154,360,153,364,158,365,159,366,160,365,159,364,158,367,161,368,161,369,158,370,159,371,160,370,159,369,158,372,162,373,88,374,163,373,88,372,162,375,89,376,89,377,162,378,88,379,163,378,88,377,162,380,102,381,164,382,66,381,164,380,102,383,165,383,165,380,102,384,64,383,165,384,64,385,166,386,166,387,64,388,165,387,64,389,102,388,165,388,165,389,102,390,164,391,66,390,164,389,102,392,164,393,167,394,168,393,167,392,164,395,169,395,169,392,164,396,170,395,169,396,170,397,166,398,166,399,170,400,169,399,170,401,164,400,169,400,169,401,164,402,167,403,168,402,167,401,164,404,165,405,170,406,164,405,170,404,165,407,166,408,166,409,165,410,170,411,164,410,170,409,165,412,171,413,172,414,173,413,172,412,171,415,174,416,174,417,171,418,172,419,173,418,172,417,171,420,175,421,174,422,171,421,174,420,175,423,176,424,176,425,175,426,174,427,171,426,174,425,175,428,177,429,178,430,179,431,179,432,178,433,177,434,180,435,181,436,182,435,181,434,180,437,183,438,183,439,180,440,181,441,182,440,181,439,180,442,184,443,185,444,186,445,186,446,185,447,184,448,187,449,188,450,189,449,188,448,187,451,190,452,190,453,187,454,188,455,189,454,188,453,187,456,191,457,192,458,112,457,192,456,191,459,193,460,193,461,191,462,192,463,112,462,192,461,191,464,26,465,194,466,195,467,195,468,194,469,26,470,191,471,192,472,112,471,192,470,191,473,193,474,193,475,191,476,192,477,112,476,192,475,191,478,196,479,197,480,198,481,198,482,197,483,196,484,199,485,200,486,201,485,200,484,199,487,202,488,202,489,199,490,200,491,201,490,200,489,199,492,203,493,204,494,205,493,204,492,203,495,206,496,206,497,203,498,204,499,205,498,204,497,203,500,207,501,208,502,209,501,208,500,207,503,210,503,210,500,207,504,211,505,211,506,207,507,210,507,210,506,207,508,208,509,209,508,208,506,207,510,212,511,213,512,214,511,213,510,212,513,215,514,215,515,212,516,213,517,214,516,213,515,212,518,216,519,217,520,218,519,217,518,216,521,204,522,204,523,216,524,217,525,218,524,217,523,216,526,219,527,220,528,221,527,220,526,219,529,194,529,194,526,219,530,195,531,195,532,219,533,194,533,194,532,219,534,220,535,221,534,220,532,219,536,222,537,223,538,224,537,223,536,222,539,225,540,225,541,222,542,223,543,224,542,223,541,222,544,226,545,227,546,228,545,227,544,226,547,229,548,229,549,226,550,227,551,228,550,227,549,226,552,230,553,231,554,232,553,231,552,230,555,233,553,231,555,233,556,234,553,231,556,234,557,235,553,231,557,235,558,236,559,236,560,235,561,231,560,235,562,234,561,231,562,234,563,233,561,231,563,233,564,230,561,231,565,232,561,231,564,230,566,237,567,238,568,239,567,238,566,237,569,240,570,240,571,237,572,238,573,239,572,238,571,237,574,168,575,169,576,241,575,169,574,168,577,167,578,167,579,168,580,169,581,241,580,169,579,168,582,242,583,243,584,244,583,243,582,242,585,245,583,243,585,245,586,246,583,243,586,246,587,247,587,247,586,246,588,248,589,248,590,246,591,247,591,247,590,246,592,243,590,246,593,245,592,243,593,245,594,242,592,243,595,244,592,243,594,242,596,249,597,250,598,251,597,250,596,249,599,252,600,252,601,249,602,250,603,251,602,250,601,249,604,253,605,254,606,255,605,254,604,253,607,256,608,256,609,253,610,254,611,255,610,254,609,253,612,257,613,258,614,259,613,258,612,257,615,260,616,260,617,257,618,258,619,259,618,258,617,257,620,261,621,262,622,263,623,263,624,262,625,261,626,264,627,265,628,191,627,265,626,264,629,266,630,266,631,264,632,265,633,191,632,265,631,264,634,267,635,268,636,269,635,268,634,267,637,270,638,270,639,267,640,268,641,269,640,268,639,267,642,271,643,272,644,273,645,273,646,272,647,271,648,274,649,275,650,276,649,275,648,274,651,277,652,277,653,274,654,275,655,276,654,275,653,274,656,271,657,278,658,272,657,278,656,271,659,279,659,279,656,271,660,280,661,280,662,271,663,279,663,279,662,271,664,278,665,272,664,278,662,271,666,281,667,268,668,282,667,268,666,281,669,269,670,269,671,281,672,268,673,282,672,268,671,281,650,276,674,283,675,284,674,283,650,276,649,275,654,275,655,276,676,283,677,284,676,283,655,276,678,285,622,263,679,286,622,263,678,285,620,261,620,261,678,285,680,287,681,287,682,285,625,261,625,261,682,285,623,263,683,286,623,263,682,285,684,168,685,288,686,289,685,288,684,168,687,290,687,290,684,168,688,241,689,169,687,290,688,241,690,241,691,290,692,169,690,241,693,168,691,290,691,290,693,168,694,288,695,289,694,288,693,168,696,291,697,292,698,293,697,292,696,291,699,294,700,294,701,291,702,292,703,293,702,292,701,291,704,295,705,292,706,296,705,292,704,295,707,297,708,297,709,295,710,292,711,296,710,292,709,295,712,298,713,299,714,300,715,300,716,299,717,298,718,301,719,302,720,303,719,302,718,301,721,304,722,304,723,301,724,302,725,303,724,302,723,301,726,289,727,305,728,306,727,305,726,289,729,307,727,305,730,290,731,308,730,290,727,305,729,307,732,307,733,305,734,290,735,308,734,290,733,305,732,307,736,289,733,305,737,306,733,305,736,289,738,289,739,290,740,307,739,290,738,289,741,288,742,288,743,289,744,290,745,307,744,290,743,289,746,309,747,310,748,311,747,310,746,309,749,312,750,312,751,309,752,310,753,311,752,310,751,309,754,312,755,313,756,310,755,313,754,312,757,314,758,314,759,312,760,313,761,310,760,313,759,312,762,315,763,316,764,317,765,317,766,316,767,315,768,318,769,319,770,320,769,319,768,318,771,321,772,321,773,318,774,319,775,320,774,319,773,318,776,322,777,323,778,258,777,323,776,322,779,324,780,324,781,322,782,323,783,258,782,323,781,322,784,325,785,326,786,327,787,327,788,326,789,325,790,328,791,329,792,330,791,329,790,328,793,331,794,331,795,328,796,329,797,330,796,329,795,328,798,332,799,333,800,264,799,333,798,332,801,334,802,334,803,332,804,333,805,264,804,333,803,332,806,335,807,336,808,337,807,336,806,335,809,338,810,338,811,335,812,336,813,337,812,336,811,335,814,339,815,340,816,341,815,340,814,339,817,342,818,342,819,339,820,340,821,341,820,340,819,339,822,337,823,343,824,344,823,343,822,337,825,336,826,336,827,337,828,343,829,344,828,343,827,337,830,341,831,345,832,346,831,345,830,341,833,340,834,340,835,341,836,345,837,346,836,345,835,341,838,347,839,348,840,349,839,348,838,347,841,350,841,350,838,347,842,351,843,351,844,347,845,350,845,350,844,347,846,348,847,349,846,348,844,347,848,352,849,353,850,354,849,353,848,352,851,355,852,355,853,352,854,353,855,354,854,353,853,352,856,356,857,357,858,358,857,357,856,356,859,359,857,357,859,359,860,360,857,357,860,360,861,361,862,361,863,360,864,357,863,360,865,359,864,357,865,359,866,356,864,357,867,358,864,357,866,356,868,362,869,363,870,364,869,363,868,362,871,365,872,365,873,362,874,363,875,364,874,363,873,362,876,366,877,367,878,368,877,367,876,366,879,369,880,369,881,366,882,367,883,368,882,367,881,366,884,370,885,305,886,308,885,305,884,370,887,306,888,306,889,370,890,305,891,308,890,305,889,370,892,371,893,372,894,373,893,372,892,371,895,374,896,374,897,371,898,372,899,373,898,372,897,371,900,375,901,376,902,377,901,376,900,375,903,378,904,378,905,375,906,376,907,377,906,376,905,375,908,379,909,380,910,381,909,380,908,379,911,382,912,382,913,379,914,380,915,381,914,380,913,379,916,383,917,384,918,385,919,385,920,384,921,383,922,386,923,387,924,388,923,387,922,386,925,389,925,389,922,386,926,390,927,390,928,386,929,389,929,389,928,386,930,387,931,388,930,387,928,386,932,323,933,391,934,392,933,391,932,323,935,393,936,393,937,323,938,391,939,392,938,391,937,323,940,394,941,395,942,396,941,395,940,394,943,397,941,395,943,397,944,398,945,398,946,397,947,395,946,397,948,394,947,395,949,396,947,395,948,394,950,399,951,400,952,401,951,400,950,399,953,402,954,402,955,399,956,400,957,401,956,400,955,399,958,403,959,404,960,405,961,405,962,404,963,403,964,406,965,407,966,408,965,407,964,406,967,409,968,409,969,406,970,407,971,408,970,407,969,406,972,410,973,411,974,412,973,411,972,410,975,413,976,413,977,410,978,411,979,412,978,411,977,410,980,414,981,415,982,416,981,415,980,414,983,417,984,417,985,414,986,415,987,416,986,415,985,414,988,418,989,419,990,420,989,419,988,418,991,416,992,416,993,418,994,419,995,420,994,419,993,418,996,421,997,422,998,423,997,422,996,421,999,424,1000,424,1001,421,1002,422,1003,423,1002,422,1001,421,1004,424,1005,425,1006,422,1005,425,1004,424,1007,426,1008,426,1009,424,1010,425,1011,422,1010,425,1009,424,1012,427,1013,428,1014,429,1013,428,1012,427,1015,430,1016,430,1017,427,1018,428,1019,429,1018,428,1017,427,1020,431,1021,432,1022,433,1023,433,1024,432,1025,431,1026,433,1027,434,1028,435,1027,434,1026,433,1029,432,1030,432,1031,433,1032,434,1033,435,1032,434,1031,433,1034,392,1035,436,1036,437,1035,436,1034,392,1037,438,1038,438,1039,392,1040,436,1041,437,1040,436,1039,392,1042,439,1043,440,1044,441,1043,440,1042,439,1045,442,1046,442,1047,439,1048,440,1049,441,1048,440,1047,439,1050,443,1051,444,1052,445,1051,444,1050,443,1053,446,1054,446,1055,443,1056,444,1057,445,1056,444,1055,443,1058,447,1059,448,1060,449,1059,448,1058,447,1061,450,1062,450,1063,447,1064,448,1065,449,1064,448,1063,447,1066,451,1067,452,1068,453,1069,453,1070,452,1071,451,1072,437,1073,454,1074,455,1073,454,1072,437,1075,456,1076,456,1077,437,1078,454,1079,455,1078,454,1077,437,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID276(GL2 gl){
double[] positionsArray = {
509.09672,538.1285445,211.26375,535.0455251,371.5620341,211.26375,505.7529765,537.6883323,211.26375,518.420625,541.9906324,211.26375,526.4272437,548.134327,211.26375,532.5709383,556.1409457,211.26375,535.1423894,562.3489778,211.26375,535.6006,368.4140482,211.26375,696.6620314,503.5606359,211.26375,696.6620314,503.5606359,211.26375,535.1423894,562.3489778,211.26375,535.6006,368.4140482,211.26375,535.0455251,371.5620341,211.26375,532.5709383,556.1409457,211.26375,526.4272437,548.134327,211.26375,518.420625,541.9906324,211.26375,509.09672,538.1285445,211.26375,505.7529765,537.6883323,211.26375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,7,6,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,11,10,12,10,13,12,13,14,12,14,15,12,15,16,12,17,12,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID284(GL2 gl){
double[] positionsArray = {
460.4315625,575.4706332,439.8825,393.9655542,393.3881282,439.8825,288.8401709,575.4706332,439.8825,461.7488488,565.4648507,439.8825,465.6109367,556.1409457,439.8825,471.7546313,548.134327,439.8825,479.76125,541.9906324,439.8825,479.76125,541.9906324,439.8825,471.7546313,548.134327,439.8825,393.9655542,393.3881282,439.8825,465.6109367,556.1409457,439.8825,461.7488488,565.4648507,439.8825,460.4315625,575.4706332,439.8825,288.8401709,575.4706332,439.8825,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID290(GL2 gl){
double[] positionsArray = {
291.3444164,575.4706332,165.54,393.9655542,393.3881282,165.54,288.8401709,575.4706332,165.54,460.4315625,575.4706332,165.54,461.7488488,565.4648507,165.54,465.6109367,556.1409457,165.54,471.7546313,548.134327,165.54,479.76125,541.9906324,165.54,479.76125,541.9906324,165.54,471.7546313,548.134327,165.54,393.9655542,393.3881282,165.54,465.6109367,556.1409457,165.54,461.7488488,565.4648507,165.54,460.4315625,575.4706332,165.54,291.3444164,575.4706332,165.54,288.8401709,575.4706332,165.54,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID296(GL2 gl){
double[] positionsArray = {
499.0909375,1007.0736081,50.285,499.0909375,1007.0736081,21.526875,249.9048438,1007.0736081,21.526875,249.9048438,1007.0736081,21.526875,499.0909375,1007.0736081,21.526875,499.0909375,1007.0736081,50.285,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID190.bind();
texcoordArray = new float[] {
-5.941559f,0.598631f,-5.941559f,0.2562723f,-2.9750576f,0.2562723f,-6.941801f,0.5979687f,-13.863637f,0.5979687f,-13.863637f,1.3968056f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-5.941559f,0.598631f,-5.941559f,0.2562723f,-2.9750576f,0.2562723f,-6.941801f,0.5979687f,-13.863637f,0.5979687f,-13.863637f,1.3968056f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,3,4,4,5,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID304(GL2 gl){
double[] positionsArray = {
393.9655542,757.5531383,577.05375,460.4315625,575.4706332,577.05375,288.8401709,575.4706332,577.05375,461.7488488,585.4764157,577.05375,465.6109367,594.8003207,577.05375,471.7546313,602.8069394,577.05375,479.76125,608.9506341,577.05375,479.76125,608.9506341,577.05375,393.9655542,757.5531383,577.05375,471.7546313,602.8069394,577.05375,465.6109367,594.8003207,577.05375,461.7488488,585.4764157,577.05375,460.4315625,575.4706332,577.05375,288.8401709,575.4706332,577.05375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID310(GL2 gl){
double[] positionsArray = {
499.0909375,1150.9412664,21.526875,166.8428125,1150.9412664,0.0,499.0909375,1150.9412664,0.0,499.0909375,1150.9412664,0.0,166.8428125,1150.9412664,0.0,499.0909375,1150.9412664,21.526875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID190.bind();
texcoordArray = new float[] {
5.941559f,0.2562723f,1.986224f,0.0f,5.941559f,0.0f,13.863637f,0.0f,4.6345224f,0.0f,13.863637f,0.5979687f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
5.941559f,0.2562723f,1.986224f,0.0f,5.941559f,0.0f,13.863637f,0.0f,4.6345224f,0.0f,13.863637f,0.5979687f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,3,4,4,5,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID318(GL2 gl){
double[] positionsArray = {
461.3086366,568.8085942,417.020625,427.1809402,377.8995393,417.020625,292.0343525,538.9609707,417.020625,461.7488488,565.4648507,417.020625,465.6109367,556.1409457,417.020625,471.7546313,548.134327,417.020625,479.76125,541.9906324,417.020625,485.9692821,539.4191813,417.020625,485.9692821,539.4191813,417.020625,479.76125,541.9906324,417.020625,427.1809402,377.8995393,417.020625,471.7546313,548.134327,417.020625,465.6109367,556.1409457,417.020625,461.7488488,565.4648507,417.020625,461.3086366,568.8085942,417.020625,292.0343525,538.9609707,417.020625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID324(GL2 gl){
double[] positionsArray = {
604.2163208,757.5531383,165.54,479.76125,608.9506341,165.54,393.9655542,757.5531383,165.54,489.085155,612.812722,165.54,499.0909375,614.1300082,165.54,509.09672,612.812722,165.54,518.420625,608.9506341,165.54,518.420625,608.9506341,165.54,604.2163208,757.5531383,165.54,509.09672,612.812722,165.54,499.0909375,614.1300082,165.54,489.085155,612.812722,165.54,479.76125,608.9506341,165.54,393.9655542,757.5531383,165.54,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID330(GL2 gl){
double[] positionsArray = {
338.6425362,710.1028276,256.9875,461.7488488,585.4764157,256.9875,460.4315625,575.4706332,256.9875,465.6109367,594.8003207,256.9875,469.7015246,600.1312787,256.9875,326.4683274,645.0505183,256.9875,463.0394856,562.3489778,256.9875,301.5198436,503.5606359,256.9875,461.7488488,565.4648507,256.9875,460.4315625,575.4706332,256.9875,338.6425362,710.1028276,256.9875,461.7488488,565.4648507,256.9875,463.0394856,562.3489778,256.9875,326.4683274,645.0505183,256.9875,301.5198436,503.5606359,256.9875,469.7015246,600.1312787,256.9875,465.6109367,594.8003207,256.9875,461.7488488,585.4764157,256.9875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,6,7,6,5,0,6,0,8,8,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,11,10,12,10,13,12,14,12,13,15,10,16,16,10,17,9,17,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID336(GL2 gl){
double[] positionsArray = {
706.1475225,538.9609707,325.573125,705.7533868,539.0304675,325.573125,694.759454,570.2494318,325.573125,694.759454,570.2494318,325.573125,705.7533868,539.0304675,325.573125,706.1475225,538.9609707,325.573125,705.7533868,539.0304675,325.573125,709.3417041,575.4706332,302.71125,705.7653764,538.9964214,325.573125,694.759454,570.2494318,325.573125,635.9282437,737.3097083,325.573125,635.9282437,737.3097083,325.573125,694.759454,570.2494318,325.573125,709.3417041,575.4706332,302.71125,705.7533868,539.0304675,325.573125,705.7653764,538.9964214,325.573125,660.1523689,710.6172209,348.435,694.759454,570.2494318,325.573125,706.1475225,538.9609707,325.573125,634.2375252,736.5320646,325.573125,634.2375252,736.5320646,325.573125,660.1523689,710.6172209,348.435,694.759454,570.2494318,325.573125,706.1475225,538.9609707,325.573125,606.1288136,758.6440049,302.71125,709.3417041,575.4706332,302.71125,635.9282437,737.3097083,325.573125,635.9282437,737.3097083,325.573125,709.3417041,575.4706332,302.71125,606.1288136,758.6440049,302.71125,660.1523689,710.6172209,348.435,706.1475225,538.9609707,325.573125,696.6620314,503.5606359,348.435,696.6620314,503.5606359,348.435,706.1475225,538.9609707,325.573125,660.1523689,710.6172209,348.435,606.1288136,758.6440049,302.71125,706.530019,612.0117426,279.849375,709.3417041,575.4706332,302.71125,709.3417041,575.4706332,302.71125,706.530019,612.0117426,279.849375,606.1288136,758.6440049,302.71125,660.1523689,710.6172209,348.435,696.6620314,503.5606359,348.435,681.1734425,680.5960165,371.296875,681.1734425,680.5960165,371.296875,696.6620314,503.5606359,348.435,660.1523689,710.6172209,348.435,573.077442,774.4795688,279.849375,706.530019,612.0117426,279.849375,606.1288136,758.6440049,302.71125,606.1288136,758.6440049,302.71125,706.530019,612.0117426,279.849375,573.077442,774.4795688,279.849375,681.1734425,680.5960165,371.296875,696.6620314,503.5606359,348.435,681.1734425,470.3452499,371.296875,681.1734425,470.3452499,371.296875,696.6620314,503.5606359,348.435,681.1734425,680.5960165,371.296875,573.077442,774.4795688,279.849375,697.4157526,647.5094665,256.9875,706.530019,612.0117426,279.849375,706.530019,612.0117426,279.849375,697.4157526,647.5094665,256.9875,573.077442,774.4795688,279.849375,681.1734425,680.5960165,371.296875,681.1734425,470.3452499,371.296875,696.6620314,647.3806305,394.15875,696.6620314,647.3806305,394.15875,681.1734425,470.3452499,371.296875,681.1734425,680.5960165,371.296875,573.077442,774.4795688,279.849375,537.7783782,784.3352445,256.9875,697.4157526,647.5094665,256.9875,697.4157526,647.5094665,256.9875,537.7783782,784.3352445,256.9875,573.077442,774.4795688,279.849375,696.6620314,647.3806305,394.15875,681.1734425,470.3452499,371.296875,660.1523689,440.3240455,394.15875,660.1523689,440.3240455,394.15875,681.1734425,470.3452499,371.296875,696.6620314,647.3806305,394.15875,537.7783782,784.3352445,256.9875,682.2758373,680.8852244,234.125625,697.4157526,647.5094665,256.9875,697.4157526,647.5094665,256.9875,682.2758373,680.8852244,234.125625,537.7783782,784.3352445,256.9875,696.6620314,647.3806305,394.15875,660.1523689,440.3240455,394.15875,706.1475225,611.9802957,417.020625,706.1475225,611.9802957,417.020625,660.1523689,440.3240455,394.15875,696.6620314,647.3806305,394.15875,537.7783782,784.3352445,256.9875,501.3041663,787.9115723,234.125625,682.2758373,680.8852244,234.125625,682.2758373,680.8852244,234.125625,501.3041663,787.9115723,234.125625,537.7783782,784.3352445,256.9875,706.1475225,611.9802957,417.020625,660.1523689,440.3240455,394.15875,634.2375252,414.4092018,417.020625,634.2375252,414.4092018,417.020625,660.1523689,440.3240455,394.15875,706.1475225,611.9802957,417.020625,501.3041663,787.9115723,234.125625,661.5702919,711.1249108,211.26375,682.2758373,680.8852244,234.125625,682.2758373,680.8852244,234.125625,661.5702919,711.1249108,211.26375,501.3041663,787.9115723,234.125625,706.1475225,611.9802957,417.020625,634.2375252,414.4092018,417.020625,709.3417041,575.4706332,439.8825,709.3417041,575.4706332,439.8825,634.2375252,414.4092018,417.020625,706.1475225,611.9802957,417.020625,501.3041663,787.9115723,234.125625,464.7630569,785.0998871,211.26375,661.5702919,711.1249108,211.26375,661.5702919,711.1249108,211.26375,464.7630569,785.0998871,211.26375,501.3041663,787.9115723,234.125625,709.3417041,575.4706332,439.8825,634.2375252,414.4092018,417.020625,604.2163208,393.3881282,439.8825,604.2163208,393.3881282,439.8825,634.2375252,414.4092018,417.020625,709.3417041,575.4706332,439.8825,464.7630569,785.0998871,211.26375,635.9282437,737.3097083,188.401875,661.5702919,711.1249108,211.26375,661.5702919,711.1249108,211.26375,635.9282437,737.3097083,188.401875,464.7630569,785.0998871,211.26375,709.3417041,575.4706332,439.8825,604.2163208,393.3881282,439.8825,706.1475225,538.9609707,462.744375,706.1475225,538.9609707,462.744375,604.2163208,393.3881282,439.8825,709.3417041,575.4706332,439.8825,464.7630569,785.0998871,211.26375,429.2653331,775.9856208,188.401875,635.9282437,737.3097083,188.401875,635.9282437,737.3097083,188.401875,429.2653331,775.9856208,188.401875,464.7630569,785.0998871,211.26375,706.1475225,538.9609707,462.744375,604.2163208,393.3881282,439.8825,571.0009348,377.8995393,462.744375,571.0009348,377.8995393,462.744375,604.2163208,393.3881282,439.8825,706.1475225,538.9609707,462.744375,429.2653331,775.9856208,188.401875,606.1288136,758.6440049,165.54,635.9282437,737.3097083,188.401875,635.9282437,737.3097083,188.401875,606.1288136,758.6440049,165.54,429.2653331,775.9856208,188.401875,706.1475225,538.9609707,462.744375,571.0009348,377.8995393,462.744375,696.6620314,503.5606359,485.60625,696.6620314,503.5606359,485.60625,571.0009348,377.8995393,462.744375,706.1475225,538.9609707,462.744375,429.2653331,775.9856208,188.401875,395.8895752,760.8457055,165.54,606.1288136,758.6440049,165.54,606.1288136,758.6440049,165.54,395.8895752,760.8457055,165.54,429.2653331,775.9856208,188.401875,696.6620314,503.5606359,485.60625,571.0009348,377.8995393,462.744375,535.6006,368.4140482,485.60625,535.6006,368.4140482,485.60625,571.0009348,377.8995393,462.744375,696.6620314,503.5606359,485.60625,681.1734425,470.3452499,508.468125,696.6620314,503.5606359,485.60625,535.6006,368.4140482,485.60625,535.6006,368.4140482,485.60625,696.6620314,503.5606359,485.60625,681.1734425,470.3452499,508.468125,681.1734425,470.3452499,508.468125,535.6006,368.4140482,485.60625,499.0909375,365.2198666,508.468125,499.0909375,365.2198666,508.468125,535.6006,368.4140482,485.60625,681.1734425,470.3452499,508.468125,660.1523689,440.3240455,531.33,681.1734425,470.3452499,508.468125,499.0909375,365.2198666,508.468125,499.0909375,365.2198666,508.468125,681.1734425,470.3452499,508.468125,660.1523689,440.3240455,531.33,660.1523689,440.3240455,531.33,499.0909375,365.2198666,508.468125,462.581275,368.4140482,531.33,462.581275,368.4140482,531.33,499.0909375,365.2198666,508.468125,660.1523689,440.3240455,531.33,634.2375252,414.4092018,554.191875,660.1523689,440.3240455,531.33,462.581275,368.4140482,531.33,462.581275,368.4140482,531.33,660.1523689,440.3240455,531.33,634.2375252,414.4092018,554.191875,634.2375252,414.4092018,554.191875,462.581275,368.4140482,531.33,427.1809402,377.8995393,554.191875,427.1809402,377.8995393,554.191875,462.581275,368.4140482,531.33,634.2375252,414.4092018,554.191875,427.1809402,377.8995393,554.191875,619.2267846,403.8984939,565.6228677,634.2375252,414.4092018,554.191875,604.2163208,393.3881282,577.05375,604.2163208,393.3881282,577.05375,427.1809402,377.8995393,554.191875,619.2267846,403.8984939,565.6228677,634.2375252,414.4092018,554.191875,604.2163208,393.3881282,577.05375,427.1809402,377.8995393,554.191875,393.9655542,393.3881282,577.05375,393.9655542,393.3881282,577.05375,427.1809402,377.8995393,554.191875,604.2163208,393.3881282,577.05375,571.0009348,377.8995393,599.915625,604.2163208,393.3881282,577.05375,393.9655542,393.3881282,577.05375,393.9655542,393.3881282,577.05375,604.2163208,393.3881282,577.05375,571.0009348,377.8995393,599.915625,571.0009348,377.8995393,599.915625,393.9655542,393.3881282,577.05375,363.9443498,414.4092018,599.915625,363.9443498,414.4092018,599.915625,393.9655542,393.3881282,577.05375,571.0009348,377.8995393,599.915625,535.6006,368.4140482,622.7775,571.0009348,377.8995393,599.915625,363.9443498,414.4092018,599.915625,363.9443498,414.4092018,599.915625,571.0009348,377.8995393,599.915625,535.6006,368.4140482,622.7775,535.6006,368.4140482,622.7775,363.9443498,414.4092018,599.915625,338.0295061,440.3240455,622.7775,338.0295061,440.3240455,622.7775,363.9443498,414.4092018,599.915625,535.6006,368.4140482,622.7775,499.0909375,365.2198666,645.639375,535.6006,368.4140482,622.7775,338.0295061,440.3240455,622.7775,338.0295061,440.3240455,622.7775,535.6006,368.4140482,622.7775,499.0909375,365.2198666,645.639375,499.0909375,365.2198666,645.639375,338.0295061,440.3240455,622.7775,317.0084325,470.3452499,645.639375,317.0084325,470.3452499,645.639375,338.0295061,440.3240455,622.7775,499.0909375,365.2198666,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.7808877,-0.274994,-0.5608857,-0.7808877,-0.274994,-0.5608857,-0.7808877,-0.274994,-0.5608857,-0.7808877,-0.274994,-0.5608857,-0.7808877,-0.274994,-0.5608857,0.7808877,0.274994,0.5608857,0.7808877,0.274994,0.5608857,0.7808877,0.274994,0.5608857,0.7808877,0.274994,0.5608857,0.7808877,0.274994,0.5608857,-0.7779652,-0.2831562,0.5608857,-0.7779652,-0.2831562,0.5608857,-0.7779652,-0.2831562,0.5608857,-0.7779652,-0.2831562,0.5608857,0.7779652,0.2831562,-0.5608857,0.7779652,0.2831562,-0.5608857,0.7779652,0.2831562,-0.5608857,0.7779652,0.2831562,-0.5608857,-0.721272,-0.4064159,0.5608857,-0.721272,-0.4064159,0.5608857,-0.721272,-0.4064159,0.5608857,0.721272,0.4064159,-0.5608857,0.721272,0.4064159,-0.5608857,0.721272,0.4064159,-0.5608857,-0.8153157,-0.1437622,-0.5608857,-0.8153157,-0.1437622,-0.5608857,-0.8153157,-0.1437622,-0.5608857,0.8153157,0.1437622,0.5608857,0.8153157,0.1437622,0.5608857,0.8153157,0.1437622,0.5608857,-0.721272,-0.4064159,-0.5608857,-0.721272,-0.4064159,-0.5608857,-0.721272,-0.4064159,-0.5608857,0.721272,0.4064159,0.5608857,0.721272,0.4064159,0.5608857,0.721272,0.4064159,0.5608857,-0.8153157,-0.1437622,0.5608857,-0.8153157,-0.1437622,0.5608857,-0.8153157,-0.1437622,0.5608857,0.8153157,0.1437622,-0.5608857,0.8153157,0.1437622,-0.5608857,0.8153157,0.1437622,-0.5608857,-0.6397409,-0.5254891,0.5608857,-0.6397409,-0.5254891,0.5608857,-0.6397409,-0.5254891,0.5608857,0.6397409,0.5254891,-0.5608857,0.6397409,0.5254891,-0.5608857,0.6397409,0.5254891,-0.5608857,-0.8278933,0.0,-0.5608857,-0.8278933,0.0,-0.5608857,-0.8278933,0.0,-0.5608857,0.8278933,-0.0,0.5608857,0.8278933,-0.0,0.5608857,0.8278933,-0.0,0.5608857,-0.6397409,-0.5254891,-0.5608857,-0.6397409,-0.5254891,-0.5608857,-0.6397409,-0.5254891,-0.5608857,0.6397409,0.5254891,0.5608857,0.6397409,0.5254891,0.5608857,0.6397409,0.5254891,0.5608857,-0.8278933,0.0,0.5608857,-0.8278933,0.0,0.5608857,-0.8278933,0.0,0.5608857,0.8278933,-0.0,-0.5608857,0.8278933,-0.0,-0.5608857,0.8278933,-0.0,-0.5608857,-0.5387716,-0.6285956,0.5608857,-0.5387716,-0.6285956,0.5608857,-0.5387716,-0.6285956,0.5608857,0.5387716,0.6285956,-0.5608857,0.5387716,0.6285956,-0.5608857,0.5387716,0.6285956,-0.5608857,-0.8153157,0.1437622,-0.5608857,-0.8153157,0.1437622,-0.5608857,-0.8153157,0.1437622,-0.5608857,0.8153157,-0.1437622,0.5608857,0.8153157,-0.1437622,0.5608857,0.8153157,-0.1437622,0.5608857,-0.5387716,-0.6285956,-0.5608857,-0.5387716,-0.6285956,-0.5608857,-0.5387716,-0.6285956,-0.5608857,0.5387716,0.6285956,0.5608857,0.5387716,0.6285956,0.5608857,0.5387716,0.6285956,0.5608857,-0.8153157,0.1437622,0.5608857,-0.8153157,0.1437622,0.5608857,-0.8153157,0.1437622,0.5608857,0.8153157,-0.1437622,-0.5608857,0.8153157,-0.1437622,-0.5608857,0.8153157,-0.1437622,-0.5608857,-0.421432,-0.7126025,0.5608857,-0.421432,-0.7126025,0.5608857,-0.421432,-0.7126025,0.5608857,0.421432,0.7126025,-0.5608857,0.421432,0.7126025,-0.5608857,0.421432,0.7126025,-0.5608857,-0.7779652,0.2831562,-0.5608857,-0.7779652,0.2831562,-0.5608857,-0.7779652,0.2831562,-0.5608857,0.7779652,-0.2831562,0.5608857,0.7779652,-0.2831562,0.5608857,0.7779652,-0.2831562,0.5608857,-0.421432,-0.7126025,-0.5608857,-0.421432,-0.7126025,-0.5608857,-0.421432,-0.7126025,-0.5608857,0.421432,0.7126025,0.5608857,0.421432,0.7126025,0.5608857,0.421432,0.7126025,0.5608857,-0.7779652,0.2831562,0.5608857,-0.7779652,0.2831562,0.5608857,-0.7779652,0.2831562,0.5608857,0.7779652,-0.2831562,-0.5608857,0.7779652,-0.2831562,-0.5608857,0.7779652,-0.2831562,-0.5608857,-0.2912873,-0.7749574,0.5608857,-0.2912873,-0.7749574,0.5608857,-0.2912873,-0.7749574,0.5608857,0.2912873,0.7749574,-0.5608857,0.2912873,0.7749574,-0.5608857,0.2912873,0.7749574,-0.5608857,-0.7169766,0.4139466,-0.5608857,-0.7169766,0.4139466,-0.5608857,-0.7169766,0.4139466,-0.5608857,0.7169766,-0.4139466,0.5608857,0.7169766,-0.4139466,0.5608857,0.7169766,-0.4139466,0.5608857,-0.2912873,-0.7749574,-0.5608857,-0.2912873,-0.7749574,-0.5608857,-0.2912873,-0.7749574,-0.5608857,0.2912873,0.7749574,0.5608857,0.2912873,0.7749574,0.5608857,0.2912873,0.7749574,0.5608857,-0.7169766,0.4139466,0.5608857,-0.7169766,0.4139466,0.5608857,-0.7169766,0.4139466,0.5608857,0.7169766,-0.4139466,-0.5608857,0.7169766,-0.4139466,-0.5608857,0.7169766,-0.4139466,-0.5608857,-0.1522921,-0.8137656,0.5608857,-0.1522921,-0.8137656,0.5608857,-0.1522921,-0.8137656,0.5608857,0.1522921,0.8137656,-0.5608857,0.1522921,0.8137656,-0.5608857,0.1522921,0.8137656,-0.5608857,-0.634203,0.5321595,-0.5608857,-0.634203,0.5321595,-0.5608857,-0.634203,0.5321595,-0.5608857,0.634203,-0.5321595,0.5608857,0.634203,-0.5321595,0.5608857,0.634203,-0.5321595,0.5608857,-0.1522921,-0.8137656,-0.5608857,-0.1522921,-0.8137656,-0.5608857,-0.1522921,-0.8137656,-0.5608857,0.1522921,0.8137656,0.5608857,0.1522921,0.8137656,0.5608857,0.1522921,0.8137656,0.5608857,-0.634203,0.5321595,0.5608857,-0.634203,0.5321595,0.5608857,-0.634203,0.5321595,0.5608857,0.634203,-0.5321595,-0.5608857,0.634203,-0.5321595,-0.5608857,0.634203,-0.5321595,-0.5608857,-0.0086695,-0.8278479,0.5608857,-0.0086695,-0.8278479,0.5608857,-0.0086695,-0.8278479,0.5608857,0.0086695,0.8278479,-0.5608857,0.0086695,0.8278479,-0.5608857,0.0086695,0.8278479,-0.5608857,-0.5321595,0.634203,-0.5608857,-0.5321595,0.634203,-0.5608857,-0.5321595,0.634203,-0.5608857,0.5321595,-0.634203,0.5608857,0.5321595,-0.634203,0.5608857,0.5321595,-0.634203,0.5608857,-0.5321595,0.634203,0.5608857,-0.5321595,0.634203,0.5608857,-0.5321595,0.634203,0.5608857,0.5321595,-0.634203,-0.5608857,0.5321595,-0.634203,-0.5608857,0.5321595,-0.634203,-0.5608857,-0.4139466,0.7169766,-0.5608857,-0.4139466,0.7169766,-0.5608857,-0.4139466,0.7169766,-0.5608857,0.4139466,-0.7169766,0.5608857,0.4139466,-0.7169766,0.5608857,0.4139466,-0.7169766,0.5608857,-0.4139466,0.7169766,0.5608857,-0.4139466,0.7169766,0.5608857,-0.4139466,0.7169766,0.5608857,0.4139466,-0.7169766,-0.5608857,0.4139466,-0.7169766,-0.5608857,0.4139466,-0.7169766,-0.5608857,-0.2831562,0.7779652,-0.5608857,-0.2831562,0.7779652,-0.5608857,-0.2831562,0.7779652,-0.5608857,0.2831562,-0.7779652,0.5608857,0.2831562,-0.7779652,0.5608857,0.2831562,-0.7779652,0.5608857,-0.2831562,0.7779652,0.5608857,-0.2831562,0.7779652,0.5608857,-0.2831562,0.7779652,0.5608857,0.2831562,-0.7779652,-0.5608857,0.2831562,-0.7779652,-0.5608857,0.2831562,-0.7779652,-0.5608857,-0.1437622,0.8153157,-0.5608857,-0.1437622,0.8153157,-0.5608857,-0.1437622,0.8153157,-0.5608857,0.1437622,-0.8153157,0.5608857,0.1437622,-0.8153157,0.5608857,0.1437622,-0.8153157,0.5608857,-0.143762,0.8153156,0.5608858,-0.143762,0.8153156,0.5608858,-0.143762,0.8153156,0.5608858,-0.143762,0.8153156,0.5608858,0.143762,-0.8153156,-0.5608858,0.143762,-0.8153156,-0.5608858,0.143762,-0.8153156,-0.5608858,0.143762,-0.8153156,-0.5608858,0.0,0.8278933,-0.5608857,0.0,0.8278933,-0.5608857,0.0,0.8278933,-0.5608857,-0.0,-0.8278933,0.5608857,-0.0,-0.8278933,0.5608857,-0.0,-0.8278933,0.5608857,0.0,0.8278933,0.5608857,0.0,0.8278933,0.5608857,0.0,0.8278933,0.5608857,-0.0,-0.8278933,-0.5608857,-0.0,-0.8278933,-0.5608857,-0.0,-0.8278933,-0.5608857,0.1437622,0.8153157,-0.5608857,0.1437622,0.8153157,-0.5608857,0.1437622,0.8153157,-0.5608857,-0.1437622,-0.8153157,0.5608857,-0.1437622,-0.8153157,0.5608857,-0.1437622,-0.8153157,0.5608857,0.1437622,0.8153157,0.5608857,0.1437622,0.8153157,0.5608857,0.1437622,0.8153157,0.5608857,-0.1437622,-0.8153157,-0.5608857,-0.1437622,-0.8153157,-0.5608857,-0.1437622,-0.8153157,-0.5608857,0.2831562,0.7779652,-0.5608857,0.2831562,0.7779652,-0.5608857,0.2831562,0.7779652,-0.5608857,-0.2831562,-0.7779652,0.5608857,-0.2831562,-0.7779652,0.5608857,-0.2831562,-0.7779652,0.5608857,0.2831562,0.7779652,0.5608857,0.2831562,0.7779652,0.5608857,0.2831562,0.7779652,0.5608857,-0.2831562,-0.7779652,-0.5608857,-0.2831562,-0.7779652,-0.5608857,-0.2831562,-0.7779652,-0.5608857,0.4139466,0.7169766,-0.5608857,0.4139466,0.7169766,-0.5608857,0.4139466,0.7169766,-0.5608857,-0.4139466,-0.7169766,0.5608857,-0.4139466,-0.7169766,0.5608857,-0.4139466,-0.7169766,0.5608857,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,3,4,5,6,7,8,7,6,9,7,9,10,11,12,13,12,14,13,15,13,14,16,17,18,17,16,19,20,21,22,23,22,21,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201,202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,217,216,219,220,221,222,223,222,221,224,225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246,247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 282, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID342(GL2 gl){
double[] positionsArray = {
604.2163208,757.5531383,577.05375,709.3417041,575.4706332,577.05375,634.2375252,736.5320646,599.915625,634.2375252,736.5320646,599.915625,709.3417041,575.4706332,577.05375,604.2163208,757.5531383,577.05375,634.2375252,736.5320646,599.915625,709.3417041,575.4706332,577.05375,706.1475225,538.9609707,599.915625,706.1475225,538.9609707,599.915625,709.3417041,575.4706332,577.05375,634.2375252,736.5320646,599.915625,604.2163208,757.5531383,577.05375,706.1475225,611.9802957,554.191875,709.3417041,575.4706332,577.05375,709.3417041,575.4706332,577.05375,706.1475225,611.9802957,554.191875,604.2163208,757.5531383,577.05375,634.2375252,736.5320646,599.915625,706.1475225,538.9609707,599.915625,660.1523689,710.6172209,622.7775,660.1523689,710.6172209,622.7775,706.1475225,538.9609707,599.915625,634.2375252,736.5320646,599.915625,604.2163208,757.5531383,577.05375,571.0009348,773.0417271,554.191875,706.1475225,611.9802957,554.191875,587.6088452,765.2973984,565.6228677,587.6088452,765.2973984,565.6228677,604.2163208,757.5531383,577.05375,571.0009348,773.0417271,554.191875,706.1475225,611.9802957,554.191875,660.1523689,710.6172209,622.7775,706.1475225,538.9609707,599.915625,696.6620314,503.5606359,622.7775,696.6620314,503.5606359,622.7775,706.1475225,538.9609707,599.915625,660.1523689,710.6172209,622.7775,571.0009348,773.0417271,554.191875,696.6620314,647.3806305,531.33,706.1475225,611.9802957,554.191875,706.1475225,611.9802957,554.191875,696.6620314,647.3806305,531.33,571.0009348,773.0417271,554.191875,660.1523689,710.6172209,622.7775,696.6620314,503.5606359,622.7775,681.1734425,680.5960165,645.639375,681.1734425,680.5960165,645.639375,696.6620314,503.5606359,622.7775,660.1523689,710.6172209,622.7775,571.0009348,773.0417271,554.191875,535.6006,782.5272182,531.33,696.6620314,647.3806305,531.33,696.6620314,647.3806305,531.33,535.6006,782.5272182,531.33,571.0009348,773.0417271,554.191875,681.1734425,680.5960165,645.639375,696.6620314,503.5606359,622.7775,681.1734425,470.3452499,645.639375,681.1734425,470.3452499,645.639375,696.6620314,503.5606359,622.7775,681.1734425,680.5960165,645.639375,535.6006,782.5272182,531.33,681.1734425,680.5960165,508.468125,696.6620314,647.3806305,531.33,696.6620314,647.3806305,531.33,681.1734425,680.5960165,508.468125,535.6006,782.5272182,531.33,535.6006,782.5272182,531.33,499.0909375,785.7213998,508.468125,681.1734425,680.5960165,508.468125,681.1734425,680.5960165,508.468125,499.0909375,785.7213998,508.468125,535.6006,782.5272182,531.33,499.0909375,785.7213998,508.468125,660.1523689,710.6172209,485.60625,681.1734425,680.5960165,508.468125,681.1734425,680.5960165,508.468125,660.1523689,710.6172209,485.60625,499.0909375,785.7213998,508.468125,499.0909375,785.7213998,508.468125,462.581275,782.5272182,485.60625,660.1523689,710.6172209,485.60625,660.1523689,710.6172209,485.60625,462.581275,782.5272182,485.60625,499.0909375,785.7213998,508.468125,462.581275,782.5272182,485.60625,634.2375252,736.5320646,462.744375,660.1523689,710.6172209,485.60625,660.1523689,710.6172209,485.60625,634.2375252,736.5320646,462.744375,462.581275,782.5272182,485.60625,462.581275,782.5272182,485.60625,427.1809402,773.0417271,462.744375,634.2375252,736.5320646,462.744375,634.2375252,736.5320646,462.744375,427.1809402,773.0417271,462.744375,462.581275,782.5272182,485.60625,427.1809402,773.0417271,462.744375,604.2163208,757.5531383,439.8825,634.2375252,736.5320646,462.744375,634.2375252,736.5320646,462.744375,604.2163208,757.5531383,439.8825,427.1809402,773.0417271,462.744375,427.1809402,773.0417271,462.744375,393.9655542,757.5531383,439.8825,604.2163208,757.5531383,439.8825,604.2163208,757.5531383,439.8825,393.9655542,757.5531383,439.8825,427.1809402,773.0417271,462.744375,393.9655542,757.5531383,439.8825,571.0009348,773.0417271,417.020625,604.2163208,757.5531383,439.8825,604.2163208,757.5531383,439.8825,571.0009348,773.0417271,417.020625,393.9655542,757.5531383,439.8825,393.9655542,757.5531383,439.8825,363.9443498,736.5320646,417.020625,571.0009348,773.0417271,417.020625,571.0009348,773.0417271,417.020625,363.9443498,736.5320646,417.020625,393.9655542,757.5531383,439.8825,363.9443498,736.5320646,417.020625,535.6006,782.5272182,394.15875,571.0009348,773.0417271,417.020625,571.0009348,773.0417271,417.020625,535.6006,782.5272182,394.15875,363.9443498,736.5320646,417.020625,363.9443498,736.5320646,417.020625,338.0295061,710.6172209,394.15875,535.6006,782.5272182,394.15875,535.6006,782.5272182,394.15875,338.0295061,710.6172209,394.15875,363.9443498,736.5320646,417.020625,338.0295061,710.6172209,394.15875,499.0909375,785.7213998,371.296875,535.6006,782.5272182,394.15875,535.6006,782.5272182,394.15875,499.0909375,785.7213998,371.296875,338.0295061,710.6172209,394.15875,338.0295061,710.6172209,394.15875,317.0084325,680.5960165,371.296875,499.0909375,785.7213998,371.296875,499.0909375,785.7213998,371.296875,317.0084325,680.5960165,371.296875,338.0295061,710.6172209,394.15875,317.0084325,680.5960165,371.296875,462.581275,782.5272182,348.435,499.0909375,785.7213998,371.296875,499.0909375,785.7213998,371.296875,462.581275,782.5272182,348.435,317.0084325,680.5960165,371.296875,317.0084325,680.5960165,371.296875,301.5198436,647.3806305,348.435,462.581275,782.5272182,348.435,462.581275,782.5272182,348.435,301.5198436,647.3806305,348.435,317.0084325,680.5960165,371.296875,301.5198436,647.3806305,348.435,427.1809402,773.0417271,325.573125,462.581275,782.5272182,348.435,462.581275,782.5272182,348.435,427.1809402,773.0417271,325.573125,301.5198436,647.3806305,348.435,427.1809402,773.0417271,325.573125,301.5198436,647.3806305,348.435,292.0343525,611.9802957,325.573125,292.0343525,611.9802957,325.573125,301.5198436,647.3806305,348.435,427.1809402,773.0417271,325.573125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.7169766,-0.4139466,0.5608857,-0.7169766,-0.4139466,0.5608857,-0.7169766,-0.4139466,0.5608857,0.7169766,0.4139466,-0.5608857,0.7169766,0.4139466,-0.5608857,0.7169766,0.4139466,-0.5608857,-0.7779652,-0.2831562,-0.5608857,-0.7779652,-0.2831562,-0.5608857,-0.7779652,-0.2831562,-0.5608857,0.7779652,0.2831562,0.5608857,0.7779652,0.2831562,0.5608857,0.7779652,0.2831562,0.5608857,-0.7169766,-0.4139466,-0.5608857,-0.7169766,-0.4139466,-0.5608857,-0.7169766,-0.4139466,-0.5608857,0.7169766,0.4139466,0.5608857,0.7169766,0.4139466,0.5608857,0.7169766,0.4139466,0.5608857,-0.7779652,-0.2831562,0.5608857,-0.7779652,-0.2831562,0.5608857,-0.7779652,-0.2831562,0.5608857,0.7779652,0.2831562,-0.5608857,0.7779652,0.2831562,-0.5608857,0.7779652,0.2831562,-0.5608857,-0.6342031,-0.5321594,0.5608858,-0.6342031,-0.5321594,0.5608858,-0.6342031,-0.5321594,0.5608858,-0.6342031,-0.5321594,0.5608858,0.6342031,0.5321594,-0.5608858,0.6342031,0.5321594,-0.5608858,0.6342031,0.5321594,-0.5608858,0.6342031,0.5321594,-0.5608858,-0.8153157,-0.1437622,-0.5608857,-0.8153157,-0.1437622,-0.5608857,-0.8153157,-0.1437622,-0.5608857,0.8153157,0.1437622,0.5608857,0.8153157,0.1437622,0.5608857,0.8153157,0.1437622,0.5608857,-0.634203,-0.5321595,-0.5608857,-0.634203,-0.5321595,-0.5608857,-0.634203,-0.5321595,-0.5608857,0.634203,0.5321595,0.5608857,0.634203,0.5321595,0.5608857,0.634203,0.5321595,0.5608857,-0.8153157,-0.1437622,0.5608857,-0.8153157,-0.1437622,0.5608857,-0.8153157,-0.1437622,0.5608857,0.8153157,0.1437622,-0.5608857,0.8153157,0.1437622,-0.5608857,0.8153157,0.1437622,-0.5608857,-0.5321595,-0.634203,0.5608857,-0.5321595,-0.634203,0.5608857,-0.5321595,-0.634203,0.5608857,0.5321595,0.634203,-0.5608857,0.5321595,0.634203,-0.5608857,0.5321595,0.634203,-0.5608857,-0.8278933,0.0,-0.5608857,-0.8278933,0.0,-0.5608857,-0.8278933,0.0,-0.5608857,0.8278933,-0.0,0.5608857,0.8278933,-0.0,0.5608857,0.8278933,-0.0,0.5608857,-0.5321595,-0.634203,-0.5608857,-0.5321595,-0.634203,-0.5608857,-0.5321595,-0.634203,-0.5608857,0.5321595,0.634203,0.5608857,0.5321595,0.634203,0.5608857,0.5321595,0.634203,0.5608857,-0.4139466,-0.7169766,0.5608857,-0.4139466,-0.7169766,0.5608857,-0.4139466,-0.7169766,0.5608857,0.4139466,0.7169766,-0.5608857,0.4139466,0.7169766,-0.5608857,0.4139466,0.7169766,-0.5608857,-0.4139466,-0.7169766,-0.5608857,-0.4139466,-0.7169766,-0.5608857,-0.4139466,-0.7169766,-0.5608857,0.4139466,0.7169766,0.5608857,0.4139466,0.7169766,0.5608857,0.4139466,0.7169766,0.5608857,-0.2831562,-0.7779652,0.5608857,-0.2831562,-0.7779652,0.5608857,-0.2831562,-0.7779652,0.5608857,0.2831562,0.7779652,-0.5608857,0.2831562,0.7779652,-0.5608857,0.2831562,0.7779652,-0.5608857,-0.2831562,-0.7779652,-0.5608857,-0.2831562,-0.7779652,-0.5608857,-0.2831562,-0.7779652,-0.5608857,0.2831562,0.7779652,0.5608857,0.2831562,0.7779652,0.5608857,0.2831562,0.7779652,0.5608857,-0.1437622,-0.8153157,0.5608857,-0.1437622,-0.8153157,0.5608857,-0.1437622,-0.8153157,0.5608857,0.1437622,0.8153157,-0.5608857,0.1437622,0.8153157,-0.5608857,0.1437622,0.8153157,-0.5608857,-0.1437622,-0.8153157,-0.5608857,-0.1437622,-0.8153157,-0.5608857,-0.1437622,-0.8153157,-0.5608857,0.1437622,0.8153157,0.5608857,0.1437622,0.8153157,0.5608857,0.1437622,0.8153157,0.5608857,-0.0,-0.8278933,0.5608857,-0.0,-0.8278933,0.5608857,-0.0,-0.8278933,0.5608857,0.0,0.8278933,-0.5608857,0.0,0.8278933,-0.5608857,0.0,0.8278933,-0.5608857,-0.0,-0.8278933,-0.5608857,-0.0,-0.8278933,-0.5608857,-0.0,-0.8278933,-0.5608857,0.0,0.8278933,0.5608857,0.0,0.8278933,0.5608857,0.0,0.8278933,0.5608857,0.1437622,-0.8153157,0.5608857,0.1437622,-0.8153157,0.5608857,0.1437622,-0.8153157,0.5608857,-0.1437622,0.8153157,-0.5608857,-0.1437622,0.8153157,-0.5608857,-0.1437622,0.8153157,-0.5608857,0.1437622,-0.8153157,-0.5608857,0.1437622,-0.8153157,-0.5608857,0.1437622,-0.8153157,-0.5608857,-0.1437622,0.8153157,0.5608857,-0.1437622,0.8153157,0.5608857,-0.1437622,0.8153157,0.5608857,0.2831562,-0.7779652,0.5608857,0.2831562,-0.7779652,0.5608857,0.2831562,-0.7779652,0.5608857,-0.2831562,0.7779652,-0.5608857,-0.2831562,0.7779652,-0.5608857,-0.2831562,0.7779652,-0.5608857,0.2831562,-0.7779652,-0.5608857,0.2831562,-0.7779652,-0.5608857,0.2831562,-0.7779652,-0.5608857,-0.2831562,0.7779652,0.5608857,-0.2831562,0.7779652,0.5608857,-0.2831562,0.7779652,0.5608857,0.4139466,-0.7169766,0.5608857,0.4139466,-0.7169766,0.5608857,0.4139466,-0.7169766,0.5608857,-0.4139466,0.7169766,-0.5608857,-0.4139466,0.7169766,-0.5608857,-0.4139466,0.7169766,-0.5608857,0.4139466,-0.7169766,-0.5608857,0.4139466,-0.7169766,-0.5608857,0.4139466,-0.7169766,-0.5608857,-0.4139466,0.7169766,0.5608857,-0.4139466,0.7169766,0.5608857,-0.4139466,0.7169766,0.5608857,0.5321595,-0.634203,0.5608857,0.5321595,-0.634203,0.5608857,0.5321595,-0.634203,0.5608857,-0.5321595,0.634203,-0.5608857,-0.5321595,0.634203,-0.5608857,-0.5321595,0.634203,-0.5608857,0.5321595,-0.634203,-0.5608857,0.5321595,-0.634203,-0.5608857,0.5321595,-0.634203,-0.5608857,-0.5321595,0.634203,0.5608857,-0.5321595,0.634203,0.5608857,-0.5321595,0.634203,0.5608857,0.634203,-0.5321595,0.5608857,0.634203,-0.5321595,0.5608857,0.634203,-0.5321595,0.5608857,-0.634203,0.5321595,-0.5608857,-0.634203,0.5321595,-0.5608857,-0.634203,0.5321595,-0.5608857,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,25,24,27,28,29,30,31,30,29,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,164,165,166,167,168,169,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 174, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID348(GL2 gl){
double[] positionsArray = {
363.9443498,736.5320646,554.191875,461.7488488,585.4764157,554.191875,460.4315625,575.4706332,554.191875,465.6109367,594.8003207,554.191875,471.7546313,602.8069394,554.191875,474.430292,604.8600461,554.191875,461.3086366,568.8085942,554.191875,292.0343525,538.9609707,554.191875,460.4315625,575.4706332,554.191875,363.9443498,736.5320646,554.191875,461.3086366,568.8085942,554.191875,292.0343525,538.9609707,554.191875,474.430292,604.8600461,554.191875,471.7546313,602.8069394,554.191875,465.6109367,594.8003207,554.191875,461.7488488,585.4764157,554.191875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,0,6,7,6,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,11,10,9,12,9,13,13,9,14,14,9,15,8,15,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID354(GL2 gl){
double[] positionsArray = {
338.0295061,710.6172209,531.33,461.7488488,585.4764157,531.33,460.4315625,575.4706332,531.33,465.6109367,594.8003207,531.33,469.7015246,600.1312787,531.33,463.0394856,562.3489778,531.33,301.5198436,503.5606359,531.33,461.7488488,565.4648507,531.33,460.4315625,575.4706332,531.33,338.0295061,710.6172209,531.33,461.7488488,565.4648507,531.33,463.0394856,562.3489778,531.33,301.5198436,503.5606359,531.33,469.7015246,600.1312787,531.33,465.6109367,594.8003207,531.33,461.7488488,585.4764157,531.33,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,0,5,6,5,0,7,7,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,12,11,9,13,9,14,14,9,15,8,15,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID360(GL2 gl){
double[] positionsArray = {
499.0909375,536.8112582,234.125625,499.0909375,365.2198666,234.125625,499.0909375,368.6671942,234.125625,681.1734425,470.3452499,234.125625,509.09672,538.1285445,234.125625,518.420625,541.9906324,234.125625,526.4272437,548.134327,234.125625,532.5709383,556.1409457,234.125625,532.5709383,556.1409457,234.125625,526.4272437,548.134327,234.125625,681.1734425,470.3452499,234.125625,518.420625,541.9906324,234.125625,509.09672,538.1285445,234.125625,499.0909375,536.8112582,234.125625,499.0909375,365.2198666,234.125625,499.0909375,368.6671942,234.125625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,3,4,5,3,5,6,3,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,10,13,14,15,14,13,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID366(GL2 gl){
double[] positionsArray = {
463.0394856,562.3489778,394.15875,462.581275,368.4140482,394.15875,301.5198436,503.5606359,394.15875,465.6109367,556.1409457,394.15875,471.7546313,548.134327,394.15875,479.76125,541.9906324,394.15875,489.085155,538.1285445,394.15875,492.4288985,537.6883323,394.15875,492.4288985,537.6883323,394.15875,489.085155,538.1285445,394.15875,462.581275,368.4140482,394.15875,479.76125,541.9906324,394.15875,471.7546313,548.134327,394.15875,465.6109367,556.1409457,394.15875,463.0394856,562.3489778,394.15875,301.5198436,503.5606359,394.15875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID372(GL2 gl){
double[] positionsArray = {
318.081343,679.9765713,234.125625,461.7488488,585.4764157,234.125625,460.4315625,575.4706332,234.125625,465.6109367,594.8003207,234.125625,317.0084325,577.5249042,234.125625,465.6109367,556.1409457,234.125625,317.0084325,470.3452499,234.125625,461.7488488,565.4648507,234.125625,460.4315625,575.4706332,234.125625,318.081343,679.9765713,234.125625,461.7488488,565.4648507,234.125625,465.6109367,556.1409457,234.125625,317.0084325,577.5249042,234.125625,317.0084325,470.3452499,234.125625,465.6109367,594.8003207,234.125625,461.7488488,585.4764157,234.125625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,4,5,6,5,4,0,5,0,7,7,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,9,12,11,13,11,12,14,9,15,8,15,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID378(GL2 gl){
double[] positionsArray = {
526.4272437,548.134327,165.54,602.9527385,395.5767169,165.54,518.420625,541.9906324,165.54,532.5709383,556.1409457,165.54,536.4330262,565.4648507,165.54,537.7503125,575.4706332,165.54,709.3417041,575.4706332,165.54,709.3417041,575.4706332,165.54,537.7503125,575.4706332,165.54,602.9527385,395.5767169,165.54,536.4330262,565.4648507,165.54,532.5709383,556.1409457,165.54,526.4272437,548.134327,165.54,518.420625,541.9906324,165.54,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID384(GL2 gl){
double[] positionsArray = {
465.6109367,556.1409457,371.296875,499.0909375,365.2198666,371.296875,317.0084325,470.3452499,371.296875,471.7546313,548.134327,371.296875,479.76125,541.9906324,371.296875,489.085155,538.1285445,371.296875,499.0909375,536.8112582,371.296875,499.0909375,536.8112582,371.296875,489.085155,538.1285445,371.296875,499.0909375,365.2198666,371.296875,479.76125,541.9906324,371.296875,471.7546313,548.134327,371.296875,465.6109367,556.1409457,371.296875,317.0084325,470.3452499,371.296875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID390(GL2 gl){
double[] positionsArray = {
469.7015246,550.8099877,348.435,535.6006,368.4140482,348.435,338.0295061,440.3240455,348.435,471.7546313,548.134327,348.435,479.76125,541.9906324,348.435,489.085155,538.1285445,348.435,499.0909375,536.8112582,348.435,505.7529765,537.6883323,348.435,505.7529765,537.6883323,348.435,499.0909375,536.8112582,348.435,535.6006,368.4140482,348.435,489.085155,538.1285445,348.435,479.76125,541.9906324,348.435,471.7546313,548.134327,348.435,469.7015246,550.8099877,348.435,338.0295061,440.3240455,348.435,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID396(GL2 gl){
double[] positionsArray = {
461.3086366,582.1326723,462.744375,363.9443498,414.4092018,462.744375,292.0343525,611.9802957,462.744375,460.4315625,575.4706332,462.744375,471.7546313,548.134327,462.744375,474.430292,546.0812203,462.744375,465.6109367,556.1409457,462.744375,461.7488488,565.4648507,462.744375,460.4315625,575.4706332,462.744375,363.9443498,414.4092018,462.744375,461.7488488,565.4648507,462.744375,465.6109367,556.1409457,462.744375,471.7546313,548.134327,462.744375,474.430292,546.0812203,462.744375,461.3086366,582.1326723,462.744375,292.0343525,611.9802957,462.744375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,4,5,4,1,6,6,1,7,7,1,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,13,12,9,8,14,9,15,9,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID402(GL2 gl){
double[] positionsArray = {
366.3474731,417.2731326,325.573125,571.0009348,377.8995393,325.573125,363.9443498,414.4092018,325.573125,474.430292,546.0812203,325.573125,479.76125,541.9906324,325.573125,489.085155,538.1285445,325.573125,499.0909375,536.8112582,325.573125,509.09672,538.1285445,325.573125,512.2125929,539.4191813,325.573125,512.2125929,539.4191813,325.573125,509.09672,538.1285445,325.573125,571.0009348,377.8995393,325.573125,499.0909375,536.8112582,325.573125,489.085155,538.1285445,325.573125,479.76125,541.9906324,325.573125,474.430292,546.0812203,325.573125,366.3474731,417.2731326,325.573125,363.9443498,414.4092018,325.573125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID408(GL2 gl){
double[] positionsArray = {
395.8551978,396.661087,302.71125,604.2163208,393.3881282,302.71125,393.9655542,393.3881282,302.71125,479.76125,541.9906324,302.71125,489.085155,538.1285445,302.71125,499.0909375,536.8112582,302.71125,509.09672,538.1285445,302.71125,518.420625,541.9906324,302.71125,518.420625,541.9906324,302.71125,509.09672,538.1285445,302.71125,604.2163208,393.3881282,302.71125,499.0909375,536.8112582,302.71125,489.085155,538.1285445,302.71125,479.76125,541.9906324,302.71125,395.8551978,396.661087,302.71125,393.9655542,393.3881282,302.71125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID414(GL2 gl){
double[] positionsArray = {
463.0394856,588.5922886,485.60625,338.0295061,440.3240455,485.60625,301.5198436,647.3806305,485.60625,461.7488488,585.4764157,485.60625,460.4315625,575.4706332,485.60625,465.6109367,556.1409457,485.60625,469.7015246,550.8099877,485.60625,461.7488488,565.4648507,485.60625,460.4315625,575.4706332,485.60625,338.0295061,440.3240455,485.60625,461.7488488,565.4648507,485.60625,465.6109367,556.1409457,485.60625,469.7015246,550.8099877,485.60625,461.7488488,585.4764157,485.60625,463.0394856,588.5922886,485.60625,301.5198436,647.3806305,485.60625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,5,6,5,1,7,7,1,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,12,11,9,8,13,9,13,14,9,15,9,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID420(GL2 gl){
double[] positionsArray = {
463.2118621,371.9902853,256.9875,660.1523689,440.3240455,256.9875,462.581275,368.4140482,256.9875,492.4288985,537.6883323,256.9875,499.0909375,536.8112582,256.9875,509.09672,538.1285445,256.9875,518.420625,541.9906324,256.9875,526.4272437,548.134327,256.9875,528.4803504,550.8099877,256.9875,528.4803504,550.8099877,256.9875,526.4272437,548.134327,256.9875,660.1523689,440.3240455,256.9875,518.420625,541.9906324,256.9875,509.09672,538.1285445,256.9875,499.0909375,536.8112582,256.9875,492.4288985,537.6883323,256.9875,463.2118621,371.9902853,256.9875,462.581275,368.4140482,256.9875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID426(GL2 gl){
double[] positionsArray = {
318.1307947,684.6986818,234.125625,326.4683274,645.0505183,256.9875,300.7891788,507.8352012,256.9875,338.6425362,710.1028276,256.9875,339.4650913,714.4981119,256.9875,339.4650913,714.4981119,256.9875,318.1307947,684.6986818,234.125625,338.6425362,710.1028276,256.9875,326.4683274,645.0505183,256.9875,300.7891788,507.8352012,256.9875,326.4683274,645.0505183,256.9875,291.6749124,543.3329251,279.849375,300.7891788,507.8352012,256.9875,339.4650913,714.4981119,256.9875,338.6425362,710.1028276,256.9875,338.6425362,710.1028276,256.9875,326.4683274,645.0505183,256.9875,339.4650913,714.4981119,256.9875,291.6749124,543.3329251,279.849375,300.7891788,507.8352012,256.9875,338.6425362,710.1028276,256.9875,326.4683274,645.0505183,256.9875,338.0295061,710.6172209,256.9875,338.0295061,710.6172209,256.9875,326.4683274,645.0505183,256.9875,338.6425362,710.1028276,256.9875,317.0084325,577.5249042,234.125625,300.7891788,507.8352012,256.9875,315.929094,474.4594433,234.125625,318.1307947,684.6986818,234.125625,318.081343,679.9765713,234.125625,318.081343,679.9765713,234.125625,317.0084325,577.5249042,234.125625,318.1307947,684.6986818,234.125625,300.7891788,507.8352012,256.9875,315.929094,474.4594433,234.125625,339.4650913,714.4981119,256.9875,353.2639137,707.1878075,279.849375,291.6749124,543.3329251,279.849375,364.1856184,736.244532,279.849375,365.6498887,740.1401601,279.849375,365.6498887,740.1401601,279.849375,339.4650913,714.4981119,256.9875,364.1856184,736.244532,279.849375,353.2639137,707.1878075,279.849375,291.6749124,543.3329251,279.849375,302.2952307,651.6473102,211.26375,317.0084325,577.5249042,234.125625,315.929094,474.4594433,234.125625,318.081343,679.9765713,234.125625,318.1307947,684.6986818,234.125625,318.1307947,684.6986818,234.125625,302.2952307,651.6473102,211.26375,318.081343,679.9765713,234.125625,317.0084325,577.5249042,234.125625,315.929094,474.4594433,234.125625,318.081343,679.9765713,234.125625,317.0084325,577.5249042,234.125625,317.0084325,680.5960165,234.125625,317.0084325,680.5960165,234.125625,317.0084325,577.5249042,234.125625,318.081343,679.9765713,234.125625,353.2639137,707.1878075,279.849375,288.8632273,579.8740345,302.71125,291.6749124,543.3329251,279.849375,365.6498887,740.1401601,279.849375,364.1856184,736.244532,279.849375,364.1856184,736.244532,279.849375,353.2639137,707.1878075,279.849375,365.6498887,740.1401601,279.849375,288.8632273,579.8740345,302.71125,291.6749124,543.3329251,279.849375,364.1856184,736.244532,279.849375,353.2639137,707.1878075,279.849375,363.9443498,736.5320646,279.849375,363.9443498,736.5320646,279.849375,353.2639137,707.1878075,279.849375,364.1856184,736.244532,279.849375,325.760695,509.9039306,211.26375,315.929094,474.4594433,234.125625,336.6346395,444.2197569,211.26375,302.2952307,651.6473102,211.26375,303.0965811,646.806745,211.26375,303.0965811,646.806745,211.26375,325.760695,509.9039306,211.26375,302.2952307,651.6473102,211.26375,315.929094,474.4594433,234.125625,336.6346395,444.2197569,211.26375,395.8895752,760.8457055,302.71125,288.8632273,579.8740345,302.71125,365.6498887,740.1401601,279.849375,365.6498887,740.1401601,279.849375,288.8632273,579.8740345,302.71125,395.8895752,760.8457055,302.71125,292.439555,616.3482463,188.401875,325.760695,509.9039306,211.26375,336.6346395,444.2197569,211.26375,303.0965811,646.806745,211.26375,302.2952307,651.6473102,211.26375,302.2952307,651.6473102,211.26375,292.439555,616.3482463,188.401875,303.0965811,646.806745,211.26375,325.760695,509.9039306,211.26375,336.6346395,444.2197569,211.26375,325.760695,509.9039306,211.26375,301.5198436,647.3806305,211.26375,303.0965811,646.806745,211.26375,303.0965811,646.806745,211.26375,301.5198436,647.3806305,211.26375,325.760695,509.9039306,211.26375,395.8895752,760.8457055,302.71125,292.439555,616.3482463,325.573125,288.8632273,579.8740345,302.71125,288.8632273,579.8740345,302.71125,292.439555,616.3482463,325.573125,395.8895752,760.8457055,302.71125,351.9041238,447.4894508,188.401875,336.6346395,444.2197569,211.26375,362.2766876,418.0349594,188.401875,292.439555,616.3482463,188.401875,294.1064171,611.6149348,188.401875,294.1064171,611.6149348,188.401875,351.9041238,447.4894508,188.401875,292.439555,616.3482463,188.401875,336.6346395,444.2197569,211.26375,362.2766876,418.0349594,188.401875,429.2653331,775.9856208,325.573125,292.439555,616.3482463,325.573125,395.8895752,760.8457055,302.71125,395.8895752,760.8457055,302.71125,292.439555,616.3482463,325.573125,429.2653331,775.9856208,325.573125,288.8632273,579.8740345,165.54,351.9041238,447.4894508,188.401875,362.2766876,418.0349594,188.401875,294.1064171,611.6149348,188.401875,292.439555,616.3482463,188.401875,292.439555,616.3482463,188.401875,288.8632273,579.8740345,165.54,294.1064171,611.6149348,188.401875,351.9041238,447.4894508,188.401875,362.2766876,418.0349594,188.401875,351.9041238,447.4894508,188.401875,292.0343525,611.9802957,188.401875,294.1064171,611.6149348,188.401875,294.1064171,611.6149348,188.401875,292.0343525,611.9802957,188.401875,351.9041238,447.4894508,188.401875,291.3444164,575.4706332,165.54,362.2766876,418.0349594,188.401875,392.0761178,396.7006628,165.54,288.8632273,579.8740345,165.54,288.8632273,579.8740345,165.54,291.3444164,575.4706332,165.54,362.2766876,418.0349594,188.401875,392.0761178,396.7006628,165.54,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.8137656,-0.1522921,-0.5608857,0.8137656,-0.1522921,-0.5608857,0.8137656,-0.1522921,-0.5608857,0.8137656,-0.1522921,-0.5608857,0.8137656,-0.1522921,-0.5608857,-0.8137656,0.1522921,0.5608857,-0.8137656,0.1522921,0.5608857,-0.8137656,0.1522921,0.5608857,-0.8137656,0.1522921,0.5608857,-0.8137656,0.1522921,0.5608857,0.8137656,-0.1522921,0.5608857,0.8137656,-0.1522921,0.5608857,0.8137656,-0.1522921,0.5608857,0.8137656,-0.1522921,0.5608857,0.8137656,-0.1522921,0.5608857,-0.8137656,0.1522921,-0.5608857,-0.8137656,0.1522921,-0.5608857,-0.8137656,0.1522921,-0.5608857,-0.8137656,0.1522921,-0.5608857,-0.8137656,0.1522921,-0.5608857,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.8278479,-0.0086695,0.5608857,0.8278479,-0.0086695,0.5608857,0.8278479,-0.0086695,0.5608857,0.8278479,-0.0086695,0.5608857,0.8278479,-0.0086695,0.5608857,-0.8278479,0.0086695,-0.5608857,-0.8278479,0.0086695,-0.5608857,-0.8278479,0.0086695,-0.5608857,-0.8278479,0.0086695,-0.5608857,-0.8278479,0.0086695,-0.5608857,0.7749574,-0.2912873,-0.5608857,0.7749574,-0.2912873,-0.5608857,0.7749574,-0.2912873,-0.5608857,0.7749574,-0.2912873,-0.5608857,0.7749574,-0.2912873,-0.5608857,-0.7749574,0.2912873,0.5608857,-0.7749574,0.2912873,0.5608857,-0.7749574,0.2912873,0.5608857,-0.7749574,0.2912873,0.5608857,-0.7749574,0.2912873,0.5608857,0.8278479,-0.0086695,-0.5608857,0.8278479,-0.0086695,-0.5608857,0.8278479,-0.0086695,-0.5608857,0.8278479,-0.0086695,-0.5608857,0.8278479,-0.0086695,-0.5608857,-0.8278479,0.0086695,0.5608857,-0.8278479,0.0086695,0.5608857,-0.8278479,0.0086695,0.5608857,-0.8278479,0.0086695,0.5608857,-0.8278479,0.0086695,0.5608857,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.7749574,-0.2912873,0.5608857,0.7749574,-0.2912873,0.5608857,0.7749574,-0.2912873,0.5608857,0.7749574,-0.2912873,0.5608857,0.7749574,-0.2912873,0.5608857,-0.7749574,0.2912873,-0.5608857,-0.7749574,0.2912873,-0.5608857,-0.7749574,0.2912873,-0.5608857,-0.7749574,0.2912873,-0.5608857,-0.7749574,0.2912873,-0.5608857,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.8167764,0.1352165,0.5608857,0.8167764,0.1352165,0.5608857,0.8167764,0.1352165,0.5608857,0.8167764,0.1352165,0.5608857,0.8167764,0.1352165,0.5608857,-0.8167764,-0.1352165,-0.5608857,-0.8167764,-0.1352165,-0.5608857,-0.8167764,-0.1352165,-0.5608857,-0.8167764,-0.1352165,-0.5608857,-0.8167764,-0.1352165,-0.5608857,0.7126025,-0.421432,-0.5608857,0.7126025,-0.421432,-0.5608857,0.7126025,-0.421432,-0.5608857,-0.7126025,0.421432,0.5608857,-0.7126025,0.421432,0.5608857,-0.7126025,0.421432,0.5608857,0.8167764,0.1352165,-0.5608857,0.8167764,0.1352165,-0.5608857,0.8167764,0.1352165,-0.5608857,0.8167764,0.1352165,-0.5608857,0.8167764,0.1352165,-0.5608857,-0.8167764,-0.1352165,0.5608857,-0.8167764,-0.1352165,0.5608857,-0.8167764,-0.1352165,0.5608857,-0.8167764,-0.1352165,0.5608857,-0.8167764,-0.1352165,0.5608857,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.7126025,-0.421432,0.5608857,0.7126025,-0.421432,0.5608857,0.7126025,-0.421432,0.5608857,-0.7126025,0.421432,-0.5608857,-0.7126025,0.421432,-0.5608857,-0.7126025,0.421432,-0.5608857,0.7808877,0.274994,0.5608857,0.7808877,0.274994,0.5608857,0.7808877,0.274994,0.5608857,0.7808877,0.274994,0.5608857,0.7808877,0.274994,0.5608857,-0.7808877,-0.274994,-0.5608857,-0.7808877,-0.274994,-0.5608857,-0.7808877,-0.274994,-0.5608857,-0.7808877,-0.274994,-0.5608857,-0.7808877,-0.274994,-0.5608857,0.6285956,-0.5387716,-0.5608857,0.6285956,-0.5387716,-0.5608857,0.6285956,-0.5387716,-0.5608857,-0.6285956,0.5387716,0.5608857,-0.6285956,0.5387716,0.5608857,-0.6285956,0.5387716,0.5608857,0.7808877,0.274994,-0.5608857,0.7808877,0.274994,-0.5608857,0.7808877,0.274994,-0.5608857,0.7808877,0.274994,-0.5608857,0.7808877,0.274994,-0.5608857,-0.7808877,-0.274994,0.5608857,-0.7808877,-0.274994,0.5608857,-0.7808877,-0.274994,0.5608857,-0.7808877,-0.274994,0.5608857,-0.7808877,-0.274994,0.5608857,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.721272,0.4064159,0.5608857,0.721272,0.4064159,0.5608857,0.721272,0.4064159,0.5608857,0.721272,0.4064159,0.5608857,-0.721272,-0.4064159,-0.5608857,-0.721272,-0.4064159,-0.5608857,-0.721272,-0.4064159,-0.5608857,-0.721272,-0.4064159,-0.5608857,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,6,7,7,6,8,9,8,6,10,11,12,11,10,13,13,10,14,15,16,17,17,16,18,19,18,16,20,21,22,23,24,25,26,27,28,27,26,29,29,26,30,31,32,33,33,32,34,35,34,32,36,37,38,37,36,39,39,36,40,41,42,43,43,42,44,45,44,42,46,47,48,47,46,49,49,46,50,51,52,53,53,52,54,55,54,52,56,57,58,59,60,61,62,63,64,63,62,65,65,62,66,67,68,69,69,68,70,71,70,68,72,73,74,75,76,77,78,79,80,79,78,81,81,78,82,83,84,85,85,84,86,87,86,84,88,89,90,91,92,93,94,95,96,95,94,97,97,94,98,99,100,101,101,100,102,103,102,100,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,117,116,119,119,116,120,121,122,123,123,122,124,125,124,122,126,127,128,129,130,131,132,133,134,133,132,135,135,132,136,137,138,139,139,138,140,141,140,138,142,143,144,145,146,147,148,149,150,149,148,151,152,153,154,155,154,153,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 240, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID432(GL2 gl){
double[] positionsArray = {
364.1856184,736.244532,279.849375,461.7488488,585.4764157,279.849375,460.4315625,575.4706332,279.849375,465.6109367,594.8003207,279.849375,471.7546313,602.8069394,279.849375,474.430292,604.8600461,279.849375,353.2639137,707.1878075,279.849375,461.3086366,568.8085942,279.849375,292.0343525,538.9609707,279.849375,460.4315625,575.4706332,279.849375,364.1856184,736.244532,279.849375,461.3086366,568.8085942,279.849375,353.2639137,707.1878075,279.849375,292.0343525,538.9609707,279.849375,474.430292,604.8600461,279.849375,471.7546313,602.8069394,279.849375,465.6109367,594.8003207,279.849375,461.7488488,585.4764157,279.849375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,6,7,8,7,6,0,7,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,10,12,11,13,11,12,14,10,15,15,10,16,16,10,17,9,17,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID438(GL2 gl){
double[] positionsArray = {
518.420625,541.9906324,188.401875,570.0136289,380.61214,188.401875,512.2125929,539.4191813,188.401875,526.4272437,548.134327,188.401875,532.5709383,556.1409457,188.401875,536.4330262,565.4648507,188.401875,536.8732384,568.8085942,188.401875,706.1475225,538.9609707,188.401875,571.0009348,377.8995393,188.401875,571.0009348,377.8995393,188.401875,706.1475225,538.9609707,188.401875,570.0136289,380.61214,188.401875,536.8732384,568.8085942,188.401875,536.4330262,565.4648507,188.401875,532.5709383,556.1409457,188.401875,526.4272437,548.134327,188.401875,518.420625,541.9906324,188.401875,512.2125929,539.4191813,188.401875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID444(GL2 gl){
double[] positionsArray = {
428.4611871,381.416989,279.849375,634.2375252,414.4092018,279.849375,427.1809402,377.8995393,279.849375,485.9692821,539.4191813,279.849375,489.085155,538.1285445,279.849375,499.0909375,536.8112582,279.849375,509.09672,538.1285445,279.849375,518.420625,541.9906324,279.849375,523.751583,546.0812203,279.849375,523.751583,546.0812203,279.849375,518.420625,541.9906324,279.849375,634.2375252,414.4092018,279.849375,509.09672,538.1285445,279.849375,499.0909375,536.8112582,279.849375,489.085155,538.1285445,279.849375,485.9692821,539.4191813,279.849375,428.4611871,381.416989,279.849375,427.1809402,377.8995393,279.849375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID450(GL2 gl){
double[] positionsArray = {
695.9097007,503.6973576,211.26375,570.0136289,380.61214,188.401875,568.9395983,379.3590469,188.401875,705.7653764,538.9964214,188.401875,705.7653764,538.9964214,188.401875,695.9097007,503.6973576,211.26375,570.0136289,380.61214,188.401875,568.9395983,379.3590469,188.401875,533.4418745,370.2447806,211.26375,695.9097007,503.6973576,211.26375,568.9395983,379.3590469,188.401875,535.0455251,371.5620341,211.26375,535.0455251,371.5620341,211.26375,533.4418745,370.2447806,211.26375,695.9097007,503.6973576,211.26375,568.9395983,379.3590469,188.401875,570.0136289,380.61214,188.401875,602.3153562,394.4989622,165.54,568.9395983,379.3590469,188.401875,705.7653764,538.9964214,188.401875,705.7653764,538.9964214,188.401875,570.0136289,380.61214,188.401875,602.3153562,394.4989622,165.54,568.9395983,379.3590469,188.401875,680.0741367,470.645986,234.125625,535.0455251,371.5620341,211.26375,533.4418745,370.2447806,211.26375,695.9097007,503.6973576,211.26375,695.9097007,503.6973576,211.26375,680.0741367,470.645986,234.125625,535.0455251,371.5620341,211.26375,533.4418745,370.2447806,211.26375,705.7653764,538.9964214,188.401875,602.9527385,395.5767169,165.54,602.3153562,394.4989622,165.54,709.3417041,575.4706332,165.54,709.3417041,575.4706332,165.54,705.7653764,538.9964214,188.401875,602.9527385,395.5767169,165.54,602.3153562,394.4989622,165.54,496.900765,367.4330954,234.125625,680.0741367,470.645986,234.125625,533.4418745,370.2447806,211.26375,499.0909375,368.6671942,234.125625,499.0909375,368.6671942,234.125625,496.900765,367.4330954,234.125625,680.0741367,470.645986,234.125625,533.4418745,370.2447806,211.26375,709.3417041,575.4706332,165.54,604.2163208,393.3881282,165.54,602.9527385,395.5767169,165.54,602.9527385,395.5767169,165.54,604.2163208,393.3881282,165.54,709.3417041,575.4706332,165.54,658.7398401,440.8465558,256.9875,499.0909375,368.6671942,234.125625,496.900765,367.4330954,234.125625,680.0741367,470.645986,234.125625,680.0741367,470.645986,234.125625,658.7398401,440.8465558,256.9875,499.0909375,368.6671942,234.125625,496.900765,367.4330954,234.125625,460.4265532,371.0094232,256.9875,658.7398401,440.8465558,256.9875,496.900765,367.4330954,234.125625,463.2118621,371.9902853,256.9875,463.2118621,371.9902853,256.9875,460.4265532,371.0094232,256.9875,658.7398401,440.8465558,256.9875,496.900765,367.4330954,234.125625,632.5550427,415.2045077,279.849375,463.2118621,371.9902853,256.9875,460.4265532,371.0094232,256.9875,658.7398401,440.8465558,256.9875,658.7398401,440.8465558,256.9875,632.5550427,415.2045077,279.849375,463.2118621,371.9902853,256.9875,460.4265532,371.0094232,256.9875,425.1274894,380.8650989,279.849375,632.5550427,415.2045077,279.849375,460.4265532,371.0094232,256.9875,428.4611871,381.416989,279.849375,428.4611871,381.416989,279.849375,425.1274894,380.8650989,279.849375,632.5550427,415.2045077,279.849375,460.4265532,371.0094232,256.9875,602.3153562,394.4989622,302.71125,428.4611871,381.416989,279.849375,425.1274894,380.8650989,279.849375,632.5550427,415.2045077,279.849375,632.5550427,415.2045077,279.849375,602.3153562,394.4989622,302.71125,428.4611871,381.416989,279.849375,425.1274894,380.8650989,279.849375,392.0761178,396.7006628,302.71125,602.3153562,394.4989622,302.71125,425.1274894,380.8650989,279.849375,395.8551978,396.661087,302.71125,395.8551978,396.661087,302.71125,392.0761178,396.7006628,302.71125,602.3153562,394.4989622,302.71125,425.1274894,380.8650989,279.849375,568.9395983,379.3590469,325.573125,395.8551978,396.661087,302.71125,392.0761178,396.7006628,302.71125,602.3153562,394.4989622,302.71125,602.3153562,394.4989622,302.71125,568.9395983,379.3590469,325.573125,395.8551978,396.661087,302.71125,392.0761178,396.7006628,302.71125,362.2766876,418.0349594,325.573125,568.9395983,379.3590469,325.573125,392.0761178,396.7006628,302.71125,366.3474731,417.2731326,325.573125,366.3474731,417.2731326,325.573125,362.2766876,418.0349594,325.573125,568.9395983,379.3590469,325.573125,392.0761178,396.7006628,302.71125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.6285956,0.5387716,0.5608857,-0.6285956,0.5387716,0.5608857,-0.6285956,0.5387716,0.5608857,-0.6285956,0.5387716,0.5608857,0.6285956,-0.5387716,-0.5608857,0.6285956,-0.5387716,-0.5608857,0.6285956,-0.5387716,-0.5608857,0.6285956,-0.5387716,-0.5608857,-0.5254891,0.6397409,-0.5608857,-0.5254891,0.6397409,-0.5608857,-0.5254891,0.6397409,-0.5608857,-0.5254891,0.6397409,-0.5608857,0.5254891,-0.6397409,0.5608857,0.5254891,-0.6397409,0.5608857,0.5254891,-0.6397409,0.5608857,0.5254891,-0.6397409,0.5608857,-0.6285956,0.5387716,-0.5608857,-0.6285956,0.5387716,-0.5608857,-0.6285956,0.5387716,-0.5608857,-0.6285956,0.5387716,-0.5608857,0.6285956,-0.5387716,0.5608857,0.6285956,-0.5387716,0.5608857,0.6285956,-0.5387716,0.5608857,0.6285956,-0.5387716,0.5608857,-0.5254891,0.6397409,0.5608857,-0.5254891,0.6397409,0.5608857,-0.5254891,0.6397409,0.5608857,-0.5254891,0.6397409,0.5608857,0.5254891,-0.6397409,-0.5608857,0.5254891,-0.6397409,-0.5608857,0.5254891,-0.6397409,-0.5608857,0.5254891,-0.6397409,-0.5608857,-0.7126025,0.421432,0.5608857,-0.7126025,0.421432,0.5608857,-0.7126025,0.421432,0.5608857,-0.7126025,0.421432,0.5608857,0.7126025,-0.421432,-0.5608857,0.7126025,-0.421432,-0.5608857,0.7126025,-0.421432,-0.5608857,0.7126025,-0.421432,-0.5608857,-0.4064159,0.721272,-0.5608857,-0.4064159,0.721272,-0.5608857,-0.4064159,0.721272,-0.5608857,-0.4064159,0.721272,-0.5608857,0.4064159,-0.721272,0.5608857,0.4064159,-0.721272,0.5608857,0.4064159,-0.721272,0.5608857,0.4064159,-0.721272,0.5608857,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.4064159,0.721272,0.5608857,-0.4064159,0.721272,0.5608857,-0.4064159,0.721272,0.5608857,-0.4064159,0.721272,0.5608857,0.4064159,-0.721272,-0.5608857,0.4064159,-0.721272,-0.5608857,0.4064159,-0.721272,-0.5608857,0.4064159,-0.721272,-0.5608857,-0.274994,0.7808877,-0.5608857,-0.274994,0.7808877,-0.5608857,-0.274994,0.7808877,-0.5608857,-0.274994,0.7808877,-0.5608857,0.274994,-0.7808877,0.5608857,0.274994,-0.7808877,0.5608857,0.274994,-0.7808877,0.5608857,0.274994,-0.7808877,0.5608857,-0.274994,0.7808877,0.5608857,-0.274994,0.7808877,0.5608857,-0.274994,0.7808877,0.5608857,-0.274994,0.7808877,0.5608857,0.274994,-0.7808877,-0.5608857,0.274994,-0.7808877,-0.5608857,0.274994,-0.7808877,-0.5608857,0.274994,-0.7808877,-0.5608857,-0.1352165,0.8167764,-0.5608857,-0.1352165,0.8167764,-0.5608857,-0.1352165,0.8167764,-0.5608857,-0.1352165,0.8167764,-0.5608857,0.1352165,-0.8167764,0.5608857,0.1352165,-0.8167764,0.5608857,0.1352165,-0.8167764,0.5608857,0.1352165,-0.8167764,0.5608857,-0.1352165,0.8167764,0.5608857,-0.1352165,0.8167764,0.5608857,-0.1352165,0.8167764,0.5608857,-0.1352165,0.8167764,0.5608857,0.1352165,-0.8167764,-0.5608857,0.1352165,-0.8167764,-0.5608857,0.1352165,-0.8167764,-0.5608857,0.1352165,-0.8167764,-0.5608857,0.0086695,0.8278479,-0.5608857,0.0086695,0.8278479,-0.5608857,0.0086695,0.8278479,-0.5608857,0.0086695,0.8278479,-0.5608857,-0.0086695,-0.8278479,0.5608857,-0.0086695,-0.8278479,0.5608857,-0.0086695,-0.8278479,0.5608857,-0.0086695,-0.8278479,0.5608857,0.0086695,0.8278479,0.5608857,0.0086695,0.8278479,0.5608857,0.0086695,0.8278479,0.5608857,0.0086695,0.8278479,0.5608857,-0.0086695,-0.8278479,-0.5608857,-0.0086695,-0.8278479,-0.5608857,-0.0086695,-0.8278479,-0.5608857,-0.0086695,-0.8278479,-0.5608857,0.1522921,0.8137656,-0.5608857,0.1522921,0.8137656,-0.5608857,0.1522921,0.8137656,-0.5608857,0.1522921,0.8137656,-0.5608857,-0.1522921,-0.8137656,0.5608857,-0.1522921,-0.8137656,0.5608857,-0.1522921,-0.8137656,0.5608857,-0.1522921,-0.8137656,0.5608857,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,4,5,6,7,6,5,8,9,10,9,8,11,12,13,14,15,14,13,16,17,18,17,16,19,20,21,22,23,22,21,24,25,26,25,24,27,28,29,30,31,30,29,32,33,34,33,32,35,36,37,38,39,38,37,40,41,42,41,40,43,44,45,46,47,46,45,48,49,50,51,52,53,54,55,56,55,54,57,58,59,60,61,60,59,62,63,64,63,62,65,66,67,68,69,68,67,70,71,72,71,70,73,74,75,76,77,76,75,78,79,80,79,78,81,82,83,84,85,84,83,86,87,88,87,86,89,90,91,92,93,92,91,94,95,96,95,94,97,98,99,100,101,100,99,102,103,104,103,102,105,106,107,108,109,108,107,110,111,112,111,110,113,114,115,116,117,116,115,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 174, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID456(GL2 gl){
double[] positionsArray = {
461.3086366,582.1326723,188.401875,351.9041238,447.4894508,188.401875,294.1064171,611.6149348,188.401875,363.9443498,414.4092018,188.401875,460.4315625,575.4706332,188.401875,471.7546313,548.134327,188.401875,474.430292,546.0812203,188.401875,465.6109367,556.1409457,188.401875,461.7488488,565.4648507,188.401875,460.4315625,575.4706332,188.401875,363.9443498,414.4092018,188.401875,461.7488488,565.4648507,188.401875,465.6109367,556.1409457,188.401875,471.7546313,548.134327,188.401875,474.430292,546.0812203,188.401875,461.3086366,582.1326723,188.401875,351.9041238,447.4894508,188.401875,294.1064171,611.6149348,188.401875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,3,5,6,5,3,7,7,3,8,8,3,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,11,10,12,12,10,13,14,13,10,9,15,10,10,15,16,17,16,15,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID462(GL2 gl){
double[] positionsArray = {
125.3117969,791.2721207,0.0,125.3117969,359.6691458,0.0,0.71875,575.4706332,0.0,125.3117969,575.4706332,0.0,218.756582,737.3217488,0.0,312.2013672,899.1728644,0.0,358.9237598,818.2473066,0.0,499.0909375,899.1728644,0.0,499.0909375,818.2473066,0.0,639.2581152,818.2473066,0.0,604.2163208,757.5531383,0.0,709.3417041,696.8589699,0.0,0.71875,287.7353166,0.0,249.9048437,143.8676583,0.0,0.71875,575.4706332,0.0,0.71875,287.7353166,0.0,125.3117969,359.6691458,0.0,249.9048437,143.8676583,0.0,709.3417041,696.8589699,0.0,639.2581152,818.2473066,0.0,604.2163208,757.5531383,0.0,499.0909375,818.2473066,0.0,499.0909375,899.1728644,0.0,358.9237598,818.2473066,0.0,312.2013672,899.1728644,0.0,218.756582,737.3217488,0.0,125.3117969,791.2721207,0.0,125.3117969,575.4706332,0.0,358.9237598,818.2473066,107.0225,499.0909375,818.2473066,0.0,358.9237598,818.2473066,0.0,499.0909375,818.2473066,122.319375,358.9237598,818.2473066,122.319375,358.9237598,818.2473066,122.319375,358.9237598,818.2473066,107.0225,499.0909375,818.2473066,122.319375,499.0909375,818.2473066,0.0,358.9237598,818.2473066,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,4,5,6,6,5,7,6,7,8,8,7,9,8,9,10,10,9,11,12,1,13,1,12,2,28,29,30,29,28,31,31,28,32,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 45, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
14,15,16,17,16,15,18,19,20,20,19,21,19,22,21,21,22,23,22,24,23,23,24,25,24,26,25,25,26,27,27,26,16,14,16,26,33,34,35,35,34,36,37,36,34,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 45, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID470(GL2 gl){
double[] positionsArray = {
288.8401709,696.8589699,0.0,288.8401709,454.0822965,0.0,218.756582,575.4706332,0.0,288.8401709,575.4706332,0.0,312.2013672,251.768402,0.0,218.756582,413.6195176,0.0,358.9237598,332.6939598,0.0,499.0909375,143.8676583,0.0,499.0909375,251.768402,0.0,685.9805078,251.768402,0.0,748.2770312,143.8676583,0.0,872.8700781,359.6691458,0.0,997.463125,287.7353166,0.0,997.463125,575.4706332,0.0,997.463125,575.4706332,0.0,872.8700781,359.6691458,0.0,997.463125,287.7353166,0.0,748.2770312,143.8676583,0.0,685.9805078,251.768402,0.0,499.0909375,143.8676583,0.0,499.0909375,251.768402,0.0,358.9237598,332.6939598,0.0,312.2013672,251.768402,0.0,288.8401709,454.0822965,0.0,218.756582,575.4706332,0.0,218.756582,413.6195176,0.0,288.8401709,575.4706332,0.0,288.8401709,696.8589699,0.0,288.8401709,454.0822965,122.319375,358.9237598,332.6939598,107.0225,358.9237598,332.6939598,122.319375,358.9237598,332.6939598,0.0,288.8401709,454.0822965,0.0,288.8401709,454.0822965,0.0,288.8401709,454.0822965,122.319375,358.9237598,332.6939598,0.0,358.9237598,332.6939598,107.0225,358.9237598,332.6939598,122.319375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,2,4,5,4,2,1,4,1,6,4,6,7,7,6,8,7,8,9,7,9,10,10,9,11,10,11,12,12,11,13,28,29,30,29,28,31,31,28,32,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 45, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
14,15,16,16,15,17,15,18,17,17,18,19,18,20,19,20,21,19,19,21,22,21,23,22,23,24,22,25,22,24,26,27,23,24,23,27,33,34,35,35,34,36,37,36,34,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 45, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID476(GL2 gl){
double[] positionsArray = {
288.8401709,696.8589699,0.0,288.8401709,575.4706332,137.39375,288.8401709,575.4706332,0.0,288.8401709,696.8589699,137.39375,288.8401709,696.8589699,137.39375,288.8401709,696.8589699,0.0,288.8401709,575.4706332,137.39375,288.8401709,575.4706332,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
19.357193f,0.0f,15.985295f,3.816493f,15.985295f,0.0f,19.357193f,3.816493f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
4,5,6,7,6,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID484(GL2 gl){
double[] positionsArray = {
499.0909375,1150.9412664,0.0,499.0909375,1007.0736081,0.0,249.9048438,1007.0736081,0.0,748.2770313,1007.0736081,0.0,685.9805078,899.1728644,0.0,779.425293,737.3217488,0.0,872.8700781,791.2721207,0.0,872.8700781,575.4706332,0.0,604.2163208,393.3881282,0.0,639.2581152,332.6939598,0.0,499.0909375,332.6939598,0.0,709.3417041,454.0822965,0.0,779.425293,413.6195176,0.0,779.425293,575.4706332,0.0,872.8700781,575.4706332,0.0,779.425293,737.3217488,0.0,779.425293,413.6195176,0.0,779.425293,575.4706332,0.0,709.3417041,454.0822965,0.0,639.2581152,332.6939598,0.0,604.2163208,393.3881282,0.0,499.0909375,332.6939598,0.0,872.8700781,791.2721207,0.0,748.2770313,1007.0736081,0.0,685.9805078,899.1728644,0.0,499.0909375,1007.0736081,0.0,499.0909375,1150.9412664,0.0,249.9048438,1007.0736081,0.0,779.425293,575.4706332,0.0,709.3417041,454.0822965,122.319375,709.3417041,454.0822965,0.0,779.425293,575.4706332,122.319375,779.425293,575.4706332,107.0225,779.425293,575.4706332,107.0225,779.425293,575.4706332,0.0,779.425293,575.4706332,122.319375,709.3417041,454.0822965,122.319375,709.3417041,454.0822965,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,5,3,6,5,6,7,8,9,10,9,8,11,9,11,12,12,11,13,12,13,5,12,5,7,28,29,30,29,28,31,31,28,32,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 45, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
14,15,16,15,17,16,17,18,16,16,18,19,18,20,19,21,19,20,14,22,15,22,23,15,15,23,24,24,23,25,23,26,25,27,25,26,33,34,35,35,34,36,37,36,34,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 45, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID490(GL2 gl){
double[] positionsArray = {
499.0909375,332.6939598,137.39375,604.2163208,393.3881282,0.0,499.0909375,332.6939598,0.0,604.2163208,393.3881282,137.39375,604.2163208,393.3881282,137.39375,499.0909375,332.6939598,137.39375,604.2163208,393.3881282,0.0,499.0909375,332.6939598,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-16.627012f,3.816493f,-19.998909f,0.0f,-16.627012f,0.0f,-19.998909f,3.816493f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
4,5,6,7,6,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID498(GL2 gl){
double[] positionsArray = {
748.2770312,143.8676583,21.526875,499.0909375,143.8676583,0.0,748.2770312,143.8676583,0.0,499.0909375,143.8676583,50.285,748.2770312,143.8676583,50.285,748.2770312,143.8676583,50.285,748.2770312,143.8676583,21.526875,499.0909375,143.8676583,50.285,499.0909375,143.8676583,0.0,748.2770312,143.8676583,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
20.785473f,1.3968056f,20.785473f,0.5979687f,13.863637f,1.3968056f,13.863637f,0.0f,20.785473f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
5,0,6,1,7,2,7,2,6,1,8,3,9,4,8,3,6,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID506(GL2 gl){
double[] positionsArray = {
461.7488488,565.4648507,758.690625,461.7488488,585.4764157,758.690625,460.4315625,575.4706332,758.690625,465.6109367,556.1409457,758.690625,465.6109367,594.8003207,758.690625,471.7546313,548.134327,758.690625,471.7546313,602.8069394,758.690625,479.76125,541.9906324,758.690625,479.76125,608.9506341,758.690625,489.085155,538.1285445,758.690625,489.085155,612.812722,758.690625,499.0909375,536.8112582,758.690625,499.0909375,614.1300082,758.690625,509.09672,538.1285445,758.690625,509.09672,612.812722,758.690625,518.420625,541.9906324,758.690625,518.420625,608.9506341,758.690625,526.4272437,548.134327,758.690625,526.4272437,602.8069394,758.690625,532.5709383,556.1409457,758.690625,532.5709383,594.8003207,758.690625,536.4330262,565.4648507,758.690625,536.4330262,585.4764157,758.690625,537.7503125,575.4706332,758.690625,537.7503125,575.4706332,758.690625,536.4330262,565.4648507,758.690625,536.4330262,585.4764157,758.690625,532.5709383,594.8003207,758.690625,532.5709383,556.1409457,758.690625,526.4272437,602.8069394,758.690625,526.4272437,548.134327,758.690625,518.420625,608.9506341,758.690625,518.420625,541.9906324,758.690625,509.09672,612.812722,758.690625,509.09672,538.1285445,758.690625,499.0909375,614.1300082,758.690625,499.0909375,536.8112582,758.690625,489.085155,612.812722,758.690625,489.085155,538.1285445,758.690625,479.76125,608.9506341,758.690625,479.76125,541.9906324,758.690625,471.7546313,602.8069394,758.690625,471.7546313,548.134327,758.690625,465.6109367,594.8003207,758.690625,465.6109367,556.1409457,758.690625,461.7488488,585.4764157,758.690625,461.7488488,565.4648507,758.690625,460.4315625,575.4706332,758.690625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
12.826357f,15.707357f,12.826357f,16.263233f,12.789765f,15.985295f,12.933637f,15.4483595f,12.933637f,16.52223f,13.104296f,15.225953f,13.104296f,16.744637f,13.326701f,15.055295f,13.326701f,16.915295f,13.585699f,14.948015f,13.585699f,17.022575f,13.863637f,14.911424f,13.863637f,17.059166f,14.141576f,14.948015f,14.141576f,17.022575f,14.400573f,15.055295f,14.400573f,16.915295f,14.622979f,15.225953f,14.622979f,16.744637f,14.793637f,15.4483595f,14.793637f,16.52223f,14.900917f,15.707357f,14.900917f,16.263233f,14.937509f,15.985295f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,1,1,3,3,4,4,4,4,3,3,5,5,4,4,5,5,6,6,6,6,5,5,7,7,6,6,7,7,8,8,8,8,7,7,9,9,8,8,9,9,10,10,10,10,9,9,11,11,10,10,11,11,12,12,12,12,11,11,13,13,12,12,13,13,14,14,14,14,13,13,15,15,14,14,15,15,16,16,16,16,15,15,17,17,16,16,17,17,18,18,18,18,17,17,19,19,18,18,19,19,20,20,20,20,19,19,21,21,20,20,21,21,22,22,22,22,21,21,23,23,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.3176471, 0.3176471, 0.3176471, 1.0);
int[] indices = {
24,25,26,26,25,27,25,28,27,27,28,29,28,30,29,29,30,31,30,32,31,31,32,33,32,34,33,33,34,35,34,36,35,35,36,37,36,38,37,37,38,39,38,40,39,39,40,41,40,42,41,41,42,43,42,44,43,43,44,45,44,46,45,47,45,46,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 66, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID514(GL2 gl){
double[] positionsArray = {
499.0909375,536.8112582,645.639375,492.3778075,537.398581,645.639375,490.2025709,537.9814339,645.639375,490.2025709,537.9814339,645.639375,492.3778075,537.398581,645.639375,499.0909375,536.8112582,645.639375,489.085155,538.1285445,645.639375,485.8686525,539.1427038,645.639375,488.0438891,538.5598509,645.639375,488.0438891,538.5598509,645.639375,485.8686525,539.1427038,645.639375,489.085155,538.1285445,645.639375,479.76125,541.9906324,645.639375,479.76125,541.9906324,645.639375,482.7527796,540.4333406,645.639375,472.6487865,547.4482175,645.639375,474.2411703,545.8558338,645.639375,471.7546313,548.134327,645.639375,469.4761381,550.620866,645.639375,471.0685218,549.0284823,645.639375,471.0685218,549.0284823,645.639375,469.4761381,550.620866,645.639375,471.7546313,548.134327,645.639375,472.6487865,547.4482175,645.639375,474.2411703,545.8558338,645.639375,482.7527796,540.4333406,645.639375,476.916831,543.8027272,645.639375,476.916831,543.8027272,645.639375,465.6109367,556.1409457,645.639375,465.6109367,556.1409457,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
0,1,2,3,4,5,1,6,2,6,7,8,9,10,11,3,11,4,8,7,12,13,10,9,7,14,12,15,16,17,16,15,12,17,18,19,20,21,22,13,23,24,22,24,23,13,25,10,13,24,26,27,16,12,13,23,24,16,15,12,24,23,22,17,15,16,19,18,28,29,21,20,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 72, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID520(GL2 gl){
double[] positionsArray = {
499.0909375,536.8112582,645.639375,495.721551,536.9583688,645.639375,492.3778075,537.398581,645.639375,489.085155,538.1285445,645.639375,490.2025709,537.9814339,645.639375,485.8686525,539.1427038,645.639375,488.0438891,538.5598509,645.639375,482.7527796,540.4333406,645.639375,479.76125,541.9906324,645.639375,476.916831,543.8027272,645.639375,474.2411703,545.8558338,645.639375,471.7546313,548.134327,645.639375,472.6487865,547.4482175,645.639375,469.4761381,550.620866,645.639375,471.0685218,549.0284823,645.639375,467.4230314,553.2965267,645.639375,465.6109367,556.1409457,645.639375,465.6109367,556.1409457,645.639375,467.4230314,553.2965267,645.639375,469.4761381,550.620866,645.639375,471.0685218,549.0284823,645.639375,471.7546313,548.134327,645.639375,472.6487865,547.4482175,645.639375,474.2411703,545.8558338,645.639375,476.916831,543.8027272,645.639375,479.76125,541.9906324,645.639375,482.7527796,540.4333406,645.639375,485.8686525,539.1427038,645.639375,488.0438891,538.5598509,645.639375,489.085155,538.1285445,645.639375,490.2025709,537.9814339,645.639375,492.3778075,537.398581,645.639375,495.721551,536.9583688,645.639375,499.0909375,536.8112582,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,2,3,4,3,5,6,5,7,8,8,9,10,10,11,12,11,13,14,13,15,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 24, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID156.bind();
texcoordArray = new float[] {
-4.4380913f,11.586269f,-4.4510684f,11.648593f,-4.461824f,11.713508f,-4.466681f,11.758824f,-4.4702754f,11.780518f,-4.471501f,11.803797f,-4.4763584f,11.849114f,-4.4800267f,11.918776f,-4.4812527f,11.988972f,-4.4800267f,12.059167f,-4.4763584f,12.128828f,-4.471501f,12.174146f,-4.4702754f,12.197425f,-4.466681f,12.219118f,-4.461824f,12.264436f,-4.4510684f,12.3293495f,-4.4380913f,12.391673f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
17,0,18,1,19,2,20,3,19,2,21,4,22,5,21,4,23,6,23,6,24,7,25,8,25,8,26,9,27,10,28,11,27,10,29,12,30,13,29,12,31,14,31,14,32,15,33,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID528(GL2 gl){
double[] positionsArray = {
564.5956056,656.7614043,645.639375,563.085591,635.7021351,645.639375,563.0624368,677.8190005,645.639375,329.8874865,680.5960165,645.639375,465.6109367,594.8003207,645.639375,323.6053291,676.7872965,645.639375,492.6514105,774.5678118,645.639375,469.4761381,600.3204005,645.639375,471.0685218,601.9127842,645.639375,471.7546313,602.8069394,645.639375,472.6487865,603.4930489,645.639375,474.2411703,605.0854326,645.639375,479.76125,608.9506341,645.639375,485.8686525,611.7985626,645.639375,488.0438891,612.3814155,645.639375,489.085155,612.812722,645.639375,490.2025709,612.9598326,645.639375,492.3778075,613.5426854,645.639375,499.0909375,614.1300082,645.639375,499.0909375,778.4719413,645.639375,505.8040675,613.5426854,645.639375,504.9377802,774.1860249,645.639375,513.0033391,768.273721,645.639375,507.9787918,612.9599698,645.639375,509.0965032,612.8128291,645.639375,509.1049535,612.8093289,645.639375,509.1070638,612.8084548,645.639375,509.1105787,612.8069988,645.639375,510.1380913,612.3813873,645.639375,512.3132225,611.7985626,645.639375,518.420625,608.9506341,645.639375,528.0603444,753.4730603,645.639375,523.9407047,605.0854326,645.639375,525.5330114,603.4931259,645.639375,526.4274447,602.8068054,645.639375,527.1137135,601.9124239,645.639375,528.7057369,600.3204005,645.639375,540.8331892,736.6615345,645.639375,532.5709383,594.8003207,645.639375,564.1844601,613.413822,645.639375,551.0565166,718.1884043,645.639375,558.5179364,698.4374505,645.639375,563.0624368,677.8190005,645.639375,558.5179364,698.4374505,645.639375,563.085591,635.7021351,645.639375,564.1844601,613.413822,645.639375,551.0565166,718.1884043,645.639375,540.8331892,736.6615345,645.639375,532.5709383,594.8003207,645.639375,528.7057369,600.3204005,645.639375,528.0603444,753.4730603,645.639375,527.1137135,601.9124239,645.639375,526.4274447,602.8068054,645.639375,525.5330114,603.4931259,645.639375,523.9407047,605.0854326,645.639375,518.420625,608.9506341,645.639375,513.0033391,768.273721,645.639375,512.3132225,611.7985626,645.639375,510.1380913,612.3813873,645.639375,509.1105787,612.8069988,645.639375,509.1070638,612.8084548,645.639375,509.1049535,612.8093289,645.639375,509.0965032,612.8128291,645.639375,507.9787918,612.9599698,645.639375,505.8040675,613.5426854,645.639375,504.9377802,774.1860249,645.639375,499.0909375,778.4719413,645.639375,499.0909375,614.1300082,645.639375,492.6514105,774.5678118,645.639375,492.3778075,613.5426854,645.639375,490.2025709,612.9598326,645.639375,489.085155,612.812722,645.639375,488.0438891,612.3814155,645.639375,485.8686525,611.7985626,645.639375,479.76125,608.9506341,645.639375,474.2411703,605.0854326,645.639375,472.6487865,603.4930489,645.639375,471.7546313,602.8069394,645.639375,471.0685218,601.9127842,645.639375,469.4761381,600.3204005,645.639375,465.6109367,594.8003207,645.639375,329.8874865,680.5960165,645.639375,323.6053291,676.7872965,645.639375,564.5956056,656.7614043,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.1748249,0.7894236,-0.5884273,0.2705987,0.653281,-0.707107,0.2705988,0.6532812,-0.7071068,0.3213507,0.7758066,-0.5430081,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.3213507,-0.7758066,0.5430081,-0.2705988,-0.6532812,0.7071068,-0.2705987,-0.653281,0.707107,-0.1748249,-0.7894236,0.5884273,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,3,4,5,4,3,6,4,6,7,7,6,8,8,6,9,9,6,10,10,6,11,11,6,12,12,6,13,13,6,14,14,6,15,15,6,16,16,6,17,17,6,18,18,6,19,18,19,20,20,19,21,20,21,22,20,22,23,23,22,24,24,22,25,25,22,26,26,22,27,27,22,28,28,22,29,29,22,30,30,22,31,30,31,32,32,31,33,33,31,34,34,31,35,35,31,36,36,31,37,36,37,38,38,37,39,39,37,40,39,40,41,39,41,1,1,41,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 120, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID156.bind();
texcoordArray = new float[] {
-4.631179f,9.768657f,-4.7989154f,9.635874f,-4.3271303f,10.206956f,-4.1616993f,10.4193f,-4.9725447f,9.5647545f,-5.1484604f,9.556778f,-4.159091f,11.183568f,-4.215034f,11.195804f,-5.323007f,9.612108f,-4.2331567f,11.207944f,-4.2424707f,11.211009f,-4.2511506f,11.219997f,-4.269277f,11.23214f,-4.320172f,11.2914715f,-5.4925594f,9.729596f,-4.3661723f,11.371997f,-4.3794417f,11.4051695f,-4.3867946f,11.419274f,-4.38682f,11.419323f,-4.386835f,11.419352f,-4.386895f,11.419468f,-4.3926144f,11.438101f,-4.405881f,11.471268f,-5.5688343f,9.81353f,-5.624127f,9.874374f,-4.4380913f,11.586269f,-5.6227827f,10.031226f,-4.461824f,11.713508f,-4.466681f,11.758824f,-4.4702754f,11.780518f,-4.471501f,11.803797f,-4.4763584f,11.849114f,-4.4812527f,11.988972f,-4.4763584f,12.128828f,-4.471501f,12.174146f,-4.4702754f,12.197425f,-4.466681f,12.219118f,-4.461824f,12.264436f,-4.4380913f,12.391673f,-5.6227827f,13.946717f,-5.6214714f,14.099735f,-4.4728208f,9.960344f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
42,0,43,1,44,2,44,2,43,1,45,3,43,1,46,4,45,3,46,4,47,5,45,3,45,3,47,5,48,6,48,6,47,5,49,7,47,5,50,8,49,7,49,7,50,8,51,9,51,9,50,8,52,10,52,10,50,8,53,11,53,11,50,8,54,12,54,12,50,8,55,13,50,8,56,14,55,13,55,13,56,14,57,15,57,15,56,14,58,16,58,16,56,14,59,17,59,17,56,14,60,18,60,18,56,14,61,19,61,19,56,14,62,20,62,20,56,14,63,21,63,21,56,14,64,22,56,14,65,23,64,22,65,23,66,24,64,22,64,22,66,24,67,25,66,24,68,26,67,25,67,25,68,26,69,27,69,27,68,26,70,28,70,28,68,26,71,29,71,29,68,26,72,30,72,30,68,26,73,31,73,31,68,26,74,32,74,32,68,26,75,33,75,33,68,26,76,34,76,34,68,26,77,35,77,35,68,26,78,36,78,36,68,26,79,37,79,37,68,26,80,38,68,26,81,39,80,38,82,40,80,38,81,39,42,0,44,2,83,41,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID536(GL2 gl){
double[] positionsArray = {
503.1693839,537.0058877,497.0371875,517.5110799,365.7459718,497.0371875,502.5421019,536.9785434,497.0371875,519.4587237,367.109526,497.0371875,519.4587237,367.109526,497.0371875,503.1693839,537.0058877,497.0371875,517.5110799,365.7459718,497.0371875,502.5421019,536.9785434,497.0371875,505.9114986,537.125421,497.0371875,509.0965866,538.1289678,497.0371875,515.5367362,540.1595151,497.0371875,515.8124681,540.3351488,497.0371875,516.1234265,540.4360454,497.0371875,524.5896297,545.9291621,497.0371875,609.8847036,430.4171609,497.0371875,531.3456308,553.42632,497.0371875,534.1390157,558.9031323,497.0371875,688.895062,486.7261746,497.0371875,688.895062,486.7261746,497.0371875,534.1390157,558.9031323,497.0371875,609.8847036,430.4171609,497.0371875,531.3456308,553.42632,497.0371875,524.5896297,545.9291621,497.0371875,516.1234265,540.4360454,497.0371875,515.8124681,540.3351488,497.0371875,515.5367362,540.1595151,497.0371875,509.0965866,538.1289678,497.0371875,505.9114986,537.125421,497.0371875,689.7467636,486.3289479,497.0371875,689.7467636,486.3289479,497.0371875,524.0487205,545.5814197,497.0371875,530.8673738,553.0216411,497.0371875,533.9705176,558.9817185,497.0371875,533.9705176,558.9817185,497.0371875,530.8673738,553.0216411,497.0371875,524.0487205,545.5814197,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,4,5,6,7,6,5,8,3,0,3,8,9,3,9,10,3,10,11,3,11,12,3,12,13,3,13,14,14,13,15,14,15,16,14,16,17,18,19,20,19,21,20,21,22,20,20,22,4,22,23,4,23,24,4,24,25,4,25,26,4,26,27,4,5,4,27,28,14,17,18,20,29,30,12,11,12,30,13,13,30,31,13,31,15,15,31,32,15,32,16,19,33,21,33,34,21,21,34,22,34,35,22,22,35,23,24,23,35,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 114, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID542(GL2 gl){
double[] positionsArray = {
317.0084325,680.5960165,508.468125,461.7488488,585.4764157,508.468125,460.4315625,575.4706332,508.468125,465.6109367,594.8003207,508.468125,465.6109367,556.1409457,508.468125,317.0084325,470.3452499,508.468125,461.7488488,565.4648507,508.468125,460.4315625,575.4706332,508.468125,317.0084325,680.5960165,508.468125,461.7488488,565.4648507,508.468125,465.6109367,556.1409457,508.468125,317.0084325,470.3452499,508.468125,465.6109367,594.8003207,508.468125,461.7488488,585.4764157,508.468125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,0,4,5,4,0,6,6,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,11,10,8,12,8,13,7,13,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID548(GL2 gl){
double[] positionsArray = {
427.1809402,773.0417271,599.915625,461.3086366,582.1326723,599.915625,292.0343525,611.9802957,599.915625,461.7488488,585.4764157,599.915625,465.6109367,594.8003207,599.915625,471.7546313,602.8069394,599.915625,479.76125,608.9506341,599.915625,485.9692821,611.5220852,599.915625,485.9692821,611.5220852,599.915625,427.1809402,773.0417271,599.915625,479.76125,608.9506341,599.915625,471.7546313,602.8069394,599.915625,465.6109367,594.8003207,599.915625,461.7488488,585.4764157,599.915625,461.3086366,582.1326723,599.915625,292.0343525,611.9802957,599.915625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID554(GL2 gl){
double[] positionsArray = {
462.581275,782.5272182,622.7775,463.0394856,588.5922886,622.7775,301.5198436,647.3806305,622.7775,465.6109367,594.8003207,622.7775,471.7546313,602.8069394,622.7775,479.76125,608.9506341,622.7775,489.085155,612.812722,622.7775,492.4288985,613.2529341,622.7775,492.4288985,613.2529341,622.7775,462.581275,782.5272182,622.7775,489.085155,612.812722,622.7775,479.76125,608.9506341,622.7775,471.7546313,602.8069394,622.7775,465.6109367,594.8003207,622.7775,463.0394856,588.5922886,622.7775,301.5198436,647.3806305,622.7775,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID560(GL2 gl){
double[] positionsArray = {
455.5025631,394.7928211,359.8659375,327.5546996,453.1649533,359.8659375,328.6587113,453.9517591,359.8659375,328.6587113,453.9517591,359.8659375,327.5546996,453.1649533,359.8659375,455.5025631,394.7928211,359.8659375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,3,4,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID566(GL2 gl){
double[] positionsArray = {
461.7492821,585.4763196,497.0371875,460.3019502,578.5571051,497.0371875,460.2877128,578.8837128,497.0371875,462.3361395,588.1080887,497.0371875,462.4727291,588.7364602,497.0371875,463.8684898,591.1124705,497.0371875,463.7402675,591.1709678,497.0371875,463.7402675,591.1709678,497.0371875,462.4727291,588.7364602,497.0371875,463.8684898,591.1124705,497.0371875,462.3361395,588.1080887,497.0371875,461.7492821,585.4763196,497.0371875,460.3019502,578.5571051,497.0371875,460.2877128,578.8837128,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,3,4,5,5,4,6,7,8,9,9,8,10,8,11,10,10,11,12,13,12,11,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID572(GL2 gl){
double[] positionsArray = {
646.4334146,725.7886455,611.3465625,528.4126939,600.9824942,611.3465625,525.9072854,603.2402222,611.3465625,533.9058106,592.5162911,611.3465625,537.0205393,582.9168436,611.3465625,537.5446163,572.8383382,611.3465625,702.5379846,523.1617419,611.3465625,536.1448721,566.2662199,611.3465625,646.4334146,725.7886455,611.3465625,537.5446163,572.8383382,611.3465625,702.5379846,523.1617419,611.3465625,536.1448721,566.2662199,611.3465625,537.0205393,582.9168436,611.3465625,533.9058106,592.5162911,611.3465625,528.4126939,600.9824942,611.3465625,525.9072854,603.2402222,611.3465625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,6,7,6,5,0,8,9,10,11,10,9,9,8,12,12,8,13,13,8,14,15,14,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID578(GL2 gl){
double[] positionsArray = {
408.5676455,765.6933002,314.1421875,460.4666908,578.9360835,314.1421875,289.4097543,592.4686431,314.1421875,410.1932815,762.2815089,314.1421875,462.5689804,588.8068132,314.1421875,467.154369,597.7970934,314.1421875,473.9103701,605.2942513,314.1421875,482.3765733,610.7873679,314.1421875,482.3765733,610.7873679,314.1421875,410.1932815,762.2815089,314.1421875,473.9103701,605.2942513,314.1421875,467.154369,597.7970934,314.1421875,462.5689804,588.8068132,314.1421875,460.4666908,578.9360835,314.1421875,408.5676455,765.6933002,314.1421875,289.4097543,592.4686431,314.1421875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,5,3,6,6,3,7,8,9,10,10,9,11,11,9,12,12,9,13,9,14,13,15,13,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID584(GL2 gl){
double[] positionsArray = {
515.5870858,785.48311,519.8990625,511.9252559,612.323884,519.8990625,502.0545261,614.4261736,519.8990625,520.9155361,607.7384953,519.8990625,688.8117429,666.3252189,519.8990625,528.4126939,600.9824942,519.8990625,533.9058106,592.5162911,519.8990625,533.9058106,592.5162911,519.8990625,688.8117429,666.3252189,519.8990625,528.4126939,600.9824942,519.8990625,520.9155361,607.7384953,519.8990625,515.5870858,785.48311,519.8990625,511.9252559,612.323884,519.8990625,502.0545261,614.4261736,519.8990625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,3,4,5,5,4,6,7,8,9,9,8,10,8,11,10,10,11,12,13,12,11,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID590(GL2 gl){
double[] positionsArray = {
586.2731225,767.1717468,428.4515625,476.7396153,607.1299471,428.4515625,376.9821205,747.1053239,428.4515625,482.3765733,610.7873679,428.4515625,491.9760208,613.9020966,428.4515625,502.0545261,614.4261736,428.4515625,511.9252559,612.323884,428.4515625,514.9296377,610.7915337,428.4515625,514.9296377,610.7915337,428.4515625,586.2731225,767.1717468,428.4515625,511.9252559,612.323884,428.4515625,502.0545261,614.4261736,428.4515625,491.9760208,613.9020966,428.4515625,482.3765733,610.7873679,428.4515625,476.7396153,607.1299471,428.4515625,376.9821205,747.1053239,428.4515625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID596(GL2 gl){
double[] positionsArray = {
310.629313,661.8279084,222.6946875,327.7875404,453.8636778,222.6946875,307.7211175,663.1546798,222.6946875,464.1013306,591.811195,222.6946875,462.5689804,588.8068132,222.6946875,460.4666908,578.9360835,222.6946875,464.1054964,559.2581306,222.6946875,467.7629173,553.6211726,222.6946875,460.9907678,568.8575781,222.6946875,460.4666908,578.9360835,222.6946875,327.7875404,453.8636778,222.6946875,460.9907678,568.8575781,222.6946875,464.1054964,559.2581306,222.6946875,467.7629173,553.6211726,222.6946875,462.5689804,588.8068132,222.6946875,464.1013306,591.811195,222.6946875,310.629313,661.8279084,222.6946875,307.7211175,663.1546798,222.6946875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,6,7,6,1,8,8,1,5,9,10,11,11,10,12,13,12,10,9,14,10,14,15,10,15,16,10,17,10,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID602(GL2 gl){
double[] positionsArray = {
551.7311225,779.4195419,405.5896875,471.6526422,602.7888427,405.5896875,349.1042188,723.3149719,405.5896875,473.9103701,605.2942513,405.5896875,482.3765733,610.7873679,405.5896875,491.9760208,613.9020966,405.5896875,502.0545261,614.4261736,405.5896875,508.6266445,613.0264295,405.5896875,508.6266445,613.0264295,405.5896875,551.7311225,779.4195419,405.5896875,502.0545261,614.4261736,405.5896875,491.9760208,613.9020966,405.5896875,482.3765733,610.7873679,405.5896875,473.9103701,605.2942513,405.5896875,471.6526422,602.7888427,405.5896875,349.1042188,723.3149719,405.5896875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID608(GL2 gl){
double[] positionsArray = {
646.4334146,725.7886455,474.1753125,488.7680668,612.8612131,474.1753125,442.9010836,778.5141145,474.1753125,491.9760208,613.9020966,474.1753125,502.0545261,614.4261736,474.1753125,511.9252559,612.323884,474.1753125,520.9155361,607.7384953,474.1753125,525.9072854,603.2402222,474.1753125,525.9072854,603.2402222,474.1753125,646.4334146,725.7886455,474.1753125,520.9155361,607.7384953,474.1753125,511.9252559,612.323884,474.1753125,502.0545261,614.4261736,474.1753125,491.9760208,613.9020966,474.1753125,488.7680668,612.8612131,474.1753125,442.9010836,778.5141145,474.1753125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID614(GL2 gl){
double[] positionsArray = {
328.621234,693.0913575,245.5565625,462.5689804,588.8068132,245.5565625,460.4666908,578.9360835,245.5565625,467.154369,597.7970934,245.5565625,325.7809964,695.045102,245.5565625,464.1054964,559.2581306,245.5565625,309.1995642,485.4492028,245.5565625,460.9907678,568.8575781,245.5565625,460.4666908,578.9360835,245.5565625,328.621234,693.0913575,245.5565625,460.9907678,568.8575781,245.5565625,464.1054964,559.2581306,245.5565625,325.7809964,695.045102,245.5565625,309.1995642,485.4492028,245.5565625,467.154369,597.7970934,245.5565625,462.5689804,588.8068132,245.5565625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,4,5,6,5,4,0,5,0,7,7,0,2,8,9,10,10,9,11,9,12,11,13,11,12,14,9,15,8,15,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID620(GL2 gl){
double[] positionsArray = {
379.1545619,744.0570486,291.2803125,462.5689804,588.8068132,291.2803125,460.4666908,578.9360835,291.2803125,467.154369,597.7970934,291.2803125,473.9103701,605.2942513,291.2803125,476.7396153,607.1299471,291.2803125,376.9821205,747.1053239,291.2803125,460.8156311,572.2256242,291.2803125,289.7146515,555.8207879,291.2803125,460.4666908,578.9360835,291.2803125,379.1545619,744.0570486,291.2803125,460.8156311,572.2256242,291.2803125,376.9821205,747.1053239,291.2803125,289.7146515,555.8207879,291.2803125,476.7396153,607.1299471,291.2803125,473.9103701,605.2942513,291.2803125,467.154369,597.7970934,291.2803125,462.5689804,588.8068132,291.2803125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,6,7,8,7,6,0,7,0,2,9,10,11,10,12,11,13,11,12,14,10,15,15,10,16,16,10,17,9,17,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID626(GL2 gl){
double[] positionsArray = {
551.7311225,779.4195419,542.7609375,511.9252559,612.323884,542.7609375,508.6266445,613.0264295,542.7609375,520.9155361,607.7384953,542.7609375,528.4126939,600.9824942,542.7609375,533.9058106,592.5162911,542.7609375,535.9796558,586.1247976,542.7609375,701.6325572,631.9917808,542.7609375,701.6325572,631.9917808,542.7609375,551.7311225,779.4195419,542.7609375,535.9796558,586.1247976,542.7609375,533.9058106,592.5162911,542.7609375,528.4126939,600.9824942,542.7609375,520.9155361,607.7384953,542.7609375,511.9252559,612.323884,542.7609375,508.6266445,613.0264295,542.7609375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID632(GL2 gl){
double[] positionsArray = {
298.2677694,627.8887726,199.8328125,351.5778925,425.9857761,199.8328125,295.4733225,628.6126798,199.8328125,461.8664349,585.5082018,199.8328125,460.4666908,578.9360835,199.8328125,469.5986131,550.7919274,199.8328125,472.1040216,548.5341995,199.8328125,464.1054964,559.2581306,199.8328125,460.9907678,568.8575781,199.8328125,460.4666908,578.9360835,199.8328125,351.5778925,425.9857761,199.8328125,460.9907678,568.8575781,199.8328125,464.1054964,559.2581306,199.8328125,469.5986131,550.7919274,199.8328125,472.1040216,548.5341995,199.8328125,461.8664349,585.5082018,199.8328125,298.2677694,627.8887726,199.8328125,295.4733225,628.6126798,199.8328125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,5,6,5,1,7,7,1,8,8,1,4,9,10,11,11,10,12,12,10,13,14,13,10,9,15,10,15,16,10,17,10,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID638(GL2 gl){
double[] positionsArray = {
515.5870858,785.48311,382.7278125,467.154369,597.7970934,382.7278125,325.7809964,695.045102,382.7278125,473.9103701,605.2942513,382.7278125,482.3765733,610.7873679,382.7278125,491.9760208,613.9020966,382.7278125,502.0545261,614.4261736,382.7278125,502.0545261,614.4261736,382.7278125,515.5870858,785.48311,382.7278125,491.9760208,613.9020966,382.7278125,482.3765733,610.7873679,382.7278125,473.9103701,605.2942513,382.7278125,467.154369,597.7970934,382.7278125,325.7809964,695.045102,382.7278125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID644(GL2 gl){
double[] positionsArray = {
478.9392306,785.1782129,359.8659375,464.1013306,591.811195,359.8659375,307.7211175,663.1546798,359.8659375,467.154369,597.7970934,359.8659375,473.9103701,605.2942513,359.8659375,482.3765733,610.7873679,359.8659375,491.9760208,613.9020966,359.8659375,495.3440669,614.0772332,359.8659375,495.3440669,614.0772332,359.8659375,478.9392306,785.1782129,359.8659375,491.9760208,613.9020966,359.8659375,482.3765733,610.7873679,359.8659375,473.9103701,605.2942513,359.8659375,467.154369,597.7970934,359.8659375,464.1013306,591.811195,359.8659375,307.7211175,663.1546798,359.8659375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID650(GL2 gl){
double[] positionsArray = {
670.2237666,697.9107439,634.2084375,533.9058106,592.5162911,634.2084375,530.2483898,598.1532491,634.2084375,537.0205393,582.9168436,634.2084375,537.5446163,572.8383382,634.2084375,535.4423267,562.9676085,634.2084375,690.2901895,488.6197418,634.2084375,533.9099764,559.9632267,634.2084375,670.2237666,697.9107439,634.2084375,537.5446163,572.8383382,634.2084375,690.2901895,488.6197418,634.2084375,535.4423267,562.9676085,634.2084375,533.9099764,559.9632267,634.2084375,537.0205393,582.9168436,634.2084375,533.9058106,592.5162911,634.2084375,530.2483898,598.1532491,634.2084375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,6,7,6,5,4,6,4,0,8,9,10,9,11,10,12,10,11,9,8,13,13,8,14,15,14,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID656(GL2 gl){
double[] positionsArray = {
618.1635447,749.1118679,588.4846875,528.4126939,600.9824942,588.4846875,520.9155361,607.7384953,588.4846875,533.9058106,592.5162911,588.4846875,537.0205393,582.9168436,588.4846875,537.5446163,572.8383382,588.4846875,708.6015527,559.3057786,588.4846875,708.6015527,559.3057786,588.4846875,618.1635447,749.1118679,588.4846875,537.5446163,572.8383382,588.4846875,537.0205393,582.9168436,588.4846875,533.9058106,592.5162911,588.4846875,528.4126939,600.9824942,588.4846875,520.9155361,607.7384953,588.4846875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID662(GL2 gl){
double[] positionsArray = {
460.4666908,578.9360835,176.9709375,379.8477624,402.6625537,176.9709375,291.9290475,592.2693382,176.9709375,460.9907678,568.8575781,176.9709375,464.1054964,559.2581306,176.9709375,469.5986131,550.7919274,176.9709375,477.095771,544.0359264,176.9709375,477.095771,544.0359264,176.9709375,469.5986131,550.7919274,176.9709375,379.8477624,402.6625537,176.9709375,464.1054964,559.2581306,176.9709375,460.9907678,568.8575781,176.9709375,460.4666908,578.9360835,176.9709375,291.9290475,592.2693382,176.9709375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID668(GL2 gl){
double[] positionsArray = {
521.4483635,607.3686718,497.0371875,528.4126939,600.9824942,497.0371875,521.1583943,607.5196457,497.0371875,526.4269438,602.8066122,497.0371875,528.8885848,600.5500185,497.0371875,530.2483898,598.1532491,497.0371875,530.3631611,598.2350442,497.0371875,530.3631611,598.2350442,497.0371875,528.8885848,600.5500185,497.0371875,530.2483898,598.1532491,497.0371875,528.4126939,600.9824942,497.0371875,526.4269438,602.8066122,497.0371875,521.4483635,607.3686718,497.0371875,521.1583943,607.5196457,497.0371875,569.3140464,743.9475854,497.0371875,495.3440669,614.0772332,497.0371875,478.9392306,785.1782129,497.0371875,502.0545261,614.4261736,497.0371875,511.9252559,612.323884,497.0371875,520.9155361,607.7384953,497.0371875,669.3530564,697.2902071,497.0371875,669.3530564,697.2902071,497.0371875,569.3140464,743.9475854,497.0371875,520.9155361,607.7384953,497.0371875,511.9252559,612.323884,497.0371875,502.0545261,614.4261736,497.0371875,495.3440669,614.0772332,497.0371875,478.9392306,785.1782129,497.0371875,670.2237666,697.9107439,497.0371875,670.2237666,697.9107439,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,5,4,6,7,8,9,9,8,10,8,11,10,11,12,10,13,10,12,14,15,16,15,14,17,17,14,18,18,14,19,19,14,2,2,14,0,0,14,3,3,14,4,4,14,6,6,14,20,21,22,7,7,22,8,8,22,11,11,22,12,12,22,13,13,22,23,23,22,24,24,22,25,25,22,26,27,26,22,28,20,14,22,21,29,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 96, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID674(GL2 gl){
double[] positionsArray = {
351.6932844,720.7686311,268.4184375,462.5689804,588.8068132,268.4184375,460.4666908,578.9360835,268.4184375,467.154369,597.7970934,268.4184375,471.6526422,602.7888427,268.4184375,349.1042188,723.3149719,268.4184375,462.0316512,565.6496241,268.4184375,296.3787499,519.7826409,268.4184375,460.9907678,568.8575781,268.4184375,460.4666908,578.9360835,268.4184375,351.6932844,720.7686311,268.4184375,460.9907678,568.8575781,268.4184375,462.0316512,565.6496241,268.4184375,349.1042188,723.3149719,268.4184375,296.3787499,519.7826409,268.4184375,471.6526422,602.7888427,268.4184375,467.154369,597.7970934,268.4184375,462.5689804,588.8068132,268.4184375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,6,7,6,5,0,6,0,8,8,0,2,9,10,11,11,10,12,10,13,12,14,12,13,15,10,16,16,10,17,9,17,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID680(GL2 gl){
double[] positionsArray = {
618.1635447,749.1118679,451.3134375,482.3765733,610.7873679,451.3134375,408.5676455,765.6933002,451.3134375,491.9760208,613.9020966,451.3134375,502.0545261,614.4261736,451.3134375,511.9252559,612.323884,451.3134375,520.9155361,607.7384953,451.3134375,520.9155361,607.7384953,451.3134375,618.1635447,749.1118679,451.3134375,511.9252559,612.323884,451.3134375,502.0545261,614.4261736,451.3134375,491.9760208,613.9020966,451.3134375,482.3765733,610.7873679,451.3134375,408.5676455,765.6933002,451.3134375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID686(GL2 gl){
double[] positionsArray = {
442.9010836,778.5141145,337.0040625,461.8664349,585.5082018,337.0040625,295.4733225,628.6126798,337.0040625,443.8987129,774.9110828,337.0040625,462.5689804,588.8068132,337.0040625,467.154369,597.7970934,337.0040625,473.9103701,605.2942513,337.0040625,482.3765733,610.7873679,337.0040625,488.7680668,612.8612131,337.0040625,488.7680668,612.8612131,337.0040625,443.8987129,774.9110828,337.0040625,482.3765733,610.7873679,337.0040625,473.9103701,605.2942513,337.0040625,467.154369,597.7970934,337.0040625,462.5689804,588.8068132,337.0040625,461.8664349,585.5082018,337.0040625,442.9010836,778.5141145,337.0040625,295.4733225,628.6126798,337.0040625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,5,3,6,6,3,7,7,3,8,9,10,11,11,10,12,12,10,13,13,10,14,14,10,15,10,16,15,17,15,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID692(GL2 gl){
double[] positionsArray = {
586.2731225,767.1717468,565.6228125,520.9155361,607.7384953,565.6228125,514.9296377,610.7915337,565.6228125,528.4126939,600.9824942,565.6228125,533.9058106,592.5162911,565.6228125,537.0205393,582.9168436,565.6228125,537.1956759,579.5487975,565.6228125,587.6088452,765.2973984,565.6228677,708.2966555,595.9536338,565.6228125,708.2966555,595.9536338,565.6228125,587.6088452,765.2973984,565.6228677,537.1956759,579.5487975,565.6228125,586.2731225,767.1717468,565.6228125,537.0205393,582.9168436,565.6228125,533.9058106,592.5162911,565.6228125,528.4126939,600.9824942,565.6228125,520.9155361,607.7384953,565.6228125,514.9296377,610.7915337,565.6228125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,2.0E-7,-1.0,0.0,2.0E-7,-1.0,0.0,2.0E-7,-1.0,0.0,2.0E-7,-1.0,0.0,2.0E-7,-1.0,0.0,2.0E-7,-1.0,0.0,2.0E-7,-1.0,0.0,2.0E-7,-1.0,0.0,2.0E-7,-1.0,-0.0,-2.0E-7,1.0,-0.0,-2.0E-7,1.0,-0.0,-2.0E-7,1.0,-0.0,-2.0E-7,1.0,-0.0,-2.0E-7,1.0,-0.0,-2.0E-7,1.0,-0.0,-2.0E-7,1.0,-0.0,-2.0E-7,1.0,-0.0,-2.0E-7,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,6,7,8,9,10,11,10,12,11,11,12,13,13,12,14,14,12,15,15,12,16,17,16,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID698(GL2 gl){
double[] positionsArray = {
618.6522374,748.5608596,314.1421875,528.9013867,600.4314859,314.1421875,521.4042288,607.187487,314.1421875,534.3945034,591.9652827,314.1421875,537.509232,582.3658352,314.1421875,538.033309,572.2873299,314.1421875,705.3227296,559.0528239,314.1421875,709.0902455,558.7547703,314.1421875,709.0902455,558.7547703,314.1421875,618.6522374,748.5608596,314.1421875,705.3227296,559.0528239,314.1421875,538.033309,572.2873299,314.1421875,537.509232,582.3658352,314.1421875,534.3945034,591.9652827,314.1421875,528.9013867,600.4314859,314.1421875,521.4042288,607.187487,314.1421875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID704(GL2 gl){
double[] positionsArray = {
496.4454737,536.7972397,519.8990625,672.7190034,456.1783114,519.8990625,482.912914,365.7403033,519.8990625,506.523979,537.3213167,519.8990625,516.1234265,540.4360454,519.8990625,524.5896297,545.9291621,519.8990625,531.3456308,553.42632,519.8990625,531.3456308,553.42632,519.8990625,524.5896297,545.9291621,519.8990625,672.7190034,456.1783114,519.8990625,516.1234265,540.4360454,519.8990625,506.523979,537.3213167,519.8990625,496.4454737,536.7972397,519.8990625,482.912914,365.7403033,519.8990625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID710(GL2 gl){
double[] positionsArray = {
472.5927144,547.9831912,611.3465625,555.5989163,372.7092988,611.3465625,352.0665852,425.4347678,611.3465625,477.5844638,543.484918,611.3465625,486.5747439,538.8995294,611.3465625,496.4454737,536.7972397,611.3465625,506.523979,537.3213167,611.3465625,509.731933,538.3622002,611.3465625,509.731933,538.3622002,611.3465625,506.523979,537.3213167,611.3465625,555.5989163,372.7092988,611.3465625,496.4454737,536.7972397,611.3465625,486.5747439,538.8995294,611.3465625,477.5844638,543.484918,611.3465625,472.5927144,547.9831912,611.3465625,352.0665852,425.4347678,611.3465625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID716(GL2 gl){
double[] positionsArray = {
516.0757785,784.9321017,245.5565625,512.4139486,611.7728757,245.5565625,502.5432189,613.8751653,245.5565625,521.4042288,607.187487,245.5565625,689.3004356,665.7742106,245.5565625,528.9013867,600.4314859,245.5565625,686.1883244,664.2913649,245.5565625,534.3945034,591.9652827,245.5565625,534.3945034,591.9652827,245.5565625,686.1883244,664.2913649,245.5565625,528.9013867,600.4314859,245.5565625,689.3004356,665.7742106,245.5565625,521.4042288,607.187487,245.5565625,516.0757785,784.9321017,245.5565625,512.4139486,611.7728757,245.5565625,502.5432189,613.8751653,245.5565625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,3,4,5,5,4,6,5,6,7,8,9,10,9,11,10,10,11,12,11,13,12,12,13,14,15,14,13,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID722(GL2 gl){
double[] positionsArray = {
708.7853483,595.4026254,428.4515625,538.033309,572.2873299,428.4515625,537.6843687,578.9977892,428.4515625,621.5178793,404.1180894,428.4515625,524.5896297,545.9291621,428.4515625,521.7603845,544.0934663,428.4515625,531.3456308,553.42632,428.4515625,535.9310194,562.4166002,428.4515625,538.033309,572.2873299,428.4515625,535.9310194,562.4166002,428.4515625,621.5178793,404.1180894,428.4515625,531.3456308,553.42632,428.4515625,524.5896297,545.9291621,428.4515625,521.7603845,544.0934663,428.4515625,708.7853483,595.4026254,428.4515625,537.6843687,578.9977892,428.4515625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,4,3,5,3,4,6,3,6,7,3,7,1,8,9,10,9,11,10,11,12,10,13,10,12,10,14,8,15,8,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID728(GL2 gl){
double[] positionsArray = {
670.7124594,697.3597355,222.6946875,495.8327596,613.5262249,222.6946875,479.4279234,784.6272045,222.6946875,502.5432189,613.8751653,222.6946875,512.4139486,611.7728757,222.6946875,521.4042288,607.187487,222.6946875,528.9013867,600.4314859,222.6946875,668.1093439,695.5045501,222.6946875,530.7370825,597.6022408,222.6946875,530.7370825,597.6022408,222.6946875,668.1093439,695.5045501,222.6946875,528.9013867,600.4314859,222.6946875,670.7124594,697.3597355,222.6946875,521.4042288,607.187487,222.6946875,512.4139486,611.7728757,222.6946875,502.5432189,613.8751653,222.6946875,495.8327596,613.5262249,222.6946875,479.4279234,784.6272045,222.6946875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,6,7,8,9,10,11,10,12,11,11,12,13,13,12,14,14,12,15,15,12,16,17,16,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID734(GL2 gl){
double[] positionsArray = {
524.5896297,545.9291621,451.3134375,589.9323543,385.5301131,451.3134375,516.1234265,540.4360454,451.3134375,531.3456308,553.42632,451.3134375,535.9310194,562.4166002,451.3134375,538.033309,572.2873299,451.3134375,709.0902455,558.7547703,451.3134375,709.0902455,558.7547703,451.3134375,538.033309,572.2873299,451.3134375,589.9323543,385.5301131,451.3134375,535.9310194,562.4166002,451.3134375,531.3456308,553.42632,451.3134375,524.5896297,545.9291621,451.3134375,516.1234265,540.4360454,451.3134375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID740(GL2 gl){
double[] positionsArray = {
617.2199877,746.4787402,176.9709375,482.865266,610.2363596,176.9709375,409.0563382,765.1422919,176.9709375,492.4647136,613.3510883,176.9709375,502.5432189,613.8751653,176.9709375,512.4139486,611.7728757,176.9709375,521.4042288,607.187487,176.9709375,521.4042288,607.187487,176.9709375,617.2199877,746.4787402,176.9709375,512.4139486,611.7728757,176.9709375,502.5432189,613.8751653,176.9709375,492.4647136,613.3510883,176.9709375,482.865266,610.2363596,176.9709375,409.0563382,765.1422919,176.9709375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID746(GL2 gl){
double[] positionsArray = {
689.3004356,665.7742106,382.7278125,537.509232,582.3658352,382.7278125,534.3945034,591.9652827,382.7278125,538.033309,572.2873299,382.7278125,672.7190034,456.1783114,382.7278125,535.9310194,562.4166002,382.7278125,531.3456308,553.42632,382.7278125,538.033309,572.2873299,382.7278125,535.9310194,562.4166002,382.7278125,672.7190034,456.1783114,382.7278125,531.3456308,553.42632,382.7278125,689.3004356,665.7742106,382.7278125,537.509232,582.3658352,382.7278125,534.3945034,591.9652827,382.7278125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,4,6,4,5,3,7,8,9,10,9,8,9,11,7,7,11,12,13,12,11,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID752(GL2 gl){
double[] positionsArray = {
670.7124594,697.3597355,359.8659375,534.3945034,591.9652827,359.8659375,530.7370825,597.6022408,359.8659375,537.509232,582.3658352,359.8659375,538.033309,572.2873299,359.8659375,535.9310194,562.4166002,359.8659375,690.7788823,488.0687335,359.8659375,534.3986692,559.4122184,359.8659375,670.7124594,697.3597355,359.8659375,538.033309,572.2873299,359.8659375,690.7788823,488.0687335,359.8659375,535.9310194,562.4166002,359.8659375,534.3986692,559.4122184,359.8659375,537.509232,582.3658352,359.8659375,534.3945034,591.9652827,359.8659375,530.7370825,597.6022408,359.8659375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,6,7,6,5,4,6,4,0,8,9,10,9,11,10,12,10,11,9,8,13,13,8,14,15,14,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID758(GL2 gl){
double[] positionsArray = {
516.1234265,540.4360454,474.1753125,555.5989163,372.7092988,474.1753125,509.731933,538.3622002,474.1753125,524.5896297,545.9291621,474.1753125,531.3456308,553.42632,474.1753125,535.9310194,562.4166002,474.1753125,536.6335649,565.7152115,474.1753125,703.0266773,522.6107335,474.1753125,703.0266773,522.6107335,474.1753125,536.6335649,565.7152115,474.1753125,555.5989163,372.7092988,474.1753125,535.9310194,562.4166002,474.1753125,531.3456308,553.42632,474.1753125,524.5896297,545.9291621,474.1753125,516.1234265,540.4360454,474.1753125,509.731933,538.3622002,474.1753125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID764(GL2 gl){
double[] positionsArray = {
646.9221074,725.2376372,199.8328125,489.2567596,612.3102048,199.8328125,443.3897763,777.9631062,199.8328125,492.4647136,613.3510883,199.8328125,502.5432189,613.8751653,199.8328125,512.4139486,611.7728757,199.8328125,521.4042288,607.187487,199.8328125,526.3959782,602.6892138,199.8328125,644.8979618,723.1795288,199.8328125,644.8979618,723.1795288,199.8328125,646.9221074,725.2376372,199.8328125,526.3959782,602.6892138,199.8328125,521.4042288,607.187487,199.8328125,512.4139486,611.7728757,199.8328125,502.5432189,613.8751653,199.8328125,492.4647136,613.3510883,199.8328125,489.2567596,612.3102048,199.8328125,443.3897763,777.9631062,199.8328125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,7,0,8,9,10,11,11,10,12,12,10,13,13,10,14,14,10,15,15,10,16,17,16,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID770(GL2 gl){
double[] positionsArray = {
552.2198152,778.8685335,268.4184375,512.4139486,611.7728757,268.4184375,509.1153373,612.4754211,268.4184375,521.4042288,607.187487,268.4184375,528.9013867,600.4314859,268.4184375,534.3945034,591.9652827,268.4184375,536.4683486,585.5737892,268.4184375,698.6215214,630.4717463,268.4184375,702.1212499,631.4407725,268.4184375,702.1212499,631.4407725,268.4184375,552.2198152,778.8685335,268.4184375,698.6215214,630.4717463,268.4184375,536.4683486,585.5737892,268.4184375,534.3945034,591.9652827,268.4184375,528.9013867,600.4314859,268.4184375,521.4042288,607.187487,268.4184375,512.4139486,611.7728757,268.4184375,509.1153373,612.4754211,268.4184375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,7,0,8,9,10,11,11,10,12,12,10,13,13,10,14,14,10,15,15,10,16,17,16,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID776(GL2 gl){
double[] positionsArray = {
702.1212499,631.4407725,405.5896875,537.509232,582.3658352,405.5896875,536.4683486,585.5737892,405.5896875,538.033309,572.2873299,405.5896875,649.395781,427.9084414,405.5896875,531.3456308,553.42632,405.5896875,526.8473576,548.4345706,405.5896875,535.9310194,562.4166002,405.5896875,538.033309,572.2873299,405.5896875,535.9310194,562.4166002,405.5896875,649.395781,427.9084414,405.5896875,531.3456308,553.42632,405.5896875,526.8473576,548.4345706,405.5896875,702.1212499,631.4407725,405.5896875,537.509232,582.3658352,405.5896875,536.4683486,585.5737892,405.5896875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,4,6,4,5,7,4,7,3,8,9,10,9,11,10,12,10,11,10,13,8,8,13,14,15,14,13,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID782(GL2 gl){
double[] positionsArray = {
489.8733553,538.1969839,542.7609375,649.395781,427.9084414,542.7609375,446.7688773,371.8038715,542.7609375,496.4454737,536.7972397,542.7609375,506.523979,537.3213167,542.7609375,516.1234265,540.4360454,542.7609375,524.5896297,545.9291621,542.7609375,526.8473576,548.4345706,542.7609375,526.8473576,548.4345706,542.7609375,524.5896297,545.9291621,542.7609375,649.395781,427.9084414,542.7609375,516.1234265,540.4360454,542.7609375,506.523979,537.3213167,542.7609375,496.4454737,536.7972397,542.7609375,489.8733553,538.1969839,542.7609375,446.7688773,371.8038715,542.7609375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID788(GL2 gl){
double[] positionsArray = {
483.5703622,540.4318796,565.6228125,619.2267846,403.8984939,565.6228677,412.2268773,384.0516665,565.6228125,486.5747439,538.8995294,565.6228125,496.4454737,536.7972397,565.6228125,506.523979,537.3213167,565.6228125,516.1234265,540.4360454,565.6228125,521.7603845,544.0934663,565.6228125,621.5178793,404.1180894,565.6228125,621.5178793,404.1180894,565.6228125,521.7603845,544.0934663,565.6228125,619.2267846,403.8984939,565.6228677,516.1234265,540.4360454,565.6228125,506.523979,537.3213167,565.6228125,496.4454737,536.7972397,565.6228125,486.5747439,538.8995294,565.6228125,483.5703622,540.4318796,565.6228125,412.2268773,384.0516665,565.6228125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
1.0E-7,-1.0E-7,-1.0,1.0E-7,-1.0E-7,-1.0,1.0E-7,-1.0E-7,-1.0,1.0E-7,-1.0E-7,-1.0,1.0E-7,-1.0E-7,-1.0,1.0E-7,-1.0E-7,-1.0,1.0E-7,-1.0E-7,-1.0,1.0E-7,-1.0E-7,-1.0,1.0E-7,-1.0E-7,-1.0,-1.0E-7,1.0E-7,1.0,-1.0E-7,1.0E-7,1.0,-1.0E-7,1.0E-7,1.0,-1.0E-7,1.0E-7,1.0,-1.0E-7,1.0E-7,1.0,-1.0E-7,1.0E-7,1.0,-1.0E-7,1.0E-7,1.0,-1.0E-7,1.0E-7,1.0,-1.0E-7,1.0E-7,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID794(GL2 gl){
double[] positionsArray = {
468.2516101,553.0701642,634.2084375,519.5607692,366.0452005,634.2084375,328.2762332,453.3126695,634.2084375,470.0873059,550.2409191,634.2084375,477.5844638,543.484918,634.2084375,486.5747439,538.8995294,634.2084375,496.4454737,536.7972397,634.2084375,503.1559329,537.1461801,634.2084375,503.1559329,537.1461801,634.2084375,496.4454737,536.7972397,634.2084375,519.5607692,366.0452005,634.2084375,486.5747439,538.8995294,634.2084375,477.5844638,543.484918,634.2084375,470.0873059,550.2409191,634.2084375,468.2516101,553.0701642,634.2084375,328.2762332,453.3126695,634.2084375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID800(GL2 gl){
double[] positionsArray = {
477.5844638,543.484918,588.4846875,589.9323543,385.5301131,588.4846875,380.3364551,402.1115454,588.4846875,486.5747439,538.8995294,588.4846875,496.4454737,536.7972397,588.4846875,506.523979,537.3213167,588.4846875,516.1234265,540.4360454,588.4846875,516.1234265,540.4360454,588.4846875,506.523979,537.3213167,588.4846875,589.9323543,385.5301131,588.4846875,496.4454737,536.7972397,588.4846875,486.5747439,538.8995294,588.4846875,477.5844638,543.484918,588.4846875,380.3364551,402.1115454,588.4846875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 30, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID806(GL2 gl){
double[] positionsArray = {
586.7618153,766.6207385,291.2803125,521.4042288,607.187487,291.2803125,515.4183304,610.2405254,291.2803125,528.9013867,600.4314859,291.2803125,534.3945034,591.9652827,291.2803125,537.509232,582.3658352,291.2803125,537.6843687,578.9977892,291.2803125,705.0592437,595.0453736,291.2803125,708.7853483,595.4026254,291.2803125,708.7853483,595.4026254,291.2803125,586.7618153,766.6207385,291.2803125,705.0592437,595.0453736,291.2803125,537.6843687,578.9977892,291.2803125,537.509232,582.3658352,291.2803125,534.3945034,591.9652827,291.2803125,528.9013867,600.4314859,291.2803125,521.4042288,607.187487,291.2803125,515.4183304,610.2405254,291.2803125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,7,0,8,9,10,11,11,10,12,12,10,13,13,10,14,14,10,15,15,10,16,17,16,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID812(GL2 gl){
double[] positionsArray = {
646.9221074,725.2376372,337.0040625,528.9013867,600.4314859,337.0040625,526.3959782,602.6892138,337.0040625,534.3945034,591.9652827,337.0040625,537.509232,582.3658352,337.0040625,538.033309,572.2873299,337.0040625,699.4075457,523.548277,337.0040625,536.6335649,565.7152115,337.0040625,703.0266773,522.6107335,337.0040625,703.0266773,522.6107335,337.0040625,646.9221074,725.2376372,337.0040625,699.4075457,523.548277,337.0040625,538.033309,572.2873299,337.0040625,536.6335649,565.7152115,337.0040625,537.509232,582.3658352,337.0040625,534.3945034,591.9652827,337.0040625,528.9013867,600.4314859,337.0040625,526.3959782,602.6892138,337.0040625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,6,7,6,5,0,6,0,8,9,10,11,10,12,11,13,11,12,12,10,14,14,10,15,15,10,16,17,16,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 42, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID818(GL2 gl){
double[] positionsArray = {
499.0909375,785.7213998,687.264375,323.6053291,676.7872965,687.264375,317.0084325,680.5960165,687.264375,329.8874865,680.5960165,687.264375,492.6514105,774.5678118,687.264375,499.0909375,778.4719413,687.264375,516.8007512,772.7395591,687.264375,504.9377802,774.1860249,687.264375,513.0033391,768.273721,687.264375,528.0603444,753.4730603,687.264375,532.4603233,757.3465903,687.264375,540.8331892,736.6615345,687.264375,545.744325,739.8622835,687.264375,551.0565166,718.1884043,687.264375,556.3767802,720.6498764,687.264375,558.5179364,698.4374505,687.264375,564.1367987,700.1085084,687.264375,563.0624368,677.8190005,687.264375,564.5956056,656.7614043,687.264375,568.8631657,678.664928,687.264375,564.1844601,613.413822,687.264375,563.085591,635.7021351,687.264375,568.8872465,634.8625862,687.264375,570.4576904,656.7646271,687.264375,570.4576904,656.7646271,687.264375,568.8631657,678.664928,687.264375,568.8872465,634.8625862,687.264375,564.5956056,656.7614043,687.264375,564.1844601,613.413822,687.264375,563.085591,635.7021351,687.264375,564.1367987,700.1085084,687.264375,563.0624368,677.8190005,687.264375,558.5179364,698.4374505,687.264375,556.3767802,720.6498764,687.264375,551.0565166,718.1884043,687.264375,545.744325,739.8622835,687.264375,540.8331892,736.6615345,687.264375,532.4603233,757.3465903,687.264375,528.0603444,753.4730603,687.264375,516.8007512,772.7395591,687.264375,513.0033391,768.273721,687.264375,504.9377802,774.1860249,687.264375,499.0909375,778.4719413,687.264375,499.0909375,785.7213998,687.264375,492.6514105,774.5678118,687.264375,329.8874865,680.5960165,687.264375,323.6053291,676.7872965,687.264375,317.0084325,680.5960165,687.264375,499.0909375,778.4719413,687.264375,504.9377802,774.1860249,645.639375,499.0909375,778.4719413,645.639375,504.9377802,774.1860249,687.264375,504.9377802,774.1860249,687.264375,499.0909375,778.4719413,687.264375,504.9377802,774.1860249,645.639375,499.0909375,778.4719413,645.639375,492.6514105,774.5678118,687.264375,499.0909375,778.4719413,645.639375,492.6514105,774.5678118,645.639375,499.0909375,778.4719413,687.264375,499.0909375,778.4719413,687.264375,492.6514105,774.5678118,687.264375,499.0909375,778.4719413,645.639375,492.6514105,774.5678118,645.639375,329.8874865,680.5960165,687.264375,492.6514105,774.5678118,645.639375,329.8874865,680.5960165,645.639375,492.6514105,774.5678118,687.264375,492.6514105,774.5678118,687.264375,329.8874865,680.5960165,687.264375,492.6514105,774.5678118,645.639375,329.8874865,680.5960165,645.639375,323.6053291,676.7872965,687.264375,329.8874865,680.5960165,645.639375,323.6053291,676.7872965,645.639375,329.8874865,680.5960165,687.264375,329.8874865,680.5960165,687.264375,323.6053291,676.7872965,687.264375,329.8874865,680.5960165,645.639375,323.6053291,676.7872965,645.639375,317.0084325,680.5960165,687.264375,323.6053291,676.7872965,645.639375,317.0084325,680.5960165,645.639375,323.6053291,676.7872965,687.264375,323.6053291,676.7872965,687.264375,317.0084325,680.5960165,687.264375,323.6053291,676.7872965,645.639375,317.0084325,680.5960165,645.639375,499.0909375,785.7213998,687.264375,317.0084325,680.5960165,645.639375,499.0909375,785.7213998,645.639375,317.0084325,680.5960165,687.264375,317.0084325,680.5960165,687.264375,499.0909375,785.7213998,687.264375,317.0084325,680.5960165,645.639375,499.0909375,785.7213998,645.639375,516.8007512,772.7395591,687.264375,499.0909375,785.7213998,645.639375,516.8007512,772.7395591,645.639375,499.0909375,785.7213998,687.264375,499.0909375,785.7213998,687.264375,516.8007512,772.7395591,687.264375,499.0909375,785.7213998,645.639375,516.8007512,772.7395591,645.639375,532.4603233,757.3465903,687.264375,532.4603233,757.3465903,645.639375,532.4603233,757.3465903,687.264375,532.4603233,757.3465903,645.639375,545.744325,739.8622835,645.639375,545.744325,739.8622835,687.264375,545.744325,739.8622835,645.639375,545.744325,739.8622835,687.264375,556.3767802,720.6498764,645.639375,556.3767802,720.6498764,687.264375,556.3767802,720.6498764,645.639375,556.3767802,720.6498764,687.264375,564.1367987,700.1085084,645.639375,564.1367987,700.1085084,687.264375,564.1367987,700.1085084,645.639375,564.1367987,700.1085084,687.264375,568.8631657,678.664928,645.639375,568.8631657,678.664928,687.264375,568.8631657,678.664928,645.639375,568.8631657,678.664928,687.264375,570.4576904,656.7646271,645.639375,570.4576904,656.7646271,687.264375,570.4576904,656.7646271,645.639375,570.4576904,656.7646271,687.264375,568.8872465,634.8625862,645.639375,568.8872465,634.8625862,687.264375,568.8872465,634.8625862,645.639375,568.8872465,634.8625862,687.264375,564.1844601,613.413822,645.639375,564.1844601,613.413822,687.264375,564.1844601,613.413822,645.639375,564.1844601,613.413822,687.264375,563.085591,635.7021351,645.639375,564.1844601,613.413822,687.264375,564.1844601,613.413822,645.639375,563.085591,635.7021351,687.264375,563.085591,635.7021351,687.264375,563.085591,635.7021351,645.639375,564.1844601,613.413822,687.264375,564.1844601,613.413822,645.639375,564.5956056,656.7614043,645.639375,563.085591,635.7021351,687.264375,563.085591,635.7021351,645.639375,564.5956056,656.7614043,687.264375,564.5956056,656.7614043,687.264375,564.5956056,656.7614043,645.639375,563.085591,635.7021351,687.264375,563.085591,635.7021351,645.639375,563.0624368,677.8190005,645.639375,564.5956056,656.7614043,687.264375,564.5956056,656.7614043,645.639375,563.0624368,677.8190005,687.264375,563.0624368,677.8190005,687.264375,563.0624368,677.8190005,645.639375,564.5956056,656.7614043,687.264375,564.5956056,656.7614043,645.639375,558.5179364,698.4374505,645.639375,563.0624368,677.8190005,687.264375,563.0624368,677.8190005,645.639375,558.5179364,698.4374505,687.264375,558.5179364,698.4374505,687.264375,558.5179364,698.4374505,645.639375,563.0624368,677.8190005,687.264375,563.0624368,677.8190005,645.639375,551.0565166,718.1884043,645.639375,558.5179364,698.4374505,687.264375,558.5179364,698.4374505,645.639375,551.0565166,718.1884043,687.264375,551.0565166,718.1884043,687.264375,551.0565166,718.1884043,645.639375,558.5179364,698.4374505,687.264375,558.5179364,698.4374505,645.639375,540.8331892,736.6615345,645.639375,551.0565166,718.1884043,687.264375,551.0565166,718.1884043,645.639375,540.8331892,736.6615345,687.264375,540.8331892,736.6615345,687.264375,540.8331892,736.6615345,645.639375,551.0565166,718.1884043,687.264375,551.0565166,718.1884043,645.639375,528.0603444,753.4730603,645.639375,540.8331892,736.6615345,687.264375,540.8331892,736.6615345,645.639375,528.0603444,753.4730603,687.264375,528.0603444,753.4730603,687.264375,528.0603444,753.4730603,645.639375,540.8331892,736.6615345,687.264375,540.8331892,736.6615345,645.639375,513.0033391,768.273721,687.264375,528.0603444,753.4730603,645.639375,513.0033391,768.273721,645.639375,528.0603444,753.4730603,687.264375,528.0603444,753.4730603,687.264375,513.0033391,768.273721,687.264375,528.0603444,753.4730603,645.639375,513.0033391,768.273721,645.639375,504.9377802,774.1860249,687.264375,513.0033391,768.273721,645.639375,504.9377802,774.1860249,645.639375,513.0033391,768.273721,687.264375,513.0033391,768.273721,687.264375,504.9377802,774.1860249,687.264375,513.0033391,768.273721,645.639375,504.9377802,774.1860249,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.591205,0.8065213,0.0,0.591205,0.8065213,0.0,0.591205,0.8065213,0.0,0.591205,0.8065213,0.0,-0.591205,-0.8065213,-0.0,-0.591205,-0.8065213,-0.0,-0.591205,-0.8065213,-0.0,-0.591205,-0.8065213,-0.0,-0.5184363,0.8551163,-0.0,-0.5184363,0.8551163,-0.0,-0.5184363,0.8551163,-0.0,-0.5184363,0.8551163,-0.0,0.5184363,-0.8551163,0.0,0.5184363,-0.8551163,0.0,0.5184363,-0.8551163,0.0,0.5184363,-0.8551163,0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,-0.5184363,0.8551163,-0.0,-0.5184363,0.8551163,-0.0,-0.5184363,0.8551163,-0.0,-0.5184363,0.8551163,-0.0,0.5184363,-0.8551163,0.0,0.5184363,-0.8551163,0.0,0.5184363,-0.8551163,0.0,0.5184363,-0.8551163,0.0,0.5,0.8660254,0.0,0.5,0.8660254,0.0,0.5,0.8660254,0.0,0.5,0.8660254,0.0,-0.5,-0.8660254,-0.0,-0.5,-0.8660254,-0.0,-0.5,-0.8660254,-0.0,-0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,-0.647792,-0.7618173,0.0,-0.591205,-0.8065213,-0.0,-0.647792,-0.7618173,0.0,-0.591205,-0.8065213,-0.0,0.591205,0.8065213,0.0,0.647792,0.7618173,-0.0,0.591205,0.8065213,0.0,0.647792,0.7618173,-0.0,-0.7505825,-0.6607768,0.0,-0.7505825,-0.6607768,0.0,0.7505825,0.6607768,-0.0,0.7505825,0.6607768,-0.0,-0.8377796,-0.5460086,0.0,-0.8377796,-0.5460086,0.0,0.8377796,0.5460086,-0.0,0.8377796,0.5460086,-0.0,-0.9075718,-0.419897,0.0,-0.9075718,-0.419897,0.0,0.9075718,0.419897,-0.0,0.9075718,0.419897,-0.0,-0.9585091,-0.285062,0.0,-0.9585091,-0.285062,0.0,0.9585091,0.285062,-0.0,0.9585091,0.285062,-0.0,-0.9895333,-0.1443049,0.0,-0.9895333,-0.1443049,0.0,0.9895333,0.1443049,-0.0,0.9895333,0.1443049,-0.0,-0.9999998,-5.498E-4,0.0,-0.9999998,-5.498E-4,0.0,0.9999998,5.498E-4,-0.0,0.9999998,5.498E-4,-0.0,-0.9896913,0.1432168,0.0,-0.9896913,0.1432168,0.0,0.9896913,-0.1432168,-0.0,0.9896913,-0.1432168,-0.0,-0.9767966,0.2141692,-0.0,-0.9767966,0.2141692,-0.0,0.9767966,-0.2141692,0.0,0.9767966,-0.2141692,0.0,0.9987868,0.0492427,0.0,0.9987868,0.0492427,0.0,0.9987868,0.0492427,0.0,0.9987868,0.0492427,0.0,-0.9987868,-0.0492427,-0.0,-0.9987868,-0.0492427,-0.0,-0.9987868,-0.0492427,-0.0,-0.9987868,-0.0492427,-0.0,0.9974392,-0.0715195,-0.0,0.9974392,-0.0715195,-0.0,0.9974392,-0.0715195,-0.0,0.9974392,-0.0715195,-0.0,-0.9974392,0.0715195,0.0,-0.9974392,0.0715195,0.0,-0.9974392,0.0715195,0.0,-0.9974392,0.0715195,0.0,0.99736,0.0726161,0.0,0.99736,0.0726161,0.0,0.99736,0.0726161,0.0,0.99736,0.0726161,0.0,-0.99736,-0.0726161,-0.0,-0.99736,-0.0726161,-0.0,-0.99736,-0.0726161,-0.0,-0.99736,-0.0726161,-0.0,0.9765605,0.2152431,0.0,0.9765605,0.2152431,0.0,0.9765605,0.2152431,0.0,0.9765605,0.2152431,0.0,-0.9765605,-0.2152431,-0.0,-0.9765605,-0.2152431,-0.0,-0.9765605,-0.2152431,-0.0,-0.9765605,-0.2152431,-0.0,0.9354729,0.3533984,0.0,0.9354729,0.3533984,0.0,0.9354729,0.3533984,0.0,0.9354729,0.3533984,0.0,-0.9354729,-0.3533984,-0.0,-0.9354729,-0.3533984,-0.0,-0.9354729,-0.3533984,-0.0,-0.9354729,-0.3533984,-0.0,0.8749508,0.4842118,0.0,0.8749508,0.4842118,0.0,0.8749508,0.4842118,0.0,0.8749508,0.4842118,0.0,-0.8749508,-0.4842118,-0.0,-0.8749508,-0.4842118,-0.0,-0.8749508,-0.4842118,-0.0,-0.8749508,-0.4842118,-0.0,0.7962515,0.6049657,0.0,0.7962515,0.6049657,0.0,0.7962515,0.6049657,0.0,0.7962515,0.6049657,0.0,-0.7962515,-0.6049657,-0.0,-0.7962515,-0.6049657,-0.0,-0.7962515,-0.6049657,-0.0,-0.7962515,-0.6049657,-0.0,0.70101,0.7131514,0.0,0.70101,0.7131514,0.0,0.70101,0.7131514,0.0,0.70101,0.7131514,0.0,-0.70101,-0.7131514,-0.0,-0.70101,-0.7131514,-0.0,-0.70101,-0.7131514,-0.0,-0.70101,-0.7131514,-0.0,0.591205,0.8065213,0.0,0.591205,0.8065213,0.0,0.591205,0.8065213,0.0,0.591205,0.8065213,0.0,-0.591205,-0.8065213,-0.0,-0.591205,-0.8065213,-0.0,-0.591205,-0.8065213,-0.0,-0.591205,-0.8065213,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,5,6,7,7,6,8,8,6,9,9,6,10,9,10,11,11,10,12,11,12,13,13,12,14,13,14,15,15,14,16,15,16,17,17,16,18,18,16,19,18,20,21,20,18,22,22,18,19,22,19,23,48,49,50,49,48,51,56,57,58,57,56,59,64,65,66,65,64,67,72,73,74,73,72,75,80,81,82,81,80,83,88,89,90,89,88,91,96,97,98,97,96,99,104,98,105,98,104,96,104,108,109,108,104,105,109,112,113,112,109,108,113,116,117,116,113,112,117,120,121,120,117,116,121,124,125,124,121,120,125,128,129,128,125,124,129,132,133,132,129,128,136,137,138,137,136,139,144,145,146,145,144,147,152,153,154,153,152,155,160,161,162,161,160,163,168,169,170,169,168,171,176,177,178,177,176,179,184,185,186,185,184,187,192,193,194,193,192,195,200,201,202,201,200,203,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 210, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID824.bind();
texcoordArray = new float[] {
-14.828062f,13.139395f,-15.377048f,12.873582f,-14.322992f,13.481369f,-14.909402f,13.280459f,-13.872332f,13.8924f,-14.423767f,13.609275f,-15.958544f,12.689453f,-15.4372635f,13.024876f,-15.996384f,12.847832f,-16.56047f,12.590834f,-16.57515f,12.753007f,-17.170322f,12.579772f,-17.161533f,12.742371f,-17.775429f,12.656498f,-17.743357f,12.816144f,-18.36322f,12.819417f,-18.30853f,12.972795f,-18.56278f,13.084706f,-18.74709f,13.1658325f,-18.921484f,13.0651455f,-18.742609f,13.374968f,-18.742609f,18.595623f,-18.738237f,18.799646f,-18.921484f,18.905445f,-24.185623f,27.652737f,-24.28631f,27.827131f,-23.18428f,28.230862f,-23.284967f,28.405256f,-11.951894f,6.463296f,-12.056485f,6.6444535f,-10.950552f,7.041421f,-11.055143f,7.2225785f,-12.180177f,6.8586926f,-14.790504f,11.379912f,-11.178835f,7.4368176f,-13.789163f,11.958037f,-14.666214f,11.164637f,-14.7682495f,11.341367f,-13.664872f,11.742762f,-13.766908f,11.919492f,-24.29234f,27.837574f,-24.398138f,28.020823f,-23.290998f,28.415699f,-23.396795f,28.598948f,-32.024174f,41.229507f,-34.944324f,46.287354f,-31.022833f,41.807632f,-33.94298f,46.86548f,-22.623755f,24.947498f,-22.92873f,25.475733f,-21.622412f,25.525623f,-21.927387f,26.053858f,-21.08006f,22.27374f,-21.385035f,22.801975f,-20.078716f,22.851866f,-20.383694f,23.3801f,-18.581812f,20.259151f,-19.583155f,19.681026f,-18.88679f,20.787386f,-19.88813f,20.20926f,-17.162798f,17.801346f,-18.164139f,17.22322f,-17.467773f,18.329578f,-18.469116f,17.751453f,-15.851151f,15.529508f,-16.852493f,14.951383f,-16.156128f,16.057741f,-17.157469f,15.479616f,-14.674124f,13.490835f,-15.675466f,12.91271f,-14.979099f,14.01907f,-15.980441f,13.440945f,-13.656167f,11.727684f,-14.657509f,11.149559f,-13.9611435f,12.255918f,-14.962485f,11.677793f,-12.818431f,10.276682f,-13.819773f,9.698557f,-13.123406f,10.804915f,-14.124748f,10.22679f,-12.178318f,9.1679735f,-13.17966f,8.5898485f,-12.483294f,9.696207f,-13.484635f,9.118082f,-31.91817f,41.045902f,-30.91683f,41.624027f,-31.608236f,40.50908f,-30.606894f,41.087204f,-33.14395f,43.169014f,-32.14261f,43.74714f,-32.850708f,42.661106f,-31.849367f,43.23923f,-32.306213f,41.71801f,-31.304873f,42.296135f,-32.012974f,41.210102f,-31.011631f,41.788227f,-31.288258f,39.95486f,-30.286915f,40.532986f,-30.995016f,39.446953f,-29.993675f,40.025078f,-30.111229f,37.916187f,-29.109888f,38.494312f,-29.81799f,37.40828f,-28.816647f,37.986404f,-28.799583f,35.64435f,-27.79824f,36.222473f,-28.506342f,35.13644f,-27.505001f,35.714565f,-27.380568f,33.186543f,-26.379227f,33.764668f,-27.087328f,32.678635f,-26.085985f,33.25676f,-25.590424f,30.08592f,-25.883663f,30.593828f,-24.58908f,30.664045f,-24.882322f,31.171953f,-24.046728f,27.412163f,-24.185623f,27.652737f,-23.045385f,27.990288f,-23.18428f,28.230862f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
24,0,25,1,26,2,25,1,27,3,26,2,26,2,27,3,28,4,29,5,28,4,27,3,25,1,30,6,27,3,27,3,30,6,31,7,31,7,30,6,32,8,30,6,33,9,32,8,32,8,33,9,34,10,33,9,35,11,34,10,34,10,35,11,36,12,35,11,37,13,36,12,36,12,37,13,38,14,37,13,39,15,38,14,38,14,39,15,40,16,40,16,39,15,41,17,41,17,39,15,42,18,39,15,43,19,42,18,42,18,43,19,44,20,44,20,43,19,45,21,45,21,43,19,46,22,47,23,46,22,43,19,52,24,53,25,54,26,55,27,54,26,53,25,60,28,61,29,62,30,63,31,62,30,61,29,68,32,69,33,70,34,71,35,70,34,69,33,76,36,77,37,78,38,79,39,78,38,77,37,84,40,85,41,86,42,87,43,86,42,85,41,92,44,93,45,94,46,95,47,94,46,93,45,100,48,101,49,102,50,103,51,102,50,101,49,101,52,106,53,103,54,107,55,103,54,106,53,107,56,106,57,110,58,111,59,110,58,106,57,110,60,111,61,114,62,115,63,114,62,111,61,114,64,115,65,118,66,119,67,118,66,115,65,118,68,119,69,122,70,123,71,122,70,119,69,122,72,123,73,126,74,127,75,126,74,123,73,126,76,127,77,130,78,131,79,130,78,127,77,130,80,131,81,134,82,135,83,134,82,131,81,140,84,141,85,142,86,143,87,142,86,141,85,148,88,149,89,150,90,151,91,150,90,149,89,156,92,157,93,158,94,159,95,158,94,157,93,164,96,165,97,166,98,167,99,166,98,165,97,172,100,173,101,174,102,175,103,174,102,173,101,180,104,181,105,182,106,183,107,182,106,181,105,188,108,189,109,190,110,191,111,190,110,189,109,196,112,197,113,198,114,199,115,198,114,197,113,204,116,205,117,206,118,207,119,206,118,205,117,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID831(GL2 gl){
double[] positionsArray = {
681.1734425,680.5960165,687.264375,674.7339155,669.4424285,687.264375,674.5765459,676.7872965,687.264375,674.8952273,473.9699792,687.264375,681.1734425,470.3452499,687.264375,519.2556215,489.9338866,687.264375,515.6277231,485.32928,687.264375,499.4039416,500.1263946,687.264375,533.8102249,473.0182153,687.264375,536.7384763,478.096541,687.264375,553.5737042,463.4489638,687.264375,555.741474,468.8955061,687.264375,574.5075731,456.8203274,687.264375,575.8698256,462.5219339,687.264375,596.1769289,453.2700166,687.264375,596.7053633,459.108236,687.264375,618.131589,452.8717894,687.264375,617.8152271,458.7253322,687.264375,638.7608579,461.3811774,687.264375,639.9154438,455.6339189,687.264375,659.1071086,467.0205961,687.264375,661.0759319,461.4990217,687.264375,668.2600934,471.0494231,687.264375,674.7339155,481.4988379,687.264375,674.7339155,669.4424285,687.264375,674.7339155,481.4988379,687.264375,674.8952273,473.9699792,687.264375,668.2600934,471.0494231,687.264375,681.1734425,470.3452499,687.264375,661.0759319,461.4990217,687.264375,659.1071086,467.0205961,687.264375,639.9154438,455.6339189,687.264375,638.7608579,461.3811774,687.264375,618.131589,452.8717894,687.264375,617.8152271,458.7253322,687.264375,596.7053633,459.108236,687.264375,596.1769289,453.2700166,687.264375,575.8698256,462.5219339,687.264375,574.5075731,456.8203274,687.264375,555.741474,468.8955061,687.264375,553.5737042,463.4489638,687.264375,536.7384763,478.096541,687.264375,533.8102249,473.0182153,687.264375,519.2556215,489.9338866,687.264375,515.6277231,485.32928,687.264375,499.4039416,500.1263946,687.264375,681.1734425,680.5960165,687.264375,674.5765459,676.7872965,687.264375,674.8952273,473.9699792,687.264375,668.2600934,471.0494231,645.639375,674.8952273,473.9699792,645.639375,668.2600934,471.0494231,687.264375,668.2600934,471.0494231,687.264375,674.8952273,473.9699792,687.264375,668.2600934,471.0494231,645.639375,674.8952273,473.9699792,645.639375,674.7339155,481.4988379,645.639375,674.8952273,473.9699792,687.264375,674.8952273,473.9699792,645.639375,674.7339155,481.4988379,687.264375,674.7339155,481.4988379,687.264375,674.7339155,481.4988379,645.639375,674.8952273,473.9699792,687.264375,674.8952273,473.9699792,645.639375,674.7339155,669.4424285,645.639375,674.7339155,481.4988379,687.264375,674.7339155,481.4988379,645.639375,674.7339155,669.4424285,687.264375,674.7339155,669.4424285,687.264375,674.7339155,669.4424285,645.639375,674.7339155,481.4988379,687.264375,674.7339155,481.4988379,645.639375,674.5765459,676.7872965,645.639375,674.7339155,669.4424285,687.264375,674.7339155,669.4424285,645.639375,674.5765459,676.7872965,687.264375,674.5765459,676.7872965,687.264375,674.5765459,676.7872965,645.639375,674.7339155,669.4424285,687.264375,674.7339155,669.4424285,645.639375,681.1734425,680.5960165,687.264375,674.5765459,676.7872965,645.639375,681.1734425,680.5960165,645.639375,674.5765459,676.7872965,687.264375,674.5765459,676.7872965,687.264375,681.1734425,680.5960165,687.264375,674.5765459,676.7872965,645.639375,681.1734425,680.5960165,645.639375,681.1734425,680.5960165,687.264375,681.1734425,470.3452499,645.639375,681.1734425,470.3452499,687.264375,681.1734425,680.5960165,645.639375,681.1734425,680.5960165,645.639375,681.1734425,680.5960165,687.264375,681.1734425,470.3452499,645.639375,681.1734425,470.3452499,687.264375,661.0759319,461.4990217,687.264375,681.1734425,470.3452499,645.639375,661.0759319,461.4990217,645.639375,681.1734425,470.3452499,687.264375,681.1734425,470.3452499,687.264375,661.0759319,461.4990217,687.264375,681.1734425,470.3452499,645.639375,661.0759319,461.4990217,645.639375,639.9154438,455.6339189,687.264375,639.9154438,455.6339189,645.639375,639.9154438,455.6339189,687.264375,639.9154438,455.6339189,645.639375,618.131589,452.8717894,687.264375,618.131589,452.8717894,645.639375,618.131589,452.8717894,687.264375,618.131589,452.8717894,645.639375,596.1769289,453.2700166,687.264375,596.1769289,453.2700166,645.639375,596.1769289,453.2700166,687.264375,596.1769289,453.2700166,645.639375,574.5075731,456.8203274,687.264375,574.5075731,456.8203274,645.639375,574.5075731,456.8203274,687.264375,574.5075731,456.8203274,645.639375,553.5737042,463.4489638,687.264375,553.5737042,463.4489638,645.639375,553.5737042,463.4489638,687.264375,553.5737042,463.4489638,645.639375,533.8102249,473.0182153,687.264375,533.8102249,473.0182153,645.639375,533.8102249,473.0182153,687.264375,533.8102249,473.0182153,645.639375,515.6277231,485.32928,687.264375,515.6277231,485.32928,645.639375,515.6277231,485.32928,687.264375,515.6277231,485.32928,645.639375,499.4039416,500.1263946,687.264375,499.4039416,500.1263946,645.639375,499.4039416,500.1263946,687.264375,499.4039416,500.1263946,645.639375,519.2556215,489.9338866,687.264375,499.4039416,500.1263946,645.639375,519.2556215,489.9338866,645.639375,499.4039416,500.1263946,687.264375,499.4039416,500.1263946,687.264375,519.2556215,489.9338866,687.264375,499.4039416,500.1263946,645.639375,519.2556215,489.9338866,645.639375,536.7384763,478.096541,687.264375,519.2556215,489.9338866,645.639375,536.7384763,478.096541,645.639375,519.2556215,489.9338866,687.264375,519.2556215,489.9338866,687.264375,536.7384763,478.096541,687.264375,519.2556215,489.9338866,645.639375,536.7384763,478.096541,645.639375,555.741474,468.8955061,687.264375,536.7384763,478.096541,645.639375,555.741474,468.8955061,645.639375,536.7384763,478.096541,687.264375,536.7384763,478.096541,687.264375,555.741474,468.8955061,687.264375,536.7384763,478.096541,645.639375,555.741474,468.8955061,645.639375,575.8698256,462.5219339,687.264375,555.741474,468.8955061,645.639375,575.8698256,462.5219339,645.639375,555.741474,468.8955061,687.264375,555.741474,468.8955061,687.264375,575.8698256,462.5219339,687.264375,555.741474,468.8955061,645.639375,575.8698256,462.5219339,645.639375,596.7053633,459.108236,687.264375,575.8698256,462.5219339,645.639375,596.7053633,459.108236,645.639375,575.8698256,462.5219339,687.264375,575.8698256,462.5219339,687.264375,596.7053633,459.108236,687.264375,575.8698256,462.5219339,645.639375,596.7053633,459.108236,645.639375,617.8152271,458.7253322,687.264375,596.7053633,459.108236,645.639375,617.8152271,458.7253322,645.639375,596.7053633,459.108236,687.264375,596.7053633,459.108236,687.264375,617.8152271,458.7253322,687.264375,596.7053633,459.108236,645.639375,617.8152271,458.7253322,645.639375,638.7608579,461.3811774,687.264375,617.8152271,458.7253322,645.639375,638.7608579,461.3811774,645.639375,617.8152271,458.7253322,687.264375,617.8152271,458.7253322,687.264375,638.7608579,461.3811774,687.264375,617.8152271,458.7253322,645.639375,638.7608579,461.3811774,645.639375,659.1071086,467.0205961,687.264375,638.7608579,461.3811774,645.639375,659.1071086,467.0205961,645.639375,638.7608579,461.3811774,687.264375,638.7608579,461.3811774,687.264375,659.1071086,467.0205961,687.264375,638.7608579,461.3811774,645.639375,659.1071086,467.0205961,645.639375,668.2600934,471.0494231,687.264375,659.1071086,467.0205961,645.639375,668.2600934,471.0494231,645.639375,659.1071086,467.0205961,687.264375,659.1071086,467.0205961,687.264375,668.2600934,471.0494231,687.264375,659.1071086,467.0205961,645.639375,668.2600934,471.0494231,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,0.4028654,-0.9152592,0.0,0.4028654,-0.9152592,0.0,0.4028654,-0.9152592,0.0,0.4028654,-0.9152592,0.0,-0.4028654,0.9152592,-0.0,-0.4028654,0.9152592,-0.0,-0.4028654,0.9152592,-0.0,-0.4028654,0.9152592,-0.0,0.9997705,0.0214209,-0.0,0.9997705,0.0214209,-0.0,0.9997705,0.0214209,-0.0,0.9997705,0.0214209,-0.0,-0.9997705,-0.0214209,0.0,-0.9997705,-0.0214209,0.0,-0.9997705,-0.0214209,0.0,-0.9997705,-0.0214209,0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,0.9997705,0.0214209,-0.0,0.9997705,0.0214209,-0.0,0.9997705,0.0214209,-0.0,0.9997705,0.0214209,-0.0,-0.9997705,-0.0214209,0.0,-0.9997705,-0.0214209,0.0,-0.9997705,-0.0214209,0.0,-0.9997705,-0.0214209,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,-0.3358571,0.9419129,0.0,-0.4028654,0.9152592,-0.0,-0.3358571,0.9419129,0.0,-0.4028654,0.9152592,-0.0,0.4028654,-0.9152592,0.0,0.3358571,-0.9419129,-0.0,0.4028654,-0.9152592,0.0,0.3358571,-0.9419129,-0.0,-0.1969582,0.9804119,0.0,-0.1969582,0.9804119,0.0,0.1969582,-0.9804119,-0.0,0.1969582,-0.9804119,-0.0,-0.0539675,0.9985427,0.0,-0.0539675,0.9985427,0.0,0.0539675,-0.9985427,-0.0,0.0539675,-0.9985427,-0.0,0.0901444,0.9959287,0.0,0.0901444,0.9959287,0.0,-0.0901444,-0.9959287,-0.0,-0.0901444,-0.9959287,-0.0,0.2323836,0.9726242,0.0,0.2323836,0.9726242,0.0,-0.2323836,-0.9726242,-0.0,-0.2323836,-0.9726242,-0.0,0.369795,0.9291134,0.0,0.369795,0.9291134,0.0,-0.369795,-0.9291134,-0.0,-0.369795,-0.9291134,-0.0,0.4995238,0.8663002,0.0,0.4995238,0.8663002,0.0,-0.4995238,-0.8663002,-0.0,-0.4995238,-0.8663002,-0.0,0.618875,0.7854895,0.0,0.618875,0.7854895,0.0,-0.618875,-0.7854895,-0.0,-0.618875,-0.7854895,-0.0,0.6738743,0.738846,-0.0,0.6738743,0.738846,-0.0,-0.6738743,-0.738846,0.0,-0.6738743,-0.738846,0.0,-0.456748,-0.8895961,0.0,-0.456748,-0.8895961,0.0,-0.456748,-0.8895961,0.0,-0.456748,-0.8895961,0.0,0.456748,0.8895961,-0.0,0.456748,0.8895961,-0.0,0.456748,0.8895961,-0.0,0.456748,0.8895961,-0.0,-0.5606573,-0.828048,0.0,-0.5606573,-0.828048,0.0,-0.5606573,-0.828048,0.0,-0.5606573,-0.828048,0.0,0.5606573,0.828048,-0.0,0.5606573,0.828048,-0.0,0.5606573,0.828048,-0.0,0.5606573,0.828048,-0.0,-0.4357926,-0.9000471,0.0,-0.4357926,-0.9000471,0.0,-0.4357926,-0.9000471,0.0,-0.4357926,-0.9000471,0.0,0.4357926,0.9000471,-0.0,0.4357926,0.9000471,-0.0,0.4357926,0.9000471,-0.0,0.4357926,0.9000471,-0.0,-0.3018742,-0.9533478,0.0,-0.3018742,-0.9533478,0.0,-0.3018742,-0.9533478,0.0,-0.3018742,-0.9533478,0.0,0.3018742,0.9533478,-0.0,0.3018742,0.9533478,-0.0,0.3018742,0.9533478,-0.0,0.3018742,0.9533478,-0.0,-0.1616844,-0.9868425,0.0,-0.1616844,-0.9868425,0.0,-0.1616844,-0.9868425,0.0,-0.1616844,-0.9868425,0.0,0.1616844,0.9868425,-0.0,0.1616844,0.9868425,-0.0,0.1616844,0.9868425,-0.0,0.1616844,0.9868425,-0.0,-0.0181356,-0.9998355,0.0,-0.0181356,-0.9998355,0.0,-0.0181356,-0.9998355,0.0,-0.0181356,-0.9998355,0.0,0.0181356,0.9998355,-0.0,0.0181356,0.9998355,-0.0,0.0181356,0.9998355,-0.0,0.0181356,0.9998355,-0.0,0.1257899,-0.9920569,0.0,0.1257899,-0.9920569,0.0,0.1257899,-0.9920569,0.0,0.1257899,-0.9920569,0.0,-0.1257899,0.9920569,-0.0,-0.1257899,0.9920569,-0.0,-0.1257899,0.9920569,-0.0,-0.1257899,0.9920569,-0.0,0.2671022,-0.9636682,0.0,0.2671022,-0.9636682,0.0,0.2671022,-0.9636682,0.0,0.2671022,-0.9636682,0.0,-0.2671022,0.9636682,-0.0,-0.2671022,0.9636682,-0.0,-0.2671022,0.9636682,-0.0,-0.2671022,0.9636682,-0.0,0.4028654,-0.9152592,0.0,0.4028654,-0.9152592,0.0,0.4028654,-0.9152592,0.0,0.4028654,-0.9152592,0.0,-0.4028654,0.9152592,-0.0,-0.4028654,0.9152592,-0.0,-0.4028654,0.9152592,-0.0,-0.4028654,0.9152592,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,6,7,6,5,8,8,5,9,8,9,10,10,9,11,10,11,12,12,11,13,12,13,14,14,13,15,14,15,16,16,15,17,16,17,18,16,18,19,19,18,20,19,20,21,21,20,22,21,22,4,4,22,3,3,23,1,48,49,50,49,48,51,56,57,58,57,56,59,64,65,66,65,64,67,72,73,74,73,72,75,80,81,82,81,80,83,88,89,90,89,88,91,96,97,98,97,96,99,104,98,105,98,104,96,108,105,109,105,108,104,112,109,113,109,112,108,116,113,117,113,116,112,120,117,121,117,120,116,124,121,125,121,124,120,128,125,129,125,128,124,132,129,133,129,132,128,136,137,138,137,136,139,144,145,146,145,144,147,152,153,154,153,152,155,160,161,162,161,160,163,168,169,170,169,168,171,176,177,178,177,176,179,184,185,186,185,184,187,192,193,194,193,192,195,200,201,202,201,200,203,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 210, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID824.bind();
texcoordArray = new float[] {
-18.742609f,18.595623f,-18.742609f,13.374968f,-18.74709f,13.1658325f,-18.56278f,13.084706f,-18.921484f,13.0651455f,-18.36322f,12.819417f,-18.30853f,12.972795f,-17.775429f,12.656498f,-17.743357f,12.816144f,-17.170322f,12.579772f,-17.161533f,12.742371f,-16.57515f,12.753007f,-16.56047f,12.590834f,-15.996384f,12.847832f,-15.958544f,12.689453f,-15.4372635f,13.024876f,-15.377048f,12.873582f,-14.909402f,13.280459f,-14.828062f,13.139395f,-14.423767f,13.609275f,-14.322992f,13.481369f,-13.872332f,13.8924f,-18.921484f,18.905445f,-18.738237f,18.799646f,22.261131f,19.090677f,22.462505f,19.090677f,22.261131f,17.934427f,22.462505f,17.934427f,12.970416f,19.090677f,12.970416f,17.934427f,12.761232f,19.090677f,12.761232f,17.934427f,18.595623f,19.090677f,18.595623f,17.934427f,13.374968f,19.090677f,13.374968f,17.934427f,18.393944f,19.090677f,18.393944f,17.934427f,18.189873f,19.090677f,18.189873f,17.934427f,25.627613f,19.090677f,25.839209f,19.090677f,25.627613f,17.934427f,25.839209f,17.934427f,-18.905445f,17.934427f,-18.905445f,19.090677f,-13.0651455f,17.934427f,-13.0651455f,19.090677f,-22.581558f,19.090677f,-21.971607f,19.090677f,-22.581558f,17.934427f,-21.971607f,17.934427f,-21.120146f,19.090677f,-20.510195f,19.090677f,-21.120146f,17.934427f,-20.510195f,17.934427f,-19.226297f,19.090677f,-18.616344f,19.090677f,-19.226297f,17.934427f,-18.616344f,17.934427f,-16.939356f,19.090677f,-16.329405f,19.090677f,-16.939356f,17.934427f,-16.329405f,17.934427f,-14.306834f,19.090677f,-13.696882f,19.090677f,-14.306834f,17.934427f,-13.696882f,17.934427f,-11.383423f,19.090677f,-10.773471f,19.090677f,-11.383423f,17.934427f,-10.773471f,17.934427f,-8.229856f,19.090677f,-7.619904f,19.090677f,-8.229856f,17.934427f,-7.619904f,17.934427f,-4.9116488f,19.090677f,-4.301697f,19.090677f,-4.9116488f,17.934427f,-4.301697f,17.934427f,-1.497738f,19.090677f,-0.887786f,19.090677f,-1.497738f,17.934427f,-0.887786f,17.934427f,5.995446f,19.090677f,6.615318f,19.090677f,5.995446f,17.934427f,6.615318f,17.934427f,4.313432f,19.090677f,4.899914f,19.090677f,4.313432f,17.934427f,4.899914f,17.934427f,7.631639f,19.090677f,8.218121f,19.090677f,7.631639f,17.934427f,8.218121f,17.934427f,10.785206f,19.090677f,11.371688f,19.090677f,10.785206f,17.934427f,11.371688f,17.934427f,13.708617f,19.090677f,14.295099f,19.090677f,13.708617f,17.934427f,14.295099f,17.934427f,16.341139f,19.090677f,16.92762f,19.090677f,16.341139f,17.934427f,16.92762f,17.934427f,18.62808f,19.090677f,19.214561f,19.090677f,18.62808f,17.934427f,19.214561f,17.934427f,20.521929f,19.090677f,21.108412f,19.090677f,20.521929f,17.934427f,21.108412f,17.934427f,21.983341f,19.090677f,22.261131f,19.090677f,21.983341f,17.934427f,22.261131f,17.934427f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
24,0,25,1,26,2,26,2,27,3,28,4,28,4,27,3,29,5,27,3,30,6,29,5,29,5,30,6,31,7,30,6,32,8,31,7,31,7,32,8,33,9,32,8,34,10,33,9,34,10,35,11,33,9,33,9,35,11,36,12,35,11,37,13,36,12,36,12,37,13,38,14,37,13,39,15,38,14,38,14,39,15,40,16,39,15,41,17,40,16,40,16,41,17,42,18,41,17,43,19,42,18,42,18,43,19,44,20,45,21,44,20,43,19,28,4,46,22,26,2,26,2,46,22,24,0,47,23,24,0,46,22,52,24,53,25,54,26,55,27,54,26,53,25,60,28,61,29,62,30,63,31,62,30,61,29,68,32,69,33,70,34,71,35,70,34,69,33,76,36,77,37,78,38,79,39,78,38,77,37,84,40,85,41,86,42,87,43,86,42,85,41,92,44,93,45,94,46,95,47,94,46,93,45,100,48,101,49,102,50,103,51,102,50,101,49,101,52,106,53,103,54,107,55,103,54,106,53,106,56,110,57,107,58,111,59,107,58,110,57,110,60,114,61,111,62,115,63,111,62,114,61,114,64,118,65,115,66,119,67,115,66,118,65,118,68,122,69,119,70,123,71,119,70,122,69,122,72,126,73,123,74,127,75,123,74,126,73,126,76,130,77,127,78,131,79,127,78,130,77,130,80,134,81,131,82,135,83,131,82,134,81,140,84,141,85,142,86,143,87,142,86,141,85,148,88,149,89,150,90,151,91,150,90,149,89,156,92,157,93,158,94,159,95,158,94,157,93,164,96,165,97,166,98,167,99,166,98,165,97,172,100,173,101,174,102,175,103,174,102,173,101,180,104,181,105,182,106,183,107,182,106,181,105,188,108,189,109,190,110,191,111,190,110,189,109,196,112,197,113,198,114,199,115,198,114,197,113,204,116,205,117,206,118,207,119,206,118,205,117,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID839(GL2 gl){
double[] positionsArray = {
324.8970454,513.4313905,687.264375,323.2866477,473.9699792,687.264375,319.3961294,492.1733188,687.264375,324.0749389,481.1764517,687.264375,325.1623648,491.1175826,687.264375,333.3968985,533.6778268,687.264375,330.4516103,511.557662,687.264375,338.6243963,531.0250329,687.264375,344.7191034,552.4920066,687.264375,349.5109326,549.1152593,687.264375,358.6284407,569.4830639,687.264375,362.8850505,565.4525153,687.264375,374.8359426,584.2980079,687.264375,378.4689017,579.6973931,687.264375,393.0048972,596.6290573,687.264375,395.9387306,591.5539543,687.264375,412.7578429,606.2200334,687.264375,414.9316,600.7758779,687.264375,433.6844108,612.871683,687.264375,317.0084325,470.3452499,687.264375,499.0909375,365.2198666,687.264375,329.8874865,470.3452499,687.264375,492.6514105,376.3734546,687.264375,499.0909375,372.8373068,687.264375,499.0909375,372.8373068,687.264375,492.6514105,376.3734546,687.264375,499.0909375,365.2198666,687.264375,329.8874865,470.3452499,687.264375,323.2866477,473.9699792,687.264375,319.3961294,492.1733188,687.264375,317.0084325,470.3452499,687.264375,433.6844108,612.871683,687.264375,412.7578429,606.2200334,687.264375,414.9316,600.7758779,687.264375,395.9387306,591.5539543,687.264375,393.0048972,596.6290573,687.264375,378.4689017,579.6973931,687.264375,374.8359426,584.2980079,687.264375,362.8850505,565.4525153,687.264375,358.6284407,569.4830639,687.264375,349.5109326,549.1152593,687.264375,344.7191034,552.4920066,687.264375,338.6243963,531.0250329,687.264375,333.3968985,533.6778268,687.264375,330.4516103,511.557662,687.264375,325.1623648,491.1175826,687.264375,324.8970454,513.4313905,687.264375,324.0749389,481.1764517,687.264375,324.0749389,481.1764517,687.264375,323.2866477,473.9699792,645.639375,323.2866477,473.9699792,687.264375,324.0749389,481.1764517,645.639375,324.0749389,481.1764517,645.639375,324.0749389,481.1764517,687.264375,323.2866477,473.9699792,645.639375,323.2866477,473.9699792,687.264375,329.8874865,470.3452499,687.264375,323.2866477,473.9699792,645.639375,329.8874865,470.3452499,645.639375,323.2866477,473.9699792,687.264375,323.2866477,473.9699792,687.264375,329.8874865,470.3452499,687.264375,323.2866477,473.9699792,645.639375,329.8874865,470.3452499,645.639375,492.6514105,376.3734546,687.264375,329.8874865,470.3452499,645.639375,492.6514105,376.3734546,645.639375,329.8874865,470.3452499,687.264375,329.8874865,470.3452499,687.264375,492.6514105,376.3734546,687.264375,329.8874865,470.3452499,645.639375,492.6514105,376.3734546,645.639375,499.0909375,372.8373068,687.264375,492.6514105,376.3734546,645.639375,499.0909375,372.8373068,645.639375,492.6514105,376.3734546,687.264375,492.6514105,376.3734546,687.264375,499.0909375,372.8373068,687.264375,492.6514105,376.3734546,645.639375,499.0909375,372.8373068,645.639375,499.0909375,372.8373068,687.264375,499.0909375,365.2198666,645.639375,499.0909375,365.2198666,687.264375,499.0909375,372.8373068,645.639375,499.0909375,372.8373068,645.639375,499.0909375,372.8373068,687.264375,499.0909375,365.2198666,645.639375,499.0909375,365.2198666,687.264375,317.0084325,470.3452499,687.264375,499.0909375,365.2198666,645.639375,317.0084325,470.3452499,645.639375,499.0909375,365.2198666,687.264375,499.0909375,365.2198666,687.264375,317.0084325,470.3452499,687.264375,499.0909375,365.2198666,645.639375,317.0084325,470.3452499,645.639375,319.3961294,492.1733188,645.639375,317.0084325,470.3452499,687.264375,317.0084325,470.3452499,645.639375,319.3961294,492.1733188,687.264375,319.3961294,492.1733188,687.264375,319.3961294,492.1733188,645.639375,317.0084325,470.3452499,687.264375,317.0084325,470.3452499,645.639375,324.8970454,513.4313905,645.639375,324.8970454,513.4313905,687.264375,324.8970454,513.4313905,687.264375,324.8970454,513.4313905,645.639375,333.3968985,533.6778268,645.639375,333.3968985,533.6778268,687.264375,333.3968985,533.6778268,687.264375,333.3968985,533.6778268,645.639375,344.7191034,552.4920066,645.639375,344.7191034,552.4920066,687.264375,344.7191034,552.4920066,687.264375,344.7191034,552.4920066,645.639375,358.6284407,569.4830639,645.639375,358.6284407,569.4830639,687.264375,358.6284407,569.4830639,687.264375,358.6284407,569.4830639,645.639375,374.8359426,584.2980079,687.264375,374.8359426,584.2980079,645.639375,374.8359426,584.2980079,687.264375,374.8359426,584.2980079,645.639375,393.0048972,596.6290573,687.264375,393.0048972,596.6290573,645.639375,393.0048972,596.6290573,687.264375,393.0048972,596.6290573,645.639375,412.7578429,606.2200334,687.264375,412.7578429,606.2200334,645.639375,412.7578429,606.2200334,687.264375,412.7578429,606.2200334,645.639375,433.6844108,612.871683,687.264375,433.6844108,612.871683,645.639375,433.6844108,612.871683,687.264375,433.6844108,612.871683,645.639375,414.9316,600.7758779,687.264375,433.6844108,612.871683,645.639375,414.9316,600.7758779,645.639375,433.6844108,612.871683,687.264375,433.6844108,612.871683,687.264375,414.9316,600.7758779,687.264375,433.6844108,612.871683,645.639375,414.9316,600.7758779,645.639375,395.9387306,591.5539543,687.264375,414.9316,600.7758779,645.639375,395.9387306,591.5539543,645.639375,414.9316,600.7758779,687.264375,414.9316,600.7758779,687.264375,395.9387306,591.5539543,687.264375,414.9316,600.7758779,645.639375,395.9387306,591.5539543,645.639375,378.4689017,579.6973931,687.264375,395.9387306,591.5539543,645.639375,378.4689017,579.6973931,645.639375,395.9387306,591.5539543,687.264375,395.9387306,591.5539543,687.264375,378.4689017,579.6973931,687.264375,395.9387306,591.5539543,645.639375,378.4689017,579.6973931,645.639375,362.8850505,565.4525153,687.264375,378.4689017,579.6973931,645.639375,362.8850505,565.4525153,645.639375,378.4689017,579.6973931,687.264375,378.4689017,579.6973931,687.264375,362.8850505,565.4525153,687.264375,378.4689017,579.6973931,645.639375,362.8850505,565.4525153,645.639375,362.8850505,565.4525153,687.264375,349.5109326,549.1152593,645.639375,349.5109326,549.1152593,687.264375,362.8850505,565.4525153,645.639375,362.8850505,565.4525153,645.639375,362.8850505,565.4525153,687.264375,349.5109326,549.1152593,645.639375,349.5109326,549.1152593,687.264375,349.5109326,549.1152593,687.264375,338.6243963,531.0250329,645.639375,338.6243963,531.0250329,687.264375,349.5109326,549.1152593,645.639375,349.5109326,549.1152593,645.639375,349.5109326,549.1152593,687.264375,338.6243963,531.0250329,645.639375,338.6243963,531.0250329,687.264375,338.6243963,531.0250329,687.264375,330.4516103,511.557662,645.639375,330.4516103,511.557662,687.264375,338.6243963,531.0250329,645.639375,338.6243963,531.0250329,645.639375,338.6243963,531.0250329,687.264375,330.4516103,511.557662,645.639375,330.4516103,511.557662,687.264375,330.4516103,511.557662,687.264375,325.1623648,491.1175826,645.639375,325.1623648,491.1175826,687.264375,330.4516103,511.557662,645.639375,330.4516103,511.557662,645.639375,330.4516103,511.557662,687.264375,325.1623648,491.1175826,645.639375,325.1623648,491.1175826,687.264375,325.1623648,491.1175826,687.264375,324.0749389,481.1764517,645.639375,324.0749389,481.1764517,687.264375,325.1623648,491.1175826,645.639375,325.1623648,491.1175826,645.639375,325.1623648,491.1175826,687.264375,324.0749389,481.1764517,645.639375,324.0749389,481.1764517,687.264375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.9940705,0.1087379,0.0,-0.9940705,0.1087379,0.0,-0.9940705,0.1087379,0.0,-0.9940705,0.1087379,0.0,0.9940705,-0.1087379,-0.0,0.9940705,-0.1087379,-0.0,0.9940705,-0.1087379,-0.0,0.9940705,-0.1087379,-0.0,-0.4813342,-0.8765371,0.0,-0.4813342,-0.8765371,0.0,-0.4813342,-0.8765371,0.0,-0.4813342,-0.8765371,0.0,0.4813342,0.8765371,-0.0,0.4813342,0.8765371,-0.0,0.4813342,0.8765371,-0.0,0.4813342,0.8765371,-0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,-0.4813342,-0.8765371,0.0,-0.4813342,-0.8765371,0.0,-0.4813342,-0.8765371,0.0,-0.4813342,-0.8765371,0.0,0.4813342,0.8765371,-0.0,0.4813342,0.8765371,-0.0,0.4813342,0.8765371,-0.0,0.4813342,0.8765371,-0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,0.5,0.8660254,0.0,0.5,0.8660254,0.0,0.5,0.8660254,0.0,0.5,0.8660254,0.0,-0.5,-0.8660254,-0.0,-0.5,-0.8660254,-0.0,-0.5,-0.8660254,-0.0,-0.5,-0.8660254,-0.0,0.9836491,-0.1800957,0.0,0.9940705,-0.1087379,-0.0,0.9940705,-0.1087379,-0.0,0.9836491,-0.1800957,0.0,-0.9836491,0.1800957,-0.0,-0.9836491,0.1800957,-0.0,-0.9940705,0.1087379,0.0,-0.9940705,0.1087379,0.0,0.9475407,-0.3196351,0.0,0.9475407,-0.3196351,0.0,-0.9475407,0.3196351,-0.0,-0.9475407,0.3196351,-0.0,0.8917471,-0.4525341,0.0,0.8917471,-0.4525341,0.0,-0.8917471,0.4525341,-0.0,-0.8917471,0.4525341,-0.0,0.8174273,-0.5760317,0.0,0.8174273,-0.5760317,0.0,-0.8174273,0.5760317,-0.0,-0.8174273,0.5760317,-0.0,0.7261255,-0.6875622,0.0,0.7261255,-0.6875622,0.0,-0.7261255,0.6875622,-0.0,-0.7261255,0.6875622,-0.0,0.6197383,-0.7848085,0.0,0.6197383,-0.7848085,0.0,-0.6197383,0.7848085,-0.0,-0.6197383,0.7848085,-0.0,0.500476,-0.8657504,0.0,0.500476,-0.8657504,0.0,-0.500476,0.8657504,-0.0,-0.500476,0.8657504,-0.0,0.3708163,-0.9287062,0.0,0.3708163,-0.9287062,0.0,-0.3708163,0.9287062,-0.0,-0.3708163,0.9287062,-0.0,0.3029223,-0.9530153,0.0,0.3029223,-0.9530153,0.0,-0.3029223,0.9530153,-0.0,-0.3029223,0.9530153,-0.0,-0.5420388,0.8403534,-0.0,-0.5420388,0.8403534,-0.0,-0.5420388,0.8403534,-0.0,-0.5420388,0.8403534,-0.0,0.5420388,-0.8403534,0.0,0.5420388,-0.8403534,0.0,0.5420388,-0.8403534,0.0,0.5420388,-0.8403534,0.0,-0.4367819,0.8995674,-0.0,-0.4367819,0.8995674,-0.0,-0.4367819,0.8995674,-0.0,-0.4367819,0.8995674,-0.0,0.4367819,-0.8995674,0.0,0.4367819,-0.8995674,0.0,0.4367819,-0.8995674,0.0,0.4367819,-0.8995674,0.0,-0.5615674,0.827431,-0.0,-0.5615674,0.827431,-0.0,-0.5615674,0.827431,-0.0,-0.5615674,0.827431,-0.0,0.5615674,-0.827431,0.0,0.5615674,-0.827431,0.0,0.5615674,-0.827431,0.0,0.5615674,-0.827431,0.0,-0.6746863,0.7381046,-0.0,-0.6746863,0.7381046,-0.0,-0.6746863,0.7381046,-0.0,-0.6746863,0.7381046,-0.0,0.6746863,-0.7381046,0.0,0.6746863,-0.7381046,0.0,0.6746863,-0.7381046,0.0,0.6746863,-0.7381046,0.0,-0.7737885,0.6334441,0.0,-0.7737885,0.6334441,0.0,-0.7737885,0.6334441,0.0,-0.7737885,0.6334441,0.0,0.7737885,-0.6334441,-0.0,0.7737885,-0.6334441,-0.0,0.7737885,-0.6334441,-0.0,0.7737885,-0.6334441,-0.0,-0.8568152,0.5156237,0.0,-0.8568152,0.5156237,0.0,-0.8568152,0.5156237,0.0,-0.8568152,0.5156237,0.0,0.8568152,-0.5156237,-0.0,0.8568152,-0.5156237,-0.0,0.8568152,-0.5156237,-0.0,0.8568152,-0.5156237,-0.0,-0.9220414,0.3870912,0.0,-0.9220414,0.3870912,0.0,-0.9220414,0.3870912,0.0,-0.9220414,0.3870912,0.0,0.9220414,-0.3870912,-0.0,0.9220414,-0.3870912,-0.0,0.9220414,-0.3870912,-0.0,0.9220414,-0.3870912,-0.0,-0.9681123,0.2505168,0.0,-0.9681123,0.2505168,0.0,-0.9681123,0.2505168,0.0,-0.9681123,0.2505168,0.0,0.9681123,-0.2505168,-0.0,0.9681123,-0.2505168,-0.0,0.9681123,-0.2505168,-0.0,0.9681123,-0.2505168,-0.0,-0.9940705,0.1087379,0.0,-0.9940705,0.1087379,0.0,-0.9940705,0.1087379,0.0,-0.9940705,0.1087379,0.0,0.9940705,-0.1087379,-0.0,0.9940705,-0.1087379,-0.0,0.9940705,-0.1087379,-0.0,0.9940705,-0.1087379,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,4,5,6,6,5,7,7,5,8,7,8,9,9,8,10,9,10,11,11,10,12,11,12,13,13,12,14,13,14,15,15,14,16,15,16,17,17,16,18,19,1,20,1,19,2,20,1,21,20,21,22,20,22,23,48,49,50,49,48,51,56,57,58,57,56,59,64,65,66,65,64,67,72,73,74,73,72,75,80,81,82,81,80,83,88,89,90,89,88,91,96,97,98,97,96,99,104,99,96,99,104,105,108,105,104,105,108,109,112,109,108,109,112,113,116,113,112,113,116,117,120,116,121,116,120,117,124,121,125,121,124,120,128,125,129,125,128,124,132,129,133,129,132,128,136,137,138,137,136,139,144,145,146,145,144,147,152,153,154,153,152,155,160,161,162,161,160,163,168,169,170,169,168,171,176,177,178,177,176,179,184,185,186,185,184,187,192,193,194,193,192,195,200,201,202,201,200,203,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 210, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID824.bind();
texcoordArray = new float[] {
-18.738237f,18.799646f,-18.742609f,18.595623f,-18.921484f,18.905445f,-18.742609f,13.374968f,-18.74709f,13.1658325f,-18.36322f,12.819417f,-18.921484f,13.0651455f,-13.872332f,13.8924f,-14.322992f,13.481369f,-14.423767f,13.609275f,-14.909402f,13.280459f,-14.828062f,13.139395f,-15.4372635f,13.024876f,-15.377048f,12.873582f,-15.996384f,12.847832f,-15.958544f,12.689453f,-16.57515f,12.753007f,-16.56047f,12.590834f,-17.161533f,12.742371f,-17.170322f,12.579772f,-17.743357f,12.816144f,-18.30853f,12.972795f,-17.775429f,12.656498f,-18.56278f,13.084706f,-11.974646f,15.358862f,-10.973303f,14.780737f,-12.075332f,15.184467f,-11.07399f,14.606342f,-18.873266f,1.0976006f,-18.977858f,0.9164428f,-19.874607f,1.6757256f,-19.979198f,1.4945678f,-18.80776f,1.2110606f,-21.418087f,-3.3101594f,-19.809101f,1.7891856f,-22.41943f,-2.7320344f,-21.587585f,-3.60374f,-21.689621f,-3.7804706f,-22.588928f,-3.025615f,-22.690964f,-3.2023456f,-13.929162f,11.973539f,-12.92782f,11.395414f,-14.03496f,11.790292f,-13.033618f,11.212167f,-14.639235f,8.431158f,-17.559383f,3.3733108f,-15.640576f,9.009283f,-18.560726f,3.9514358f,-25.383692f,-10.178788f,-26.385033f,-9.600663f,-25.078716f,-9.650554f,-26.080057f,-9.072429f,-26.140163f,-11.489036f,-27.141504f,-10.910911f,-25.835188f,-10.960801f,-26.836529f,-10.382676f,-26.732895f,-12.5156765f,-27.734238f,-11.9375515f,-26.42792f,-11.987443f,-27.42926f,-11.409318f,-27.149572f,-13.237384f,-28.150915f,-12.659259f,-26.844597f,-12.709149f,-27.845938f,-12.131024f,-27.38154f,-13.639162f,-28.382881f,-13.061037f,-27.076563f,-13.110929f,-28.077906f,-12.532804f,-27.119001f,-13.184432f,-27.423977f,-13.712666f,-28.120342f,-12.606307f,-28.42532f,-13.134541f,-26.971027f,-12.928134f,-27.276003f,-13.4563675f,-27.972368f,-12.350009f,-28.277346f,-12.8782425f,-26.635715f,-12.347358f,-26.940693f,-12.875591f,-27.637058f,-11.769233f,-27.942034f,-12.297466f,-26.120033f,-11.45417f,-26.42501f,-11.982404f,-27.121376f,-10.876045f,-27.426352f,-11.404279f,-8.430444f,19.185099f,-8.740379f,18.648275f,-9.431786f,19.763224f,-9.741721f,19.2264f,-9.277408f,17.718113f,-9.570649f,17.210205f,-10.278749f,18.296238f,-10.571991f,17.78833f,-8.942097f,18.29889f,-9.235337f,17.790981f,-9.943439f,18.877014f,-10.23668f,18.369106f,-8.794123f,18.555187f,-9.087364f,18.04728f,-9.7954645f,19.133312f,-10.088706f,18.625404f,-9.837902f,19.059809f,-8.83656f,18.481684f,-10.131143f,18.5519f,-9.129801f,17.973776f,-10.069869f,18.65803f,-9.068527f,18.079905f,-10.363111f,18.150122f,-9.361769f,17.571997f,-10.486547f,17.936323f,-9.485205f,17.358198f,-10.779788f,17.428415f,-9.778446f,16.85029f,-11.079279f,16.909683f,-10.077937f,16.331558f,-11.3725195f,16.401773f,-10.371178f,15.823649f,-11.835751f,15.599435f,-10.834409f,15.02131f,-11.974646f,15.358862f,-10.973303f,14.780737f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
24,0,25,1,26,2,25,1,27,3,26,2,27,3,28,4,26,2,29,5,30,6,28,4,26,2,28,4,30,6,31,7,32,8,33,9,33,9,32,8,34,10,32,8,35,11,34,10,34,10,35,11,36,12,35,11,37,13,36,12,36,12,37,13,38,14,37,13,39,15,38,14,38,14,39,15,40,16,39,15,41,17,40,16,40,16,41,17,42,18,41,17,43,19,42,18,42,18,43,19,44,20,44,20,43,19,45,21,43,19,46,22,45,21,45,21,46,22,47,23,47,23,46,22,28,4,29,5,28,4,46,22,52,24,53,25,54,26,55,27,54,26,53,25,60,28,61,29,62,30,63,31,62,30,61,29,68,32,69,33,70,34,71,35,70,34,69,33,76,36,77,37,78,38,79,39,78,38,77,37,84,40,85,41,86,42,87,43,86,42,85,41,92,44,93,45,94,46,95,47,94,46,93,45,100,48,101,49,102,50,103,51,102,50,101,49,106,52,107,53,100,54,101,55,100,54,107,53,110,56,111,57,106,58,107,59,106,58,111,57,114,60,115,61,110,62,111,63,110,62,115,61,118,64,119,65,114,66,115,67,114,66,119,65,118,68,122,69,119,70,123,71,119,70,122,69,122,72,126,73,123,74,127,75,123,74,126,73,126,76,130,77,127,78,131,79,127,78,130,77,130,80,134,81,131,82,135,83,131,82,134,81,140,84,141,85,142,86,143,87,142,86,141,85,148,88,149,89,150,90,151,91,150,90,149,89,156,92,157,93,158,94,159,95,158,94,157,93,164,96,165,97,166,98,167,99,166,98,165,97,172,100,173,101,174,102,175,103,174,102,173,101,180,104,181,105,182,106,183,107,182,106,181,105,188,108,189,109,190,110,191,111,190,110,189,109,196,112,197,113,198,114,199,115,198,114,197,113,204,116,205,117,206,118,207,119,206,118,205,117,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID847(GL2 gl){
double[] positionsArray = MahonTower2Coordinates.getID847PositionsArray();
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = MahonTower2Coordinates.getID847NoramlsArray();
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = MahonTower2Coordinates.getID847TexCoordinatesArray();
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,3,3,0,0,4,4,5,4,6,0,7,3,7,3,6,0,8,1,9,2,8,1,6,0,10,5,11,6,12,7,11,6,10,5,13,8,14,8,15,5,16,6,17,7,16,6,15,5,18,9,19,10,20,11,19,10,18,9,21,12,22,12,23,9,24,10,25,11,24,10,23,9,26,13,27,14,28,15,27,14,26,13,29,16,30,16,31,13,32,14,33,15,32,14,31,13,34,17,35,18,36,19,35,18,34,17,37,20,38,20,39,17,40,18,41,19,40,18,39,17,42,21,43,22,44,23,43,22,42,21,45,24,46,24,47,21,48,22,49,23,48,22,47,21,50,25,51,26,52,27,53,27,54,26,55,25,56,28,57,29,58,30,57,29,56,28,59,31,59,31,56,28,60,32,61,32,62,28,63,31,63,31,62,28,64,29,65,30,64,29,62,28,36,19,66,33,67,34,66,33,36,19,35,18,40,18,41,19,68,33,69,34,68,33,41,19,70,23,71,35,72,36,71,35,70,23,73,22,74,22,75,23,76,35,77,36,76,35,75,23,78,37,79,38,80,39,79,38,78,37,81,40,82,40,83,37,84,38,85,39,84,38,83,37,86,41,87,42,88,43,87,42,86,41,89,44,89,44,86,41,90,45,91,45,92,41,93,44,93,44,92,41,94,42,95,43,94,42,92,41,96,46,97,5,98,47,97,5,96,46,99,48,100,48,101,46,102,5,103,47,102,5,101,46,104,49,105,50,106,51,107,51,108,50,109,49,110,52,111,53,112,54,111,53,110,52,113,55,114,55,115,52,116,53,117,54,116,53,115,52,118,46,10,5,119,47,10,5,118,46,120,48,121,48,122,46,15,5,123,47,15,5,122,46,124,56,125,57,126,58,127,58,128,57,129,56,130,59,131,60,132,61,131,60,130,59,133,62,134,62,135,59,136,60,137,61,136,60,135,59,138,63,139,64,140,65,139,64,138,63,141,66,142,66,143,63,144,64,145,65,144,64,143,63,146,67,147,68,148,69,147,68,146,67,149,70,149,70,146,67,150,71,151,71,152,67,153,70,153,70,152,67,154,68,155,69,154,68,152,67,132,61,156,72,157,73,156,72,132,61,131,60,136,60,137,61,158,72,159,73,158,72,137,61,160,74,140,65,161,75,140,65,160,74,138,63,143,63,162,74,145,65,163,75,145,65,162,74,164,76,165,77,166,78,165,77,164,76,167,79,167,79,164,76,168,80,169,80,170,76,171,79,171,79,170,76,172,77,173,78,172,77,170,76,174,81,175,82,176,83,175,82,174,81,15,14,10,14,177,81,178,82,179,83,178,82,177,81,180,84,181,85,182,86,181,85,180,84,183,87,184,87,185,84,186,85,187,86,186,85,185,84,188,88,189,89,190,90,189,89,188,88,97,5,102,5,191,88,192,89,193,90,192,89,191,88,194,91,195,92,196,93,195,92,194,91,197,94,198,94,199,91,200,92,201,93,200,92,199,91,202,95,203,47,204,96,203,47,202,95,205,97,206,97,207,95,208,47,209,96,208,47,207,95,210,98,211,99,212,100,213,100,214,99,215,98,216,95,217,47,218,96,217,47,216,95,219,97,220,97,221,95,222,47,223,96,222,47,221,95,224,101,225,102,226,103,227,103,228,102,229,101,230,104,231,105,232,106,231,105,230,104,233,107,234,107,235,104,236,105,237,106,236,105,235,104,238,108,239,109,240,110,239,109,238,108,241,111,242,111,243,108,244,109,245,110,244,109,243,108,226,103,246,112,247,113,246,112,226,103,248,114,248,114,226,103,225,102,228,102,227,103,249,114,249,114,227,103,250,112,251,113,250,112,227,103,233,107,252,115,231,105,252,115,233,107,253,116,254,116,234,107,255,115,236,105,255,115,234,107,256,117,240,110,257,118,240,110,256,117,238,108,243,108,258,117,245,110,259,118,245,110,258,117,260,119,261,120,262,121,261,120,260,119,263,122,263,122,260,119,264,123,265,123,266,119,267,122,267,122,266,119,268,120,269,121,268,120,266,119,270,82,271,124,272,83,273,83,274,124,275,82,276,125,277,126,182,127,277,126,276,125,278,128,277,126,278,128,279,129,277,126,279,129,280,130,277,126,280,130,281,131,282,131,283,130,284,126,283,130,285,129,284,126,285,129,286,128,284,126,286,128,287,125,284,126,288,127,284,126,287,125,289,132,290,133,291,134,290,133,289,132,292,135,293,135,294,132,295,133,296,134,295,133,294,132,297,136,298,137,299,138,298,137,297,136,300,139,301,139,302,136,303,137,304,138,303,137,302,136,305,140,306,141,307,142,306,141,305,140,308,143,309,143,310,140,311,141,312,142,311,141,310,140,313,144,314,145,315,146,316,146,317,145,318,144,319,147,320,148,321,149,320,148,319,147,322,96,323,96,324,147,325,148,326,149,325,148,324,147,327,150,328,151,329,152,330,152,331,151,332,150,333,153,334,154,335,155,334,154,333,153,336,156,337,156,338,153,339,154,340,155,339,154,338,153,341,157,342,158,343,159,342,158,341,157,344,160,345,160,346,157,347,158,348,159,347,158,346,157,349,161,350,162,351,163,350,162,349,161,352,164,352,164,349,161,353,165,354,165,355,161,356,164,356,164,355,161,357,162,358,163,357,162,355,161,336,156,359,166,334,154,359,166,336,156,360,167,361,167,337,156,362,166,339,154,362,166,337,156,363,168,364,169,365,170,364,169,363,168,366,171,367,171,368,168,369,169,370,170,369,169,368,168,371,172,372,173,373,174,372,173,371,172,314,145,314,145,371,172,315,146,316,146,374,172,317,145,317,145,374,172,375,173,376,174,375,173,374,172,377,124,378,175,379,176,378,175,377,124,380,177,380,177,377,124,381,82,382,82,383,124,384,177,384,177,383,124,385,175,386,176,385,175,383,124,387,176,388,177,389,178,388,177,387,176,390,175,391,175,392,176,393,177,394,178,393,177,392,176,395,176,396,179,397,180,396,179,395,176,398,178,396,179,399,177,400,181,399,177,396,179,398,178,401,178,402,179,403,177,404,181,403,177,402,179,401,178,405,176,402,179,406,180,402,179,405,176,407,182,408,183,409,184,408,183,407,182,410,185,411,185,412,182,413,183,414,184,413,183,412,182,410,185,415,186,408,183,415,186,410,185,416,187,417,187,411,185,418,186,413,183,418,186,411,185,419,188,420,189,421,190,422,190,423,189,424,188,425,191,426,192,427,193,426,192,425,191,428,194,429,194,430,191,431,192,432,193,431,192,430,191,433,195,434,196,435,197,434,196,433,195,436,198,437,198,438,195,439,196,440,197,439,196,438,195,441,199,442,200,443,201,442,200,441,199,444,142,445,142,446,199,447,200,448,201,447,200,446,199,449,202,450,203,451,204,452,204,453,203,454,202,455,205,456,206,457,207,456,206,455,205,458,148,459,148,460,205,461,206,462,207,461,206,460,205,463,208,464,209,465,210,464,209,463,208,466,211,467,211,468,208,469,209,470,210,469,209,468,208,471,212,472,213,473,214,472,213,471,212,474,215,475,215,476,212,477,213,478,214,477,213,476,212,479,216,480,217,481,218,480,217,479,216,482,219,483,219,484,216,485,217,486,218,485,217,484,216,474,215,487,220,472,213,487,220,474,215,488,221,489,221,475,215,490,220,477,213,490,220,475,215,491,222,492,223,493,224,492,223,491,222,494,225,494,225,491,222,495,226,496,226,497,222,498,225,498,225,497,222,499,223,500,224,499,223,497,222,501,227,502,228,503,229,502,228,501,227,504,230,505,230,506,227,507,228,508,229,507,228,506,227,509,231,510,232,511,233,512,234,513,235,514,236,513,235,512,234,510,232,513,235,510,232,509,231,513,235,509,231,515,237,516,237,517,231,518,235,517,231,519,232,518,235,519,232,520,234,518,235,521,236,518,235,520,234,522,233,519,232,517,231,523,238,524,239,525,240,524,239,523,238,526,241,527,241,528,238,529,239,530,240,529,239,528,238,531,180,532,181,533,242,532,181,531,180,534,179,535,179,536,180,537,181,538,242,537,181,536,180,539,243,540,244,541,245,540,244,539,243,542,246,542,246,539,243,543,247,542,246,543,247,544,248,544,248,543,247,545,249,546,249,547,247,548,248,548,248,547,247,549,246,547,247,550,243,549,246,549,246,550,243,551,244,552,245,551,244,550,243,506,250,553,251,508,252,553,251,506,250,554,253,555,253,501,250,556,251,503,252,556,251,501,250,557,254,558,255,559,256,558,255,557,254,560,257,561,257,562,254,563,255,564,256,563,255,562,254,565,258,566,259,567,260,568,260,569,259,570,258,571,261,572,262,573,263,572,262,571,261,574,264,574,264,571,261,575,265,576,265,577,261,578,264,578,264,577,261,579,262,580,263,579,262,577,261,581,266,582,267,583,268,582,267,581,266,584,199,585,199,586,266,587,267,588,268,587,267,586,266,589,269,590,270,591,271,590,270,589,269,592,272,593,272,594,269,595,270,596,271,595,270,594,269,597,180,598,273,599,274,598,273,597,180,600,242,598,273,601,181,602,275,601,181,598,273,600,242,603,242,604,273,605,181,606,275,605,181,604,273,603,242,607,180,604,273,608,274,604,273,607,180,609,276,610,277,611,278,610,277,609,276,612,279,613,279,614,276,615,277,616,278,615,277,614,276,612,279,617,280,610,277,617,280,612,279,618,281,619,281,613,279,620,280,615,277,620,280,613,279,621,282,622,283,623,284,624,284,625,283,626,282,528,285,627,286,530,287,627,286,528,285,628,288,629,288,523,285,630,286,525,287,630,286,523,285,631,274,632,289,633,290,632,289,631,274,634,291,632,289,634,291,635,275,635,275,636,292,632,289,637,289,638,292,639,275,639,275,640,291,637,289,640,291,641,274,637,289,642,290,637,289,641,274,643,291,644,273,645,275,644,273,643,291,646,274,647,274,648,291,649,273,650,275,649,273,648,291,651,293,652,294,653,295,652,294,651,293,654,296,655,296,656,293,657,294,658,295,657,294,656,293,659,297,660,298,661,299,660,298,659,297,662,300,663,300,664,297,665,298,666,299,665,298,664,297,667,301,668,302,669,303,670,303,671,302,672,301,673,304,674,305,675,306,674,305,673,304,676,307,677,307,678,304,679,305,680,306,679,305,678,304,681,308,682,309,683,310,682,309,681,308,684,311,685,311,686,308,687,309,688,310,687,309,686,308,689,312,690,309,691,313,690,309,689,312,692,310,693,310,694,312,695,309,696,313,695,309,694,312,697,314,698,315,699,316,698,315,697,314,700,317,701,317,702,314,703,315,704,316,703,315,702,314,705,318,706,319,707,320,706,319,705,318,708,321,708,321,705,318,709,322,709,322,705,318,710,323,710,323,705,318,711,324,712,324,713,318,714,323,714,323,713,318,715,322,715,322,713,318,716,321,716,321,713,318,717,319,718,320,717,319,713,318,719,325,720,326,721,327,720,326,719,325,722,328,723,328,724,325,725,326,726,327,725,326,724,325,727,329,728,330,729,331,728,330,727,329,730,332,731,332,732,329,733,330,734,331,733,330,732,329,735,333,736,289,737,292,736,289,735,333,738,290,739,290,740,333,741,289,742,292,741,289,740,333,743,334,744,335,745,336,744,335,743,334,746,337,746,337,743,334,747,338,747,338,743,334,748,339,748,339,743,334,749,340,750,340,751,334,752,339,752,339,751,334,753,338,753,338,751,334,754,337,754,337,751,334,755,335,756,336,755,335,751,334,757,341,758,342,759,343,758,342,757,341,760,344,761,344,762,341,763,342,764,343,763,342,762,341,765,345,766,346,767,347,766,346,765,345,768,348,769,348,770,345,771,346,772,347,771,346,770,345,767,347,773,349,774,350,773,349,767,347,766,346,771,346,772,347,775,349,776,350,775,349,772,347,777,351,778,292,779,352,778,292,777,351,780,333,780,333,777,351,781,353,780,333,781,353,782,290,783,290,784,353,785,333,784,353,786,351,785,333,785,333,786,351,787,292,788,352,787,292,786,351,789,354,790,355,791,356,790,355,789,354,792,357,793,357,794,354,795,355,796,356,795,355,794,354,797,358,798,359,799,360,798,359,797,358,800,361,801,361,802,358,803,359,804,360,803,359,802,358,805,362,806,363,807,364,808,364,809,363,810,362,811,365,732,366,731,367,732,366,811,365,812,368,813,368,814,365,727,366,730,367,727,366,814,365,815,369,816,370,817,352,816,370,815,369,818,353,818,353,815,369,819,371,818,353,819,371,820,372,821,372,822,371,823,353,822,371,824,369,823,353,823,353,824,369,825,370,826,352,825,370,824,369,827,370,828,351,829,352,828,351,827,370,830,353,831,353,832,370,833,351,834,352,833,351,832,370,835,373,836,374,837,375,836,374,835,373,838,376,839,376,840,373,841,374,842,375,841,374,840,373,843,377,836,374,838,376,836,374,843,377,844,378,845,378,846,377,841,374,839,376,841,374,846,377,847,379,848,380,849,381,850,381,851,380,852,379,853,382,854,383,855,384,854,383,853,382,856,385,857,385,858,382,859,383,860,384,859,383,858,382,861,386,862,387,863,388,862,387,861,386,864,389,865,389,866,386,867,387,868,388,867,387,866,386,869,390,870,391,871,392,872,392,873,391,874,390,875,393,876,391,877,394,876,391,875,393,878,392,879,392,880,393,881,391,882,394,881,391,880,393,883,395,884,396,885,397,884,396,883,395,886,266,887,266,888,395,889,396,890,397,889,396,888,395,891,398,892,399,893,400,892,399,891,398,894,401,895,401,896,398,897,399,898,400,897,399,896,398,899,402,900,403,901,404,900,403,899,402,902,405,902,405,899,402,903,406,903,406,899,402,904,407,905,407,906,402,907,406,907,406,906,402,908,405,908,405,906,402,909,403,910,404,909,403,906,402,911,408,912,409,913,410,912,409,911,408,914,411,915,411,916,408,917,409,918,410,917,409,916,408,919,412,920,413,921,414,920,413,919,412,922,415,923,415,924,412,925,413,926,414,925,413,924,412,927,416,928,371,929,369,928,371,927,416,930,372,931,372,932,416,933,371,934,369,933,371,932,416,935,417,936,418,937,419,936,418,935,417,938,420,939,420,940,417,941,418,942,419,941,418,940,417,943,421,944,422,945,423,944,422,943,421,946,424,947,424,948,421,949,422,950,423,949,422,948,421,951,425,952,426,953,427,952,426,951,425,954,428,955,428,956,425,957,426,958,427,957,426,956,425,959,429,960,430,961,431,960,430,959,429,962,432,962,432,963,433,960,430,964,430,965,433,966,432,966,432,967,429,964,430,968,431,964,430,967,429,969,434,970,435,971,436,970,435,969,434,972,437,973,437,974,434,975,435,976,436,975,435,974,434,977,438,978,439,979,440,980,440,981,439,982,438,983,441,984,442,985,443,984,442,983,441,986,444,987,444,988,441,989,442,990,443,989,442,988,441,991,445,992,446,993,447,992,446,991,445,994,448,995,448,996,445,997,446,998,447,997,446,996,445,999,449,1000,450,1001,451,1000,450,999,449,1002,452,1003,452,1004,449,1005,450,1006,451,1005,450,1004,449,1007,453,1008,454,1009,455,1008,454,1007,453,1010,456,1011,456,1012,453,1013,454,1014,455,1013,454,1012,453,1015,457,1016,458,1017,459,1018,459,1019,458,1020,457,1021,460,1022,395,1023,461,1022,395,1021,460,1024,462,1025,462,1026,460,1027,395,1028,461,1027,395,1026,460,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID855(GL2 gl){
double[] positionsArray = {
499.0909375,818.2473066,137.39375,499.0909375,818.2473066,122.319375,358.9237598,818.2473066,122.319375,358.9237598,818.2473066,122.319375,499.0909375,818.2473066,122.319375,499.0909375,818.2473066,137.39375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-13.863637f,3.816493f,-13.863637f,3.3977604f,-9.970104f,3.3977604f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
3,4,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID863(GL2 gl){
double[] positionsArray = {
358.9237598,818.2473066,122.319375,358.9237598,818.2473066,107.0225,218.756582,737.3217488,107.0225,218.756582,737.3217488,107.0225,358.9237598,818.2473066,107.0225,358.9237598,818.2473066,122.319375,218.756582,737.3217488,81.824375,358.9237598,818.2473066,0.0,218.756582,737.3217488,0.0,358.9237598,818.2473066,107.0225,218.756582,737.3217488,107.0225,218.756582,737.3217488,107.0225,218.756582,737.3217488,81.824375,358.9237598,818.2473066,107.0225,358.9237598,818.2473066,0.0,218.756582,737.3217488,0.0,218.756582,737.3217488,81.824375,125.3117969,575.4706332,81.824375,218.756582,737.3217488,107.0225,218.756582,737.3217488,107.0225,125.3117969,575.4706332,81.824375,218.756582,737.3217488,81.824375,218.756582,737.3217488,81.824375,125.3117969,575.4706332,50.285,125.3117969,575.4706332,81.824375,125.3117969,575.4706332,0.0,218.756582,737.3217488,0.0,218.756582,737.3217488,0.0,218.756582,737.3217488,81.824375,125.3117969,575.4706332,0.0,125.3117969,575.4706332,50.285,125.3117969,575.4706332,81.824375,125.3117969,575.4706332,81.824375,125.3117969,359.6691458,50.285,125.3117969,575.4706332,50.285,125.3117969,575.4706332,50.285,125.3117969,359.6691458,50.285,125.3117969,575.4706332,81.824375,125.3117969,575.4706332,0.0,125.3117969,359.6691458,21.526875,125.3117969,359.6691458,0.0,125.3117969,359.6691458,50.285,125.3117969,575.4706332,50.285,125.3117969,575.4706332,50.285,125.3117969,575.4706332,0.0,125.3117969,359.6691458,50.285,125.3117969,359.6691458,21.526875,125.3117969,359.6691458,0.0,125.3117969,359.6691458,21.526875,249.9048437,143.8676583,21.526875,125.3117969,359.6691458,50.285,125.3117969,359.6691458,50.285,249.9048437,143.8676583,21.526875,125.3117969,359.6691458,21.526875,125.3117969,359.6691458,21.526875,249.9048437,143.8676583,0.0,249.9048437,143.8676583,21.526875,125.3117969,359.6691458,0.0,125.3117969,359.6691458,0.0,125.3117969,359.6691458,21.526875,249.9048437,143.8676583,0.0,249.9048437,143.8676583,21.526875,249.9048437,143.8676583,21.526875,249.9048437,143.8676583,0.0,499.0909375,0.0,0.0,499.0909375,0.0,0.0,249.9048437,143.8676583,0.0,249.9048437,143.8676583,21.526875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,-0.5,0.8660254,0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,0.5,-0.8660254,-0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-19.998909f,3.3977604f,-19.998909f,2.9728472f,-15.503045f,2.9728472f,-15.503045f,2.2728994f,-19.998909f,-0.0f,-15.503045f,-0.0f,-19.998909f,2.9728472f,-15.503045f,2.9728472f,-20.77549f,2.2728994f,-15.584113f,2.2728994f,-20.77549f,2.9728472f,-15.584113f,1.3968056f,-15.584113f,0.0f,-20.77549f,0.0f,15.985295f,1.3968056f,9.990809f,1.3968056f,15.985295f,2.2728994f,15.985295f,0.0f,9.990809f,0.5979687f,9.990809f,0.0f,-6.9118533f,0.5979687f,0.0099826f,0.5979687f,-6.9118533f,1.3968056f,-6.9118533f,0.5979687f,0.0099826f,0.0f,0.0099826f,0.5979687f,-6.9118533f,0.0f,4.013614f,0.5979688f,4.013614f,0.0f,12.006262f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,6,3,7,4,8,5,7,4,6,3,9,6,9,6,6,3,10,7,16,8,17,9,18,10,22,8,23,11,24,9,23,11,22,8,25,12,25,12,22,8,26,13,35,14,36,15,37,16,43,14,44,17,45,15,45,15,44,17,46,18,47,19,46,18,44,17,48,20,49,21,50,22,54,23,55,24,56,25,55,24,54,23,57,26,62,27,63,28,64,29,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
3,4,5,11,12,13,13,12,14,15,14,12,19,20,21,27,28,29,29,28,30,31,30,28,51,52,53,58,59,60,61,60,59,65,66,67,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 36, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
32,33,34,38,39,40,39,38,41,41,38,42,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 12, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID871(GL2 gl){
double[] positionsArray = {
125.3117969,791.2721207,50.285,0.71875,575.4706332,50.285,125.3117969,791.2721207,81.824375,125.3117969,791.2721207,81.824375,0.71875,575.4706332,50.285,125.3117969,791.2721207,50.285,125.3117969,791.2721207,50.285,0.71875,575.4706332,21.526875,0.71875,575.4706332,50.285,0.71875,575.4706332,0.0,125.3117969,791.2721207,0.0,125.3117969,791.2721207,0.0,125.3117969,791.2721207,50.285,0.71875,575.4706332,0.0,0.71875,575.4706332,21.526875,0.71875,575.4706332,50.285,0.71875,575.4706332,21.526875,0.71875,287.7353166,21.526875,0.71875,575.4706332,50.285,0.71875,575.4706332,50.285,0.71875,287.7353166,21.526875,0.71875,575.4706332,21.526875,0.71875,575.4706332,21.526875,0.71875,287.7353166,0.0,0.71875,287.7353166,21.526875,0.71875,575.4706332,0.0,0.71875,575.4706332,0.0,0.71875,575.4706332,21.526875,0.71875,287.7353166,0.0,0.71875,287.7353166,21.526875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,6,7,8,7,6,9,9,6,10,16,17,18,22,23,24,23,22,25,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-20.77549f,2.2728994f,-13.853655f,1.3968056f,-20.77549f,1.3968056f,-20.77549f,-0.0f,-20.77549f,1.3968056f,-13.853655f,-0.0f,-13.853655f,0.5979687f,-13.853655f,1.3968056f,-15.985295f,1.3968056f,-7.9926476f,0.5979687f,-15.985295f,0.5979687f,-15.985295f,0.0f,-7.9926476f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,0,4,1,5,2,11,3,12,4,13,5,13,5,12,4,14,6,15,7,14,6,12,4,19,8,20,9,21,10,26,11,27,10,28,12,29,9,28,12,27,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID879(GL2 gl){
double[] positionsArray = {
748.2770313,1007.0736081,50.285,748.2770313,1007.0736081,21.526875,499.0909375,1150.9412664,21.526875,499.0909375,1150.9412664,21.526875,748.2770313,1007.0736081,21.526875,748.2770313,1007.0736081,50.285,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
3.9790335f,0.5979687f,-4.013614f,0.5979687f,-4.013614f,1.3968056f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,0,4,1,5,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID887(GL2 gl){
double[] positionsArray = {
748.2770313,1007.0736081,50.285,872.8700781,791.2721207,81.824375,872.8700781,791.2721207,50.285,872.8700781,791.2721207,50.285,872.8700781,791.2721207,81.824375,748.2770313,1007.0736081,50.285,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.8660254,0.5,0.0,0.8660254,0.5,0.0,0.8660254,0.5,0.0,-0.8660254,-0.5,-0.0,-0.8660254,-0.5,-0.0,-0.8660254,-0.5,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
6.9118533f,1.3968056f,6.9118533f,2.2728994f,13.833689f,1.3968056f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,0,4,1,5,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID895(GL2 gl){
double[] positionsArray = {
779.425293,737.3217488,107.0225,779.425293,575.4706332,122.319375,779.425293,575.4706332,107.0225,779.425293,575.4706332,107.0225,779.425293,575.4706332,122.319375,779.425293,737.3217488,107.0225,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
20.48116f,2.9728472f,15.985295f,3.3977604f,15.985295f,2.9728472f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
3,4,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID903(GL2 gl){
double[] positionsArray = {
685.9805078,899.1728644,81.824375,779.425293,737.3217488,107.0225,779.425293,737.3217488,81.824375,779.425293,737.3217488,81.824375,779.425293,737.3217488,107.0225,685.9805078,899.1728644,81.824375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,0.8660254,0.5,-0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,-0.8660254,-0.5,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
12.10323f,2.2728994f,6.9118533f,2.9728472f,6.9118533f,2.2728994f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
3,4,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID911(GL2 gl){
double[] positionsArray = {
685.9805078,899.1728644,81.824375,499.0909375,1007.0736081,50.285,685.9805078,899.1728644,50.285,685.9805078,899.1728644,50.285,499.0909375,1007.0736081,50.285,685.9805078,899.1728644,81.824375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
4.013614f,1.3968056f,-1.9808716f,1.3968056f,4.013614f,2.2728994f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,0,4,1,5,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID919(GL2 gl){
double[] positionsArray = {
249.9048438,1007.0736081,21.526875,249.9048438,1007.0736081,0.0,0.71875,863.2059498,0.0,0.71875,863.2059498,0.0,249.9048438,1007.0736081,0.0,249.9048438,1007.0736081,21.526875,249.9048438,1007.0736081,21.526875,499.0909375,1007.0736081,0.0,249.9048438,1007.0736081,0.0,499.0909375,1007.0736081,21.526875,499.0909375,1007.0736081,21.526875,249.9048438,1007.0736081,21.526875,499.0909375,1007.0736081,0.0,249.9048438,1007.0736081,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-19.998909f,0.5979687f,-19.998909f,0.0f,-12.006262f,0.0f,-6.941801f,0.5979687f,-13.863637f,-0.0f,-6.941801f,-0.0f,-13.863637f,0.5979687f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,6,3,7,4,8,5,7,4,6,3,9,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
3,4,5,10,11,12,13,12,11,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID927(GL2 gl){
double[] positionsArray = {
779.425293,575.4706332,122.319375,709.3417041,454.0822965,137.39375,709.3417041,454.0822965,122.319375,709.3417041,454.0822965,122.319375,709.3417041,454.0822965,137.39375,779.425293,575.4706332,122.319375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,0.8660254,-0.5,-0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,-0.8660254,0.5,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
24.669024f,3.3977604f,20.77549f,3.816493f,20.77549f,3.3977604f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
3,4,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID935(GL2 gl){
double[] positionsArray = {
997.463125,287.7353166,21.526875,748.2770312,143.8676583,0.0,997.463125,287.7353166,0.0,748.2770312,143.8676583,21.526875,748.2770312,143.8676583,21.526875,997.463125,287.7353166,21.526875,748.2770312,143.8676583,0.0,997.463125,287.7353166,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,1,0,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 6, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
19.998909f,0.5979687f,27.991558f,0.5979687f,19.998909f,0.0f,27.991558f,0.0f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
4,0,5,1,6,2,7,3,6,2,5,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID943(GL2 gl){
double[] positionsArray = {
499.0909375,143.8676583,81.824375,499.0909375,143.8676583,50.285,748.2770312,143.8676583,50.285,748.2770312,143.8676583,50.285,499.0909375,143.8676583,50.285,499.0909375,143.8676583,81.824375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
20.785473f,1.3968056f,13.863637f,1.3968056f,13.863637f,2.2728994f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,0,4,1,5,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID951(GL2 gl){
double[] positionsArray = {
288.8401709,454.0822965,122.319375,358.9237598,332.6939598,122.319375,288.8401709,454.0822965,137.39375,288.8401709,454.0822965,137.39375,358.9237598,332.6939598,122.319375,288.8401709,454.0822965,122.319375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.8660254,-0.5,-0.0,-0.8660254,-0.5,-0.0,-0.8660254,-0.5,-0.0,0.8660254,0.5,0.0,0.8660254,0.5,0.0,0.8660254,0.5,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-6.9118533f,3.3977604f,-3.0183206f,3.3977604f,-6.9118533f,3.816493f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
3,4,5,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID959(GL2 gl){
double[] positionsArray = {
685.9805078,251.768402,81.824375,872.8700781,359.6691458,50.285,685.9805078,251.768402,50.285,685.9805078,251.768402,50.285,872.8700781,359.6691458,50.285,685.9805078,251.768402,81.824375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,-0.5,0.8660254,-0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,0.5,-0.8660254,0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
0,1,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 3, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
-19.998909f,1.3968056f,-25.993395f,1.3968056f,-19.998909f,2.2728994f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
3,0,4,1,5,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID967(GL2 gl){
double[] positionsArray = {
499.0909375,251.768402,81.824375,358.9237598,332.6939598,0.0,499.0909375,251.768402,0.0,358.9237598,332.6939598,107.0225,499.0909375,251.768402,107.0225,499.0909375,251.768402,107.0225,499.0909375,251.768402,81.824375,358.9237598,332.6939598,107.0225,358.9237598,332.6939598,0.0,499.0909375,251.768402,0.0,499.0909375,251.768402,107.0225,499.0909375,251.768402,81.824375,685.9805078,251.768402,81.824375,685.9805078,251.768402,81.824375,499.0909375,251.768402,81.824375,499.0909375,251.768402,107.0225,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,-0.5,-0.8660254,0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.5,0.8660254,-0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
8.509479f,2.2728994f,4.013614f,0.0f,8.509479f,0.0f,4.013614f,2.9728472f,8.509479f,2.9728472f,13.863637f,2.9728472f,13.863637f,2.2728994f,19.055014f,2.2728994f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,1,1,0,0,3,3,3,3,0,0,4,4,10,5,11,6,12,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
5,6,7,7,6,8,9,8,6,13,14,15,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 12, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID975(GL2 gl){
double[] positionsArray = {
997.463125,863.2059498,0.0,997.463125,575.4706332,21.526875,997.463125,575.4706332,0.0,997.463125,575.4706332,0.0,997.463125,575.4706332,21.526875,997.463125,863.2059498,0.0,997.463125,575.4706332,0.0,872.8700781,359.6691458,21.526875,872.8700781,359.6691458,0.0,997.463125,575.4706332,21.526875,997.463125,575.4706332,21.526875,997.463125,575.4706332,0.0,872.8700781,359.6691458,21.526875,872.8700781,359.6691458,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,0.8660254,-0.5,0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,-0.8660254,0.5,-0.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID25.bind();
texcoordArray = new float[] {
23.977943f,-0.0f,15.985295f,0.5979687f,15.985295f,-0.0f,27.697327f,-0.0f,20.77549f,0.5979687f,20.77549f,-0.0f,27.697327f,0.5979687f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
0,0,1,1,2,2,6,3,7,4,8,5,7,4,6,3,9,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(1.0, 1.0, 1.0, 1.0);
int[] indices = {
3,4,5,10,11,12,13,12,11,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 9, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID983(GL2 gl){
double[] positionsArray = {
660.1523689,710.6172209,485.60625,492.4288985,613.2529341,485.60625,462.581275,782.5272182,485.60625,499.0909375,614.1300082,485.60625,509.09672,612.812722,485.60625,518.420625,608.9506341,485.60625,526.4272437,602.8069394,485.60625,528.4803504,600.1312787,485.60625,528.4803504,600.1312787,485.60625,660.1523689,710.6172209,485.60625,526.4272437,602.8069394,485.60625,518.420625,608.9506341,485.60625,509.09672,612.812722,485.60625,499.0909375,614.1300082,485.60625,492.4288985,613.2529341,485.60625,462.581275,782.5272182,485.60625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID989(GL2 gl){
double[] positionsArray = {
462.581275,782.5272182,348.435,463.0394856,588.5922886,348.435,301.5198436,647.3806305,348.435,465.6109367,594.8003207,348.435,471.7546313,602.8069394,348.435,479.76125,608.9506341,348.435,489.085155,612.812722,348.435,492.4288985,613.2529341,348.435,492.4288985,613.2529341,348.435,462.581275,782.5272182,348.435,489.085155,612.812722,348.435,479.76125,608.9506341,348.435,471.7546313,602.8069394,348.435,465.6109367,594.8003207,348.435,463.0394856,588.5922886,348.435,301.5198436,647.3806305,348.435,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID995(GL2 gl){
double[] positionsArray = {
706.1475225,611.9802957,417.020625,537.7503125,575.4706332,417.020625,536.8732384,582.1326723,417.020625,634.2375252,414.4092018,417.020625,526.4272437,548.134327,417.020625,523.751583,546.0812203,417.020625,532.5709383,556.1409457,417.020625,536.4330262,565.4648507,417.020625,537.7503125,575.4706332,417.020625,536.4330262,565.4648507,417.020625,634.2375252,414.4092018,417.020625,532.5709383,556.1409457,417.020625,526.4272437,548.134327,417.020625,523.751583,546.0812203,417.020625,706.1475225,611.9802957,417.020625,536.8732384,582.1326723,417.020625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,4,3,5,3,4,6,3,6,7,3,7,1,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,13,10,12,10,14,8,15,8,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1001(GL2 gl){
double[] positionsArray = {
634.2375252,736.5320646,462.744375,485.9692821,611.5220852,462.744375,427.1809402,773.0417271,462.744375,489.085155,612.812722,462.744375,499.0909375,614.1300082,462.744375,509.09672,612.812722,462.744375,518.420625,608.9506341,462.744375,523.751583,604.8600461,462.744375,523.751583,604.8600461,462.744375,634.2375252,736.5320646,462.744375,518.420625,608.9506341,462.744375,509.09672,612.812722,462.744375,499.0909375,614.1300082,462.744375,489.085155,612.812722,462.744375,485.9692821,611.5220852,462.744375,427.1809402,773.0417271,462.744375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1007(GL2 gl){
double[] positionsArray = {
604.2163208,757.5531383,577.05375,526.4272437,602.8069394,577.05375,518.420625,608.9506341,577.05375,532.5709383,594.8003207,577.05375,536.4330262,585.4764157,577.05375,537.7503125,575.4706332,577.05375,709.3417041,575.4706332,577.05375,709.3417041,575.4706332,577.05375,604.2163208,757.5531383,577.05375,537.7503125,575.4706332,577.05375,536.4330262,585.4764157,577.05375,532.5709383,594.8003207,577.05375,526.4272437,602.8069394,577.05375,518.420625,608.9506341,577.05375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1013(GL2 gl){
double[] positionsArray = {
526.4272437,548.134327,439.8825,604.2163208,393.3881282,439.8825,518.420625,541.9906324,439.8825,532.5709383,556.1409457,439.8825,536.4330262,565.4648507,439.8825,537.7503125,575.4706332,439.8825,709.3417041,575.4706332,439.8825,709.3417041,575.4706332,439.8825,537.7503125,575.4706332,439.8825,604.2163208,393.3881282,439.8825,536.4330262,565.4648507,439.8825,532.5709383,556.1409457,439.8825,526.4272437,548.134327,439.8825,518.420625,541.9906324,439.8825,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1019(GL2 gl){
double[] positionsArray = {
660.1523689,710.6172209,211.26375,492.4288985,613.2529341,211.26375,462.581275,782.5272182,211.26375,499.0909375,614.1300082,211.26375,509.09672,612.812722,211.26375,518.420625,608.9506341,211.26375,526.4272437,602.8069394,211.26375,528.4803504,600.1312787,211.26375,528.4803504,600.1312787,211.26375,660.1523689,710.6172209,211.26375,526.4272437,602.8069394,211.26375,518.420625,608.9506341,211.26375,509.09672,612.812722,211.26375,499.0909375,614.1300082,211.26375,492.4288985,613.2529341,211.26375,462.581275,782.5272182,211.26375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1025(GL2 gl){
double[] positionsArray = {
427.1809402,773.0417271,325.573125,461.3086366,582.1326723,325.573125,292.0343525,611.9802957,325.573125,461.7488488,585.4764157,325.573125,465.6109367,594.8003207,325.573125,471.7546313,602.8069394,325.573125,479.76125,608.9506341,325.573125,485.9692821,611.5220852,325.573125,485.9692821,611.5220852,325.573125,427.1809402,773.0417271,325.573125,479.76125,608.9506341,325.573125,471.7546313,602.8069394,325.573125,465.6109367,594.8003207,325.573125,461.7488488,585.4764157,325.573125,461.3086366,582.1326723,325.573125,292.0343525,611.9802957,325.573125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1031(GL2 gl){
double[] positionsArray = {
604.2163208,757.5531383,439.8825,479.76125,608.9506341,439.8825,393.9655542,757.5531383,439.8825,489.085155,612.812722,439.8825,499.0909375,614.1300082,439.8825,509.09672,612.812722,439.8825,518.420625,608.9506341,439.8825,518.420625,608.9506341,439.8825,604.2163208,757.5531383,439.8825,509.09672,612.812722,439.8825,499.0909375,614.1300082,439.8825,489.085155,612.812722,439.8825,479.76125,608.9506341,439.8825,393.9655542,757.5531383,439.8825,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1037(GL2 gl){
double[] positionsArray = {
479.76125,541.9906324,577.05375,604.2163208,393.3881282,577.05375,393.9655542,393.3881282,577.05375,489.085155,538.1285445,577.05375,499.0909375,536.8112582,577.05375,509.09672,538.1285445,577.05375,518.420625,541.9906324,577.05375,518.420625,541.9906324,577.05375,509.09672,538.1285445,577.05375,604.2163208,393.3881282,577.05375,499.0909375,536.8112582,577.05375,489.085155,538.1285445,577.05375,479.76125,541.9906324,577.05375,393.9655542,393.3881282,577.05375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1043(GL2 gl){
double[] positionsArray = {
660.1523689,710.6172209,348.435,532.5709383,594.8003207,348.435,528.4803504,600.1312787,348.435,536.4330262,585.4764157,348.435,537.7503125,575.4706332,348.435,536.4330262,565.4648507,348.435,696.6620314,503.5606359,348.435,535.1423894,562.3489778,348.435,660.1523689,710.6172209,348.435,537.7503125,575.4706332,348.435,696.6620314,503.5606359,348.435,536.4330262,565.4648507,348.435,535.1423894,562.3489778,348.435,536.4330262,585.4764157,348.435,532.5709383,594.8003207,348.435,528.4803504,600.1312787,348.435,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,6,7,6,5,4,6,4,0,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,12,10,11,9,8,13,13,8,14,15,14,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1049(GL2 gl){
double[] positionsArray = {
535.6006,782.5272182,256.9875,509.09672,612.812722,256.9875,505.7529765,613.2529341,256.9875,518.420625,608.9506341,256.9875,526.4272437,602.8069394,256.9875,532.5709383,594.8003207,256.9875,535.1423894,588.5922886,256.9875,696.6620314,647.3806305,256.9875,696.6620314,647.3806305,256.9875,535.6006,782.5272182,256.9875,535.1423894,588.5922886,256.9875,532.5709383,594.8003207,256.9875,526.4272437,602.8069394,256.9875,518.420625,608.9506341,256.9875,509.09672,612.812722,256.9875,505.7529765,613.2529341,256.9875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1055(GL2 gl){
double[] positionsArray = {
509.09672,538.1285445,485.60625,535.6006,368.4140482,485.60625,505.7529765,537.6883323,485.60625,518.420625,541.9906324,485.60625,526.4272437,548.134327,485.60625,532.5709383,556.1409457,485.60625,535.1423894,562.3489778,485.60625,696.6620314,503.5606359,485.60625,696.6620314,503.5606359,485.60625,535.1423894,562.3489778,485.60625,535.6006,368.4140482,485.60625,532.5709383,556.1409457,485.60625,526.4272437,548.134327,485.60625,518.420625,541.9906324,485.60625,509.09672,538.1285445,485.60625,505.7529765,537.6883323,485.60625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1061(GL2 gl){
double[] positionsArray = {
571.0009348,773.0417271,554.191875,518.420625,608.9506341,554.191875,512.2125929,611.5220852,554.191875,526.4272437,602.8069394,554.191875,532.5709383,594.8003207,554.191875,536.4330262,585.4764157,554.191875,536.8732384,582.1326723,554.191875,706.1475225,611.9802957,554.191875,706.1475225,611.9802957,554.191875,571.0009348,773.0417271,554.191875,536.8732384,582.1326723,554.191875,536.4330262,585.4764157,554.191875,532.5709383,594.8003207,554.191875,526.4272437,602.8069394,554.191875,518.420625,608.9506341,554.191875,512.2125929,611.5220852,554.191875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1067(GL2 gl){
double[] positionsArray = {
485.9692821,539.4191813,554.191875,634.2375252,414.4092018,554.191875,427.1809402,377.8995393,554.191875,489.085155,538.1285445,554.191875,499.0909375,536.8112582,554.191875,509.09672,538.1285445,554.191875,518.420625,541.9906324,554.191875,523.751583,546.0812203,554.191875,523.751583,546.0812203,554.191875,518.420625,541.9906324,554.191875,634.2375252,414.4092018,554.191875,509.09672,538.1285445,554.191875,499.0909375,536.8112582,554.191875,489.085155,538.1285445,554.191875,485.9692821,539.4191813,554.191875,427.1809402,377.8995393,554.191875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1073(GL2 gl){
double[] positionsArray = {
696.6620314,647.3806305,394.15875,536.4330262,585.4764157,394.15875,535.1423894,588.5922886,394.15875,537.7503125,575.4706332,394.15875,660.1523689,440.3240455,394.15875,532.5709383,556.1409457,394.15875,528.4803504,550.8099877,394.15875,536.4330262,565.4648507,394.15875,537.7503125,575.4706332,394.15875,536.4330262,565.4648507,394.15875,660.1523689,440.3240455,394.15875,532.5709383,556.1409457,394.15875,528.4803504,550.8099877,394.15875,696.6620314,647.3806305,394.15875,536.4330262,585.4764157,394.15875,535.1423894,588.5922886,394.15875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,4,6,4,5,7,4,7,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,12,10,11,10,13,8,8,13,14,15,14,13,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1079(GL2 gl){
double[] positionsArray = {
571.0009348,773.0417271,279.849375,518.420625,608.9506341,279.849375,512.2125929,611.5220852,279.849375,526.4272437,602.8069394,279.849375,532.5709383,594.8003207,279.849375,536.4330262,585.4764157,279.849375,536.8732384,582.1326723,279.849375,706.1475225,611.9802957,279.849375,706.1475225,611.9802957,279.849375,571.0009348,773.0417271,279.849375,536.8732384,582.1326723,279.849375,536.4330262,585.4764157,279.849375,532.5709383,594.8003207,279.849375,526.4272437,602.8069394,279.849375,518.420625,608.9506341,279.849375,512.2125929,611.5220852,279.849375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1085(GL2 gl){
double[] positionsArray = {
571.0009348,773.0417271,417.020625,474.430292,604.8600461,417.020625,363.9443498,736.5320646,417.020625,479.76125,608.9506341,417.020625,489.085155,612.812722,417.020625,499.0909375,614.1300082,417.020625,509.09672,612.812722,417.020625,512.2125929,611.5220852,417.020625,512.2125929,611.5220852,417.020625,571.0009348,773.0417271,417.020625,509.09672,612.812722,417.020625,499.0909375,614.1300082,417.020625,489.085155,612.812722,417.020625,479.76125,608.9506341,417.020625,474.430292,604.8600461,417.020625,363.9443498,736.5320646,417.020625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1091(GL2 gl){
double[] positionsArray = {
393.9655542,757.5531383,302.71125,460.4315625,575.4706332,302.71125,288.8401709,575.4706332,302.71125,461.7488488,585.4764157,302.71125,465.6109367,594.8003207,302.71125,471.7546313,602.8069394,302.71125,479.76125,608.9506341,302.71125,479.76125,608.9506341,302.71125,393.9655542,757.5531383,302.71125,471.7546313,602.8069394,302.71125,465.6109367,594.8003207,302.71125,461.7488488,585.4764157,302.71125,460.4315625,575.4706332,302.71125,288.8401709,575.4706332,302.71125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1097(GL2 gl){
double[] positionsArray = {
634.2375252,736.5320646,325.573125,526.4272437,602.8069394,325.573125,523.751583,604.8600461,325.573125,532.5709383,594.8003207,325.573125,536.4330262,585.4764157,325.573125,537.7503125,575.4706332,325.573125,705.7533868,539.0304675,325.573125,536.8732384,568.8085942,325.573125,694.759454,570.2494318,325.573125,694.759454,570.2494318,325.573125,634.2375252,736.5320646,325.573125,705.7533868,539.0304675,325.573125,537.7503125,575.4706332,325.573125,536.8732384,568.8085942,325.573125,536.4330262,585.4764157,325.573125,532.5709383,594.8003207,325.573125,526.4272437,602.8069394,325.573125,523.751583,604.8600461,325.573125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,6,7,6,5,0,6,0,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
9,10,11,10,12,11,13,11,12,12,10,14,14,10,15,15,10,16,17,16,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1103(GL2 gl){
double[] positionsArray = {
634.2375252,736.5320646,188.401875,485.9692821,611.5220852,188.401875,427.1809402,773.0417271,188.401875,489.085155,612.812722,188.401875,499.0909375,614.1300082,188.401875,509.09672,612.812722,188.401875,518.420625,608.9506341,188.401875,523.751583,604.8600461,188.401875,523.751583,604.8600461,188.401875,634.2375252,736.5320646,188.401875,518.420625,608.9506341,188.401875,509.09672,612.812722,188.401875,499.0909375,614.1300082,188.401875,489.085155,612.812722,188.401875,485.9692821,611.5220852,188.401875,427.1809402,773.0417271,188.401875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1109(GL2 gl){
double[] positionsArray = {
499.0909375,785.7213998,234.125625,509.09672,612.812722,234.125625,499.0909375,614.1300082,234.125625,681.1734425,680.5960165,234.125625,518.420625,608.9506341,234.125625,526.4272437,602.8069394,234.125625,532.5709383,594.8003207,234.125625,532.5709383,594.8003207,234.125625,681.1734425,680.5960165,234.125625,526.4272437,602.8069394,234.125625,518.420625,608.9506341,234.125625,509.09672,612.812722,234.125625,499.0909375,785.7213998,234.125625,499.0909375,614.1300082,234.125625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,5,3,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,8,12,11,13,11,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1115(GL2 gl){
double[] positionsArray = {
535.6006,782.5272182,394.15875,469.7015246,600.1312787,394.15875,338.0295061,710.6172209,394.15875,471.7546313,602.8069394,394.15875,479.76125,608.9506341,394.15875,489.085155,612.812722,394.15875,499.0909375,614.1300082,394.15875,505.7529765,613.2529341,394.15875,505.7529765,613.2529341,394.15875,535.6006,782.5272182,394.15875,499.0909375,614.1300082,394.15875,489.085155,612.812722,394.15875,479.76125,608.9506341,394.15875,471.7546313,602.8069394,394.15875,469.7015246,600.1312787,394.15875,338.0295061,710.6172209,394.15875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1121(GL2 gl){
double[] positionsArray = {
681.1734425,680.5960165,371.296875,536.4330262,585.4764157,371.296875,532.5709383,594.8003207,371.296875,537.7503125,575.4706332,371.296875,681.1734425,470.3452499,371.296875,536.4330262,565.4648507,371.296875,532.5709383,556.1409457,371.296875,537.7503125,575.4706332,371.296875,536.4330262,565.4648507,371.296875,681.1734425,470.3452499,371.296875,532.5709383,556.1409457,371.296875,681.1734425,680.5960165,371.296875,536.4330262,585.4764157,371.296875,532.5709383,594.8003207,371.296875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,4,6,4,5,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,10,9,8,9,11,7,7,11,12,13,12,11,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1127(GL2 gl){
double[] positionsArray = {
518.420625,541.9906324,462.744375,571.0009348,377.8995393,462.744375,512.2125929,539.4191813,462.744375,526.4272437,548.134327,462.744375,532.5709383,556.1409457,462.744375,536.4330262,565.4648507,462.744375,536.8732384,568.8085942,462.744375,706.1475225,538.9609707,462.744375,706.1475225,538.9609707,462.744375,536.8732384,568.8085942,462.744375,571.0009348,377.8995393,462.744375,536.4330262,565.4648507,462.744375,532.5709383,556.1409457,462.744375,526.4272437,548.134327,462.744375,518.420625,541.9906324,462.744375,512.2125929,539.4191813,462.744375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1133(GL2 gl){
double[] positionsArray = {
499.0909375,785.7213998,371.296875,465.6109367,594.8003207,371.296875,317.0084325,680.5960165,371.296875,471.7546313,602.8069394,371.296875,479.76125,608.9506341,371.296875,489.085155,612.812722,371.296875,499.0909375,614.1300082,371.296875,499.0909375,614.1300082,371.296875,499.0909375,785.7213998,371.296875,489.085155,612.812722,371.296875,479.76125,608.9506341,371.296875,471.7546313,602.8069394,371.296875,465.6109367,594.8003207,371.296875,317.0084325,680.5960165,371.296875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1139(GL2 gl){
double[] positionsArray = {
535.6006,782.5272182,531.33,509.09672,612.812722,531.33,505.7529765,613.2529341,531.33,518.420625,608.9506341,531.33,526.4272437,602.8069394,531.33,532.5709383,594.8003207,531.33,535.1423894,588.5922886,531.33,696.6620314,647.3806305,531.33,696.6620314,647.3806305,531.33,535.6006,782.5272182,531.33,535.1423894,588.5922886,531.33,532.5709383,594.8003207,531.33,526.4272437,602.8069394,531.33,518.420625,608.9506341,531.33,509.09672,612.812722,531.33,505.7529765,613.2529341,531.33,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1145(GL2 gl){
double[] positionsArray = {
492.4288985,537.6883323,531.33,660.1523689,440.3240455,531.33,462.581275,368.4140482,531.33,499.0909375,536.8112582,531.33,509.09672,538.1285445,531.33,518.420625,541.9906324,531.33,526.4272437,548.134327,531.33,528.4803504,550.8099877,531.33,528.4803504,550.8099877,531.33,526.4272437,548.134327,531.33,660.1523689,440.3240455,531.33,518.420625,541.9906324,531.33,509.09672,538.1285445,531.33,499.0909375,536.8112582,531.33,492.4288985,537.6883323,531.33,462.581275,368.4140482,531.33,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1151(GL2 gl){
double[] positionsArray = {
604.2163208,757.5531383,302.71125,526.4272437,602.8069394,302.71125,518.420625,608.9506341,302.71125,532.5709383,594.8003207,302.71125,536.4330262,585.4764157,302.71125,537.7503125,575.4706332,302.71125,709.3417041,575.4706332,302.71125,709.3417041,575.4706332,302.71125,604.2163208,757.5531383,302.71125,537.7503125,575.4706332,302.71125,536.4330262,585.4764157,302.71125,532.5709383,594.8003207,302.71125,526.4272437,602.8069394,302.71125,518.420625,608.9506341,302.71125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1157(GL2 gl){
double[] positionsArray = {
433.6844108,612.871683,645.639375,461.0188853,582.1837632,645.639375,460.4315625,575.4706332,645.639375,461.7488644,585.4766568,645.639375,462.7630081,588.6929182,645.639375,465.6109367,594.8003207,645.639375,461.60171,584.3588946,645.639375,462.1802871,586.5181738,645.639375,324.0749389,481.1764517,645.639375,329.8874865,470.3452499,645.639375,323.2866477,473.9699792,645.639375,325.1623648,491.1175826,645.639375,330.4516103,511.557662,645.639375,492.6514105,376.3734546,645.639375,338.6243963,531.0250329,645.639375,349.5109326,549.1152593,645.639375,362.8850505,565.4525153,645.639375,378.4689017,579.6973931,645.639375,395.9387306,591.5539543,645.639375,414.9316,600.7758779,645.639375,461.0188853,568.7575032,645.639375,461.7488644,565.4646093,645.639375,461.7476705,565.4736777,645.639375,461.7473724,565.4759423,645.639375,461.7468758,565.4797143,645.639375,461.6017099,566.582372,645.639375,462.1802925,564.4230725,645.639375,462.7630081,562.2483482,645.639375,465.6109367,556.1409457,645.639375,467.4230314,553.2965267,645.639375,469.4761381,550.620866,645.639375,471.7546313,548.134327,645.639375,474.2411703,545.8558338,645.639375,476.916831,543.8027272,645.639375,479.76125,541.9906324,645.639375,482.7527796,540.4333406,645.639375,485.8686525,539.1427038,645.639375,489.085155,538.1285445,645.639375,492.3778075,537.398581,645.639375,495.721551,536.9583688,645.639375,499.0909375,372.8373068,645.639375,499.0909375,536.8112582,645.639375,499.0909375,536.8112582,645.639375,495.721551,536.9583688,645.639375,499.0909375,372.8373068,645.639375,492.6514105,376.3734546,645.639375,492.3778075,537.398581,645.639375,489.085155,538.1285445,645.639375,485.8686525,539.1427038,645.639375,482.7527796,540.4333406,645.639375,479.76125,541.9906324,645.639375,476.916831,543.8027272,645.639375,474.2411703,545.8558338,645.639375,471.7546313,548.134327,645.639375,469.4761381,550.620866,645.639375,467.4230314,553.2965267,645.639375,465.6109367,556.1409457,645.639375,462.7630081,562.2483482,645.639375,462.1802925,564.4230725,645.639375,461.7488644,565.4646093,645.639375,461.6017099,566.582372,645.639375,461.0188853,568.7575032,645.639375,461.7468758,565.4797143,645.639375,461.7473724,565.4759423,645.639375,461.7476705,565.4736777,645.639375,460.4315625,575.4706332,645.639375,433.6844108,612.871683,645.639375,414.9316,600.7758779,645.639375,395.9387306,591.5539543,645.639375,378.4689017,579.6973931,645.639375,362.8850505,565.4525153,645.639375,349.5109326,549.1152593,645.639375,338.6243963,531.0250329,645.639375,330.4516103,511.557662,645.639375,329.8874865,470.3452499,645.639375,325.1623648,491.1175826,645.639375,324.0749389,481.1764517,645.639375,323.2866477,473.9699792,645.639375,462.1802871,586.5181738,645.639375,462.7630081,588.6929182,645.639375,461.7488644,585.4766568,645.639375,461.60171,584.3588946,645.639375,461.0188853,582.1837632,645.639375,465.6109367,594.8003207,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,1,3,6,3,4,7,8,9,10,9,8,11,9,11,12,9,12,13,13,12,14,13,14,15,13,15,16,13,16,17,13,17,18,13,18,19,13,19,0,13,0,20,20,0,2,13,20,21,21,20,22,22,20,23,23,20,24,24,20,25,13,21,26,13,26,27,13,27,28,13,28,29,13,29,30,13,30,31,13,31,32,13,32,33,13,33,34,13,34,35,13,35,36,13,36,37,13,37,38,13,38,39,13,39,40,40,39,41,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 120, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID156.bind();
texcoordArray = new float[] {
-4.4380913f,12.391673f,-4.4510684f,12.3293495f,-5.6214714f,14.099735f,-5.6227827f,13.946717f,-4.461824f,12.264436f,-4.4702754f,12.197425f,-4.4763584f,12.128828f,-4.4800267f,12.059167f,-4.4812527f,11.988972f,-4.4800267f,11.918776f,-4.4763584f,11.849114f,-4.4702754f,11.780518f,-4.461824f,11.713508f,-4.4510684f,11.648593f,-4.4380913f,11.586269f,-4.405881f,11.471268f,-4.3926144f,11.438101f,-4.386895f,11.419468f,-4.3794417f,11.4051695f,-4.3661723f,11.371997f,-4.3867946f,11.419274f,-4.38682f,11.419323f,-4.386835f,11.419352f,-4.320172f,11.2914715f,-4.1616993f,10.4193f,-4.3271303f,10.206956f,-4.4728208f,9.960344f,-4.631179f,9.768657f,-4.7989154f,9.635874f,-4.9725447f,9.5647545f,-5.1484604f,9.556778f,-5.323007f,9.612108f,-5.6227827f,10.031226f,-5.4925594f,9.729596f,-5.5688343f,9.81353f,-5.624127f,9.874374f,-4.2331567f,11.207944f,-4.215034f,11.195804f,-4.2424707f,11.211009f,-4.2511506f,11.219997f,-4.269277f,11.23214f,-4.159091f,11.183568f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
42,0,43,1,44,2,44,2,43,1,45,3,43,1,46,4,45,3,46,4,47,5,45,3,47,5,48,6,45,3,48,6,49,7,45,3,49,7,50,8,45,3,50,8,51,9,45,3,51,9,52,10,45,3,52,10,53,11,45,3,53,11,54,12,45,3,54,12,55,13,45,3,55,13,56,14,45,3,56,14,57,15,45,3,57,15,58,16,45,3,58,16,59,17,45,3,60,18,61,19,62,20,62,20,61,19,63,21,63,21,61,19,64,22,64,22,61,19,59,17,59,17,61,19,45,3,65,23,66,24,61,19,61,19,66,24,45,3,66,24,67,25,45,3,67,25,68,26,45,3,68,26,69,27,45,3,69,27,70,28,45,3,70,28,71,29,45,3,71,29,72,30,45,3,72,30,73,31,45,3,45,3,73,31,74,32,73,31,75,33,74,32,75,33,76,34,74,32,77,35,74,32,76,34,78,36,79,37,80,38,81,39,80,38,82,40,83,41,66,24,79,37,79,37,66,24,80,38,80,38,66,24,82,40,65,23,82,40,66,24,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1165(GL2 gl){
double[] positionsArray = {
674.7339155,669.4424285,645.639375,674.7339155,481.4988379,645.639375,674.5765459,676.7872965,645.639375,535.4188669,588.6929182,645.639375,532.5709383,594.8003207,645.639375,536.0017198,586.5176816,645.639375,536.4330262,585.4764157,645.639375,536.5801368,584.3589998,645.639375,537.1629897,582.1837632,645.639375,537.7503125,575.4706332,645.639375,555.741474,468.8955061,645.639375,575.8698256,462.5219339,645.639375,596.7053633,459.108236,645.639375,617.8152271,458.7253322,645.639375,638.7608579,461.3811774,645.639375,659.1071086,467.0205961,645.639375,668.2600934,471.0494231,645.639375,674.8952273,473.9699792,645.639375,505.8040675,537.398581,645.639375,499.4039416,500.1263946,645.639375,499.0909375,536.8112582,645.639375,519.2556215,489.9338866,645.639375,507.978812,537.981302,645.639375,509.0965035,538.1284375,645.639375,510.1380911,538.5598791,645.639375,512.3132225,539.1427038,645.639375,518.420625,541.9906324,645.639375,523.9407047,545.8558338,645.639375,536.7384763,478.096541,645.639375,525.5330113,547.4481404,645.639375,526.415358,548.1251866,645.639375,526.4183763,548.1275026,645.639375,526.4201885,548.1288931,645.639375,526.4274449,548.1344612,645.639375,527.1137283,549.0288573,645.639375,528.7057369,550.620866,645.639375,532.5709383,556.1409457,645.639375,535.4188669,562.2483482,645.639375,536.0017198,564.4235848,645.639375,536.4330262,565.4648507,645.639375,536.5801368,566.5822666,645.639375,537.1629897,568.7575032,645.639375,537.7503125,575.4706332,645.639375,537.1629897,568.7575032,645.639375,555.741474,468.8955061,645.639375,536.7384763,478.096541,645.639375,536.5801368,566.5822666,645.639375,536.4330262,565.4648507,645.639375,536.0017198,564.4235848,645.639375,535.4188669,562.2483482,645.639375,532.5709383,556.1409457,645.639375,528.7057369,550.620866,645.639375,527.1137283,549.0288573,645.639375,526.4274449,548.1344612,645.639375,526.4201885,548.1288931,645.639375,526.4183763,548.1275026,645.639375,526.415358,548.1251866,645.639375,525.5330113,547.4481404,645.639375,523.9407047,545.8558338,645.639375,519.2556215,489.9338866,645.639375,518.420625,541.9906324,645.639375,512.3132225,539.1427038,645.639375,510.1380911,538.5598791,645.639375,509.0965035,538.1284375,645.639375,507.978812,537.981302,645.639375,505.8040675,537.398581,645.639375,499.4039416,500.1263946,645.639375,499.0909375,536.8112582,645.639375,674.8952273,473.9699792,645.639375,674.7339155,481.4988379,645.639375,668.2600934,471.0494231,645.639375,674.5765459,676.7872965,645.639375,659.1071086,467.0205961,645.639375,638.7608579,461.3811774,645.639375,617.8152271,458.7253322,645.639375,596.7053633,459.108236,645.639375,575.8698256,462.5219339,645.639375,537.1629897,582.1837632,645.639375,536.5801368,584.3589998,645.639375,536.4330262,585.4764157,645.639375,536.0017198,586.5176816,645.639375,535.4188669,588.6929182,645.639375,532.5709383,594.8003207,645.639375,674.7339155,669.4424285,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,2,3,4,3,2,5,5,2,6,6,2,7,7,2,8,8,2,9,9,2,10,10,2,11,11,2,12,12,2,13,13,2,14,14,2,15,15,2,16,16,2,1,16,1,17,18,19,20,19,18,21,21,18,22,21,22,23,21,23,24,21,24,25,21,25,26,21,26,27,21,27,28,28,27,29,28,29,30,28,30,31,28,31,32,28,32,33,28,33,34,28,34,35,28,35,36,28,36,37,28,37,38,28,38,39,28,39,40,28,40,41,28,41,10,10,41,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 120, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glEnable(GL2.GL_TEXTURE_2D);
gl.glEnable(GL2.GL_BLEND);
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
ID156.bind();
texcoordArray = new float[] {
-4.4812527f,11.988972f,-4.4763584f,11.849114f,-4.631179f,9.768657f,-4.4728208f,9.960344f,-4.471501f,11.803797f,-4.4702754f,11.780518f,-4.466681f,11.758824f,-4.461824f,11.713508f,-4.4380913f,11.586269f,-4.405881f,11.471268f,-4.3926144f,11.438101f,-4.386895f,11.419468f,-4.386835f,11.419352f,-4.38682f,11.419323f,-4.3867946f,11.419274f,-4.3794417f,11.4051695f,-4.3661723f,11.371997f,-4.3271303f,10.206956f,-4.320172f,11.2914715f,-4.269277f,11.23214f,-4.2511506f,11.219997f,-4.2424707f,11.211009f,-4.2331567f,11.207944f,-4.215034f,11.195804f,-4.1616993f,10.4193f,-4.159091f,11.183568f,-5.624127f,9.874374f,-5.6227827f,10.031226f,-5.5688343f,9.81353f,-5.6214714f,14.099735f,-5.4925594f,9.729596f,-5.323007f,9.612108f,-5.1484604f,9.556778f,-4.9725447f,9.5647545f,-4.7989154f,9.635874f,-4.4763584f,12.128828f,-4.471501f,12.174146f,-4.4702754f,12.197425f,-4.466681f,12.219118f,-4.461824f,12.264436f,-4.4380913f,12.391673f,-5.6227827f,13.946717f,};
fbt = GLBuffers.newDirectFloatBuffer(texcoordArray);
gl.glTexCoordPointer(2, GL2.GL_FLOAT, 0, fbt);
gl.glEnableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
int[] indices = {
42,0,43,1,44,2,44,2,43,1,45,3,43,1,46,4,45,3,46,4,47,5,45,3,47,5,48,6,45,3,48,6,49,7,45,3,49,7,50,8,45,3,50,8,51,9,45,3,51,9,52,10,45,3,52,10,53,11,45,3,53,11,54,12,45,3,54,12,55,13,45,3,55,13,56,14,45,3,56,14,57,15,45,3,57,15,58,16,45,3,45,3,58,16,59,17,58,16,60,18,59,17,60,18,61,19,59,17,61,19,62,20,59,17,62,20,63,21,59,17,63,21,64,22,59,17,64,22,65,23,59,17,59,17,65,23,66,24,67,25,66,24,65,23,68,26,69,27,70,28,69,27,71,29,70,28,70,28,71,29,72,30,72,30,71,29,73,31,73,31,71,29,74,32,74,32,71,29,75,33,75,33,71,29,76,34,76,34,71,29,44,2,44,2,71,29,42,0,42,0,71,29,77,35,77,35,71,29,78,36,78,36,71,29,79,37,79,37,71,29,80,38,80,38,71,29,81,39,82,40,81,39,71,29,71,29,69,27,83,41,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
gl.glBegin(GL2.GL_TRIANGLES);
	for (int i=0; i<indices.length-1; i+=2) {
		int vertexIndex = indices[i];
		int textureIndex = indices[i+1];
		try {
		gl.glTexCoord2f(texcoordArray[textureIndex*2], -(texcoordArray[textureIndex*2+1]));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		gl.glArrayElement(vertexIndex);
	}
gl.glEnd();
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1173(GL2 gl){
double[] positionsArray = {
634.2375252,736.5320646,599.915625,526.4272437,602.8069394,599.915625,523.751583,604.8600461,599.915625,532.5709383,594.8003207,599.915625,536.4330262,585.4764157,599.915625,537.7503125,575.4706332,599.915625,706.1475225,538.9609707,599.915625,536.8732384,568.8085942,599.915625,634.2375252,736.5320646,599.915625,537.7503125,575.4706332,599.915625,706.1475225,538.9609707,599.915625,536.8732384,568.8085942,599.915625,536.4330262,585.4764157,599.915625,532.5709383,594.8003207,599.915625,526.4272437,602.8069394,599.915625,523.751583,604.8600461,599.915625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,6,7,6,5,0,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,11,10,9,9,8,12,12,8,13,13,8,14,15,14,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1179(GL2 gl){
double[] positionsArray = {
499.0909375,536.8112582,508.468125,681.1734425,470.3452499,508.468125,499.0909375,365.2198666,508.468125,509.09672,538.1285445,508.468125,518.420625,541.9906324,508.468125,526.4272437,548.134327,508.468125,532.5709383,556.1409457,508.468125,532.5709383,556.1409457,508.468125,526.4272437,548.134327,508.468125,681.1734425,470.3452499,508.468125,518.420625,541.9906324,508.468125,509.09672,538.1285445,508.468125,499.0909375,536.8112582,508.468125,499.0909375,365.2198666,508.468125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1185(GL2 gl){
double[] positionsArray = {
660.1523689,710.6172209,622.7775,532.5709383,594.8003207,622.7775,528.4803504,600.1312787,622.7775,536.4330262,585.4764157,622.7775,537.7503125,575.4706332,622.7775,536.4330262,565.4648507,622.7775,696.6620314,503.5606359,622.7775,535.1423894,562.3489778,622.7775,660.1523689,710.6172209,622.7775,537.7503125,575.4706332,622.7775,696.6620314,503.5606359,622.7775,536.4330262,565.4648507,622.7775,535.1423894,562.3489778,622.7775,536.4330262,585.4764157,622.7775,532.5709383,594.8003207,622.7775,528.4803504,600.1312787,622.7775,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,5,6,7,6,5,4,6,4,0,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,12,10,11,9,8,13,13,8,14,15,14,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1191(GL2 gl){
double[] positionsArray = {
469.7015246,550.8099877,622.7775,535.6006,368.4140482,622.7775,338.0295061,440.3240455,622.7775,471.7546313,548.134327,622.7775,479.76125,541.9906324,622.7775,489.085155,538.1285445,622.7775,499.0909375,536.8112582,622.7775,505.7529765,537.6883323,622.7775,505.7529765,537.6883323,622.7775,499.0909375,536.8112582,622.7775,535.6006,368.4140482,622.7775,489.085155,538.1285445,622.7775,479.76125,541.9906324,622.7775,471.7546313,548.134327,622.7775,469.7015246,550.8099877,622.7775,338.0295061,440.3240455,622.7775,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1197(GL2 gl){
double[] positionsArray = {
474.430292,546.0812203,599.915625,571.0009348,377.8995393,599.915625,363.9443498,414.4092018,599.915625,479.76125,541.9906324,599.915625,489.085155,538.1285445,599.915625,499.0909375,536.8112582,599.915625,509.09672,538.1285445,599.915625,512.2125929,539.4191813,599.915625,512.2125929,539.4191813,599.915625,509.09672,538.1285445,599.915625,571.0009348,377.8995393,599.915625,499.0909375,536.8112582,599.915625,489.085155,538.1285445,599.915625,479.76125,541.9906324,599.915625,474.430292,546.0812203,599.915625,363.9443498,414.4092018,599.915625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1203(GL2 gl){
double[] positionsArray = {
499.0909375,785.7213998,508.468125,509.09672,612.812722,508.468125,499.0909375,614.1300082,508.468125,681.1734425,680.5960165,508.468125,518.420625,608.9506341,508.468125,526.4272437,602.8069394,508.468125,532.5709383,594.8003207,508.468125,532.5709383,594.8003207,508.468125,681.1734425,680.5960165,508.468125,526.4272437,602.8069394,508.468125,518.420625,608.9506341,508.468125,509.09672,612.812722,508.468125,499.0909375,785.7213998,508.468125,499.0909375,614.1300082,508.468125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,4,3,5,5,3,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.6, 0.4, 0.2, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,8,12,11,13,11,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1209(GL2 gl){
double[] positionsArray = {
463.7402675,591.1709678,497.0371875,327.5546996,453.1649533,497.0371875,307.4882767,662.4559553,497.0371875,462.4727291,588.7364602,497.0371875,461.7492821,585.4763196,497.0371875,460.2877128,578.8837128,497.0371875,460.2338499,578.2373589,497.0371875,460.3019502,578.5571051,497.0371875,463.8726556,558.5594061,497.0371875,467.5300765,552.9224481,497.0371875,460.7579269,568.1588536,497.0371875,460.2338499,578.2373589,497.0371875,327.5546996,453.1649533,497.0371875,460.7579269,568.1588536,497.0371875,463.8726556,558.5594061,497.0371875,467.5300765,552.9224481,497.0371875,460.2877128,578.8837128,497.0371875,460.3019502,578.5571051,497.0371875,461.7492821,585.4763196,497.0371875,462.4727291,588.7364602,497.0371875,463.7402675,591.1709678,497.0371875,307.4882767,662.4559553,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,7,6,5,1,8,9,8,1,10,10,1,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 27, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
11,12,13,13,12,14,15,14,12,16,11,17,11,16,12,16,18,12,18,19,12,19,20,12,21,12,20,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 27, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1215(GL2 gl){
double[] positionsArray = {
460.5827903,571.5268997,428.4515625,411.5053437,383.9039503,428.4515625,289.4818107,555.1220634,428.4515625,460.7579269,568.1588536,428.4515625,463.8726556,558.5594061,428.4515625,469.3657723,550.0932029,428.4515625,476.8629302,543.3372018,428.4515625,482.8488286,540.2841634,428.4515625,482.8488286,540.2841634,428.4515625,476.8629302,543.3372018,428.4515625,411.5053437,383.9039503,428.4515625,469.3657723,550.0932029,428.4515625,463.8726556,558.5594061,428.4515625,460.7579269,568.1588536,428.4515625,460.5827903,571.5268997,428.4515625,289.4818107,555.1220634,428.4515625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1221(GL2 gl){
double[] positionsArray = {
463.8726556,558.5594061,382.7278125,482.1913805,365.5925871,382.7278125,308.9667233,484.7504783,382.7278125,469.3657723,550.0932029,382.7278125,476.8629302,543.3372018,382.7278125,485.8532103,538.7518132,382.7278125,495.7239401,536.6495236,382.7278125,495.7239401,536.6495236,382.7278125,485.8532103,538.7518132,382.7278125,482.1913805,365.5925871,382.7278125,476.8629302,543.3372018,382.7278125,469.3657723,550.0932029,382.7278125,463.8726556,558.5594061,382.7278125,308.9667233,484.7504783,382.7278125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1227(GL2 gl){
double[] positionsArray = {
482.463254,369.0291773,245.5565625,671.9974698,456.0305952,245.5565625,482.1913805,365.5925871,245.5565625,495.7239401,536.6495236,245.5565625,505.8024454,537.1736006,245.5565625,515.4018929,540.2883292,245.5565625,523.8680961,545.7814459,245.5565625,530.6240972,553.2786038,245.5565625,530.6240972,553.2786038,245.5565625,523.8680961,545.7814459,245.5565625,671.9974698,456.0305952,245.5565625,515.4018929,540.2883292,245.5565625,505.8024454,537.1736006,245.5565625,495.7239401,536.6495236,245.5565625,482.463254,369.0291773,245.5565625,482.1913805,365.5925871,245.5565625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1233(GL2 gl){
double[] positionsArray = {
353.9665539,427.9525398,337.0040625,554.8773827,372.5615827,337.0040625,351.3450516,425.2870516,337.0040625,471.8711808,547.835475,337.0040625,476.8629302,543.3372018,337.0040625,485.8532103,538.7518132,337.0040625,495.7239401,536.6495236,337.0040625,505.8024454,537.1736006,337.0040625,509.0103994,538.214484,337.0040625,509.0103994,538.214484,337.0040625,505.8024454,537.1736006,337.0040625,554.8773827,372.5615827,337.0040625,495.7239401,536.6495236,337.0040625,485.8532103,538.7518132,337.0040625,476.8629302,543.3372018,337.0040625,471.8711808,547.835475,337.0040625,353.9665539,427.9525398,337.0040625,351.3450516,425.2870516,337.0040625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1239(GL2 gl){
double[] positionsArray = {
408.3348046,764.9945757,588.4846875,460.2338499,578.2373589,588.4846875,289.1769135,591.7699186,588.4846875,462.3361395,588.1080887,588.4846875,466.9215282,597.0983689,588.4846875,473.6775293,604.5955267,588.4846875,482.1437325,610.0886434,588.4846875,482.1437325,610.0886434,588.4846875,408.3348046,764.9945757,588.4846875,473.6775293,604.5955267,588.4846875,466.9215282,597.0983689,588.4846875,462.3361395,588.1080887,588.4846875,460.2338499,578.2373589,588.4846875,289.1769135,591.7699186,588.4846875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
7,8,9,9,8,10,10,8,11,11,8,12,13,12,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1245(GL2 gl){
double[] positionsArray = {
381.7568015,405.0775669,314.1421875,589.2108207,385.382397,314.1421875,379.6149215,401.9638292,314.1421875,476.8629302,543.3372018,314.1421875,485.8532103,538.7518132,314.1421875,495.7239401,536.6495236,314.1421875,505.8024454,537.1736006,314.1421875,515.4018929,540.2883292,314.1421875,515.4018929,540.2883292,314.1421875,505.8024454,537.1736006,314.1421875,589.2108207,385.382397,314.1421875,495.7239401,536.6495236,314.1421875,485.8532103,538.7518132,314.1421875,476.8629302,543.3372018,314.1421875,381.7568015,405.0775669,314.1421875,379.6149215,401.9638292,314.1421875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1251(GL2 gl){
double[] positionsArray = {
442.6682427,777.81539,611.3465625,461.6335941,584.8094773,611.3465625,295.2404817,627.9139553,611.3465625,462.3361395,588.1080887,611.3465625,466.9215282,597.0983689,611.3465625,473.6775293,604.5955267,611.3465625,482.1437325,610.0886434,611.3465625,488.535226,612.1624886,611.3465625,488.535226,612.1624886,611.3465625,442.6682427,777.81539,611.3465625,482.1437325,610.0886434,611.3465625,473.6775293,604.5955267,611.3465625,466.9215282,597.0983689,611.3465625,462.3361395,588.1080887,611.3465625,461.6335941,584.8094773,611.3465625,295.2404817,627.9139553,611.3465625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1257(GL2 gl){
double[] positionsArray = {
478.7063898,784.4794883,634.2084375,463.8684898,591.1124705,634.2084375,307.4882767,662.4559553,634.2084375,466.9215282,597.0983689,634.2084375,473.6775293,604.5955267,634.2084375,482.1437325,610.0886434,634.2084375,491.74318,613.2033721,634.2084375,495.111226,613.3785087,634.2084375,495.111226,613.3785087,634.2084375,478.7063898,784.4794883,634.2084375,491.74318,613.2033721,634.2084375,482.1437325,610.0886434,634.2084375,473.6775293,604.5955267,634.2084375,466.9215282,597.0983689,634.2084375,463.8684898,591.1124705,634.2084375,307.4882767,662.4559553,634.2084375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,5,0,6,6,0,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,12,9,13,13,9,14,15,14,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1263(GL2 gl){
double[] positionsArray = {
515.4018929,540.2883292,199.8328125,554.1070812,375.3435983,199.8328125,509.0103994,538.214484,199.8328125,523.8680961,545.7814459,199.8328125,530.6240972,553.2786038,199.8328125,535.2094858,562.268884,199.8328125,535.9120313,565.5674954,199.8328125,702.3051437,522.4630174,199.8328125,554.8773827,372.5615827,199.8328125,554.8773827,372.5615827,199.8328125,702.3051437,522.4630174,199.8328125,554.1070812,375.3435983,199.8328125,535.9120313,565.5674954,199.8328125,535.2094858,562.268884,199.8328125,530.6240972,553.2786038,199.8328125,523.8680961,545.7814459,199.8328125,515.4018929,540.2883292,199.8328125,509.0103994,538.214484,199.8328125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,0.0,-0.0,-1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,-0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1269(GL2 gl){
double[] positionsArray = {
523.8680961,545.7814459,176.9709375,588.1237773,387.6638213,176.9709375,515.4018929,540.2883292,176.9709375,530.6240972,553.2786038,176.9709375,535.2094858,562.268884,176.9709375,537.3117755,572.1396137,176.9709375,708.3687119,558.6070541,176.9709375,708.3687119,558.6070541,176.9709375,537.3117755,572.1396137,176.9709375,588.1237773,387.6638213,176.9709375,535.2094858,562.268884,176.9709375,530.6240972,553.2786038,176.9709375,523.8680961,545.7814459,176.9709375,515.4018929,540.2883292,176.9709375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1275(GL2 gl){
double[] positionsArray = {
461.6335941,584.8094773,474.1753125,351.3450516,425.2870516,474.1753125,295.2404817,627.9139553,474.1753125,460.2338499,578.2373589,474.1753125,469.3657723,550.0932029,474.1753125,471.8711808,547.835475,474.1753125,463.8726556,558.5594061,474.1753125,460.7579269,568.1588536,474.1753125,460.2338499,578.2373589,474.1753125,351.3450516,425.2870516,474.1753125,460.7579269,568.1588536,474.1753125,463.8726556,558.5594061,474.1753125,469.3657723,550.0932029,474.1753125,471.8711808,547.835475,474.1753125,461.6335941,584.8094773,474.1753125,295.2404817,627.9139553,474.1753125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,4,5,4,1,6,6,1,7,7,1,3,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
8,9,10,10,9,11,11,9,12,13,12,9,8,14,9,15,9,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1281(GL2 gl){
double[] positionsArray = {
325.5481556,694.3463775,519.8990625,462.3361395,588.1080887,519.8990625,460.2338499,578.2373589,519.8990625,466.9215282,597.0983689,519.8990625,463.8726556,558.5594061,519.8990625,308.9667233,484.7504783,519.8990625,460.7579269,568.1588536,519.8990625,460.2338499,578.2373589,519.8990625,325.5481556,694.3463775,519.8990625,460.7579269,568.1588536,519.8990625,463.8726556,558.5594061,519.8990625,308.9667233,484.7504783,519.8990625,466.9215282,597.0983689,519.8990625,462.3361395,588.1080887,519.8990625,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,0,4,5,4,0,6,6,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
7,8,9,9,8,10,11,10,8,12,8,13,7,13,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1287(GL2 gl){
double[] positionsArray = {
505.8024454,537.1736006,222.6946875,518.5341556,369.0794412,222.6946875,502.4343994,536.9984639,222.6946875,515.4018929,540.2883292,222.6946875,523.8680961,545.7814459,222.6946875,518.8392356,365.8974843,222.6946875,690.0573487,487.9210173,222.6946875,530.6240972,553.2786038,222.6946875,533.6771356,559.2645022,222.6946875,533.6771356,559.2645022,222.6946875,530.6240972,553.2786038,222.6946875,690.0573487,487.9210173,222.6946875,523.8680961,545.7814459,222.6946875,518.8392356,365.8974843,222.6946875,518.5341556,369.0794412,222.6946875,515.4018929,540.2883292,222.6946875,505.8024454,537.1736006,222.6946875,502.4343994,536.9984639,222.6946875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,5,4,6,6,4,7,6,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
9,10,11,10,12,11,11,12,13,13,12,14,12,15,14,15,16,14,17,14,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1293(GL2 gl){
double[] positionsArray = {
413.0590068,387.3094775,291.2803125,620.7963457,403.9703732,291.2803125,411.5053437,383.9039503,291.2803125,482.8488286,540.2841634,291.2803125,485.8532103,538.7518132,291.2803125,495.7239401,536.6495236,291.2803125,505.8024454,537.1736006,291.2803125,515.4018929,540.2883292,291.2803125,521.038851,543.9457501,291.2803125,521.038851,543.9457501,291.2803125,515.4018929,540.2883292,291.2803125,620.7963457,403.9703732,291.2803125,505.8024454,537.1736006,291.2803125,495.7239401,536.6495236,291.2803125,485.8532103,538.7518132,291.2803125,482.8488286,540.2841634,291.2803125,413.0590068,387.3094775,291.2803125,411.5053437,383.9039503,291.2803125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1299(GL2 gl){
double[] positionsArray = {
461.7988104,564.9508996,405.5896875,446.0473437,371.6561553,405.5896875,296.145909,519.0839164,405.5896875,463.8726556,558.5594061,405.5896875,469.3657723,550.0932029,405.5896875,476.8629302,543.3372018,405.5896875,485.8532103,538.7518132,405.5896875,489.1518217,538.0492677,405.5896875,489.1518217,538.0492677,405.5896875,485.8532103,538.7518132,405.5896875,446.0473437,371.6561553,405.5896875,476.8629302,543.3372018,405.5896875,469.3657723,550.0932029,405.5896875,463.8726556,558.5594061,405.5896875,461.7988104,564.9508996,405.5896875,296.145909,519.0839164,405.5896875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
8,9,10,9,11,10,11,12,10,12,13,10,13,14,10,15,10,14,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1305(GL2 gl){
double[] positionsArray = {
446.9580068,375.1715222,268.4184375,648.6742474,427.7607253,268.4184375,446.0473437,371.6561553,268.4184375,489.1518217,538.0492677,268.4184375,495.7239401,536.6495236,268.4184375,505.8024454,537.1736006,268.4184375,515.4018929,540.2883292,268.4184375,523.8680961,545.7814459,268.4184375,526.125824,548.2868544,268.4184375,526.125824,548.2868544,268.4184375,523.8680961,545.7814459,268.4184375,648.6742474,427.7607253,268.4184375,515.4018929,540.2883292,268.4184375,505.8024454,537.1736006,268.4184375,495.7239401,536.6495236,268.4184375,489.1518217,538.0492677,268.4184375,446.9580068,375.1715222,268.4184375,446.0473437,371.6561553,268.4184375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,1,6,7,1,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,15,16,11,17,11,16,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1311(GL2 gl){
double[] positionsArray = {
460.2338499,578.2373589,451.3134375,379.6149215,401.9638292,451.3134375,289.1769135,591.7699186,451.3134375,460.7579269,568.1588536,451.3134375,463.8726556,558.5594061,451.3134375,469.3657723,550.0932029,451.3134375,476.8629302,543.3372018,451.3134375,476.8629302,543.3372018,451.3134375,469.3657723,550.0932029,451.3134375,379.6149215,401.9638292,451.3134375,463.8726556,558.5594061,451.3134375,460.7579269,568.1588536,451.3134375,460.2338499,578.2373589,451.3134375,289.1769135,591.7699186,451.3134375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,-0.0,-0.0,-1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,0.0,0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,1,3,4,1,4,5,1,5,6,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
7,8,9,8,10,9,10,11,9,11,12,9,13,9,12,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 15, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1317(GL2 gl){
double[] positionsArray = {
376.7492797,746.4065994,565.6228125,462.3361395,588.1080887,565.6228125,460.2338499,578.2373589,565.6228125,466.9215282,597.0983689,565.6228125,473.6775293,604.5955267,565.6228125,476.5067744,606.4312226,565.6228125,290.4371827,557.2160074,565.6228677,460.5827903,571.5268997,565.6228125,289.4818107,555.1220634,565.6228125,460.2338499,578.2373589,565.6228125,376.7492797,746.4065994,565.6228125,460.5827903,571.5268997,565.6228125,290.4371827,557.2160074,565.6228677,289.4818107,555.1220634,565.6228125,476.5067744,606.4312226,565.6228125,473.6775293,604.5955267,565.6228125,466.9215282,597.0983689,565.6228125,462.3361395,588.1080887,565.6228125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-1.0E-7,-1.0E-7,-1.0,-1.0E-7,-1.0E-7,-1.0,-1.0E-7,-1.0E-7,-1.0,-1.0E-7,-1.0E-7,-1.0,-1.0E-7,-1.0E-7,-1.0,-1.0E-7,-1.0E-7,-1.0,-1.0E-7,-1.0E-7,-1.0,-1.0E-7,-1.0E-7,-1.0,-1.0E-7,-1.0E-7,-1.0,1.0E-7,1.0E-7,1.0,1.0E-7,1.0E-7,1.0,1.0E-7,1.0E-7,1.0,1.0E-7,1.0E-7,1.0,1.0E-7,1.0E-7,1.0,1.0E-7,1.0E-7,1.0,1.0E-7,1.0E-7,1.0,1.0E-7,1.0E-7,1.0,1.0E-7,1.0E-7,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,4,0,5,6,7,8,7,6,0,7,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
9,10,11,10,12,11,13,11,12,14,10,15,15,10,16,16,10,17,9,17,10,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1323(GL2 gl){
double[] positionsArray = {
348.871378,722.6162474,542.7609375,462.3361395,588.1080887,542.7609375,460.2338499,578.2373589,542.7609375,466.9215282,597.0983689,542.7609375,471.4198014,602.0901182,542.7609375,461.7988104,564.9508996,542.7609375,296.145909,519.0839164,542.7609375,460.7579269,568.1588536,542.7609375,460.2338499,578.2373589,542.7609375,348.871378,722.6162474,542.7609375,460.7579269,568.1588536,542.7609375,461.7988104,564.9508996,542.7609375,296.145909,519.0839164,542.7609375,471.4198014,602.0901182,542.7609375,466.9215282,597.0983689,542.7609375,462.3361395,588.1080887,542.7609375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,-0.0,0.0,-1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,0,5,6,5,0,7,7,0,2,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
8,9,10,10,9,11,12,11,9,13,9,14,14,9,15,8,15,9,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 18, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1329(GL2 gl){
double[] positionsArray = {
467.5300765,552.9224481,359.8659375,455.5025631,394.7928211,359.8659375,328.6587113,453.9517591,359.8659375,518.8392356,365.8974843,359.8659375,469.3657723,550.0932029,359.8659375,476.8629302,543.3372018,359.8659375,485.8532103,538.7518132,359.8659375,495.7239401,536.6495236,359.8659375,502.4343994,536.9984639,359.8659375,502.4343994,536.9984639,359.8659375,495.7239401,536.6495236,359.8659375,518.8392356,365.8974843,359.8659375,485.8532103,538.7518132,359.8659375,476.8629302,543.3372018,359.8659375,469.3657723,550.0932029,359.8659375,467.5300765,552.9224481,359.8659375,455.5025631,394.7928211,359.8659375,328.6587113,453.9517591,359.8659375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
double[] normalsArray = {
0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,0.0,0.0,-1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,-0.0,-0.0,1.0,};
fbn = GLBuffers.newDirectDoubleBuffer(normalsArray, 0);
gl.glNormalPointer(GL2.GL_DOUBLE, 0, fbn);
gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glColor4d(0.3803922, 0.254902, 0.1294118, 1.0);
int[] indices = {
0,1,2,1,0,3,3,0,4,3,4,5,3,5,6,3,6,7,3,7,8,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
{
gl.glColor4d(0.5294118, 0.3568627, 0.1803922, 1.0);
int[] indices = {
9,10,11,10,12,11,12,13,11,13,14,11,14,15,11,11,15,16,17,16,15,};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices, 0);
gl.glDrawElements(GL2.GL_TRIANGLES, 21, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_TEXTURE_2D);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1335(GL2 gl){
double[] positionsArray = {
530.7589751,597.6446435,645.6811867,532.5709383,594.8003207,645.639375,528.7059322,600.320264,645.7158393,526.4274451,602.8068051,645.7430689,523.9408666,605.0853297,645.7626681,521.2651339,607.1384848,645.7744876,518.420625,608.9506341,645.7784375,515.4290033,610.5079764,645.7744876,512.3130524,611.7986513,645.7626681,509.096503,612.8128292,645.7430689,505.8038517,613.5427864,645.7158393,502.4601749,613.9829635,645.6811867,499.0909375,614.1300082,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
0,
2,
2,
3,
3,
4,
4,
5,
5,
6,
6,
7,
7,
8,
8,
9,
9,
10,
10,
11,
11,
12,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1341(GL2 gl){
double[] positionsArray = {
292.0343525,538.9609707,279.849375,288.8401709,575.4706332,302.71125,301.5198436,503.5606359,256.9875,292.0343525,611.9802957,325.573125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
0,
2,
3,
1,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1345(GL2 gl){
double[] positionsArray = {
393.9655542,757.5531383,302.71125,427.1809402,773.0417271,325.573125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1349(GL2 gl){
double[] positionsArray = {
499.0909375,575.4706332,165.54,499.0909375,575.4706332,146.96125,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1353(GL2 gl){
double[] positionsArray = {
485.5749472,539.1846482,359.8659375,476.6234479,543.8452905,359.8659375,495.4276946,536.9996319,359.8659375,502.1408448,537.2922693,359.8659375,469.1832265,550.6639438,359.8659375,467.3713284,553.5084882,359.8659375,326.5640605,454.9286871,359.8659375,328.6587113,453.9517591,359.8659375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
0,
2,
2,
3,
4,
1,
5,
4,
5,
6,
6,
7,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1357(GL2 gl){
double[] positionsArray = {
510.1380913,612.3813873,645.639375,507.9787918,612.9599698,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1361(GL2 gl){
double[] positionsArray = {
527.1137135,601.9124239,645.639375,525.5330114,603.4931259,645.639375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1365(GL2 gl){
double[] positionsArray = {
463.7613219,559.1759282,497.0371875,460.7272278,568.8011658,497.0371875,467.3713284,553.5084882,497.0371875,460.3019502,578.5571051,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
0,
2,
3,
1,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1369(GL2 gl){
double[] positionsArray = {
308.2539817,664.3806527,497.0371875,464.0302277,591.7278821,497.0371875,463.7402675,591.1709678,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
1,
2,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1373(GL2 gl){
double[] positionsArray = {
569.3140464,743.9475854,497.0371875,480.9619885,785.1542646,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1377(GL2 gl){
double[] positionsArray = {
530.3631611,598.2350442,497.0371875,530.7004829,597.7054741,497.0371875,671.5077509,696.2852752,497.0371875,669.3530564,697.2902071,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
1,
2,
3,
2,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1381(GL2 gl){
double[] positionsArray = {
495.9309665,613.921693,497.0371875,502.6441168,614.2143304,497.0371875,512.4968642,612.0293141,497.0371875,521.1583943,607.5196457,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
2,
1,
3,
2,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1385(GL2 gl){
double[] positionsArray = {
517.1098229,366.0596977,359.8659375,455.5025631,394.7928211,359.8659375,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1389(GL2 gl){
double[] positionsArray = {
503.1693839,537.0058877,497.0371875,503.1559329,537.1461801,497.0371875,506.523979,537.3213167,497.0371875,515.8124681,540.3351488,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
1,
2,
2,
3,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1393(GL2 gl){
double[] positionsArray = {
688.895062,486.7261746,497.0371875,690.7788823,488.0687335,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1397(GL2 gl){
double[] positionsArray = {
519.5607692,366.0452005,497.0371875,609.8847036,430.4171609,497.0371875,519.4587237,367.109526,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
2,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1401(GL2 gl){
double[] positionsArray = {
534.3986692,559.4122184,497.0371875,534.1390157,558.9031323,497.0371875,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1405(GL2 gl){
double[] positionsArray = {
393.9655542,757.5531383,0.0,580.2163208,757.5531383,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
private void ID1409(GL2 gl){
double[] positionsArray = {
393.9655542,393.3881282,0.0,300.8401709,554.6860235,0.0,};
DoubleBuffer fbv = GLBuffers.newDirectDoubleBuffer(positionsArray, 0);
gl.glVertexPointer(3, GL2.GL_DOUBLE, 0, fbv);
gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
DoubleBuffer fbn = null;
FloatBuffer fbt = null;
float[] texcoordArray = null;
{
gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);
gl.glEnable(GL2.GL_BLEND);
gl.glColor4d(0.0, 0.0, 0.0, 1.0);
int[] indices = {
1,
0,
};
IntBuffer fbi = GLBuffers.newDirectIntBuffer(indices);
gl.glDrawElements(GL2.GL_LINES, indices.length, GL2.GL_UNSIGNED_INT, fbi);
gl.glDisable(GL2.GL_BLEND);
}
gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
gl.glDisableClientState(GL2.GL_TEXTURE_COORD_ARRAY);
}
}
