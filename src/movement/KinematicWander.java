package movement;

import java.lang.annotation.Target;
import java.util.Random;

public class KinematicWander {
	Character character;
	private float maxSpeed;
	private float maxRotation;
	
	public KinematicWander() {
		super();
	}

	public KinematicWander(Character character, float maxSpeed, float maxRotation) {
		super();
		this.character = character;
		this.maxSpeed = maxSpeed;
		this.maxRotation = maxRotation;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public float getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(float maxRotation) {
		this.maxRotation = maxRotation;
	}

	@Override
	public String toString() {
		return "KinematicWander [character=" + character + ", maxSpeed=" + maxSpeed + ", maxRotation=" + maxRotation
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public KinematicOutput generateKinematicOutput () {
		Vector2D velocity = new Vector2D();
		velocity.setZ((float)Math.cos(character.getOrientation()));
		velocity.setX((float)Math.sin(character.getOrientation()));
		
		//Vector2D velocity = new Vector2D();
		//velocity =  Vector2D.mulVector2D(orientation, maxSpeed);
		
		velocity.mulVector2D(maxSpeed);
		
		Random r =new Random();
		float rotation = (r.nextFloat()-r.nextFloat()) * maxRotation;
		
		return new KinematicOutput(velocity, rotation);
	}
	
	public static void main(String[] args) {
		Character character =new Character(0, new Vector2D(0, 0), 0, new Vector2D(1, 1));
		KinematicWander wander = new KinematicWander(character,1,(float) (Math.PI/8));
		KinematicOutput kinematicOutput = wander.generateKinematicOutput();

		System.out.println(kinematicOutput);
		
		character.update(kinematicOutput, 1);
		character.applyNewOrientation();
		
		System.out.println(character);
	}

}
