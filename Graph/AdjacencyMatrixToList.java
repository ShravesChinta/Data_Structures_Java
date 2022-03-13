import java.util.*;

public class AdjacencyMatrixToList {
    public static void main(String[] args) {

        int[][] AdjacencyArray = { { 0, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 1 }, { 1, 0, 1, 0 } };
        AdMatrixtoList(AdjacencyArray);
    }

    public static void AdMatrixtoList(int[][] a) {
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < a[0].length; i++) {
            array.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == 1)
                    array.get(i).add(j);
            }
        }

        for (int i = 0; i < a[0].length; i++) {
            System.out.println(i + ":" + array.get(i));
        }
    }
}