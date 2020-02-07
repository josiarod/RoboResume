import java.util.ArrayList;

public class Skills {
    ArrayList<String> list = new ArrayList<>();
    private String skillName;
    private String proficiency;

    public Skills(){

    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    public ArrayList<String> skills(){
        list.add(skillName + ", " + proficiency);
        return list;
    }





}
