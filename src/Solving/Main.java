package Solving;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                int H = Integer.parseInt(st.nextToken());
                int M = Integer.parseInt(st.nextToken());

                StringBuilder sb = new StringBuilder();

                if(M < 45) {
                    if(H == 0){
                        H = 23;
                        sb.append(H).append(' ');
                    } else {
                        H--;
                        sb.append(H).append(' ');
                    }
                    sb.append(M = 60 - (45 - M));
                }
                else {
                    sb.append(H).append(' ').append(M - 45);
                }

                System.out.println(sb);
            }
        }
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            String b = sc.next();
//            String[] bAr = b.split("");
//
//            int j = 0;
//            int result = 0;
//
//            int[] ibAr = new int[bAr.length];
//            for (int i=0; i < bAr.length; i++) {
//                ibAr[i] = Integer.parseInt(bAr[i]);
//            }
//
//            for(int i=(ibAr.length-1); i>=0; i--){
//                int pow = (int) Math.pow(10, ((ibAr.length-1)-i));
//                j = a * (ibAr[i] * pow);
//                System.out.println(a * ibAr[i]);
//                result += j;
//            }
//            System.out.println(result);

//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();        // 123
//        String b = sc.nextLine();        // 445
//        int aNum = Integer.parseInt(a);
//        // int bNum = Integer.parseInt(b);
//        int[] arrB = new int[b.length()];
//
//        if ((a.length() == 3) && (b.length() == 3)) {
//            for (int i = 0; i < b.length(); i++) arrB[i] = b.charAt(i) - '0';
//
//            int depth1 = aNum * arrB[2];
//            String strDepth1 = depth1 + "";
//            int[] arrDepth1 = new int[strDepth1.length()];
//            for (int i = 0; i < strDepth1.length(); i++) arrDepth1[i] = strDepth1.charAt(i) - '0';
//
//            int depth2 = aNum * arrB[1];
//            String strDepth2 = depth2 + "";
//            int[] arrDepth2 = new int[(depth2 + "").length()];
//            for (int i = 0; i < strDepth2.length(); i++) arrDepth2[i] = strDepth2.charAt(i) - '0';
//
//            int depth3 = aNum * arrB[0];
//            String strDepth3 = depth3 + "";
//            int[] arrDepth3 = new int[(depth3 + "").length()];
//            for (int i = 0; i < strDepth3.length(); i++) arrDepth3[i] = strDepth3.charAt(i) - '0';
//
//            int result = aNum * Integer.parseInt(b);
//            String strResult = result + "";
//            int[] arrResult = new int[(result + "").length()];
//            for (int i = 0; i < strResult.length(); i++) arrResult[i] = strResult.charAt(i) - '0';
//
//            System.out.println(result);
//            System.out.println(depth1);
//            System.out.println(depth2);
//            System.out.println(depth3);
//        Scanner in = new Scanner(System.in);
//         int a = in.nextInt();
//         String b = in.next();
//
//         in.close();
//
//        System.out.println(a * (b.charAt(2) - '0'));
//        System.out.println(a * (b.charAt(1) - '0'));
//        System.out.println(a * (b.charAt(0) - '0'));
//        System.out.println(a * Integer.parseInt(b));
//        import java.io.BufferedReader;



