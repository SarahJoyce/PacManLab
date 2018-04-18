
public class World extends GraphicsEngine{

	//need to add positions for blocked off walls
	
	PacMan man = new PacMan();
	Ghost g1 = new Ghost();
	Ghost g2 = new Ghost();
	Ghost g3 = new Ghost();
	Ghost g4 = new Ghost();
	Object[][] walls;
	enum gameThings {EMPTY, WALL, POINT, PELLET, GHOST, PACMAN;}
	
	
	public World(PacMan man, Ghost g1, Ghost g2, Ghost g3, Ghost g4) {
		man = man;
		g1 = g1;
		g2 = g2;
		g3 = g3;
		g4 = g4;
		walls = new Object[][] {
			{gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL},
			{gameThings.WALL, gameThings.PELLET, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.PELLET, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.PACMAN, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.PELLET, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.GHOST, gameThings.GHOST, gameThings.GHOST, gameThings.GHOST, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.POINT, gameThings.WALL},
			{gameThings.WALL, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.POINT, gameThings.PELLET, gameThings.WALL},
			{gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL, gameThings.WALL}
		};
		
	}
	
	//draws the world
	public void draw() {}
	
	//gets rid of objects; for example when pacman eats the pellet, it has to disappear
	public void delete() {}
	
	public void update() {}
	
}
