package home.task.from.vv;

import java.util.HashSet;
import java.util.Set;

public class Entity {

    private static final Set<String> PIDORS_SET = new HashSet<>();

    static {
        PIDORS_SET.add("Iluha");
        PIDORS_SET.add("Zhenya");
    }

    private String name;
    private Integer height;
    private Integer weight;

    public Entity(String name, Integer height, Integer weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWeight() {
        return weight;
    }

    public boolean isPidor() {
        return PIDORS_SET.contains(name);
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

}
