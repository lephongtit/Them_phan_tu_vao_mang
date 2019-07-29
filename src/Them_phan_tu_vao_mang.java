import java.util.Scanner;
public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Nhập vị trí muốn đến: ");
        int index = sr.nextInt();
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        int indexArr = 5;
        if (index>1&& index<arr.length) {
            System.out.print("Nhập giá trị muốn thêm: ");
            int x = sr.nextInt();

            System.out.print("Mảng ban đầu là: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            for (int i = indexArr; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            System.out.println();
            System.out.print("Mảng sau khi là: ");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }else {
            System.out.println("Vị trí không hợp lệ!");
        }
    }
}
