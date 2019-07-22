package 随笔.面试.面经.面经0506_拼多多;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/6 17:19 </p>
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int hp = sca.nextInt();
        int normalAttack = sca.nextInt();
        int bufferAttack = sca.nextInt();
        if (bufferAttack <= 2 * normalAttack) {
            if (hp % normalAttack == 0) {
                System.out.println(hp / normalAttack);
            } else {
                System.out.println((hp / normalAttack) + 1);
            }
        } else {
            int count = 0;
            if (hp <= normalAttack) {
                count++;
            } else {
                count += (hp / bufferAttack) * 2;
                hp -= bufferAttack * (hp / bufferAttack);
                if (hp <= normalAttack && hp > 0) {
                    count += 1;
                } else if (hp > normalAttack) {
                    count += 2;
                }
            }
            System.out.println(count);
        }
    }

}
