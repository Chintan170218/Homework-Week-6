package homeworkw6;

public class Program3 {

    //3.1 Declare one instance and one static variable
    int a = 15;
    static int b = 25;

    //3.5 Declare the Main method
    public static void main(String [] args) {

        //3.6 Call both instance and static methods into the Main method and run the programme.
        Program3 x = new Program3();
        x.method();
        method1();

    }
    //3.2 Declare one instance method
    public void method(){

        /*3.4 all both instance and static variables into both instance and static
        methods inside the print statement.*/
        System.out.println(a);
        System.out.println(b);

    }
    //3.3 Declare one static method
    public static void method1(){

        /*3.4 all both instance and static variables into both instance and static
        methods inside the print statement.*/
        Program3 instance = new Program3();
        System.out.println(instance.a);
        System.out.println(b);

    }

}
