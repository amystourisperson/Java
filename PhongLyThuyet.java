/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTapCollection;

/**
 *
 * @author DAI NGUYEN
 */
public class PhongLyThuyet extends PhongHoc {
    private boolean mayChieu;

    public PhongLyThuyet(String maPhong, String dayNha,
                         double dienTich, int soBongDen,
                         boolean mayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayChieu = mayChieu;
    }

    @Override
    public boolean datChuan() {
        return duAnhSang() && mayChieu;
    }

    @Override
    public String toString() {
        return "Phong ly thuyet: " + super.toString()
                + ", May chieu: " + mayChieu;
    }
}