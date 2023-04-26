  //contributor myah Jackson 


    public class Question {
    private String text;
    private boolean isIntroverted;

    public Question(String text, boolean isIntroverted) {
        this.text = text;
        this.isIntroverted = isIntroverted;
    }

    public String getText() {
        return text;
    }

    public boolean isIntroverted() {
        return isIntroverted;
    }
}