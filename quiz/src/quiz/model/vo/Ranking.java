package quiz.model.vo;

public class Ranking {
    private int idranking;
    private String nick;
    private int score;
    
    public Ranking() {
        this.idranking = 0;
        this.nick = "";
        this.score = 0;
    }
    
    public Ranking(int idranking, String nick, int score) {
        this.idranking = idranking;
        this.nick = nick;
        this.score = score;
    }

    public int getIdranking() {
        return idranking;
    }

    public void setIdranking(int idranking) {
        this.idranking = idranking;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
