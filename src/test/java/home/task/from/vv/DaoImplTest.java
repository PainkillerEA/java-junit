package home.task.from.vv;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.*;

public class DaoImplTest {

    @Test
    public void somePerson() {
        Dao dao = new DaoImpl();
        Entity entity = new Entity("Vasya", 180, 80);
        dao.store(entity);
        Entity actualEntity = dao.findAll().get(0);
        assertEquals(entity, actualEntity);
    }

    @Test
    public void somePeople() {
        Dao dao = new DaoImpl();
        Entity entity1 = new Entity("Petya", 150, 45);
        Entity entity2 = new Entity("Sanek", 160, 45);
        Entity entity3 = new Entity("Tolik", 150, 70);
        dao.store(entity1);
        dao.store(entity2);
        dao.store(entity3);
        List<Entity> expectedEntities = Arrays.asList(entity1, entity2, entity3);
        List<Entity> actualEntities = dao.findAll();
        assertEquals(expectedEntities, actualEntities);
    }

    @Test
    public void testNaPidora() {
        Dao dao = new DaoImpl();
        Entity entity = new Entity("Iluha", 120, 120);
        boolean isStored = dao.store(entity);
        assertTrue(isStored);
        assertTrue(dao.findAll().get(0).isPidor());
    }

    @Test
    public void shouldStoreZhenyaAsPidor() {
        Dao dao = new DaoImpl();
        Entity entity = new Entity("Zhenya", 120, 120);
        dao.store(entity);
        assertTrue(dao.findAll().get(0).isPidor());
    }

    @Test
    public void shouldStoreVovaAsNotPidor() {
        Dao dao = new DaoImpl();
        Entity entity = new Entity("Vova", 120, 120);
        dao.store(entity);
        assertFalse(dao.findAll().get(0).isPidor());
    }

    @Test
    public void testNaPidora4() {
        Dao dao = new DaoImpl();
        Entity entity = new Entity("Artem", 120, 120);
        dao.store(entity);
        assertFalse(dao.findAll().get(0).isPidor());
    }
}
