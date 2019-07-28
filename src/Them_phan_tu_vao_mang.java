import java.util.Scanner;
public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        System.out.println("Nhập giá trị muốn thêm: ");
        int x= sr.nextInt();
        System.out.println("Nhập vị trí muốn đến: ");
        int index=sr.nextInt();
        int []arr={0,4,6,7,8};
        try{
            System.out.println("Mản hiện tại là: ");
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }
            int [] temp = new int[arr.length+1];
            if (index==0){
                temp[index]=x;
            }else {
                for (int i=0;i<temp.length;i++){
                    if (i<index){
                        temp[i]=arr[i];
                    }else if (i>index){
                        temp[i]=arr[i-1];
                    }else {
                        temp[i]=x;
                    }
                }
            }
            System.out.println();
            System.out.println("Mảng sau khi thêm là :");
            for (int i=0;i<temp.length;i++){
                System.out.println(temp[i]+" ");
            }
        }catch (Exception e){
            System.out.println("Không có vị trí "+index+" để chèn");
        }

    }
}
