package model.repository.imple;

import model.entity.MauSac;
import model.repository.NameObjectRepository;
import java.util.ArrayList;
import java.util.List;

public class MauSacRepository implements NameObjectRepository<MauSac> {
    private final static List<MauSac> list = new ArrayList<>();

    static {
        list.add(new MauSac(1, "#FF0000", "Đỏ"));
        list.add(new MauSac(2, "#00FF00", "Xanh lá"));
        list.add(new MauSac(3, "#0000FF", "Xanh dương"));
        list.add(new MauSac(4, "#FFFF00", "Vàng"));
        list.add(new MauSac(5, "#FF00FF", "Hồng"));
        list.add(new MauSac(6, "#00FFFF", "Xanh ngọc"));
        list.add(new MauSac(7, "#FFFFFF", "Trắng"));
    }


    @Override
    public List<MauSac> findAllByObject() {
        return list;
    }

    @Override
    public boolean save(MauSac mauSac) {
        return list.add(mauSac);
    }

    @Override
    public void update(MauSac mauSac) {
        int id = mauSac.getId() - 1;
        list.set(id, mauSac);
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public MauSac findById(Object o) {
        return null;
    }
}
