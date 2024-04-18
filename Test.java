public class Test {
    // Primitive types are passed by value
    // This method takes two integers as arguments and modifies one of them
    void meth(int i,int j){
        j*=2;
        j/=2;
    }
}
class CallByvalue{
    public static void main(String[] args) {
        // Creating an object of the Test class
        Test ob =new Test();

        // Declaring and initializing two integer variables a and b
        int a=15,b=20;

        // Printing the values of a and b before calling the method
        System.out.println("a and b before call: "+a+" "+b);

        // Calling the meth() method of the Test class with arguments a and b
        // Note: In Java, primitive types are passed by value
        ob.meth(a,b);

        // Printing the values of a and b after calling the method
        // The values of a and b are not modified inside the method because primitive types are passed by value
        System.out.println("a and b after call: "+a+" "+b);
    }
}
