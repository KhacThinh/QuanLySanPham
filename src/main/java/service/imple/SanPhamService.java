package service.imple;

import model.entity.SanPham;
import model.repository.NameObjectRepository;
import model.repository.imple.MauSacRepository;
import model.repository.imple.SanPhamRepository;
import service.NameObjectService;

import java.util.List;
import java.util.Optional;

public class SanPhamService implements NameObjectService<SanPham> {

    private final NameObjectRepository<SanPham> sanPhamRepository;

    public SanPhamService() {
        sanPhamRepository = new SanPhamRepository();
    }

    @Override
    public List<SanPham> findAllByObject() {
        return sanPhamRepository.findAllByObject();
    }

    @Override
    public boolean save(SanPham sanPham) {
        Optional<SanPham> optional = Optional.ofNullable(sanPham);
        if (optional.isPresent()) {
            sanPhamRepository.save(sanPham);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(SanPham sanPham) {
        sanPhamRepository.update(sanPham);
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
