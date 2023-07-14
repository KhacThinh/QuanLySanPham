package service.imple;

import model.entity.ChucVu;
import model.entity.KhachHang;
import model.repository.NameObjectRepository;
import model.repository.imple.ChucVuRepository;
import model.repository.imple.KhachHangRepository;
import service.NameObjectService;

import java.util.List;
import java.util.Optional;

public class KhachHangService implements NameObjectService<KhachHang> {

    private final NameObjectRepository<KhachHang> khachHangRepository;

    public KhachHangService() {
        khachHangRepository = new KhachHangRepository();
    }

    @Override
    public List<KhachHang> findAllByObject() {
        return khachHangRepository.findAllByObject();
    }

    @Override
    public boolean save(KhachHang khachHang) {
        Optional<KhachHang> optional = Optional.ofNullable(khachHang);
        if (optional.isPresent()) {
            khachHangRepository.save(khachHang);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(KhachHang khachHang) {
        khachHangRepository.update(khachHang);
    }

    @Override
    public boolean delete(Object o) {
        Optional<KhachHang> khachHang = Optional.ofNullable((KhachHang) o);
        if (khachHang.isPresent()) {
            return khachHangRepository.delete(o);
        }
        return false;
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
