import java.awt.Color;

public class Engine  extends Machine{

	public Engine(Color color, int power, float height) {
		super(color, power, height);
		this.color = Color.GREEN;
		this.power = 100;
		this.height = 2;
	}

}
