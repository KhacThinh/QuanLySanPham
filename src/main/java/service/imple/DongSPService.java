package service.imple;

import model.entity.DongSP;
import model.repository.NameObjectRepository;
import model.repository.imple.DongSPRepository;
import service.NameObjectService;

import java.util.List;
import java.util.Optional;

public class DongSPService implements NameObjectService<DongSP> {

    private final NameObjectRepository<DongSP> dongSPRepository;

    public DongSPService() {
        dongSPRepository = new DongSPRepository();
    }

    @Override
    public List<DongSP> findAllByObject() {
        return dongSPRepository.findAllByObject();
    }

    @Override
    public boolean save(DongSP dongSP) {
        Optional<DongSP> optional = Optional.ofNullable(dongSP);
        if (optional.isPresent()) {
            dongSPRepository.save(dongSP);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(DongSP dongSP) {
        dongSPRepository.update(dongSP);
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
