package homeworkw6;

public class Program4 {

    //4.1 Declare two instance and two static variables
    int a = 15;
    static String name = "Alpha";
    int b = 25;
    static String name1 = "Beta";

    //4.5 Declare the Main method
    public static void main(String[] args) {

        //4.6 Call both instance and static methods into the Main method and run the programme.
        Program4 x = new Program4();
        x.method();
        method1();

    }

    //4.2 Declare one instance method
    public void method() {

        /*4.4 Call all four instance and static variables into both instance and static methods
        inside the print statement.*/
        System.out.println(a);
        System.out.println(name);
        System.out.println(b);
        System.out.println(name1);

    }

    //4.2 Declare one static method
    public static void method1() {

        /*4.4 Call all four instance and static variables into both instance and static methods
        inside the print statement.*/
        Program4 a1 = new Program4();
        System.out.println(a1.a);
        System.out.println(name);
        Program4 b1 = new Program4();
        System.out.println(b1.b);
        System.out.println(name1);

    }

}