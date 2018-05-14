
public class EmptyGameObject extends GameObject {

	protected EmptyGameObject(int xposition, int yposition) {
		super(xposition, yposition);
		super.objectType = ObjectType.EMPTY;
	}

}
