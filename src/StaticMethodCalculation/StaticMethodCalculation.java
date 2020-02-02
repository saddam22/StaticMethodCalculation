
package StaticMethodCalculation;

public class StaticMethodCalculation {
    
    static int cube(int x){
    return x*x*x;
    }
    public static void main(String[] args) {
        int result = StaticMethodCalculation.cube(5);
        System.out.println(result);
    }
}
