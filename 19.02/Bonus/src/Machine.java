import java.awt.Color;

public abstract class Machine {
	public int power = 0;
	public float height = 0;
	public Color color;
	
	public Machine(Color color, int power,float height) {
		this.color = color;
		this.power = power;
		this.height = height;
	}
}
