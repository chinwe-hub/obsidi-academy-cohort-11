public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));                  
        System.out.println(isPerfectSquare(4));                  
        System.out.println(isPerfectSquare(Integer.MAX_VALUE/100)); 
        System.out.println(isPerfectSquare(255));                
    }

    public static boolean isPerfectSquare(int num) {

      // use a for loop for iteration
        for (int i = 1; i * i <= num; i++) {
          // make use of a comparison operator instead of an assignment operator
            if (i * i == num) {
                return true;
            }
        }
        
        return false;
    }

     /*
     * I changed the assignment (single equal) sign "i*i = num" to comparison (double equal sign) "i*i == num".
     * 
     * I also changed the condition to "i * i <= num" to stop the loop as soon as the square root is passed. 
     * This makes it faster than checking every single number up to num.
     *   
     * */
}
