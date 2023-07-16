package model.repository.imple;

import model.entity.NSX;
import model.repository.NameObjectRepository;

import java.util.ArrayList;
import java.util.List;

public class NSXRepository implements NameObjectRepository<NSX> {
    private final static List<NSX> list = new ArrayList<>();

    static {
        list.add(new NSX(1, "NSX001", "Hà Nội"));
        list.add(new NSX(2, "NSX002", "Hồ Chí Minh"));
        list.add(new NSX(3, "NSX003", "Đà Nẵng"));
        list.add(new NSX(4, "NSX004", "Huế"));
        list.add(new NSX(5, "NSX005", "Hải Phòng"));
        list.add(new NSX(6, "NSX006", "Nha Trang"));
        list.add(new NSX(7, "NSX007", "Cần Thơ"));
        list.add(new NSX(8, "NSX008", "Đà Lạt"));
        list.add(new NSX(9, "NSX009", "Vũng Tàu"));
        list.add(new NSX(10, "NSX010", "Quy Nhơn"));
    }


    @Override
    public List<NSX> findAllByObject() {
        return list;
    }

    @Override
    public boolean save(NSX nsx) {
        return list.add(nsx);
    }

    @Override
    public void update(NSX nsx) {
        int id = nsx.getId() - 1;
        list.set(id, nsx);
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public NSX findById(Object o) {
        return null;
    }

    @Override
    public List<NSX> findByName(String name) {
        return null;
    }
}
