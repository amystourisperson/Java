/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapCollection;

/**
 *
 * @author DAI NGUYEN
 */
public class PhongMayTinh extends PhongHoc {
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha,
                        double dienTich, int soBongDen,
                        int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public boolean datChuan() {
        return duAnhSang()
                && soMayTinh > 0
                && dienTich / soMayTinh >= 1.5;
    }

    @Override
    public String toString() {
        return "Phong may tinh: " + super.toString()
                + ", So may tinh: " + soMayTinh;
    }
}
