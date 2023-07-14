package service.imple;

import model.entity.CuaHang;
import model.repository.NameObjectRepository;
import model.repository.imple.CuaHangRepository;
import service.NameObjectService;

import java.util.List;
import java.util.Optional;

public class CuaHangService implements NameObjectService<CuaHang> {

    private final NameObjectRepository<CuaHang> cuaHangRepository;

    public CuaHangService() {
        cuaHangRepository = new CuaHangRepository();
    }

    @Override
    public List<CuaHang> findAllByObject() {
        return cuaHangRepository.findAllByObject();
    }

    @Override
    public boolean save(CuaHang cuaHang) {
        Optional<CuaHang> optional = Optional.ofNullable(cuaHang);
        if (optional.isPresent()) {
            cuaHangRepository.save(cuaHang);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(CuaHang cuaHang) {
        cuaHangRepository.update(cuaHang);
    }

    @Override
    public boolean delete(Object o) {
        Optional<CuaHang> cuaHang = Optional.ofNullable((CuaHang) o);
        if (cuaHang.isPresent()) {
            cuaHangRepository.delete(cuaHang.get());
            return true;
        }
        return false;
    }

    @Override
    public CuaHang findById(Object o) {
        return cuaHangRepository.findById(o);
    }

    @Override
    public List<CuaHang> findByName(String name) {
        return cuaHangRepository.findByName(name);
    }
}
