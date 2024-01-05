package com.groupeisi.backendadmin.web;

import com.groupeisi.backendadmin.services.ProduitService;
import com.groupeisi.generated.api.ProduitApi;
import com.groupeisi.generated.model.ProduitDTO;
import com.groupeisi.generated.model.ProduitsResultListDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@NoArgsConstructor @AllArgsConstructor
public class ProduitsController implements ProduitApi {
    @Autowired
    private ProduitService produitService;

    @Override
    public ResponseEntity<ProduitDTO> getProduit(Integer idProduit) throws Exception {
        return ResponseEntity.ok(produitService.getProduit(idProduit));
    }

    @Override
    public ResponseEntity<ProduitsResultListDTO> getAllProducts(Integer currentPage, Integer sizePage) throws Exception {
        return ProduitApi.super.getAllProducts(currentPage, sizePage);
    }
}