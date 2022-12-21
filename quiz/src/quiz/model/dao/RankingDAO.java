
package quiz.model.dao;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.sql.ResultSet;
    import java.util.ArrayList;
import quiz.model.vo.Ranking;
    
/**
 *
 * @author Matheus e Veroneze
 */
public class RankingDAO {
    private Connection con;
    
    public RankingDAO(){
        this.con = ConexaoBD.conectar();
    }
    
    //adc ranking
    
    public boolean adcRanking(String name, int score){
        String sql = "insert into ranking (nick, score) values (?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, score);
            
            return stmt.execute();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    //carregar array com os rankings
    public ArrayList<Ranking> carregarRanking() {
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Ranking> ranking = new ArrayList<>();
        
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from ranking order by score desc");            
            while (rs.next()) {
                Ranking r = new Ranking();
                r.setIdranking(rs.getInt("idranking"));
                r.setNick(rs.getString("nick"));
                r.setScore(rs.getInt("score"));
                
                ranking.add(r);
            }
            stmt.close();
            rs.close();            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ranking;
    }
}
