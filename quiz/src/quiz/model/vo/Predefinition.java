package quiz.model.vo;

public class Predefinition {
    public int idPredefinition;
    public int qtdQuestion;
    public String difficult;
    public String theme;

    public Predefinition() {
        this.idPredefinition = 0;
        this.qtdQuestion = 0;
        this.difficult = "";
        this.theme = "";
    }
    
    public Predefinition(int idPredefinition, int qtdQuestion, String difficult, String theme) {
        this.idPredefinition = idPredefinition;
        this.qtdQuestion = qtdQuestion;
        this.difficult = difficult;
        this.theme = theme;
    }
    
    public Predefinition( int qtdQuestion, String difficult, String theme) {
        this.qtdQuestion = qtdQuestion;
        this.difficult = difficult;
        this.theme = theme;
    }

    
    
    public int getIdPredefinition() {
        return idPredefinition;
    }

    public void setIdPredefinition(int idPredefinition) {
        this.idPredefinition = idPredefinition;
    }
    
    
    
    
    
    public int getQtdQuestion() {
        return qtdQuestion;
    }

    public void setQtdQuestion(int qtdQuestion) {
        this.qtdQuestion = qtdQuestion;
    }

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return Integer.toString(idPredefinition);
    }
    
    
}
