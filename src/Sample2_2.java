import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Sample2_2 {
  public static void main(String[] args) throws IOException {
    System.out.println("請輸入整數");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    if (num == 1) { // 錯誤在於 要大括號 不然 只會執行 if 下面的那一行
      System.out.println("輸入的是1");
      System.out.println("選擇的是1");
    }
    System.out.println("結束處理");
  }
}
