import java.util.Scanner;

public class FinalClass {
    public FinalClass(){

    }

    public void finalClass(){
        StringBuilder finalList = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String moreExperience = "y";
        String moreEducation = "y";
        int skillsCounter = 0;
        String moreSkills = "";



        PersonalInformation information = new PersonalInformation();
        System.out.println("Please enter name: ");
        information.setName(sc.nextLine());
        System.out.println("Please enter email: ");
        information.setEmailAddress(sc.nextLine());
        System.out.println("Please enter phone number: ");
        information.setPhoneNumber(sc.nextLine());


        for(String string: information.information()){
            finalList.append(string).append("\n");
        }
        finalList.append("\n");

        System.out.println("Education");
        finalList.append("Education\n");
        while(!moreEducation.equalsIgnoreCase("n")) {
            Education education = new Education();
            System.out.println("Please enter degree type(Associate's, Bachelor's, Master's, PhD, etc.): ");
            education.setDegreeType(sc.nextLine());
            System.out.println("Please enter major: ");
            education.setMajor(sc.nextLine());
            System.out.println("Please enter University Name: ");
            education.setUniversityName(sc.nextLine());
            System.out.println("Please enter Graduation Year: ");
            education.setGraduationYear(sc.nextLine());



            for (String string : education.education()) {
                finalList.append(string).append("\n");
            }

                finalList.append("\n");

                System.out.println("More Education? y/n");
                if (sc.nextLine().equalsIgnoreCase("n")) {
                    moreEducation = "n";
                }


        }


        System.out.println("Work Experience");
        finalList.append("Experience\n");
        while(!moreExperience.equalsIgnoreCase("n")) {
            String moreDescription = "y";
            WorkExperience experience = new WorkExperience();
            System.out.println("Please enter a company name: ");
            experience.setCompany(sc.nextLine());
            System.out.println("Pleease enter job title: ");
            experience.setJobTitle(sc.nextLine());
            System.out.println(("Please enter start date: "));
            experience.setStartDate(sc.nextLine());
            System.out.println("Pleease enter end date: ");
            experience.setEndDate(sc.nextLine());

            while(!moreDescription.equalsIgnoreCase("n")) {
                System.out.println("Please enter a job description: ");
                experience.jobDescription.add(sc.nextLine());
                System.out.println("Do you need to enter another job description? y/n");
                if(sc.nextLine().equalsIgnoreCase("n")){
                    moreDescription = "n";
                }
            }

            for (String string : experience.experience()) {
                finalList.append(string).append("\n");
            }
            finalList.append("\n");

            System.out.println("More experience? y/n");
            if(sc.nextLine().equalsIgnoreCase("n")){
                moreExperience = "n";
            }
        }


                  System.out.println("Skills");
                  finalList.append("Skills\n");
                 while(skillsCounter < 3) {
                    Skills skills = new Skills();
                    System.out.println("Please enter  1 skill: ");
                    skills.setSkillName(sc.nextLine());
                    System.out.println("Please enter proficiency level  (Fundamental, Novice, Intermediate, Advanced, Expert): ");
                    skills.setProficiency(sc.nextLine());


                    for (String string : skills.skills()) {
                        finalList.append(string).append("\n");
                    }

                   // finalList.append("\n");
                    skillsCounter++;
                }


         while(!moreSkills.equalsIgnoreCase("n")) {
           System.out.println("Do you want to enter another skill? y/n");
            moreSkills = sc.nextLine();
            if(moreSkills.equalsIgnoreCase("n")){
                break;
            }

           Skills skills = new Skills();
           System.out.println("Please enter  1 skill: ");
           skills.setSkillName(sc.nextLine());
           System.out.println("Please enter proficiency level  (Fundamental, Novice, Intermediate, Advanced, Expert): ");
           skills.setProficiency(sc.nextLine());

           //finalList.append("Skills\n");
           for (String string : skills.skills()) {
               finalList.append(string).append("\n");
           }

           finalList.append("\n");

       }

         System.out.println("=========================================================================");
         System.out.println(finalList);

    }
}
