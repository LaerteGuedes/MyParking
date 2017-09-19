package br.com.riscozero.core.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by laerteguedes on 30/08/17.
 */
@Entity
@Table(name = "roles")
public class Role implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
