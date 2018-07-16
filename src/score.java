
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class score {
    public void insertUpdateDeleteStudent(char operation,Integer sid,Integer cid,Float scr,String descp) throws SQLException{
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation == 'i'){
            try {
                ps=con.prepareStatement("INSERT INTO `score`(`student_id`, `course_id`, `student_score`, `description`) VALUES (?,?,?,?)");
                ps.setInt(1, sid);
                ps.setInt(2, cid);
                ps.setFloat(3, scr);
                ps.setString(4 , descp);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Score Added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'e'){
            try {
                ps=con.prepareStatement("UPDATE `score` SET `student_score`=?,`description`=? WHERE `student_id`=? AND`course_id`=?");
                ps.setFloat(1, scr);
                ps.setString(2, descp);
                ps.setInt(3, sid);
                ps.setInt(4,cid);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Score data edited");
                }
                else
                    JOptionPane.showMessageDialog(null,"FALSE");
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'r'){
            try {
                ps=con.prepareStatement("DELETE FROM `score` WHERE `student_id`=? AND`course_id`=?");
               
                ps.setInt(1, sid);
                ps.setInt(2, cid);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Score Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }
    public ArrayList<manageScore> getListScore() throws SQLException
    {
        
       // String sql="SELECT * FROM 'student'";
        Connection con=MyConnection.getConnection();
        PreparedStatement ps ;
        ps=con.prepareStatement("SELECT * FROM score");
        ResultSet rs=ps.executeQuery();
        ArrayList<manageScore> arrScore = new ArrayList<>();
        while(rs.next()){
            arrScore.add(new manageScore(rs.getInt("student_id"),rs.getInt("course_id"),rs.getFloat("student_score"),rs.getString("description")));
        }
        return arrScore;
        
    }   
}
