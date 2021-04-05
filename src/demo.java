import java.sql.SQLOutput;
import java.util.Scanner;
public class demo {
    static void menu(Scanner scanner, int arr[]){
        while (true){
            System.out.println("chọn menu 1.Thêm \n 2.hiển thị mảng \n 3.thoát");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    addArr(scanner,arr);
                    break;
                case 2:
                    getArr(arr);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
    static void addArr(Scanner scanner,int arr[]){
        System.out.println("Phần tử muốn thêm là:");
        int x = scanner.nextInt();
        int i;
        do {
            System.out.println("Vào vị trí thứ:");
             i = scanner.nextInt();
             if((i<0) || (i>arr.length-1)){
                 System.out.println("i phải nằm trong khoảng từ 0 đến"+arr.length);
             }
        }while ((i<0) || (i>arr.length-1));
        arr[i]=x;
        System.out.println("đã thêm "+x+" vào vị trí thứ "+i);

    }
    static void getArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println("Vị trí thứ "+i+" là "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Mời nhập số lượng phần tử trong mảng: ");
            n = scanner.nextInt();
            if(n<1){
                System.out.println("số lượng phải lớn hơn 1");
            }
        }while (n<1);
        int arr[] =new int[n];
        menu(scanner,arr);




    }
}
