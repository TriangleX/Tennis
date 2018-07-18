package tennis;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class Window {
	
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 720;
	private static final int FPS_CAP = 120;
	
	public static void createDisplay() {
		ContextAttribs attribs = new ContextAttribs(3,0);
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.setInitialBackground(0f, 255.0f, 0f);
			Display.create(new PixelFormat(), attribs);
			Display.setTitle("Tennis");
		}catch(LWJGLException e) {
			e.printStackTrace();
		}
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
	}
	
	public static void updateDisplay() {
		Display.sync(FPS_CAP);
		Display.update();
	}
	
	public static void closeDisplay() {
		Display.destroy();
	}

}
