// objects are passed through their references.
public class TestTrue {
    int a,b;

    // Constructor to initialize the object with values for a and b
    public TestTrue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    // Method to modify the TestTrue object passed as a parameter
    // Objects are passed by reference in Java
    void meth(TestTrue o){
        o.a*=2;
        o.b/=2;
    }
}

class passObjRef{
    public static void main(String[] args) {
        // Create TestTrue class object
        TestTrue ob=new TestTrue(15, 20);

        System.err.println("ob.a  and  ob.b before call: "+ob.a+" "+ob.b);

        // Calling the meth() method of the TestTrue class with the object ob as an argument
        ob.meth(ob);
        System.out.println("ob.a  and  ob.b after call: "+ob.a+" "+ob.b);
    }
}