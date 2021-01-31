package pl.mr.apigenerator.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "enemies")
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne
    private Hero hero;

    public Enemy(String name, Hero hero) {
        this.name = name;
        this.hero = hero;
    }

    public Enemy() {
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enemy enemy = (Enemy) o;
        return id == enemy.id &&
                Objects.equals(name, enemy.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
