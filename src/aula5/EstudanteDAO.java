package aula5;

import aula2.Estudante;

import java.sql.*;

public class EstudanteDAO {

    ConexaoBD db = new ConexaoBD();

    public void createTableIfNotExistes(){
        String sql = "create table if not exists estudante (id INT primary key auto_increment, nome VARCHAR(255));";

        try {
            Connection conn = db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        }catch (Exception e){
            e.getMessage();
        }
    }

    public void adicionarEstudante(String nomeEstudante){
        String sql = "insert into estudante (nome) values (?);";
        try {
            Connection conn = db.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nomeEstudante);
            pstmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Estudante getEstudante(int id){
        String sql = "SELECT * FROM carloca.estudante where id = ?";
        Estudante retorno = new Estudante();
        try {
            Connection conn = db.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                retorno.setNome(rs.getString("nome"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return retorno;
    }



}
