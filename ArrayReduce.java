package chapter06;
import  java.util.Scanner;
public class ArrayReduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        do {
            int[] arrNew = new int[arr.length-1];
            for (int i = 0; i <arr.length-1 ; i++) {
                arrNew[i] = arr[i];
            }
            System.out.println("请输入要删减的索引：");
            int reduceNum = scanner.nextInt();
            arrNew[arrNew.length-1] = reduceNum;
            arr = arrNew;
            if (arr.length==1){
                System.out.println("当前数组只剩下一个元素，不能够在缩减！");
                break;
            }

            for (int i = 0; i < arr.length ; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("是否还要继续删除？(y/n)");
            char key = scanner.next().charAt(0);
            if (key=='n'){
                break;
            }
        }while (true);
        System.out.println("你退出了删减！");
    }
}
