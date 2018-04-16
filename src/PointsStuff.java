
public class PointsStuff extends GameObject {
	
	int totalWorth;
	
	private final int littleDotPoints = 10;
	private enum fruitPoints {
		
		CHERRY(100),
		STRAWBERRY(300), 
		ORANGE(500), 
		APPLE(700), 
		MELON(1000);
		
		private final int pointVal;
		
		private fruitPoints(int pointVal) {
			this.pointVal = pointVal;
		}
	}

	public PointsStuff (int xval, int yval, int pointVal) {
		super(xval, yval);
		pointVal = totalWorth;
	}

}
