package rough;

public class age {

}


//public class Person {
//
//    /* Inclusive limits for the defined age ranges */
//    private static final int YOUNG_MAX = 12;
//    private static final int TEEN_MIN = 13;
//    // interesting definition of "teen"...
//    private static final int TEEN_MAX = 17;
//
//    private int age;
//
//    public Person(int initialAge) {
//        if (initialAge < 0) {
//            System.out.println("Age is not valid, "
//                + "setting age to 0.");
//            age = 0;
//        } else {
//            age = initialAge;
//        }
//    }
//
//    public void amIOld() {
//        String answer;
//
//        if (age <= YOUNG_MAX) {
//            answer = "You are young.";
//        } else if (TEEN_MIN <= age && age <= TEEN_MAX) {
//            answer = "You are a teenager.";
//        } else {
//            answer = "You are old.";
//        }
//
//        System.out.println(answer);
//    }
//
//    public void yearPasses() {
//        age++;
//    }