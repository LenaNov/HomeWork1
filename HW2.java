import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class HW2 {
    public static class MyArraySizeException extends RuntimeException{
        private String textEx;
        MyArraySizeException(String txt) {
            textEx=txt;
            System.out.println(textEx);
        }
    }
    public static class MyArrayDataException extends ArrayStoreException{
        private String textEx;
        MyArrayDataException(String txt) {
            textEx=txt;
            System.out.println(textEx);
        }
    }

    public static void main (String[] args) {
        String[][] myArray={{"13","35","41","12"},{"4","5"},{"1-","st","13","50"},{"2","7","11"}};
        myArray4x4(myArray);
        System.out.println("I'm still alive");
        myArrayToInt(myArray);
        System.out.println("I'm finishing my work");
    }

    public static void myArray4x4 (String[][] inpArray) throws MyArraySizeException {
        int rows;
        int cols;
        String errText;
        rows = inpArray.length;
            if (rows != 4) {
                errText = "Количество строк массива "+rows+ ", неверно, должно быть 4";
                throw new MyArraySizeException(errText);
            } else {
                for (int i = 1; i <= rows; i++) {
                   cols = inpArray[i].length;
                   if (cols !=4) {
                     errText = "Количество столбцов " +i+ " строки массива = "+cols+ ", это неверно, должно быть 4";
                     throw new MyArraySizeException(errText);
                   }
                }
            }
    }

    public static void myArrayToInt (String[][] inpArray) throws MyArrayDataException {
        int[][] numArray = new int[4][4];
        int num;
        int sum=0;
        String errText;
        for (int i=1; i<=4; i++) {
                for (int j=1; j<=4; j++) {
                    errText = "Непреобразуемый/отсутствует элемент в столбце "+j+"строки номер "+i;
                    numArray[i][j]=parseInt(inpArray[i][j]);
                    sum=sum+numArray[i][j];
                    throw new MyArrayDataException(errText);
                }
        }
        System.out.println("Общая сумма элементов массива 4х4 равна " +sum);
    }


}
