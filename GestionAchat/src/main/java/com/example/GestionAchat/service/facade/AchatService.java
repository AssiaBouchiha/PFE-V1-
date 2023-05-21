package com.example.tpcommande.service.facade;

import com.example.tpcommande.bean.Achat;

import java.util.List;

public interface AchatService {


    int save(Achat achat);
     int update(Achat achat);
    Achat findByReference(String reference);

    int deleteByReference(String reference);

    int deleteByFournisseurReference(String reference);
    List<Achat> findByMontantAchatLessThan(double montantAchat);

    List<Achat> findByMontantAchatGreaterThan(double montantAchat);

    List<Achat> findAll();
}
