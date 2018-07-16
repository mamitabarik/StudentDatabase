
public class mgCourse {
    private int id,hours_number;
    private String label;
    
    public mgCourse(int id, int hours_number, String label) {
        this.id = id;
        this.hours_number = hours_number;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHours() {
        return hours_number;
    }

    public void setHours(int hours_number) {
        this.hours_number = hours_number;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
}
