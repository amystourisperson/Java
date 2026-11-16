/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapCollection;

/**
 *
 * @author DAI NGUYEN
 */
public class PhongThiNghiem extends PhongHoc {
    private String chuyenNganh;
    private int sucChua;
    private boolean bonRua;

    public PhongThiNghiem(String maPhong, String dayNha,
                          double dienTich, int soBongDen,
                          String chuyenNganh, int sucChua,
                          boolean bonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.bonRua = bonRua;
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && bonRua;
    }

    @Override
    public String toString() {
        return "Phong thi nghiem: " + super.toString()
                + ", Chuyen nganh: " + chuyenNganh
                + ", Suc chua: " + sucChua
                + ", Bon rua: " + bonRua;
    }
}