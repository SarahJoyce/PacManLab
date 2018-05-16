public class Pellet extends GameObject {
	
	boolean isEaten;
	
	protected Pellet(int xposition, int yposition, boolean isEaten) {
		super(xposition, yposition);
		this.isEaten = isEaten;
		super.objectType = ObjectType.PELLET;
	}
}
