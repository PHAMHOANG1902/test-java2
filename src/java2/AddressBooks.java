package java2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBooks {
    private static ArrayList<Contact> addressBook = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("Menu Sổ Địa Chỉ:");
            System.out.println("1. Thêm liên hệ mới");
            System.out.println("2. Tìm kiếm liên hệ theo tên");
            System.out.println("3. Hiển thị tất cả các liên hệ");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Tiêu thụ ký tự newline

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContact();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!. Vui lòng nhập một số từ 1 đến 4.");
            }
        }
    }

    private static void addContact() {
        System.out.println("Nhập thông tin liên hệ:");
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Công ty: ");
        String company = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        String phone = scanner.nextLine();

        Contact newContact = new Contact(name, company, email, phone);
        addressBook.add(newContact);
        System.out.println("Liên hệ đã được thêm thành công.");
    }

    private static void findContact() {
        System.out.print("Nhập tên để tìm kiếm: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Contact contact : addressBook) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Số điện thoại: " + contact.getPhone());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy liên hệ.");
        }
    }

    private static void displayContacts() {
        if (addressBook.isEmpty()) {
            System.out.println("Không có liên hệ nào được tìm thấy.");
        } else {
            System.out.println("Danh sách liên hệ:");
            for (Contact contact : addressBook) {
                System.out.println(contact);
                System.out.println("-----------------------");
            }
        }
    }
}
