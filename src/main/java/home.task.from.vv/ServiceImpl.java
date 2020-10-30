package home.task.from.vv;

import java.util.List;

public class ServiceImpl implements Service {
    private final Dao dao;

    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public void addNewItem(Entity Entity) {
        dao.store(Entity);
    }

    @Override
    public List<Entity> findAll() {
        return dao.findAll();
    }
}
