import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numberSet = new HashSet<>();

        // Nhập danh sách số nguyên
        System.out.println("Nhap danh  (nhập -1 để kết thúc):");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            numberSet.add(input);
        }

        // Xuất danh sách số nguyên
        System.out.println("Danh sách số nguyên:");
        for (int num : numberSet) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Tìm kiếm giá trị
        System.out.print("Nhập giá trị cần tìm: ");
        int searchValue = scanner.nextInt();
        if (numberSet.contains(searchValue)) {
            System.out.println("Giá trị " + searchValue + " được tìm thấy trong tập hợp.");
        } else {
            System.out.println("Giá trị " + searchValue + " không được tìm thấy trong tập hợp.");
        }

        // Xuất các số nguyên tố
        System.out.println("Các số nguyên tố trong tập hợp:");
        for (int num : numberSet) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Sắp xếp tập hợp
        List<Integer> sortedList = new ArrayList<>(numberSet);
        Collections.sort(sortedList);
        System.out.println("Tập hợp sau khi được sắp xếp:");
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Xóa một giá trị bất kỳ
        System.out.print("Nhập giá trị cần xóa: ");
        int deleteValue = scanner.nextInt();
        if (numberSet.remove(deleteValue)) {
            System.out.println("Giá trị " + deleteValue + " đã được xóa khỏi tập hợp.");
        } else {
            System.out.println("Không tìm thấy giá trị " + deleteValue + " trong tập hợp.");
        }
    }

    // Kiểm tra số nguyên tố
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
