
public class manageScore {
   int student_id, course_id;
   float student_score;
   String description;

    public manageScore(int student_id, int course_id, float student_score, String description) {
        this.student_id = student_id;
        this.course_id = course_id;
        this.student_score = student_score;
        this.description = description;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public float getStudent_score() {
        return student_score;
    }

    public void setStudent_score(float student_score) {
        this.student_score = student_score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
   
}
