package rahid.coursework;

public class Model {
	private String question;
    private String[] options;
    private int correctOptionIndex;
    private String[] imagePaths;

    public Model(String question, String[] options, int correctOptionIndex, String[] imagePaths) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
        this.imagePaths = imagePaths;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String[] getImagePaths() {
        return imagePaths;
    }

    public boolean isCorrect(int optionIndex) {
        return optionIndex == correctOptionIndex;
    }
}
