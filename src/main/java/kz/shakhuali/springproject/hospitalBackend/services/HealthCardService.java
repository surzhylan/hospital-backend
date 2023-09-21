package kz.shakhuali.springproject.hospitalBackend.services;


import kz.shakhuali.springproject.hospitalBackend.model.HealthCard;

import java.util.List;

public interface HealthCardService {
    List<HealthCard> getAllHealthCards();
    HealthCard getHealthCard(Long id);
    HealthCard addHealthCard(HealthCard healthCard);
    HealthCard updateHealthCard(HealthCard updHealthCard);
    void deleteCard(Long id);
}
