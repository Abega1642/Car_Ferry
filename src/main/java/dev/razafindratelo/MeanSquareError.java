package mg.training;

public class MeanSquareError {
    public static double solution(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            int diff = arr1[i] - arr2[i];
            sum += (int) Math.pow(diff, 2);
        }
        double len = arr1.length;
        return (sum / len);
    }

    public static void main(String[] args) {
        int[] b1 = {10, 20, 10, 2};
        int[] b2 = {10, 25, 5, -2};
        System.out.println(MeanSquareError.solution(b1, b2));
    }
}
