package com.company;


import java.util.*;

public class Main {
    public static void main(String[] args) {


//        InputStreamReader input = new InputStreamReader(System.in);
//        BufferedReader buffer = new BufferedReader(input);
        // FileInputStream fstream = new FileInputStream("text.txt");
        // BufferedReader buffer = new BufferedReader(new InputStreamReader(fstream));
//1
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] chisla = new int[200005][2];
        for (int i = 0; i < chisla.length; i++) {
            chisla[i][1] = i;
        }
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(chisla, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o2[0], o1[0]);
            }
        });




    }
}

//        int x1,x2,y;
//        for(int i=0;i<n;i++){
//            x1=scanner.nextInt();
//            for(int j=0;j<raz;j++)
//                mas[j][x1]=1;
//        }
//        for(int i=0;i<m;i++){
//            x1=scanner.nextInt();
//            x2=scanner.nextInt();
//            y=scanner.nextInt();
//            for(int j=x1-1;j<x2;j++)
//                mas[y][j]=1;
//        }
//
//        otvet[0][0]=mas[0][0];
//        for(int i=0;i<raz;i++)
//            if(mas[i][0]==1)
//                otvet[0][i]++;
//
//        for(int i=0;i<raz;i++){
//            for(int j=0;j<raz;j++)
//                if(mas[i][j]==1)
//                    otvet[i][j]++;
//
//        }
//
//
//        for(int i=0;i<10;i++) {
//            for (int j = 0; j < 10; j++)
//                System.out.print(mas[i][j]);
//            System.out.println();
//        }


//        int[] one=new int[n+m];
//        int[] nMas=new int[n];
//        int[] mMas=new int[m];
//        int[] answer=new int[m];
//        for(int i=0;i<n+m;i++)
//            one[i]=scanner.nextInt();
//        int temp,nt=0,mt=0;
//        for(int i=0;i<n+m;i++) {
//            temp = scanner.nextInt();
//            if(temp==1) {
//                mMas[mt] = one[i];
//                mt++;
//            }
//            else {
//                nMas[nt] = one[i];
//                nt++;
//            }
//
//        }
//        int L = 0;
//        int R = m - 1;
//        int chislo,tempI=0;
//        for(int i=0;i<n;i++){
//                chislo=nMas[i];
//                L = 0;
//                R = m - 1;
//                temp=1000000000;
//                while (L <= R) {
//                    int k = (L + R) / 2;
//                    mt=mMas[k]-chislo;
//                    if(Math.abs(temp)>Math.abs(mt)) {
//                        temp = mt;
//                        tempI=k;
//                    }
//                    else if(Math.abs(temp)==Math.abs(mt)&&(tempI>k))
//                        tempI=k;
//                    if(mt>0)
//                        R=k-1;
//                    else
//                        L = k + 1;
//                }
//                answer[tempI]++;
//        }

//        System.out.println(Arrays.toString(one));
//        System.out.println(Arrays.toString(nMas));
//        System.out.println(Arrays.toString(mMas));
//
//        for(int i=0;i<m;i++)
//        System.out.print(answer[i]+" ");
