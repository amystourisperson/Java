/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapCollection;

/**
 *
 * @author DAI NGUYEN
 */

import java.util.*;
import java.io.*;

public class TrueLove {

    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();

    static ArrayList<String> dsNhanVien = new ArrayList<>();
    static LinkedHashSet<String> tenSanPham = new LinkedHashSet<>();
    static Queue<String> dsDuLich = new LinkedList<>();
    static ArrayList<KhachHang> dsKhachHang = new ArrayList<>();

    // Lop khach hang
    static class KhachHang implements Serializable {
        String maKH;
        String tenKH;
        double doanhSo;

        public KhachHang(String ma, String ten, double ds) {
            maKH = ma;
            tenKH = ten;
            doanhSo = ds;
        }

        public String toString() {
            return maKH + " - " + tenKH + " - Doanh so: " + doanhSo;
        }
    }

    // Lop loi tu tao
    static class TenRongException extends Exception {
        public TenRongException(String thongBao) {
            super(thongBao);
        }
    }

    // Cach 1: Su dung loi co san cua Java
    static void kiemTraTenHeThong(String ten) {
        if (ten == null || ten.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Ten khong duoc de trong!"
            );
        }
    }

    // Cach 2: Tu tao lop bat loi
    static void kiemTraTenTuTao(String ten)
            throws TenRongException {
        if (ten == null || ten.trim().isEmpty()) {
            throw new TenRongException(
                "Ten nhan vien khong duoc de trong!"
            );
        }
    }

    // Nhap ten va lua chon cach kiem tra
    static String nhapTen() {
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();

        System.out.println("1. Bat loi co san");
        System.out.println("2. Bat loi tu tao");
        System.out.print("Chon cach kiem tra: ");
        int chon = Integer.parseInt(sc.nextLine());

        try {
            if (chon == 1) {
                kiemTraTenHeThong(ten);
            } else {
                kiemTraTenTuTao(ten);
            }

            return ten.trim();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (TenRongException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    // 1. Quan ly nhan vien
    static void themNhanVien() {
        String ten = nhapTen();

        if (ten != null) {
            dsNhanVien.add(ten);
            tenSanPham.add(ten);

            System.out.println("Them nhan vien thanh cong!");
        }
    }

    static void xuatNhanVien() {
        System.out.println("Danh sach nhan vien:");

        for (String ten : dsNhanVien) {
            System.out.println(ten);
        }
    }

    static void chonNhanVienNhanQua() {
        if (dsNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien rong!");
            return;
        }

        int vt = rd.nextInt(dsNhanVien.size());

        System.out.println(
            "Nhan vien nhan qua: " + dsNhanVien.get(vt)
        );
    }

    // 2. Dat ten san pham
    static void chonTenSanPham() {
        if (tenSanPham.isEmpty()) {
            System.out.println("Khong con ten nao de su dung!");
            return;
        }

        ArrayList<String> ds = new ArrayList<>(tenSanPham);

        int vt = rd.nextInt(ds.size());
        String ten = ds.get(vt);

        System.out.println("Ten san pham moi: " + ten);

        // Xoa ten da su dung
        tenSanPham.remove(ten);
    }

    // 3. Tim ten pho bien nhat
    static void timTenPhoBien() {
        if (dsNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien rong!");
            return;
        }

        HashMap<String, Integer> thongKe = new HashMap<>();

        for (String ten : dsNhanVien) {
            if (thongKe.containsKey(ten)) {
                thongKe.put(ten, thongKe.get(ten) + 1);
            } else {
                thongKe.put(ten, 1);
            }
        }

        int max = 0;

        for (String ten : thongKe.keySet()) {
            if (thongKe.get(ten) > max) {
                max = thongKe.get(ten);
            }
        }

        System.out.println("Ten pho bien nhat:");

        for (String ten : thongKe.keySet()) {
            if (thongKe.get(ten) == max) {
                System.out.println(
                    ten + " - " + max + " lan"
                );
            }
        }
    }

    // 4. Dang ky du lich
    static void dangKyDuLich() {
        String ten = nhapTen();

        if (ten != null) {
            dsDuLich.offer(ten);
            System.out.println("Dang ky du lich thanh cong!");
        }
    }

    static void xuLyDangKy() {
        if (dsDuLich.isEmpty()) {
            System.out.println("Chua co nhan vien dang ky!");
            return;
        }

        System.out.println(
            "Nhan vien duoc uu tien: " + dsDuLich.poll()
        );
    }

    static void xuatDangKy() {
        System.out.println("Danh sach dang ky du lich:");

        for (String ten : dsDuLich) {
            System.out.println(ten);
        }
    }

    // 5. Quan ly khach hang
    static void themKhachHang() {
        System.out.print("Nhap ma khach hang: ");
        String ma = sc.nextLine();

        System.out.print("Nhap ten khach hang: ");
        String ten = sc.nextLine();

        System.out.print("Nhap doanh so: ");
        double ds = Double.parseDouble(sc.nextLine());

        dsKhachHang.add(new KhachHang(ma, ten, ds));

        System.out.println("Them khach hang thanh cong!");
    }

    static void suaKhachHang() {
        System.out.print("Nhap ma khach hang can sua: ");
        String ma = sc.nextLine();

        for (KhachHang kh : dsKhachHang) {
            if (kh.maKH.equals(ma)) {
                System.out.print("Nhap ten moi: ");
                kh.tenKH = sc.nextLine();

                System.out.print("Nhap doanh so moi: ");
                kh.doanhSo = Double.parseDouble(sc.nextLine());

                System.out.println("Sua thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay khach hang!");
    }

    static void xoaKhachHang() {
        System.out.print("Nhap ma khach hang can xoa: ");
        String ma = sc.nextLine();

        for (int i = 0; i < dsKhachHang.size(); i++) {
            if (dsKhachHang.get(i).maKH.equals(ma)) {
                dsKhachHang.remove(i);
                System.out.println("Xoa thanh cong!");
                return;
            }
        }

        System.out.println("Khong tim thay khach hang!");
    }

    static void timKhachHang() {
        System.out.print("Nhap ma khach hang can tim: ");
        String ma = sc.nextLine();

        for (KhachHang kh : dsKhachHang) {
            if (kh.maKH.equals(ma)) {
                System.out.println(kh);
                return;
            }
        }

        System.out.println("Khong tim thay khach hang!");
    }

    static void sapXepKhachHang() {
        Collections.sort(dsKhachHang,
            new Comparator<KhachHang>() {
                public int compare(KhachHang a, KhachHang b) {
                    return Double.compare(
                        a.doanhSo, b.doanhSo
                    );
                }
            }
        );

        System.out.println("Da sap xep theo doanh so tang dan!");
        xuatKhachHang();
    }

    static void xuatKhachHang() {
        for (KhachHang kh : dsKhachHang) {
            System.out.println(kh);
        }
    }

    // Luu du lieu vao file
    static void luuFile() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("TrueLove.dat")
            );

            out.writeObject(dsNhanVien);
            out.writeObject(tenSanPham);
            out.writeObject(new LinkedList<>(dsDuLich));
            out.writeObject(dsKhachHang);

            out.close();

            System.out.println("Da luu du lieu vao file!");

        } catch (IOException e) {
            System.out.println("Loi khi luu file: " + e.getMessage());
        }
    }

    // Doc du lieu tu file
    static void docFile() {
        try {
            ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("TrueLove.dat")
            );

            dsNhanVien = (ArrayList<String>) in.readObject();
            tenSanPham = (LinkedHashSet<String>) in.readObject();
            dsDuLich = (Queue<String>) in.readObject();
            dsKhachHang = (ArrayList<KhachHang>) in.readObject();

            in.close();

            System.out.println("Da doc du lieu tu file!");

        } catch (FileNotFoundException e) {
            System.out.println("Chua co file du lieu, bat dau moi!");
        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Khong tim thay lop du lieu!");
        }
    }

    // Menu
    public static void main(String[] args) {
        docFile();

        int chon;

        do {
            System.out.println("\n===== CONG TY TRUELOVE =====");
            System.out.println("1. Quan ly nhan vien");
            System.out.println("2. Dat ten san pham");
            System.out.println("3. Tim ten pho bien");
            System.out.println("4. Dang ky du lich");
            System.out.println("5. Quan ly khach hang");
            System.out.println("0. Thoat va luu du lieu");
            System.out.print("Nhap lua chon: ");

            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.println("1. Them nhan vien");
                    System.out.println("2. Xuat danh sach");
                    System.out.println("3. Chon nguoi nhan qua");
                    System.out.print("Chon: ");

                    int nv = Integer.parseInt(sc.nextLine());

                    if (nv == 1)
                        themNhanVien();
                    else if (nv == 2)
                        xuatNhanVien();
                    else if (nv == 3)
                        chonNhanVienNhanQua();
                    break;

                case 2:
                    chonTenSanPham();
                    break;

                case 3:
                    timTenPhoBien();
                    break;

                case 4:
                    System.out.println("1. Dang ky du lich");
                    System.out.println("2. Xem danh sach dang ky");
                    System.out.println("3. Xu ly nguoi dang ky dau tien");
                    System.out.print("Chon: ");

                    int dl = Integer.parseInt(sc.nextLine());

                    if (dl == 1)
                        dangKyDuLich();
                    else if (dl == 2)
                        xuatDangKy();
                    else if (dl == 3)
                        xuLyDangKy();
                    break;

                case 5:
                    System.out.println("1. Them khach hang");
                    System.out.println("2. Sua khach hang");
                    System.out.println("3. Xoa khach hang");
                    System.out.println("4. Tim khach hang");
                    System.out.println("5. Sap xep theo doanh so");
                    System.out.println("6. Xuat danh sach");
                    System.out.print("Chon: ");

                    int kh = Integer.parseInt(sc.nextLine());

                    if (kh == 1)
                        themKhachHang();
                    else if (kh == 2)
                        suaKhachHang();
                    else if (kh == 3)
                        xoaKhachHang();
                    else if (kh == 4)
                        timKhachHang();
                    else if (kh == 5)
                        sapXepKhachHang();
                    else if (kh == 6)
                        xuatKhachHang();
                    break;

                case 0:
                    luuFile();
                    System.out.println("Ket thuc chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}
