package service.imple;

import model.entity.ChucVu;
import model.repository.NameObjectRepository;
import model.repository.imple.ChucVuRepository;
import service.NameObjectService;

import java.util.List;
import java.util.Optional;

public class ChucVuService implements NameObjectService<ChucVu> {

    private final NameObjectRepository<ChucVu> chucVuRepositoryImple;

    public ChucVuService() {
        chucVuRepositoryImple = new ChucVuRepository();
    }

    @Override
    public List<ChucVu> findAllByObject() {
        return chucVuRepositoryImple.findAllByObject();
    }

    @Override
    public boolean save(ChucVu chucVu) {
        Optional<ChucVu> optional = Optional.ofNullable(chucVu);
        if (optional.isPresent()) {
            chucVuRepositoryImple.save(chucVu);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(ChucVu chucVu) {
        chucVuRepositoryImple.update(chucVu);
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public ChucVu findById(Object o) {
        return null;
    }
}
