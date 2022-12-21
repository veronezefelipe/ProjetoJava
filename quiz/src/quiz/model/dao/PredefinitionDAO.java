/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import quiz.model.vo.Predefinition;

/**
 *
 * @author Matheus e Veroneze
 */
public class PredefinitionDAO {
    
    private Connection con;
    
    public PredefinitionDAO(){
        this.con = ConexaoBD.conectar();
    }
    
    
    
    //adc pred
    
    public boolean adcPredefinition(Predefinition predefinition){
        String sql = "insert into predefinition (qtdquestions, difficult, theme) values (?,?,?)";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, predefinition.getQtdQuestion());
            stmt.setString(2, predefinition.getDifficult());
            stmt.setString(3, predefinition.getTheme());
            
            return stmt.execute();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    
    //consultar predefinitiions
    public ArrayList<Predefinition> consultarPredefinitions(){
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Predefinition> predefinitions = new ArrayList<>();
        
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from predefinition");
            
            while(rs.next()){
                Predefinition predefinition = new Predefinition();
                predefinition.setIdPredefinition(rs.getInt("idpredefinition"));
                predefinition.setQtdQuestion(rs.getInt("qtdquestions"));
                predefinition.setDifficult(rs.getString("difficult"));
                predefinition.setTheme(rs.getString("theme"));
                
                predefinitions.add(predefinition);
            }
            stmt.close();
            rs.close();
        }catch(SQLException ex){
            ex.printStackTrace();
    }
        return predefinitions;
    }
}
