/*
Class with Single Object
 */
public class SingleTonClass {
    static SingleTonClass singleTonClassObject = null;
    String name = "";
    int age = 0;
    // Preventing initialisation from Outside
    private SingleTonClass(String name, int age) {
        this.name = name;
        this.age = age;
        /*
        We can add code snippets to run only once.
         */
    }

    public static SingleTonClass getInstance(String name, int age) {
        // Logic to return only one instance of the class
        if (singleTonClassObject == null) {
            singleTonClassObject = new SingleTonClass(name, age);
        }
        return singleTonClassObject;
    }
}

/*
* Public class should be the file name. So only one public class is allowed in one file in Java.
 */
class Main {

    public static void main(String[] args) {
        SingleTonClass singleTonClass1 = SingleTonClass.getInstance("Logesh", 21);

        // Eventhough I pass the new Name(Mani) and Age. It return's Logesh's object
        SingleTonClass singleTonClass2 = SingleTonClass.getInstance("Mani", 22);

        System.out.println(singleTonClass1.name + " : " + singleTonClass2.name);

    }
}
