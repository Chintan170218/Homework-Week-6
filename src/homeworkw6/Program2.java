package homeworkw6;

public class Program2 {
    //2.1 Declare two static variables
    static int a = 15;
    static int b = 25;

    //2.4 Declare the Main Method
    public static void main(String[] args) {

        //2.5 Call the below static method into the Main method and Run the programme
        Program2 obj = new Program2();
        obj.Method();


    }

    //2.2 Declare one static method
    public static void Method(){

        //2.3 Call both static variables into the static method inside the print statement
        System.out.println(a);
        System.out.println(b);


    }

}
