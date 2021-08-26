package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.OrganizerDao;
import se331.lab.rest.entity.Organizer;

import java.util.List;

@Service
public class OrganizerServiceImpl implements OrganizerService {
    @Autowired
    OrganizerDao organizerDao;

    @Override
    public Integer getOrganizerSize() {
        return organizerDao.getOrganizerSize();
    }

    @Override
    public List<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizerDao.getOrganizers(pageSize,page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizerDao.getOrganizer(id);
    }
}
