public class Subject {
    String subjectName;
    Integer subjectMarks;

    public Subject(String subjectName, Integer subjectMarks) {
        this.subjectName = subjectName;
        this.subjectMarks = subjectMarks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(Integer subjectMarks) {
        this.subjectMarks = subjectMarks;
    }
}
