package java_01;

public class quiz6 {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("합: " + sum);
        System.out.println("평균: " + (double)sum/scores.length);

    }
}
