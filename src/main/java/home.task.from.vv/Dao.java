package home.task.from.vv;

import java.util.List;

public interface Dao {
    boolean store(Entity entity);

    List<Entity> findAll();
}
