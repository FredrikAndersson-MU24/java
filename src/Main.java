import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        int[] intArray = {1,2,3};

        String xString = "5";

        int summa = addNumbers(x, y);
        int difference = subtractNumbers(xString, y);

//        System.out.println("summa = " + summa);
//        System.out.println("difference = " + difference);
        System.out.println("intArray innan funktionen= " + Arrays.toString(intArray));
        setNumber(intArray, x);
        System.out.println("intArray innan funktionen= " + Arrays.toString(intArray));

    }

    // accessModifier [kan vara static] returTyp [void, int, float..] namnPåFunktionen(datatypPåParameter namnPåParameter, ...){

    // Kod här

    // }

    public static void setNumber(int[] array, int x){
        int[] intArray2 = array.clone();
        intArray2[1] = x;
        System.out.println("array in function= " + Arrays.toString(intArray2));
    }

    public static int addNumbers(int x, int y){
        return x + y;
    }

    public static int subtractNumbers(String xString, int y){
        int x = Integer.parseInt(xString);
        return x - y;
    }
}