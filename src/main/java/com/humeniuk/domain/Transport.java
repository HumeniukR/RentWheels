package com.humeniuk.domain;

import javax.persistence.*;

/**
 * Created by humeniuk on 20.11.2016.
 */
@Entity
@Table(name = "transport", schema = "", catalog = "on_wheels_db")
public class Transport {
    private int idTransport;
    private String model;
    private Integer prise;
    private String rentTime;
    private String description;
    private String country;
    private String region;
    private String sity;
    private String streetName;
    private Integer streetNumber;
    private Category categoryByIdCategory;
    private Person personByIdPerson;

    @Id
    @Column(name = "id_transport", nullable = false, insertable = true, updatable = true)
    public int getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(int idTransport) {
        this.idTransport = idTransport;
    }

    @Basic
    @Column(name = "model", nullable = false, insertable = true, updatable = true, length = 100)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "prise", nullable = true, insertable = true, updatable = true)
    public Integer getPrise() {
        return prise;
    }

    public void setPrise(Integer prise) {
        this.prise = prise;
    }

    @Basic
    @Column(name = "rent_time", nullable = true, insertable = true, updatable = true, length = 45)
    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }

    @Basic
    @Column(name = "description", nullable = true, insertable = true, updatable = true, length = 200)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "country", nullable = false, insertable = true, updatable = true, length = 100)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "region", nullable = true, insertable = true, updatable = true, length = 100)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "sity", nullable = false, insertable = true, updatable = true, length = 200)
    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    @Basic
    @Column(name = "street_name", nullable = true, insertable = true, updatable = true, length = 100)
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Basic
    @Column(name = "street_number", nullable = true, insertable = true, updatable = true)
    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport that = (Transport) o;

        if (idTransport != that.idTransport) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (prise != null ? !prise.equals(that.prise) : that.prise != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (rentTime != null ? !rentTime.equals(that.rentTime) : that.rentTime != null) return false;
        if (sity != null ? !sity.equals(that.sity) : that.sity != null) return false;
        if (streetName != null ? !streetName.equals(that.streetName) : that.streetName != null) return false;
        if (streetNumber != null ? !streetNumber.equals(that.streetNumber) : that.streetNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTransport;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (prise != null ? prise.hashCode() : 0);
        result = 31 * result + (rentTime != null ? rentTime.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (sity != null ? sity.hashCode() : 0);
        result = 31 * result + (streetName != null ? streetName.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id_category", nullable = false)
    public Category getCategoryByIdCategory() {
        return categoryByIdCategory;
    }

    public void setCategoryByIdCategory(Category categoryByIdCategory) {
        this.categoryByIdCategory = categoryByIdCategory;
    }

    @ManyToOne
    @JoinColumn(name = "id_person", referencedColumnName = "id_person", nullable = false)
    public Person getPersonByIdPerson() {
        return personByIdPerson;
    }

    public void setPersonByIdPerson(Person personByIdPerson) {
        this.personByIdPerson = personByIdPerson;
    }
}
