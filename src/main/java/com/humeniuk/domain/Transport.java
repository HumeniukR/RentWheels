package com.humeniuk.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "transport")
@Data
public class Transport {
    @Id
    @GeneratedValue
    @Column(name = "id_transport")
    private int idTransport;
    @Column(name = "model")
    private String model;
    @Column(name = "prise")
    private Integer prise;
    @Column(name = "rentTime")
    private String rentTime;
    @Column(name = "description")
    private String description;
    @Column(name = "country")
    private String country;
    @Column(name = "region")
    private String region;
    @Column(name = "sity")
    private String sity;
    @Column(name = "streetName")
    private String streetName;
    @Column(name = "streetNumber")
    private Integer streetNumber;

}
