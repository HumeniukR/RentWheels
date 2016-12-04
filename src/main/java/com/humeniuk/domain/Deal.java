package com.humeniuk.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by humeniuk on 20.11.2016.
 */
@Entity
@Table(name = "deal", schema = "", catalog = "on_wheels_db")
public class Deal {
    private int idDeal;
    private int idRenter;
    private String message;
    private String status;

    @Basic
    @Column(name = "id_deal", nullable = false, insertable = true, updatable = true)
    public int getIdDeal() {
        return idDeal;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    @Basic
    @Column(name = "id_renter", nullable = false, insertable = true, updatable = true)
    public int getIdRenter() {
        return idRenter;
    }

    public void setIdRenter(int idRenter) {
        this.idRenter = idRenter;
    }

    @Basic
    @Column(name = "message", nullable = false, insertable = true, updatable = true, length = 200)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "status", nullable = false, insertable = true, updatable = true, length = 45)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deal that = (Deal) o;

        if (idDeal != that.idDeal) return false;
        if (idRenter != that.idRenter) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDeal;
        result = 31 * result + idRenter;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    private String id;

    @javax.persistence.Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
