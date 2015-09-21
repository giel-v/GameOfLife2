package tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Tests {

	@Test
	public void test() {
		World world = World.getWorld();
		Cell cell = new Cell();
		Assert.assertNotNull(world.getNeighbours(cell));
	}
	
	

}
