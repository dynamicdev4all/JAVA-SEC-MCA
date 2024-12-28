public class Factorial {

    static int findFact(int n){
        if(n==0){
            return 1;
        }
        return n * findFact(n - 1);
    }

    public static void main(String[] args) {
        findFact(5);
    }
}
