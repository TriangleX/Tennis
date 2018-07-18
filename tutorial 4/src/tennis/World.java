package tennis;

import java.util.ArrayList;

public class World {
	
	public ArrayList<Entity> entities = new ArrayList<Entity>();
	
	public World(Window window) {
		this.entities.add(Main.thePlayer);
	}
	
	public void run(Window window) {
		for(Entity entity : this.entities) {
			entity.onUpdate(window);
		}
	}

}
