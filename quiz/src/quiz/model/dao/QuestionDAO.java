package quiz.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import quiz.model.vo.Question;
import quiz.model.vo.Ranking;

public class QuestionDAO {
    private Connection con;

    public QuestionDAO() {
        this.con = ConexaoBD.conectar();
    }
    
    //select questoes aleatorias
    public ArrayList<Question> selectQuestionAleatorias(int qtd, String theme, String difficult){
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Question> q = new ArrayList<>();
        
        try {
        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from questions where theme = '" + theme + "' and difficult ='" + difficult +  "' order by rand() limit 0," +  qtd);

        while (rs.next()) {
            Question question = new Question();
            question.setIdQuestion(rs.getInt("idquestion"));
            question.setQuestion(rs.getString("question"));     
            question.setAlternative1(rs.getString("alternative1"));
            question.setAlternative2(rs.getString("alternative2"));
            question.setAlternative3(rs.getString("alternative3"));
            question.setAlternative4(rs.getString("alternative4"));
            question.setRightAnswer(rs.getInt("rightAnswer"));
            
            q.add(question);
        }

        stmt.close();
        rs.close();
        } catch (SQLException e) {
               e.printStackTrace();
        }
        return q;
    }
    
    public boolean signRanking(Ranking ranking){
        try{
            String sql = "insert into raking (nick, score) values (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, ranking.getNick());
            stmt.setInt(2, ranking.getScore());
            
            return stmt.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}

