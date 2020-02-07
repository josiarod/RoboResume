import java.util.ArrayList;

public class Education {
    ArrayList<String>  list = new ArrayList<>();
    private String degreeType;
    private String major;
    private String universityName;
    private String graduationYear;
    private String more = "y";

    public Education(){

    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }


    public ArrayList<String> education(){
        list.add(degreeType + " in "+ major +",");
        list.add(universityName + ", " + graduationYear);
        return list;
    }
}
