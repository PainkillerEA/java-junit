package home.task.from.vv;

import java.util.List;

public interface Dao {
    boolean store(Entity entity);
//lox pidr 123456789
    List<Entity> findAll();
}
