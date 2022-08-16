package z.random.demo01;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = r.nextInt(100) + 1;
        System.out.println("请输入你猜测的数字:");
        int j = 0;
        for (int i = 1; i < 6; i++) {
            j ++;
            int scannerNum = sc.nextInt();
            if(scannerNum > randomNum){
                if(j < 5) {
                    System.out.println("太大了，请重试");
                }else{
                    System.out.println("很遗憾，游戏失败");
                }
            }else if(scannerNum < randomNum){
                if(j < 5){
                System.out.println("太小了，请重试");
                }else{
                    System.out.println("很遗憾，游戏失败");
                }
            }else{
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}

