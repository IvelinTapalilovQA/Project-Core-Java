package skillo.oop.person;

public class American extends Person {
    public American(String name, String sex, String religion, String languageSpeaking, String job, String nationality, String egn, String countryOfResidence) {
        super(name, sex, religion, languageSpeaking, job, nationality, egn, countryOfResidence);
    }

    void cookingAmericanFood(){
        System.out.println("I'm cooking hot-dogs and burgers");
    }
}