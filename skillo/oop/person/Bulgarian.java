package skillo.oop.person;

public class Bulgarian extends Person {


    public Bulgarian(String name, String sex, String religion, String languageSpeaking, String job, String nationality, String EGN, String countryOfResidence) {
        super(name, sex, religion, languageSpeaking, job, nationality, EGN, countryOfResidence);
    }

    @Override
    void sayHello() {
        System.out.println("Здравей");
    }

    void cookingBulgarianFood(){
        System.out.println("I'm cooking banitza.....");
    }
}
