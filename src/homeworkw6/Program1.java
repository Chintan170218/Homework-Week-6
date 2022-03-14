package homeworkw6;

public class Program1 {

    //1.1 Declare two instance variables
    int a = 15;
    int b = 25;

    //1.4 Declare the Main Method
    public static void main(String[] args) {

        //1.5 Call the below instance method into the Main method and Run the programme
        Program1 obj = new Program1();
        obj.Method();


    }

    //1.2 Declare one instance method
    public void Method(){

        //1.3 Call both instance variables into the instance method inside the print statement
        System.out.println(a);
        System.out.println(b);


    }

}
