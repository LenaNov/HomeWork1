import java.util.Arrays;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        int[] ar={1,0,1,0,0,0,1,0,1,1};
        zeroOne(ar); //задание 1
        arr100(); //Задание 2
        int[] ar1={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleSix(ar1); //Задание 3
        int[][] ar3={
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        diagonals(ar3); //Задание 4
        int l=5;
        int iV=7;
        System.out.println(Arrays.toString(initialValueArray(l,iV))); //Задание 5
        int[] ar6={4,7,1,3,9,2,3,0,-1,222,8};
        minMax(ar6); //Задание 6
        int[] balMas={2,-2,2,1,2,-2,10,-3};
        System.out.println(findBalance(balMas)); //Задание 7
        int sdvig=-3;
        moveMas(ar6,sdvig); //Задание 8
    }

    public static void zeroOne(int[] mass01) {
        for (int i = 0; i < mass01.length; i++) {
            if (mass01[i] == 0) {
                mass01[i] = 1;
            } else {
                mass01[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mass01));
    }

    public static void arr100() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void doubleSix(int[] d6) {
        for (int i = 0; i < d6.length; i++) {
            if (d6[i] < 6) {
                d6[i] = d6[i]*2;
            }
        }
        System.out.println(Arrays.toString(d6));
    }

    public static void diagonals(int[][] mas5) {
        for (int i = 0; i < mas5.length; i++) {
            mas5[i][i] = 1;
        }
        for (int i = 0; i < mas5.length; i++) {
                int j=mas5.length-i-1;
                mas5[i][j]=1;
        }
        for (int i = 0; i < mas5.length; i++) {
            System.out.println(Arrays.toString(mas5[i]));
        }
    }

    public static int[] initialValueArray(int len, int initialValue) {
        int[] masLen = new int[len];
        for (int i = 0; i < len; i++) {
            masLen[i]=initialValue;
        }
        return masLen;
    }

    public static void minMax(int[] mas6) {
        int min=mas6[0];
        int max=mas6[0];
        for (int element:mas6) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
            System.out.println("Максимальный элемент массива = " + max);
            System.out.println("Минимальный  элемент массива = " + min);
    }

    public static boolean findBalance(int[] mas7) {
        int sumUm=0;
        int sumUv=0;
        for (int element:mas7) {
            sumUm += element;
        }
        for (int i = 0; i < mas7.length; i++) {
            sumUv += mas7[i];
            sumUm -= mas7[i];
            if (sumUm == sumUv) {
                return true;
            }
        }
        return false;
    }
    public static void moveMas(int[] mas8, int n) {
        if (n == 0 || n>mas8.length || -n>mas8.length ) {
            System.out.println("Число сдвига равно нулю или больше длины массива, массив не изменяется");
        } else if (n > 0) { //сдвиг вправо
            for (int x = 0; x < n; x++) {
                int element = mas8[mas8.length - 1];
                for (int i = mas8.length - 1; i > 0; i--) {
                    mas8[i] = mas8[i - 1];
                }
                mas8[0] = element;
            }
        } else { //сдвиг влево
            for (int x = n; x < 0; x++) {
                int element = mas8[0];
                for (int i = 0; i < mas8.length-1; i++) {
                    mas8[i] = mas8[i + 1];
                }
                mas8[mas8.length - 1] = element;
            }
        }
        System.out.println(Arrays.toString(mas8));
    }
}





