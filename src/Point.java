
public class Point extends GameObject {
	protected Point(int xposition, int yposition) {
		super(xposition, yposition);
		super.objectType = ObjectType.POINT;
	}
}
