import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_20 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("請輸入5個人的分數");
        int test[] = new int[5];

        // Read input scores
        for(int i = 0; i < test.length; i++) {
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }

        // Bubble sort implementation
        for(int s = 0; s < test.length-1; s++) {
            for(int t = s+1; t < test.length; t++) {
                if(test[t] > test[s]) {
                    int tmp = test[t];
                    test[t] = test[s];
                    test[s] = tmp;
                }
            }
        }

        // Print sorted scores
        for(int i = 0; i < test.length; i++) {
            System.out.println("第" + (i+1) + "名的分數是" + test[i]);
        }
    }
}
