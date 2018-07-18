package tennis;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

public class Main {
	
	public static World theWorld;
	public static Player thePlayer;
	public static Window window;
	
	public static void main(String[] args) {
		init();
		initGL();
		gameLoop();
	}
	
	private static void init() {
		Window.createDisplay();
		thePlayer = new Player(window);
		theWorld = new World(window);
	}
	
	private static void initGL() {
		
	}
	
	private static void gameLoop() {
		while(!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
			init2D();
			theWorld.run(window);
			
			Window.updateDisplay();
		}
		Window.closeDisplay();
	}
	
	private static void init2D() {
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		GL11.glDisable(GL11.GL_LIGHTING);
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0.0f, Display.getWidth(), Display.getHeight(), 0.0f, -1.0f, 1.0f);
		
		GL11.glDisable(GL11.GL_DEPTH_TEST);
		
		GL11.glEnable(GL11.GL_ALPHA_TEST);
		GL11.glAlphaFunc(GL11.GL_GREATER, 0.4f);
	}

}
