package tests;

import java.util.ArrayList;
import java.util.List;

public class World {
	private static World world = null;
	
	private List<Cell> cells;
	
	private World(){
		cells = new ArrayList();
	}
	
	public static World getWorld(){
		if(world == null){
			world = new World();
		}
		return world;
	}

	public List getNeighbours(Cell cell) {
		return new ArrayList<Cell>();
	}

	public List<Cell> getCells() {
		return cells;
	}

	
	

}
