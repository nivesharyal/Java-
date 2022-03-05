package ArrayExample;

public class ArrayEx {
    public void show() {
        int[] arrayOne = {1, 2, 3, 4, 5};
        System.out.println(arrayOne[0]);
        String arrayTwo[] = {"Nivesh", "Pratima"};
        System.out.println(arrayTwo[0]);
        int[] arrayThree = new int[10];
        arrayThree[0] = 10;
        System.out.println(arrayThree[0]);
        for (int i = 0; i < arrayOne.length; i++) {
            //System.out.println(arrayOne[i]);
            System.out.println("The index is " + i + " the value : " + arrayOne[i]);
        }
        for (int i : arrayOne) {
            // String[] array  = new String[2];
            System.out.println(i);
        }
        int[][] arrayFour = {{1, 2, 3}, {3, 4, 5}, {4, 5, 6}};
        {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(arrayFour[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}