package kz.shakhuali.springproject.hospitalBackend.services.impl;

import kz.shakhuali.springproject.hospitalBackend.model.Diagnose;
import kz.shakhuali.springproject.hospitalBackend.repositories.DiagnoseRepository;
import kz.shakhuali.springproject.hospitalBackend.services.DiagnoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiagnoseServiceImpl implements DiagnoseService {
    @Autowired
    private DiagnoseRepository diagnoseRepository;

    @Override
    public Diagnose addDiagnose(Diagnose diagnose) {
        return diagnoseRepository.save(diagnose);
    }

    @Override
    public List<Diagnose> getAllDiagnoses() {
        return diagnoseRepository.findAll();
    }

    @Override
    public void deleteDiagnose(List<Diagnose> diagnoses) {
        diagnoseRepository.deleteAll();
    }

    @Override
    public Diagnose findByName(String name) {
        return diagnoseRepository.findByName(name);
    }

    @Override
    public Diagnose getDiagnose(Long id) {
        return diagnoseRepository.findById(id).orElse(null);
    }
}
