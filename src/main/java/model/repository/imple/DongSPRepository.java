package model.repository.imple;

import model.entity.DongSP;
import model.repository.NameObjectRepository;

import java.util.ArrayList;
import java.util.List;

public class DongSPRepository implements NameObjectRepository<DongSP> {
    private final static List<DongSP> list = new ArrayList<>();

    static {
        list.add(new DongSP(1, "DSP001", "Giá rẻ"));
        list.add(new DongSP(2, "DSP002", "Bình Thường"));
        list.add(new DongSP(3, "DSP003", "Cao Cấp"));
    }


    @Override
    public List<DongSP> findAllByObject() {
        return list;
    }

    @Override
    public boolean save(DongSP dongSP) {
        return list.add(dongSP);
    }

    @Override
    public void update(DongSP dongSP) {
        int id = dongSP.getId() - 1;
        list.set(id, dongSP);
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public DongSP findById(Object o) {
        return null;
    }

    @Override
    public List<DongSP> findByName(String name) {
        return null;
    }
}
