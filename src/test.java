import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        int[] copy = arr.clone();
        arr[0] = 0;
        System.out.println(Arrays.toString(copy));
    }
}
