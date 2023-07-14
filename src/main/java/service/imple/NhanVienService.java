package service.imple;


import model.entity.NhanVien;
import model.repository.NameObjectRepository;
import model.repository.imple.MauSacRepository;
import model.repository.imple.NhanVienRepository;
import service.NameObjectService;

import java.util.List;
import java.util.Optional;

public class NhanVienService implements NameObjectService<NhanVien> {

    private final NameObjectRepository<NhanVien> nhanVienRepository;

    public NhanVienService() {
        nhanVienRepository = new NhanVienRepository();
    }

    @Override
    public List<NhanVien> findAllByObject() {
        return nhanVienRepository.findAllByObject();
    }

    @Override
    public boolean save(NhanVien nhanVien) {
        Optional<NhanVien> optional = Optional.ofNullable(nhanVien);
        if (optional.isPresent()) {
            nhanVienRepository.save(nhanVien);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(NhanVien nhanVien) {
        nhanVienRepository.update(nhanVien);
    }

    @Override
    public boolean delete(Object o) {
        NhanVien nhanVien = (NhanVien) o;
        if (nhanVien != null) {
            return nhanVienRepository.delete(nhanVien);
        }
        return false;
    }

    @Override
    public NhanVien findById(Object o) {
        return null;
    }

    @Override
    public List<NhanVien> findByName(String name) {
        return null;
    }
}
