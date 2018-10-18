package movement;

public class Vector2D {
	
	private float x;
	private float z;

	public Vector2D() {
		super();
	}

	public Vector2D(float x, float z) {
		super();
		this.x = x;
		this.z = z;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Vector2D [x=" + x + ", z=" + z + "]";
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	
	public static Vector2D addVector2D(Vector2D v1, Vector2D v2)
	{
		return new Vector2D(v1.getX()+v2.getX(), v1.getZ()+v2.getZ());
	}
	
	public Vector2D addVector2D(Vector2D v)
	{
		this.x += v.getX();
		this.z += v.getZ();
		return this;
	}
	
	public static Vector2D subVector2D(Vector2D v1, Vector2D v2)
	{
		return new Vector2D(v1.getX()-v2.getX(), v1.getZ()-v2.getZ());
	}
	
	public Vector2D subVector2D(Vector2D v)
	{
		this.x -= v.getX();
		this.z -= v.getZ();
		return this;
	}
	
	public static Vector2D mulVector2D(Vector2D v, float constrant)
	{
		return new Vector2D(v.getX()*constrant, v.getZ()*constrant);
	}
	
	public Vector2D mulVector2D(float constant)
	{
		this.x *= constant;
		this.z *= constant;
		return this;
	}
	
	public double length() {
		return Math.sqrt(this.x*this.x+this.z*this.z);
	}
	
	public void normolize() {
		double length = this.length();
		this.x /= length;
		this.z /= length;
	}
	
	
	public static void main(String[] args) {
		
	}

}
