import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalInformation {
    ArrayList<String> list = new ArrayList<>();
    private String name;
    private String emailAddress;
    private String phoneNumber;

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(isPhoneNumberValid(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        }


    }





    public PersonalInformation(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        if(isEmailValid(emailAddress)) {
            this.emailAddress = emailAddress;
        }

    }


    private boolean isEmailValid(String email){
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;
        //Make the comparison case-insensitive.
        Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches()){
            isValid = true;
        }
        return isValid;
    }

    public ArrayList<String> information(){
        list.add(name);
        list.add(emailAddress);
        list.add(phoneNumber);

        return list;
    }

}
