package movement;

public class KinematicOutput {
	
	private float rotation;
	private Vector2D velocity;
	
	public KinematicOutput() {
		super();
	}

	public KinematicOutput(Vector2D velocity, float rotation) {
		super();
		this.rotation = rotation;
		this.velocity = velocity;
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
		return "KinematicOutput [rotation=" + rotation + ", velocity=" + velocity + "]";
	}
	
	
}
