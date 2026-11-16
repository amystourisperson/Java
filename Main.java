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
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        DSHinhTron ds = new DSHinhTron();

        int n;

        System.out.print("Nhap so luong hinh tron: ");
        n = sc.nextInt();

        // Tao danh sach hinh tron voi ban kinh ngau nhien
        for (int i = 0; i < n; i++) {
            double r = 1 + rd.nextDouble() * 9;

            HinhTron h = new HinhTron(r);

            ds.themHinhTron(h);
        }

        // Xuat danh sach hinh tron
        System.out.println("\nDanh sach hinh tron:");

        ds.xuatDanhSach();

        // Xuat so luong hinh tron
        System.out.println("\nSo luong hinh tron: "
                + ds.layKichThuoc());

        // Tinh tong dien tich
        System.out.println("Tong dien tich: "
                + ds.tinhTongDienTich());

        // Tim dien tich lon nhat
        System.out.println("Dien tich lon nhat: "
                + ds.timDienTichLonNhat());

        // Lay hinh tron co dien tich nho nhat
        HinhTron h = ds.layHinhTronNhoNhat();

        if (h != null) {
            System.out.println("Hinh tron co dien tich nho nhat:");
            System.out.println(h);
        }

        sc.close();
    }
}