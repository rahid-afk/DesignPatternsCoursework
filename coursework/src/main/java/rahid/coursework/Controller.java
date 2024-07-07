package rahid.coursework;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setQuestion(model.getQuestion());
        this.view.setOptions(model.getOptions());
        this.view.setImages(model.getImagePaths());

        for (int i = 0; i < view.getOptionButtons().length; i++) {
            int index = i;
            view.getOptionButtons()[i].setOnAction(e -> {
                handleAnswer(index);
            });
        }
    }

    private void handleAnswer(int optionIndex) {
        boolean correct = model.isCorrect(optionIndex);
        showAlert(correct ? "Correct! Polar bears live in the Arctic." : "Incorrect! Try again.");
    }

    private void showAlert(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Quiz Result");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}