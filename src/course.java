
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class course {
     public void insertUpdateDeleteStudent(char operation,Integer id,String label,Integer hours) throws SQLException{
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation == 'i'){
            try {
                ps=con.prepareStatement("INSERT INTO `course`( `label`, `hours_number`) VALUES (?,?)");
                ps.setString(1, label);
                ps.setInt(2, hours);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"New Course Added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'e'){
            try {
                ps=con.prepareStatement("UPDATE `course` SET `label`= ?,`hours_number`=? WHERE `id`= ?");
                ps.setString(1, label);
                ps.setInt(2, hours);
                ps.setInt(3, id);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Course data edited");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'r'){
            try {
                ps=con.prepareStatement("DELETE FROM `course` WHERE `id`= ?");
                ps=con.prepareStatement("DELETE FROM `score` WHERE `course_id`= ?");
                ps.setInt(1, id);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Course Removed");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     }
     public boolean isCourseExist(String courseName) throws SQLException{
         boolean isExist=false;
         
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
                ps=con.prepareStatement("SELECT * FROM `course` WHERE `label`=?");
                ps.setString(1, courseName);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    isExist = true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
          return isExist;      
         
     }
     
     
     public ArrayList<mgCourse> getListCourse() throws SQLException
    {
        
       // String sql="SELECT * FROM 'student'";
        Connection con=MyConnection.getConnection();
        PreparedStatement ps ;
        ps=con.prepareStatement("SELECT * FROM course");
        ResultSet rs=ps.executeQuery();
        ArrayList<mgCourse> arrCourse = new ArrayList<>();
        while(rs.next()){
           arrCourse.add(new mgCourse(rs.getInt("id"),rs.getInt("hours_number"),rs.getString("label")));
        }
        return arrCourse;
        
    }   
     public int getCouraseId(String courseLabel) throws SQLException{
         int courseId=0;
         
         
         Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        try {
                ps=con.prepareStatement("SELECT * FROM `course` WHERE `label`=?");
                ps.setString(1, courseLabel );
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    courseId=rs.getInt("Id");  
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
         return courseId;
     }
     public void fillCourseCombo(JComboBox combo) throws SQLException{
         Connection con=MyConnection.getConnection();
         PreparedStatement ps;
         ps=con.prepareStatement("SELECT * FROM course");
         ResultSet rs=ps.executeQuery();
         while(rs.next()){
              combo.addItem(rs.getString(2));
         }
     }
}
