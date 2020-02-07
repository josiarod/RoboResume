import java.util.Scanner;

public class FinalClass {
    public FinalClass(){

    }

    public void finalClass(){
        StringBuilder finalList = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        PersonalInformation information = new PersonalInformation();
        System.out.println("Please enter name: ");
        information.setName(sc.nextLine());
        System.out.println("Please enter email: ");
        information.setEmailAddress(sc.nextLine());


        for(String string: information.information()){
            finalList.append(string).append("\n");
        }
        finalList.append("\n");

        Education education = new Education();
        System.out.println("Please enter degree type(Associate's, Bachelor's, Master's, PhD, etc.): ");
        education.setDegreeType(sc.nextLine());
        System.out.println("Please enter major: ");
        education.setMajor(sc.nextLine());
        System.out.println("Please enter University Name: ");
        education.setUniversityName(sc.nextLine());
        System.out.println("Please enter Graduation Year: ");
        education.setGraduationYear(sc.nextLine());


        finalList.append("Education\n");
        for(String string: education.education()){
            finalList.append(string).append("\n");
        }
        finalList.append("\n");


        WorkExperience experience = new WorkExperience();
        System.out.println("Please enter a company name: ");
        experience.setCompany(sc.nextLine());
        System.out.println("Pleease enter job title: ");
        experience.setJobTitle(sc.nextLine());
        System.out.println(("Please enter start date: "));
        experience.setStartDate(sc.nextLine());
        System.out.println("Pleease enter end date: ");
        experience.setEndDate(sc.nextLine());
        System.out.println("Please enter at least 1 job description: ");
        experience.setJobDescription(sc.nextLine());

        finalList.append("Experience\n");
        for(String string: experience.experience()){
            finalList.append(string).append("\n");
        }
        finalList.append("\n");


        Skills skills = new Skills();
        System.out.println("Please enter skill name: ");
        skills.setSkillName(sc.nextLine());
        System.out.println("Plese enter proficiency level  (Fundamental, Novice, Intermediate, Advanced, Expert): ");
        skills.setProficiency(sc.nextLine());

        finalList.append("Skills\n");
        for(String string: skills.skills()){
            finalList.append(string).append("\n");
        }

        System.out.println("=========================================================================");
        System.out.println(finalList);

    }
}
