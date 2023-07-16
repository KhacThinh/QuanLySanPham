package service.imple;

import model.entity.MauSac;
import model.entity.NSX;
import model.repository.NameObjectRepository;
import model.repository.imple.MauSacRepository;
import model.repository.imple.NSXRepository;
import service.NameObjectService;

import java.util.List;
import java.util.Optional;

public class NSXService implements NameObjectService<NSX> {

    private final NameObjectRepository<NSX> nsxRepository;

    public NSXService() {
        nsxRepository = new NSXRepository();
    }

    @Override
    public List<NSX> findAllByObject() {
        return nsxRepository.findAllByObject();
    }

    @Override
    public boolean save(NSX nsx) {
        Optional<NSX> optional = Optional.ofNullable(nsx);
        if (optional.isPresent()) {
            nsxRepository.save(nsx);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void update(NSX mauSac) {
        nsxRepository.update(mauSac);
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }

    @Override
    public NSX findById(Object o) {
        return null;
    }

    @Override
    public List<NSX> findByName(String name) {
        return null;
    }
}
