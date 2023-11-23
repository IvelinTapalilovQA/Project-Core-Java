package progress.oop.human;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Male maleOne = new Male("John Atanasov", 48);
        Male maleTwo = new Male("Silvester Stalone", 67);
        Female femaleOne = new Female("Christin Georgieva", 22);
        Female femaleTwo = new Female("Mona Lisa", 39);

        maleOne.talk();
        maleOne.walk();
        maleOne.sleep();

        femaleOne.talk();
        femaleOne.walk();
        femaleOne.sleep();

        ArrayList<Human> humans = new ArrayList<>();

        Collections.addAll(humans, maleOne, maleTwo,femaleOne,femaleTwo);
        Collections.sort(humans);

        for (Human human: humans) {
            System.out.println(human.getName() + " " + human.getAge());
        }
    }
}
