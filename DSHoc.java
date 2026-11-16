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
import java.util.Collections;
import java.util.Comparator;

public class DSHoc {
    private ArrayList<PhongHoc> ds;

    public DSHoc() {
        ds = new ArrayList<>();
    }

    // Tim phong theo ma
    public PhongHoc timPhong(String ma) {
        for (PhongHoc p : ds) {
            if (p.getMaPhong().equalsIgnoreCase(ma)) {
                return p;
            }
        }
        return null;
    }

    // Them phong hoc
    public void themPhong(PhongHoc p) {
        if (timPhong(p.getMaPhong()) == null) {
            ds.add(p);
            System.out.println("Them phong thanh cong!");
        } else {
            System.out.println("Ma phong da ton tai!");
        }
    }

    // In danh sach phong hoc
    public void inDanhSach() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }

        for (PhongHoc p : ds) {
            System.out.println(p);
        }
    }

    // In phong dat chuan
    public void inPhongDatChuan() {
        boolean timThay = false;

        for (PhongHoc p : ds) {
            if (p.datChuan()) {
                System.out.println(p);
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong co phong dat chuan!");
        }
    }

    // Sap xep tang dan theo day nha
    public void sapXepTheoDayNha() {
        Collections.sort(ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc a, PhongHoc b) {
                return a.getDayNha().compareToIgnoreCase(
                        b.getDayNha());
            }
        });
    }

    // Sap xep giam dan theo dien tich
    public void sapXepTheoDienTich() {
        Collections.sort(ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc a, PhongHoc b) {
                return Double.compare(
                        b.getDienTich(), a.getDienTich());
            }
        });
    }

    // Sap xep tang dan theo so bong den
    public void sapXepTheoSoBongDen() {
        Collections.sort(ds, new Comparator<PhongHoc>() {
            @Override
            public int compare(PhongHoc a, PhongHoc b) {
                return Integer.compare(
                        a.getSoBongDen(), b.getSoBongDen());
            }
        });
    }

    // Cap nhat so may tinh
    public void capNhatSoMay(String ma, int soMay) {
        PhongHoc p = timPhong(ma);

        if (p == null) {
            System.out.println("Khong tim thay phong!");
        } else if (p instanceof PhongMayTinh) {
            PhongMayTinh pm = (PhongMayTinh) p;
            pm.setSoMayTinh(soMay);
            System.out.println("Cap nhat thanh cong!");
        } else {
            System.out.println("Day khong phai phong may tinh!");
        }
    }

    // Xoa phong hoc
    public void xoaPhong(String ma, boolean xacNhan) {
        PhongHoc p = timPhong(ma);

        if (p == null) {
            System.out.println("Khong tim thay phong!");
        } else if (xacNhan) {
            ds.remove(p);
            System.out.println("Da xoa phong hoc!");
        } else {
            System.out.println("Da huy thao tac xoa!");
        }
    }

    // Dem tong so phong
    public int tongSoPhong() {
        return ds.size();
    }

    // In phong may tinh co 60 may
    public void inPhongCo60May() {
        boolean timThay = false;

        for (PhongHoc p : ds) {
            if (p instanceof PhongMayTinh) {
                PhongMayTinh pm = (PhongMayTinh) p;

                if (pm.getSoMayTinh() == 60) {
                    System.out.println(pm);
                    timThay = true;
                }
            }
        }

        if (!timThay) {
            System.out.println("Khong co phong may tinh co 60 may!");
        }
    }
}