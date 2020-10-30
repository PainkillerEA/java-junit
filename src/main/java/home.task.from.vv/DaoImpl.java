package home.task.from.vv;

import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao {
    private final List<Entity> people = new ArrayList<>();

    @Override
    public boolean store(Entity entity) {
        return people.add(entity);
    }

    @Override
    public List<Entity> findAll() {
        return people;
    }
}
