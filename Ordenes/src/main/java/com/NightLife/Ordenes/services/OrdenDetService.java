package com.NightLife.Ordenes.services;

import com.NightLife.Ordenes.Entity.Orden;
import com.NightLife.Ordenes.Entity.OrdenDetails;

import java.util.List;
import java.util.Optional;

public interface OrdenDetService {
    List<OrdenDetails> listarOrdenDet();
    OrdenDetails guardarOrdenDet(OrdenDetails ordenDetails);
    Optional<OrdenDetails> porIdOrdenDet (Integer id);
    void deletebyIdOrdenDet(Integer id);
}
