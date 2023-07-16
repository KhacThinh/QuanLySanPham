package model.repository.imple;

import model.entity.SanPham;
import model.repository.NameObjectRepository;

import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository implements NameObjectRepository<SanPham> {
    private final static List<SanPham> list = new ArrayList<>();

    static {
        list.add(new SanPham(1, "SP001", "Nồi cơm điện"));
        list.add(new SanPham(2, "SP002", "Bàn ủi"));
        list.add(new SanPham(3, "SP003", "Quạt điện"));
        list.add(new SanPham(4, "SP004", "Đèn bàn"));
        list.add(new SanPham(5, "SP005", "Máy lọc không khí"));
        list.add(new SanPham(6, "SP006", "Ổ cắm điện"));
        list.add(new SanPham(7, "SP007", "Máy hút bụi"));
    }


    @Override
    public List<SanPham> findAllByObject() {
        return list;
    }

    @Override
    public boolean save(SanPham sanPham) {
        return list.add(sanPham);
    }

    @Override
    public void update(SanPham sanPham) {
        int id = sanPham.getId() - 1;
        list.set(id, sanPham);
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public SanPham findById(Object o) {
        return null;
    }

    @Override
    public List<SanPham> findByName(String name) {
        return null;
    }
}
