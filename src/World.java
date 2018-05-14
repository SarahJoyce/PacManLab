import java.util.ArrayList;

public class World {
	GameObject.ObjectType[][] board;
	ArrayList<GameObject> board2;

	public World() {
		// initBoardArray();
		initBoardList();
	}

	private void initBoardArray() {
		board = new GameObject.ObjectType[15][15];
		
		for (int i = 0; i < 14; i++) {
			board[0][i] = GameObject.ObjectType.WALL;
			board[14][i + 1] = GameObject.ObjectType.WALL;
			board[i + 1][0] = GameObject.ObjectType.WALL;
			board[i][14] = GameObject.ObjectType.WALL;
		}
		for (int i = 0; i < 11; i++) {
			board[1][i + 2] = GameObject.ObjectType.POINT;
			board[i + 2][13] = GameObject.ObjectType.POINT;
			board[i + 2][1] = GameObject.ObjectType.POINT;
			board[13][i + 2] = GameObject.ObjectType.POINT;
		}
		for (int i = 0; i < 5; i++) {
			board[i + 2][3] = GameObject.ObjectType.POINT;
			board[i + 2][6] = GameObject.ObjectType.POINT;
			board[8][i + 2] = GameObject.ObjectType.WALL;
			board[i + 2][4] = GameObject.ObjectType.WALL;
			board[i + 2][5] = GameObject.ObjectType.WALL;
			board[i + 7][7] = GameObject.ObjectType.WALL;
			board[12][i + 7] = GameObject.ObjectType.WALL;
			board[5][i + 8] = GameObject.ObjectType.WALL;
		}
		for (int i = 0; i < 4; i++) {
			board[7][i + 3] = GameObject.ObjectType.POINT;
			board[9][i + 2] = GameObject.ObjectType.POINT;
			board[6][i + 8] = GameObject.ObjectType.POINT;
			board[11][i + 8] = GameObject.ObjectType.POINT;
			board[i + 7][8] = GameObject.ObjectType.POINT;
			board[i + 7][11] = GameObject.ObjectType.POINT;
			board[4][i + 9] = GameObject.ObjectType.POINT;
			board[i + 2][7] = GameObject.ObjectType.WALL;
			board[2][i + 9] = GameObject.ObjectType.WALL;
			board[3][i + 9] = GameObject.ObjectType.WALL;
			board[i + 7][9] = GameObject.ObjectType.WALL;
			board[i + 7][10] = GameObject.ObjectType.WALL;
			board[i + 6][12] = GameObject.ObjectType.WALL;
			board[10][i + 2] = GameObject.ObjectType.WALL;
			board[12][i + 2] = GameObject.ObjectType.WALL;
			board[11][i + 2] = GameObject.ObjectType.GHOST;
		}
		for (int i = 0; i < 3; i++) {
			board[i + 2][8] = GameObject.ObjectType.POINT;
			board[i + 10][6] = GameObject.ObjectType.POINT;
			board[i + 10][12] = GameObject.ObjectType.WALL;
			board[i + 2][2] = GameObject.ObjectType.WALL;
			board[i + 5][2] = GameObject.ObjectType.WALL;
		}
		board[13][1] = GameObject.ObjectType.POINT;
		board[1][1] = GameObject.ObjectType.PELLET;
		board[1][13] = GameObject.ObjectType.PELLET;
		board[13][13] = GameObject.ObjectType.PELLET;
		board[9][6] = GameObject.ObjectType.PELLET;
		board[6][7] = GameObject.ObjectType.PACMAN;
	}

	private void initBoardList() {
		board2 = new ArrayList<GameObject>();
		for (int i = 0; i < 14; i++) {
			Add(GameObject.ObjectType.WALL, 0, i);
			Add(GameObject.ObjectType.WALL, 14, i + 1);
			Add(GameObject.ObjectType.WALL, i + 1, 0);
			Add(GameObject.ObjectType.WALL, i, 14);
		}
		for (int i = 0; i < 11; i++) {
			Add(GameObject.ObjectType.POINT, 1, i + 2);
			Add(GameObject.ObjectType.POINT, i + 2, 13);
			Add(GameObject.ObjectType.POINT, i + 2, 1);
			Add(GameObject.ObjectType.POINT, 13, i + 2);
		}
		for (int i = 0; i < 5; i++) {
			Add(GameObject.ObjectType.POINT, i + 2, 3);
			Add(GameObject.ObjectType.POINT, i + 2, 6);
			Add(GameObject.ObjectType.WALL, 8, i + 2);
			Add(GameObject.ObjectType.WALL, i + 2, 4);
			Add(GameObject.ObjectType.WALL, i + 2, 5);
			Add(GameObject.ObjectType.WALL, i + 2, 7);
			Add(GameObject.ObjectType.WALL, 12, i + 7);
			Add(GameObject.ObjectType.WALL, 5, i + 8);
		}
		for (int i = 0; i < 4; i++) {
			Add(GameObject.ObjectType.POINT, 7, i + 3);
			Add(GameObject.ObjectType.POINT, 9, i + 2);
			Add(GameObject.ObjectType.POINT, 6, i + 8);
			Add(GameObject.ObjectType.POINT, 11, i + 8);
			Add(GameObject.ObjectType.POINT, i + 7, 8);
			Add(GameObject.ObjectType.POINT, i + 7, 11);
			Add(GameObject.ObjectType.POINT, 4, i + 9);
			Add(GameObject.ObjectType.WALL, i + 2, 7);
			Add(GameObject.ObjectType.WALL, 2, i + 9);
			Add(GameObject.ObjectType.WALL, 3, i + 9);
			Add(GameObject.ObjectType.WALL, i + 7, 9);
			Add(GameObject.ObjectType.WALL, i + 7, 10);
			Add(GameObject.ObjectType.WALL, i + 6, 12);
			Add(GameObject.ObjectType.WALL, 10, i + 2);
			Add(GameObject.ObjectType.WALL, 12, i + 2);
			Add(GameObject.ObjectType.GHOST, 11, i + 2);
		}
		for (int i = 0; i < 3; i++) {
			Add(GameObject.ObjectType.POINT, i + 2, 8);
			Add(GameObject.ObjectType.POINT, i + 10, 6);
			Add(GameObject.ObjectType.WALL, i + 10, 12);
			Add(GameObject.ObjectType.WALL, i + 2, 2);
			Add(GameObject.ObjectType.WALL, i + 5, 2);
		}
		Add(GameObject.ObjectType.POINT, 13, 1);
		Add(GameObject.ObjectType.PELLET, 1, 1);
		Add(GameObject.ObjectType.PELLET, 1, 13);
		Add(GameObject.ObjectType.PELLET, 13, 13);
		Add(GameObject.ObjectType.PELLET, 9, 6);
		Add(GameObject.ObjectType.PACMAN, 7, 7);
	}

	private void Add(GameObject.ObjectType type, int x, int y) {
		board2.add(CreateGameObject(type, x, y));
	}

	private GameObject CreateGameObject(GameObject.ObjectType type, int x, int y) {
		switch (type) {
		case EMPTY:
			return new EmptyGameObject(x, y);
		case GHOST:
			return new Ghost(x, y, false, false, type);
		case PACMAN:
			return new PacMan(x, y, false, y);
		case PELLET:
			return new Pellet(x, y);
		case POINT:
			return new Point(x, y);
		case WALL:
			return new Wall(x, y);
		default:
			throw new RuntimeException();
		}
	}

	// gets rid of objects; for example when pacman eats the pellet, it has to
	// disappear
	public void delete() {
	}

	public void update() {
	}
}
