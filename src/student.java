
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class student {
    public void insertUpdateDeleteStudent(char operation,Integer id,String fname,String lname,String sex,String bdate,String phone,String address) throws SQLException{
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation == 'i'){
            try {
                ps=con.prepareStatement("INSERT INTO student(first_name, last_name, sex, birthdate, phone,address) VALUES(?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6,address);
                     
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"New Student Added");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(operation == 'u'){
            try {
                ps=con.prepareStatement("UPDATE `student` SET `first_name`= ?,`last_name`= ?,`sex`= ?,`birthdate`= ?,`phone`= ?,`address`= ? WHERE `id`= ?");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6,address);
                ps.setInt(7, id);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Student Data Updated");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(operation == 'd'){
            try {
                ps=con.prepareStatement("DELETE FROM `student` WHERE `id`= ?");
                ps=con.prepareStatement("DELETE FROM `score` WHERE `student_id`= ?");
               
                ps.setInt(1, id);
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null,"Student Data Deleted");
                }
            } catch (SQLException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
 
    public ArrayList<manageStudent> getListStudent() throws SQLException
    {
        
       // String sql="SELECT * FROM 'student'";
        Connection con=MyConnection.getConnection();
        PreparedStatement ps ;
        ps=con.prepareStatement("SELECT * FROM student");
        ResultSet rs=ps.executeQuery();
        ArrayList<manageStudent> arrStudent = new ArrayList<>();
        while(rs.next()){
            arrStudent.add(new manageStudent(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("sex"),rs.getString("birthdate"),rs.getString("phone"),rs.getString("address")));
        }
        return arrStudent;
        
    }   

   
}