package pl.mr.apigenerator.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "heroes")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "hero")
    private Set<Enemy> enemyList;

    public Hero(String name, Set<Enemy> enemyList) {
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

    public Set<Enemy> getEnemyList() {
        return enemyList;
    }

    public void setEnemyList(Set<Enemy> enemyList) {
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
