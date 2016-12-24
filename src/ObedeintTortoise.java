import org.teachingextensions.logo.Tortoise;

public class ObedeintTortoise {
	public static void main(String[] args) {
		Tortoise.show();
		drawSquare();
		drawTriangle();
	}

	public static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(50);
			Tortoise.turn(90);
		}
	}

	public static void drawTriangle() {
		for (int i = 0; i < 3; i++) {
			Tortoise.move(50);
			Tortoise.turn(360 / 3);
		}
	}
}
