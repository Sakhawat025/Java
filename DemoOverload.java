// Demonstrate Methd Overloading.
public class DemoOverload {
    void test(){
        System.out.println("No Parameters.");
    }

    // Overload test for one integer Parameter.
    void test(int a){
        System.out.println("A: "+a);
    }

    // Overeload test for two integer parameters.
    void test(int a,int b){
        System.out.println("A and B: "+a+" "+b);
    }

    // Overload test for double parameter.
    double test(double a){
        System.out.println("double a: "+a);
        return a*a;
    }
    
}

class Overload{
    public static void main(String args[]){
        // Create DemoOverload class Object.
        DemoOverload ob=new DemoOverload();
        double result;

        // Call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(12, 15);
        result=ob.test(9.9);
        System.out.println("result of ob.test(9.9): "+result);
    }
}
