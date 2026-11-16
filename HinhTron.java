/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapCollection;

/**
 *
 * @author DAI NGUYEN
 */
public class HinhTron {
    private double banKinh;

    // Ham khoi tao khong doi
    public HinhTron() {
        banKinh = 0;
    }

    // Ham khoi tao co doi
    public HinhTron(double r) {
        banKinh = r;
    }

    // Tinh dien tich hinh tron
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    // Tra ve thong tin hinh tron
    @Override
    public String toString() {
        return "Ban kinh: " + banKinh
                + ", Dien tich: " + tinhDienTich();
    }
}