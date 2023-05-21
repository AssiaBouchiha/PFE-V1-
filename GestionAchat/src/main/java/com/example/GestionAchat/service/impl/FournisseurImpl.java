package com.example.tpcommande.service.impl;

import com.example.tpcommande.bean.Fournisseur;
import com.example.tpcommande.dao.FournisseurDao;
import com.example.tpcommande.service.facade.AchatService;
import com.example.tpcommande.service.facade.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class FournisseurImpl implements FournisseurService {

    @Autowired
    private FournisseurDao fournisseurDao;

    @Autowired
    private AchatService achatService;

    @Override
    public int save(Fournisseur fournisseur) {
        if (findByReference(fournisseur.getReference()) !=null){
            return -1;
        }
        fournisseurDao.save(fournisseur);
        return 1;
    }

    @Override
    public int update(Fournisseur fournisseur) {

        if (findByReference(fournisseur.getReference()) ==null){
            return -1;
        }
        fournisseurDao.save(fournisseur);
        return 1;

    }

    @Override
    public Fournisseur findByReference(String reference) {
        return fournisseurDao.findByReference(reference);
    }

    @Override
    @Transactional
    public int deleteByReference(String reference) {
        if (findByReference(reference) ==null){
            return -1;
        }
       int res1 = fournisseurDao.deleteByReference(reference);
       int res2 = achatService.deleteByFournisseurReference(reference);
        return res1 + res2;

    }


    @Override
    public List<Fournisseur> findByAchatReference(String reference) {

        return fournisseurDao.findByAchatReference(reference);
    }

    @Override
    public List<Fournisseur> findAll() {
        return null;
    }
}
