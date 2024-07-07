package rahid.coursework;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CourseworkApp extends Application{
	View view;
	Model model;
	Controller controller;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String question = "Which animal lives in the Arctic?";
        String[] options = {"Penguin", "Polar Bear", "Kangaroo"};
        int correctOptionIndex = 1;
        String[] imagePaths = {
            "/coursework/src/main/java/rahid/coursework/penguin.jpg", 
            "/coursework/src/main/java/rahid/coursework/polarbear.jpg", 
            "/coursework/src/main/java/rahid/coursework/kangaroo.jpg"
        };

        Model model = new Model(question, options, correctOptionIndex, imagePaths);
        View view = new View(primaryStage, options.length);
        new Controller(model, view);

        primaryStage.show();		
	}
	
	

}
