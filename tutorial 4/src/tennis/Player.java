package tennis;

public class Player extends Entity {

	public Player(Window window) {
		super(window);
		this.posX = 16f;
		this.posY = (Window.HEIGHT/2) - (this.height/2);
		this.height *= 5f;
	}
	
	@Override
	public void onUpdate(Window window) {
		super.onUpdate(window);
	}
}
