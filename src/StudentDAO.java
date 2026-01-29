import java.sql.*;

public class StudentDAO {

    public void addStudent(Student s) {
        String sql = """
                INSERT INTO students(id, name, age, gpa)
                VALUES (?, ?, ?, ?)
                ON CONFLICT (id) DO NOTHING
                """;

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setDouble(4, s.getGpa());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readStudents() {
        String sql = "SELECT * FROM students ORDER BY id";
        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getString("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age") + " " +
                                rs.getDouble("gpa")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateGpa(String id, double gpa) {
        String sql = "UPDATE students SET gpa = ? WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, gpa);
            ps.setString(2, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(String id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

