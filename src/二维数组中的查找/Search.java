package 二维数组中的查找;

/**
 * 在一个二维数组中，每一行都按照从左到右递增
 * 的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组
 * 和一个整数，判断数组中是否函数该整数。
 */
/**
 * 算法思路，从二维数组的右上角开始比较，若大于右上角的值，则列+1，若小于右上角的值，则行+1
*/
public class Search {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };
        System.out.println(search1(13,a));

    }
//    private static boolean search(int[][] arr,int val){   //右上角开始
//        int a = arr[0].length;  //代表二维数组的列数
//        int b = arr.length;     //代表二维数组的行数
//        int i = 0;
//        int j = a - 1;
//        while (i <= b-1 && j >= 0){
//            if (arr[i][j] == val){
//                return true;
//            }else if (arr[i][j] > val){
//                j--;
//            }else {
//                i++;
//            }
//        }
//        return false;
//    }
    private static boolean search1(int val,int[][] arr){   //右下角开始
        int a = arr.length;  //二维数组的行数
        int b = arr[0].length;  //二维数组的列数
        int i = a - 1;
        int j = 0;
        while (i >= 0 && j < b){
            if (arr[i][j] == val){
                return true;
            }else if (arr[i][j] > val){
                i--;
            }else {
                j++;
            }
        }

        return false;
    }
}
