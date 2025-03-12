package model.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

    // Version Serializable
    @Serial
    private static final long serialVersionUID = 1L;

    // Attributes
    private Integer id;
    private String name;

    // Constructor empty
    public Department() {
    }

    // Constructor with arguments
    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // HashCode and Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    // ToString
    @Override
    public String toString() {
        return "Department {" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
