
import java.util.Scanner;

public class another {

    public static void main(String[] args) {
        char A[]=new char[26];
        char a[]=new char[26];
        int  sum[] = new int[26];
        A[0]='A';
        a[0]='a';
        for(int i=1;i < 26;i++) {
            A[i] = (char) (A[0] + i);
            a[i] = (char)(a[0]+i);
        }

        int T;
        Scanner scan = new Scanner(System.in);
        T = Integer.parseInt(scan.nextLine());
        while(T-- != 0){
            for(int i=0;i<26;i++)
                sum[i]=0;
            String s = scan.nextLine();
//            System.out.println("S="+s);
            for(int i = 0; i < s.length(); i++){
                for(int j = 0; j < 26; j++){
//                    System.out.println(s.charAt(i)+" "+A[j]);
                    if(s.charAt(i)==A[j]||s.charAt(i)==a[j]){
//                        System.out.println(111);
                        sum[j]++;
                        continue;
                    }
                }
            }
            int pos = 0;
            for(;pos<26;pos++){
                if(sum[pos]!=0)
                    break;
            }
            System.out.print(sum[pos++]);
            for(;pos<26;pos++){
                if(sum[pos]==0)
                    continue;
                System.out.print(" "+sum[pos]);
            }
            System.out.println("");
        }

    }

}
