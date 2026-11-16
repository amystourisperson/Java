/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapCollection;

/**
 *
 * @author DAI NGUYEN
 */
import java.util.ArrayList;

public class DSHinhTron {
    private ArrayList<HinhTron> ds;

    // Ham khoi tao
    public DSHinhTron() {
        ds = new ArrayList<>();
    }

    // Them mot hinh tron vao danh sach
    public void themHinhTron(HinhTron h) {
        ds.add(h);
    }

    // Lay so luong hinh tron
    public int layKichThuoc() {
        return ds.size();
    }

    // Lay hinh tron tai vi tri vt
    public HinhTron layHinhTron(int vt) {
        return ds.get(vt);
    }

    // Gan hinh tron tai vi tri vt
    public void ganHinhTron(int vt, HinhTron h) {
        ds.set(vt, h);
    }

    // Tinh tong dien tich cac hinh tron
    public double tinhTongDienTich() {
        double tong = 0;

        for (HinhTron h : ds) {
            tong += h.tinhDienTich();
        }

        return tong;
    }

    // Tim dien tich lon nhat
    public double timDienTichLonNhat() {
        if (ds.size() == 0)
            return 0;

        double max = ds.get(0).tinhDienTich();

        for (HinhTron h : ds) {
            if (h.tinhDienTich() > max) {
                max = h.tinhDienTich();
            }
        }

        return max;
    }

    // Lay hinh tron co dien tich nho nhat
    public HinhTron layHinhTronNhoNhat() {
        if (ds.size() == 0)
            return null;

        HinhTron min = ds.get(0);

        for (HinhTron h : ds) {
            if (h.tinhDienTich() < min.tinhDienTich()) {
                min = h;
            }
        }

        return min;
    }

    // Xuat danh sach hinh tron
    public void xuatDanhSach() {
        for (HinhTron h : ds) {
            System.out.println(h);
        }
    }
}