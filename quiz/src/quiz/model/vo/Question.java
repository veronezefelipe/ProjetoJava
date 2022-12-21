package quiz.model.vo;

public class Question {
    protected int idQuestion;
    private String question;
    private String alternative1;
    private String alternative2;
    private String alternative3;
    private String alternative4;
    private int rightAnswer;

    public Question() {
        this.idQuestion = 0;
        this.question = "";
        this.alternative1 = "";
        this.alternative2 = "";
        this.alternative3 = "";
        this.alternative4 = "";
        this.rightAnswer = 0;
    }
    
    public Question(int idQuestion, String question, String theme, String difficult, String alternative1, String alternative2, String alternative3, String alternative4, int rightAnswer) {
        this.idQuestion = idQuestion;
        this.question = question;
        this.alternative1 = alternative1;
        this.alternative2 = alternative2;
        this.alternative3 = alternative3;
        this.alternative4 = alternative4;
        this.rightAnswer = rightAnswer;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }



    public String getAlternative1() {
        return alternative1;
    }

    public void setAlternative1(String alternative1) {
        this.alternative1 = alternative1;
    }

    public String getAlternative2() {
        return alternative2;
    }

    public void setAlternative2(String alternative2) {
        this.alternative2 = alternative2;
    }

    public String getAlternative3() {
        return alternative3;
    }

    public void setAlternative3(String alternative3) {
        this.alternative3 = alternative3;
    }

    public String getAlternative4() {
        return alternative4;
    }

    public void setAlternative4(String alternative4) {
        this.alternative4 = alternative4;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }
    
    
}
