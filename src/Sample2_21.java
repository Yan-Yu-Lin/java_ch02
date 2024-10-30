import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Sample2_21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");
        Integer test[] = new Integer[5];

        // Read input scores
        for(int i = 0; i < test.length; i++) {
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }

        // Sort in reverse order
        Arrays.sort(test, Collections.reverseOrder());

        // Print sorted scores
        for(int i = 0; i < test.length; i++) {
            System.out.println("第" + (i+1) + "名的分數是" + test[i]);
        }
    }
}
