
public class Point extends GameObject {
	
	boolean isEaten;
	
	protected Point(int xposition, int yposition, boolean isEaten) {
		super(xposition, yposition);
		this.isEaten = isEaten;
		super.objectType = ObjectType.POINT;
	}
}
