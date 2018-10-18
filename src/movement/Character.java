package movement;

public class Character {
	
	private float orientation; //hướng mặt character
	private Vector2D position; // vị trí character
	private float rotation; //vận tốc xoay quanh character
	private Vector2D velocity; //vận tốc của character
	
	public Character() {
		super();
	}
	
	public Character(float orientation, Vector2D position, float rotation, Vector2D velocity) {
		super();
		this.orientation = orientation;
		this.position = position;
		this.rotation = rotation;
		this.velocity = velocity;
	}
	
	public float getOrientation() {
		return orientation;
	}
	
	public void setOrientation(float orientation) {
		this.orientation = orientation;
	}
	
	public Vector2D getPosition() {
		return position;
	}
	
	public void setPosition(Vector2D position) {
		this.position = position;
	}
	
	public float getRotation() {
		return rotation;
	}
	
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
	
	public Vector2D getVelocity() {
		return velocity;
	}
	
	public void setVelocity(Vector2D velocity) {
		this.velocity = velocity;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	
	@Override
	public String toString() {
		return "Character [orientation=" + orientation + ", position=" + position + ", rotation=" + rotation
				+ ", velocity=" + velocity + "]";
	}
	
	
	public void update(KinematicOutput kinematicOutput, float time) {
		this.velocity = kinematicOutput.getVelocity();
		this.rotation = kinematicOutput.getRotation();
		
		this.position.addVector2D(Vector2D.mulVector2D(velocity, time));
		this.orientation+=this.rotation*time;
	}
	
	public void applyNewOrientation() {
		if(this.velocity.length()>0)
		{
			this.orientation = (float) Math.atan2(-this.velocity.getX(), this.velocity.getZ());
		}
	}
}
