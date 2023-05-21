package com.example.tpcommande.dao;

import com.example.tpcommande.bean.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FournisseurDao extends JpaRepository<Fournisseur,Long> {

    Fournisseur findByReference(String reference);

    int deleteByReference(String reference);

    List<Fournisseur> findByAchatReference(String reference);

}
