import java.util.ArrayList;

public class WorkExperience {
    ArrayList<String> list = new ArrayList<>();
private String company;
private String jobTitle;
private String startDate;
private String endDate;
private String jobDescription;

public WorkExperience(){

}

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public ArrayList<String> experience(){
        list.add(company);
        list.add(jobTitle);
        list.add(startDate);
        list.add(endDate);
        list.add(jobDescription);

        return list;
    }
}
