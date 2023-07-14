package model.repository.imple;

import model.entity.ChucVu;
import model.repository.NameObjectRepository;

import java.util.ArrayList;
import java.util.List;

public class ChucVuRepository implements NameObjectRepository<ChucVu> {

    private final static List<ChucVu> list = new ArrayList<>();

    public ChucVuRepository() {
    }

    static {
        list.add(new ChucVu(1, "CV1", "Nhân Viên"));
        list.add(new ChucVu(2, "CV2", "Trưởng Phòng"));
        list.add(new ChucVu(3, "CV3", "Kế Toán"));
    }


    @Override
    public List<ChucVu> findAllByObject() {
        return list;
    }

    @Override
    public boolean save(ChucVu chucVu) {
        return list.add(chucVu);
    }

    @Override
    public void update(ChucVu chucVu) {
        int id = chucVu.getId() - 1;
        list.set(id, chucVu);
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public ChucVu findById(Object o) {
        return null;
    }

    @Override
    public List<ChucVu> findByName(String name) {
        return null;
    }
}
