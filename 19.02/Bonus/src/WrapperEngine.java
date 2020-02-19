import java.awt.Color;

public class WrapperEngine  extends Machine{

	public WrapperEngine(Color color, int power, float height) {
		super(color, power, height);
		this.color = Color.RED;
		this.power = 110;
		this.height = 4;
	}

}
