package kz.shakhuali.springproject.hospitalBackend.services.impl;

import kz.shakhuali.springproject.hospitalBackend.model.HealthCard;
import kz.shakhuali.springproject.hospitalBackend.repositories.HealthCardRepository;
import kz.shakhuali.springproject.hospitalBackend.services.HealthCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthCardServiceImpl implements HealthCardService {
    @Autowired
    private HealthCardRepository healthCardRepository;

    @Override
    public List<HealthCard> getAllHealthCards() {
        return healthCardRepository.findAll();
    }

    @Override
    public HealthCard getHealthCard(Long id) {
        return healthCardRepository.findById(id).orElseThrow();
    }

    @Override
    public HealthCard addHealthCard(HealthCard healthCard) {
        return healthCardRepository.save(healthCard);
    }

    @Override
    public HealthCard updateHealthCard(HealthCard updHealthCard) {
        HealthCard healthCard = healthCardRepository.findById(updHealthCard.getCardId()).orElse(null);
        healthCard.setPatient(updHealthCard.getPatient());
        healthCard.setDiagnoses(updHealthCard.getDiagnoses());
        return healthCardRepository.save(healthCard);
    }

    @Override
    public void deleteCard(Long id) {
        healthCardRepository.deleteById(id);
    }
}
