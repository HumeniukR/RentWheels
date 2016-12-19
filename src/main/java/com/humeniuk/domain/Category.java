package com.humeniuk.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "category")
//@NamedQuery(name = "listOfCategories", query = "SELECT name FROM category")
public class Category {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_category")
    private long idCategory;

    @Column(name = "name")
    private String name;

}
