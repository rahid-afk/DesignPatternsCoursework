package rahid.coursework;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

class GameObject {
	protected Image image;
	protected double x, y;
	protected GraphicsContext gc;
	
	public GameObject(GraphicsContext gc, double x, double y) {
		this.gc = gc;
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		if (image != null) {
			gc.drawImage(image, x, y, 30, 30);
		}
	}

	public void setImage(String imagePath) {
		this.image = new Image(imagePath);
	}
}
