package skillo.oop.person;

import java.time.LocalDate;

public class Person {

    private String name;
    private String sex;
    private String religion;
    private String languageSpeaking;
    private String job;
    private String nationality;
    private String egn;
    private String dateOfBirth;
    private int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String languageSpeaking, String job, String nationality, String egn, String countryOfResidence) {
        this.name = name;
        this.religion = religion;
        this.languageSpeaking = languageSpeaking;
        this.job = job;
        this.nationality = nationality;
        this.countryOfResidence = countryOfResidence;
        setSex(sex);
        setEgn(egn);
        setDateOfBirth(egn);
        setAge(egn);
    }


    private void setSex(String sex) {
        try {
            validateSex(sex);
            this.sex = sex;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void validateSex(String sex) throws Exception {

        if (!sex.equals("Male") && !sex.equals("Female")) {
            throw new Exception("Please provide a valid value for sex!");
        }
    }


    public void setJob(String job) {
        this.job = job;
    }

    private void setEgn(String egn) {
        if(egn.length() == 10){
            this.egn = egn;
        }else throw new RuntimeException("The length of EGN must be exactly 10 digits!");
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    private void setDateOfBirth(String egn) {
        String month = egn.substring(2, 4);
        String date  = egn.substring(4, 6);
        this.dateOfBirth = (month+"-"+date);

    }

    public int getAge() {
        return age;
    }

    private void setAge(String egn) {
        String age = egn.substring(0, 2);
        int year;
        int yearNow;
        if (age.startsWith("0") || age.startsWith("1")) {
            year = 2000 + Integer.parseInt(age);
        } else {
            year = 1900 + Integer.parseInt(age);
        }
        yearNow = LocalDate.now().getYear();
        this.age = (yearNow - year);
    }


    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    void sayHello() {
        System.out.println("Hello");
    }

    void celebrateEaster() {
        if (religion.equals("Orthodox") || religion.equals("Catholic")){
            System.out.println("I'm celebrating easter!");
        }else System.out.println("I'm not celebrating easter!");
    }

    boolean isAdult() {
        if(countryOfResidence.equals("Bulgaria")  && age < 18) {
            return false;
        } else if (countryOfResidence.equals("Italy") && age < 18)  {
            return false;
        } else if (countryOfResidence.equals("USA") && age < 21) {
           return false;
        }
        return true;
    }

    boolean canTakeLoan() {
        return job != null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", religion='" + religion + '\'' +
                ", languageSpeaking='" + languageSpeaking + '\'' +
                ", job='" + job + '\'' +
                ", nationality='" + nationality + '\'' +
                ", egn='" + egn + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", countryOfResidence='" + countryOfResidence + '\'' +
                '}';
    }
}
