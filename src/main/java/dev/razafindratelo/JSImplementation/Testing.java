package mg.training.JSImplementation;

public class Testing {
    public static void main(String[] args) {
        JStable<Integer> example = new JSImplementation<>();
        example.push(1);
        example.push(2);
        example.push(3);
        example.push(4);
        System.out.println(example.toString());
        example.pop();
        System.out.println(example.toString());
        example.unshift(0);
        System.out.println(example.toString());
        int a = example.shift();
        System.out.println(a);
        System.out.println(example.toString());
    }
}
