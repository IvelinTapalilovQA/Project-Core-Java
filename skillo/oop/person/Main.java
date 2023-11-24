package skillo.oop.person;

public class Main {
    public static void main(String[] args) {

        American american = new American("John Snow", "Male", "Catholic", "English", "Accountant", "American", "9501248590", "USA");
        Bulgarian bulgarian = new Bulgarian("Dimityr Tudjarov", "Male", "Orthodox", "Bulgarian", "Policeman", "Bulgarian", "8102238999", "Bulgaria");
        Italian italian = new Italian("Folicia Colintini", "Female", "Catholic", "Italian", "Hairdresser", "Italian", "9804178784", "Italy");

        executePersonActions(american);
        executePersonActions(bulgarian);
        executePersonActions(italian);

        System.out.println(("Execute individual actions for class " + american.getClass().getSimpleName()));
        american.cookingAmericanFood();
        System.out.println(("Execute individual actions for class " + bulgarian.getClass().getSimpleName()));
        bulgarian.cookingBulgarianFood();
        System.out.println(("Execute individual actions for class " + italian.getClass().getSimpleName()));
        italian.cookingItalianFood();

        System.out.println(american.getDateOfBirth());
        System.out.println(american.getAge());
        System.out.println(american);

    }

    private static void executePersonActions(Person person){
        System.out.println(("Execute actions for class " + person.getClass().getSimpleName()));
        person.sayHello();
        person.celebrateEaster();
        System.out.println(person.isAdult());
        System.out.println(person.canTakeLoan());
    }


}

