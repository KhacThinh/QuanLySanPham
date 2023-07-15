package model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChiTietSP {
    private int id;
    private int idSP;
    private int idNsx;
    private int idMauSac;
    private int idDongSP;
    private Date namBH;
    private String moTa;
    private int soLuongTon;
    private double giaNhap;
    private double giaBan;
}
