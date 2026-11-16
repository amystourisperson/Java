/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapCollection;

/**
 *
 * @author DAI NGUYEN
 */

import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);

    // Nhap phong hoc
    public static PhongHoc nhapPhong(DSHoc ds) {
        System.out.println("1. Phong ly thuyet");
        System.out.println("2. Phong may tinh");
        System.out.println("3. Phong thi nghiem");
        System.out.print("Chon loai phong: ");
        int loai = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap ma phong: ");
        String ma = sc.nextLine();

        if (ds.timPhong(ma) != null) {
            System.out.println("Ma phong da ton tai!");
            return null;
        }

        System.out.print("Nhap day nha: ");
        String day = sc.nextLine();

        System.out.print("Nhap dien tich: ");
        double dt = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap so bong den: ");
        int bong = Integer.parseInt(sc.nextLine());

        if (loai == 1) {
            System.out.print("Co may chieu (true/false): ");
            boolean mayChieu = Boolean.parseBoolean(sc.nextLine());

            return new PhongLyThuyet(
                    ma, day, dt, bong, mayChieu);

        } else if (loai == 2) {
            System.out.print("Nhap so may tinh: ");
            int soMay = Integer.parseInt(sc.nextLine());

            return new PhongMayTinh(
                    ma, day, dt, bong, soMay);

        } else if (loai == 3) {
            System.out.print("Nhap chuyen nganh: ");
            String chuyenNganh = sc.nextLine();

            System.out.print("Nhap suc chua: ");
            int sucChua = Integer.parseInt(sc.nextLine());

            System.out.print("Co bon rua (true/false): ");
            boolean bonRua = Boolean.parseBoolean(sc.nextLine());

            return new PhongThiNghiem(
                    ma, day, dt, bong,
                    chuyenNganh, sucChua, bonRua);
        }

        System.out.println("Loai phong khong hop le!");
        return null;
    }

    public static void main(String[] args) {
        DSHoc ds = new DSHoc();

        // Khoi tao 3 phong mac dinh
        ds.themPhong(new PhongLyThuyet(
                "LT01", "A", 100, 10, true));

        ds.themPhong(new PhongMayTinh(
                "MT01", "B", 90, 9, 60));

        ds.themPhong(new PhongThiNghiem(
                "TN01", "C", 120, 12,
                "Hoa hoc", 40, true));

        int chon;

        do {
            System.out.println("\n===== QUAN LY PHONG HOC =====");
            System.out.println("1. Them phong hoc");
            System.out.println("2. Tim phong theo ma");
            System.out.println("3. In toan bo danh sach");
            System.out.println("4. In phong dat chuan");
            System.out.println("5. Sap xep tang dan theo day nha");
            System.out.println("6. Sap xep giam dan theo dien tich");
            System.out.println("7. Sap xep tang dan theo so bong den");
            System.out.println("8. Cap nhat so may tinh");
            System.out.println("9. Xoa phong hoc");
            System.out.println("10. In tong so phong");
            System.out.println("11. In phong may tinh co 60 may");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1: {
                    PhongHoc p = nhapPhong(ds);

                    if (p != null) {
                        ds.themPhong(p);
                    }
                    break;
                }

                case 2: {
                    System.out.print("Nhap ma phong can tim: ");
                    String ma = sc.nextLine();

                    PhongHoc p = ds.timPhong(ma);

                    if (p != null) {
                        System.out.println(p);
                    } else {
                        System.out.println("Khong tim thay phong!");
                    }
                    break;
                }

                case 3:
                    ds.inDanhSach();
                    break;

                case 4:
                    ds.inPhongDatChuan();
                    break;

                case 5:
                    ds.sapXepTheoDayNha();
                    ds.inDanhSach();
                    break;

                case 6:
                    ds.sapXepTheoDienTich();
                    ds.inDanhSach();
                    break;

                case 7:
                    ds.sapXepTheoSoBongDen();
                    ds.inDanhSach();
                    break;

                case 8: {
                    System.out.print("Nhap ma phong: ");
                    String ma = sc.nextLine();

                    System.out.print("Nhap so may tinh moi: ");
                    int soMay = Integer.parseInt(sc.nextLine());

                    ds.capNhatSoMay(ma, soMay);
                    break;
                }

                case 9: {
                    System.out.print("Nhap ma phong can xoa: ");
                    String ma = sc.nextLine();

                    System.out.print("Ban co chac chan xoa? (Y/N): ");
                    String xacNhan = sc.nextLine();

                    ds.xoaPhong(
                            ma, xacNhan.equalsIgnoreCase("Y"));
                    break;
                }

                case 10:
                    System.out.println(
                            "Tong so phong: " + ds.tongSoPhong());
                    break;

                case 11:
                    ds.inPhongCo60May();
                    break;

                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}