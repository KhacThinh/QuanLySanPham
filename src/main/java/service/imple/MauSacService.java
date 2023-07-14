package service.imple;

import model.entity.MauSac;
import model.repository.NameObjectRepository;
import model.repository.imple.ChucVuRepository;
import model.repository.imple.MauSacRepository;
import service.NameObjectService;

import java.util.List;
import java.util.Optional;

public class MauSacService implements NameObjectService<MauSac> {

    private final NameObjectRepository<MauSac> mauSacRepository;

    public MauSacService() {
        mauSacRepository = new MauSacRepository();
    }

    @Override
    public List<MauSac> findAllByObject() {
        return mauSacRepository.findAllByObject();
    }

    @Override
    public boolean save(MauSac mauSac) {
        Optional<MauSac> optional = Optional.ofNullable(mauSac);
        if (optional.isPresent()) {
            mauSacRepository.save(mauSac);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(MauSac mauSac) {
        mauSacRepository.update(mauSac);
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public MauSac findById(Object o) {
        return null;
    }

    @Override
    public List<MauSac> findByName(String name) {
        return null;
    }
}
