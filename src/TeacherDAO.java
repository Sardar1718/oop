import java.sql.Connection;
import java.sql.PreparedStatement;

public class TeacherDAO {

    public void addTeacher(Teacher t) {
        String sql = "INSERT INTO teachers(name, age, subject, experience_years) VALUES (?, ?, ?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, t.getName());
            ps.setInt(2, t.getAge());
            ps.setString(3, t.getSubject());
            ps.setInt(4, t.getExperienceYears());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
