
public abstract class GameObject {
	
	protected int xposition;
	protected int yposition;
	
	enum ObjectType {EMPTY, WALL, POINT, PELLET, GHOST, PACMAN;};
	
	public ObjectType objectType = ObjectType.EMPTY;

	protected GameObject(int xposition, int yposition) {
		this.xposition = xposition;
		this.yposition = yposition;
	}
	
}
