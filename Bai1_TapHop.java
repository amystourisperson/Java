/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapCollection;

/**
 *
 * @author DAI NGUYEN
 */

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1_TapHop {

    // Nhap danh sach so nguyen
    static void nhap(HashSet<Integer> ds, Scanner sc) {
        int n;

        System.out.print("Nhap so luong phan tu: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            int x = sc.nextInt();

            ds.add(x);
        }
    }

    // Xuat danh sach
    static void xuat(HashSet<Integer> ds) {
        System.out.println("Danh sach cac phan tu:");

        for (int x : ds) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    // Tim kiem gia tri
    static void timKiem(HashSet<Integer> ds, int x) {
        if (ds.contains(x)) {
            System.out.println("Tim thay " + x + " trong tap hop!");
        } else {
            System.out.println("Khong tim thay " + x + " trong tap hop!");
        }
    }

    // Kiem tra so nguyen to
    public static boolean laSoNguyenTo(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Xuat cac so nguyen to
    public static void xuatSoNguyenTo(HashSet<Integer> ds) {
        System.out.println("Cac so nguyen to:");

        for (int x : ds) {
            if (laSoNguyenTo(x)) {
                System.out.print(x + " ");
            }
        }

        System.out.println();
    }

    // Sap xep tap hop
    public static void sapXep(HashSet<Integer> ds) {
        ArrayList<Integer> list = new ArrayList<>(ds);

        Collections.sort(list);

        System.out.println("Danh sach sau khi sap xep:");

        for (int x : list) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    // Xoa mot gia tri
    public static void xoa(HashSet<Integer> ds, int x) {
        if (ds.remove(x)) {
            System.out.println("Da xoa " + x);
        } else {
            System.out.println("Khong tim thay " + x + " de xoa!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> ds = new HashSet<>();

        // Nhap danh sach
        nhap(ds, sc);

        // Xuat danh sach
        xuat(ds);

        // Tim kiem
        System.out.print("Nhap gia tri can tim: ");
        int x = sc.nextInt();
        timKiem(ds, x);

        // Xuat so nguyen to
        xuatSoNguyenTo(ds);

        // Sap xep
        sapXep(ds);

        // Xoa gia tri
        System.out.print("Nhap gia tri can xoa: ");
        x = sc.nextInt();
        xoa(ds, x);

        // Xuat lai danh sach
        System.out.println("Danh sach sau khi xoa:");
        xuat(ds);

        sc.close();
    }
}
