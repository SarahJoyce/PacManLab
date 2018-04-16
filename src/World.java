
public class World implements GraphicsEngine{

	//need to add positions for blocked off walls
	
	PacMan man = new PacMan();
	Ghost g1 = new Ghost();
	Ghost g2 = new Ghost();
	Ghost g3 = new Ghost();
	Ghost g4 = new Ghost();
	
	public World(PacMan man, Ghost g1, Ghost g2, Ghost g3, Ghost g4) {
		man = man;
		g1 = g1;
		g2 = g2;
		g3 = g3;
		g4 = g4;
	}
	
	//draws the world
	public void draw() {}
	
	//gets rid of objects; for example when pacman eats the pellet, it has to disappear
	public void delete() {}
	
	public void update() {}
	
}
