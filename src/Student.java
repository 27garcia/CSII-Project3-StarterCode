public class Student {
    private String id;
    private String reasoning;
    private String month;
    private int siblings;
    private int grade;
    private int handicap;
    private boolean favNum;
    private boolean cD;


    public Student(String id, String reasoning, String month, int siblings, int grade, int handicap, boolean favNum, boolean cD) {
        this.id = id;
        this.reasoning = reasoning;
        this.month = month;
        this.siblings = siblings;
        this.grade = grade;
        this.handicap = handicap;
        this.favNum = favNum;
        this.cD = cD;

    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReasoning() {
        return reasoning;
    }

    public void setReasoning(String reasoning) {
        this.reasoning = reasoning;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String umonth) {
        this.month = month;
    }

    public int getSiblings() {
        return siblings;
    }
    public void setSiblings(int siblings) {
        this.siblings = siblings;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getHandicap() {
        return handicap;
    }
    public void setHandicap(int handicap) {
        this.handicap = handicap;
    }
    public boolean isFavNum() {
        return favNum;
    }
    public void setFavNum(boolean favNum) {
        this.favNum = favNum;
    }
    public boolean isCD() {
        return cD;
    }
    public void setCD(boolean cD) {
        this.cD = cD;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id: '" + id + '\'' +
                "\n reasoning for playing golf: '" + reasoning + '\'' +
                "\n second favorite month: '" + month + '\'' +
                "\n number of siblings: " + siblings + '\'' +
                "\n grade: " + grade + '\'' +
                "\n golf handicap index: " + handicap + '\'' +
                "\n favorite number: " + favNum + '\'' +
                "\n Dogs are better than Cats: " + cD + '\'' +

                '}';
    }
}