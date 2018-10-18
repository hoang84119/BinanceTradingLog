package movement;

public class KinematicFlee {
	private Character character;
	private float maxSpeed;
	private Character target;
	
	public KinematicFlee() {
		super();
	}

	public KinematicFlee(Character character, Character target, float maxSpeed) {
		super();
		this.character = character;
		this.maxSpeed = maxSpeed;
		this.target = target;
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

	public Character getTarget() {
		return target;
	}

	public void setTarget(Character target) {
		this.target = target;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "KinematicSeek [character=" + character + ", maxSpeed=" + maxSpeed + ", target=" + target + "]";
	}

	public KinematicOutput generateKinematicOutput () {
		Vector2D velocity = new Vector2D();
		velocity = Vector2D.subVector2D(character.getPosition(), target.getPosition());
		velocity.normolize();
		velocity.mulVector2D(maxSpeed);
		
		return new KinematicOutput(velocity, 0);
	}
	
	public static void main(String[] args) {
		Character character = new Character();
		character.setPosition(new Vector2D(2, 1));
		
		Character target =new Character();
		target.setPosition(new Vector2D(9, 1));
		
		KinematicFlee kinematicSeek = new KinematicFlee(character, target, 1);
		KinematicOutput kinematicOutput = kinematicSeek.generateKinematicOutput();
		System.out.println(kinematicOutput);
		
		character.update(kinematicOutput, 1);
		character.applyNewOrientation();
		
		System.out.println(character.getPosition());
		System.out.println(character.getOrientation());
	}
}
