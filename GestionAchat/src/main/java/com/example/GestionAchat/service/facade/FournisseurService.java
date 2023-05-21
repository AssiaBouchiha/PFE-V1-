package com.example.tpcommande.service.facade;


import com.example.tpcommande.bean.Fournisseur;

import java.util.List;

public interface FournisseurService {

    int save(Fournisseur fournisseur);

    int update(Fournisseur fournisseur);

    Fournisseur findByReference(String reference);

    int deleteByReference(String reference);


    List<Fournisseur> findByAchatReference(String reference);


    List<Fournisseur> findAll();

}

