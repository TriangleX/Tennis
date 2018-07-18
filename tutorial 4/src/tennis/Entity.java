package tennis;

import java.awt.Rectangle;

public class Entity {
	
	public float posX;
	public float posY;
	public float motionX;
	public float motionY;
	public float width;
	public float height;
	public float speed;
	public Rectangle rect;
	public Gui gui;
	
	public Entity(Window window) {
		this.posX = 0;
		this.posY = 0;
		this.motionX = 0;
		this.motionY = 0;
		this.width = 16f;
		this.height = 16f;
		this.speed = 5.0f;
		this.rect = new Rectangle();
		this.Bounds();
		this.gui = new Gui();
	}
	
	public void Bounds() {
		this.rect.x = (int) this.posX;
		this.rect.y = (int) this.posY;
		this.rect.width = (int) this.width;
		this.rect.height = (int) this.height;
	}
	
	public void onUpdate(Window window) {
		this.Bounds();
		this.move(this.motionX, this.motionY);
		this.Render(window);
	}
	
	public void move(float mX, float mY) {
		this.posX = mX;
		this.posY = mY;
	}
	
	public void Render(Window window) {
		gui.drawRect(this.posX, this.posY, this.width, this.height, 0xFF000000);
	}

}
