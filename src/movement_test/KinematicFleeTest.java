package movement_test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import movement.Character;
import movement.KinematicFlee;
import movement.KinematicOutput;
import movement.KinematicSeek;
import movement.Vector2D;

public class KinematicFleeTest {

	KinematicFlee kinematicFlee;
	Character character;
	Character target;
	
	@Before
	public void setUp() throws Exception {
		character = new Character();
		character.setPosition(new Vector2D(2, 1));
		target =new Character();
		target.setPosition(new Vector2D(9, 1));
		kinematicFlee = new KinematicFlee(character,target,1);
	}

	@After
	public void tearDown() throws Exception {
		character = null;
		target = null;
		kinematicFlee = null;
	}

	@Test
	public void test() {
		KinematicOutput kinematicOutput = kinematicFlee.generateKinematicOutput();
		character.update(kinematicOutput, 1);
		character.applyNewOrientation();
		
		assertEquals(1.5707964, character.getOrientation());
	}

}
