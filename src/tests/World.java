package tests;

import java.util.ArrayList;
import java.util.List;

public class World {
	private static World world = null;
	
	public static World getWorld(){
		if(world == null){
			world = new World();
		}
		return world;
	}

	public List getNeighbours(Cell cell) {
		return new ArrayList<Cell>();
	}

}
