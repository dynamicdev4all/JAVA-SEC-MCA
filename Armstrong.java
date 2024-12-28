public class Armstrong {
    public static void main(String[] args) {
        int num = 548834;
        int numCopy = num;
        int numCopy2 = num;
        int count = 0;
        int power = 1;
        int sum = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        while (numCopy != 0) {
            power = 1;
            int rem = numCopy % 10; // 3, 5, 1
            for (int i = 0; i < count; i++) {
                power = power * rem;
            }
            sum = sum + power;
            numCopy = numCopy / 10;
        }
        System.out.println(sum);
        if (numCopy2 == sum) {
            System.out.println("ARMSTRONG");
        } else {
            System.out.println("NOT-ARMSTRONG");
        }

    }
}
