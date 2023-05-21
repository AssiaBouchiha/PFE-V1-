package com.example.tpcommande.ws;

import com.example.tpcommande.bean.Achat;
import com.example.tpcommande.service.facade.AchatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/achat")
public class AchatWs {

   @PostMapping("/")
    public int save(@RequestBody Achat achat) {
       return achatService.save(achat);}

    @PutMapping("/")
    public int update(@RequestBody Achat achat) {
        return achatService.update(achat);
    }


    @GetMapping("/reference/{reference}")
    public Achat findByReference(@PathVariable String reference) {
        return achatService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference")
    public int deleteByReference(@PathVariable String reference) {
        return achatService.deleteByReference(reference);
    }


    @GetMapping("/MontantAchatGreaterThan/{montantAchat}")
    public List<Achat> findByMontantAchatLessThan(@PathVariable double montantAchat) {
        return achatService.findByMontantAchatLessThan(montantAchat);
    }
    @GetMapping("/MontantAchatGreaterThan/{montantAchat}")
    public List<Achat> findByMontantAchatGreaterThan(@PathVariable double montantAchat) {
        return achatService.findByMontantAchatGreaterThan(montantAchat);
    }
    @GetMapping("/")
    public List<Achat> findAll() {
        return achatService.findAll();
    }

    @Autowired
private AchatService achatService;
}
