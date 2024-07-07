package rahid.coursework;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import rahid.coursework.GameObject;

public class View {
    private Label questionLabel;
    private Button[] optionButtons;
    private VBox layout;
    private Canvas canvas;
    private GraphicsContext gc;
    private GameObject[] gameObjects;

    public View(Stage stage, int numberOfOptions) {
        questionLabel = new Label();
        optionButtons = new Button[numberOfOptions];
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = new Button();
        }

        canvas = new Canvas(400, 200);
        gc = canvas.getGraphicsContext2D();
        gameObjects = new GameObject[numberOfOptions];
        for (int i = 0; i < gameObjects.length; i++) {
            gameObjects[i] = new GameObject(gc, 50 + i * 100, 50);
        }

        layout = new VBox(10, questionLabel, optionButtons[0], optionButtons[1], optionButtons[2], canvas);
        layout.setStyle("-fx-padding: 20; -fx-alignment: center; -fx-font-size: 18;");
        Scene scene = new Scene(layout, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Animal Habitat Quiz");
    }

    public void setQuestion(String question) {
        questionLabel.setText(question);
    }

    public void setOptions(String[] options) {
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i].setText(options[i]);
        }
    }

    public void setImages(String[] imagePaths) {
        for (int i = 0; i < gameObjects.length; i++) {
            gameObjects[i].setImage(imagePaths[i]);
            gameObjects[i].update();
        }
    }

    public Button[] getOptionButtons() {
        return optionButtons;
    }

    public VBox getLayout() {
        return layout;
    }
}
