public class Student {
    private String name;
    private long id;
    private int specialNumbers = 3172137; 

    // Getter

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    // setter

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    Student () {
        this.name = "";
        this.id = 0L;
    }

    Student (String name, long id) {
        this.name = name;
        this.id = id;
    }

    // validate strudent id
    public String validateStudentId (long id) {
        int result = 0;
        long x = 1;
        for (int i = 0 ; i < 7 ; i++) {
            result += getInt(id, x * 100) * getInt(specialNumbers, x);
            x *= 10;
        }
        return (getInt(id, 10) == (result % 11)) ? " valid" : " invalid";
    }

    private int getInt (long id, long x) {
        return ((int)(id / x) % 10);
    }
}