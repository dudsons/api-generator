package pl.mr.apigenerator.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "heroes")
public class Hero {

    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "hero"
    )
    private List<Enemy> enemyList = new ArrayList<>();

    public Hero(String name, List<Enemy> enemyList) {
        this.name = name;
        this.enemyList = enemyList;
    }

    public Hero() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Enemy> getEnemyList() {
        return enemyList;
    }

    public void setEnemyList(List<Enemy> enemyList) {
        this.enemyList = enemyList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return id == hero.id &&
                Objects.equals(name, hero.name) &&
                Objects.equals(enemyList, hero.enemyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, enemyList);
    }
}
