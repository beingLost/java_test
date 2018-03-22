/*我们想象一下江老板某一天的学习，把复习效率量化成百分比，
        以分钟为标准时间单位，时间是离散的，
        假设每一分钟，江老板的复习效率会刚好下降p（比如p=1，一开始效率是70，下一分钟就是69了），
        他初始有a点学习效率，然后当他学习效率低于w时，
        他就会来一把王者荣耀，花费精确的20分钟提升r的效率，
        询问今天如果他一共复习t分钟，那么总共能复习多少知识。(注：时间离散；学习效率无法降低为负数)
        这分钟复习的知识量=该分钟的效率*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int p=0,
                a=0,
                w=0,
                r=0,
                t=0;
        int sum = 0;
        boolean flag = true;
        int T;

//        T = Integer.parseInt(args[0]);



        Scanner scan = new Scanner(System.in);
        T = scan.nextInt();
        int pos = 1;
        while(T-- != 0 ){
            a = scan.nextInt();
            p = scan.nextInt();
            r = scan.nextInt();
            w = scan.nextInt();
            t = scan.nextInt();

            sum = 0;
            while(flag) {
                if(a < w){
                    int tmp = (w - a) /r;
                    if((w-a)%r > 0)
                        tmp++;
                    t -= 20*tmp;
                    if(t < 0){
                        flag = false;
                        continue;
                    }
                    else{
                        a += tmp*r;
                    }
                }
                if(a < p){
                    int tmp = (p-a) /r;
                    if((p-a)%r > 0)
                        tmp++;
                    t -= 20*tmp;
                    if(t < 0){
                        flag = false;
                        continue;
                    }
                    else{
                        a += tmp*r;
                    }

                }

                int temp = (a - w) / p;
                if(a-temp*p-p >= 0)
                    temp++;
                if (temp > t) {
                    temp = t;
                    flag = false;
                }
//                System.out.println("temp="+temp);
//                sum += temp * a;
                for (int i = 0; i < temp; i++) {
                    sum += a;
                    a -= p;
                }
                t -= temp;
//                if (t > 20) {
//                    t -= 20;
//                    a += r;
//                }
//                else {
//                    flag = false;
//                }
            }
            flag = true;
            System.out.println(sum);
        }


    }
}
