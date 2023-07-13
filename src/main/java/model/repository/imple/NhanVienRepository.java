package model.repository.imple;

import model.entity.NhanVien;
import model.repository.NameObjectRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NhanVienRepository implements NameObjectRepository<NhanVien> {

    private final static List<NhanVien> list = new ArrayList<>();

    static {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            list.add(new NhanVien(1, "NV001", "Nguyen", "Van", "Hoang", true, dateFormat.parse("01/01/1990"), "123 ABC Street", "0123456789", "123456", 1, 1, 1, true));
            list.add(new NhanVien(2, "NV002", "Tran", "Thi", "Phuong", false, dateFormat.parse("02/02/1991"), "456 XYZ Street", "0987654321", "654321", 1, 2, 1, true));
            list.add(new NhanVien(3, "NV003", "Le", "Hoang", "Tuan", true, dateFormat.parse("03/03/1992"), "789 QWE Street", "0456123789", "987654", 2, 1, 2, true));
            list.add(new NhanVien(4, "NV004", "Pham", "Van", "Khanh", true, dateFormat.parse("04/04/1993"), "321 ASD Street", "0789321654", "789123", 2, 2, 2, true));
            list.add(new NhanVien(5, "NV005", "Hoang", "Thi", "Ngoc", false, dateFormat.parse("05/05/1994"), "654 ZXC Street", "0654789321", "456789", 3, 1, 1, true));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<NhanVien> findAllByObject() {
        return list
                .stream()
                .filter(t -> t.isTrangThai() == true)
                .collect(Collectors.toList());
    }

    @Override
    public boolean save(NhanVien nhanVien) {
        return list.add(nhanVien);
    }

    @Override
    public void update(NhanVien nhanVien) {
        int id = nhanVien.getId() - 1;
        list.set(id, nhanVien);
    }

    @Override
    public boolean delete(Object o) {
        NhanVien nhanVien = (NhanVien) o;
        list.set(nhanVien.getId() - 1, nhanVien);
        return true;
    }

    @Override
    public NhanVien findById(Object o) {
        return null;
    }
}
