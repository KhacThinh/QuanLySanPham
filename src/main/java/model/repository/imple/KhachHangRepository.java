package model.repository.imple;

import model.entity.ChucVu;
import model.entity.KhachHang;
import model.repository.NameObjectRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class KhachHangRepository implements NameObjectRepository<KhachHang> {
    private final static List<KhachHang> list = new ArrayList<>();

    static {
        list.add(new KhachHang(1, "KH001", "Nguyen", "Van", "Hoang", new Date(), "0123456789", "123 ABC Street, Ho Chi Minh City", "Ho Chi Minh City", "Việt Nam", "123456"));
        list.add(new KhachHang(2, "KH002", "Tran", "Thi", "Phuong", new Date(), "0987654321", "456 XYZ Street, Hanoi", "Hanoi", "Việt Nam", "654321"));
        list.add(new KhachHang(3, "KH003", "Le", "Hoang", "Tuan", new Date(), "0456123789", "789 QWE Street, Da Nang", "Da Nang", "Philippines", "987654"));
        list.add(new KhachHang(4, "KH004", "Pham", "Van", "Khanh", new Date(), "0789321654", "321 ASD Street, Can Tho", "Can Tho", "Việt Nam", "789123"));
        list.add(new KhachHang(5, "KH005", "Hoang", "Thi", "Ngoc", new Date(), "0654789321", "654 ZXC Street, Vung Tau", "Vung Tau", "Campuchia", "456789"));
    }


    @Override
    public List<KhachHang> findAllByObject() {
        return list
                .stream()
                .filter(t -> t.isTrangThai() == true)
                .collect(Collectors.toList());
    }

    @Override
    public boolean save(KhachHang khachHang) {
        return list.add(khachHang);
    }

    @Override
    public void update(KhachHang khachHang) {
        int id = khachHang.getId() - 1;
        list.set(id, khachHang);
    }

    @Override
    public boolean delete(Object o) {
        KhachHang khachHang = (KhachHang) o;
        list.set(khachHang.getId() - 1, khachHang);
        return true;
    }

    @Override
    public KhachHang findById(Object o) {
        return null;
    }

    @Override
    public List<KhachHang> findByName(String name) {
        return null;
    }
}
