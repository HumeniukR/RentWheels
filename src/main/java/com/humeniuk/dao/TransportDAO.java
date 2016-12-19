package com.humeniuk.dao;

import com.humeniuk.domain.Transport;

import java.util.List;

public interface TransportDAO {
    List<Transport> getTransportByCategoryId(int IdCategory);
    List<Transport> getTransportByPersonId(int IdPerson);
    TransportDAO getTransportById();
}
