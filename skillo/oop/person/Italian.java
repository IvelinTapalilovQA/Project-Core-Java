package skillo.oop.person;

public class Italian extends Person{

    public Italian(String name, String sex, String religion, String languageSpeaking, String job, String nationality, String egn, String countryOfResidence) {
        super(name, sex, religion, languageSpeaking, job, nationality, egn, countryOfResidence);
    }

    @Override
    void sayHello() {
        System.out.println("Ciao!");
    }

    void cookingItalianFood(){
           System.out.println("I'm cooking pizza....");
    }
}
