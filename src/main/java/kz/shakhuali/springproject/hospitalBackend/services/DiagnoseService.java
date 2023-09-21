package kz.shakhuali.springproject.hospitalBackend.services;

import kz.shakhuali.springproject.hospitalBackend.model.Diagnose;

import java.util.List;

public interface DiagnoseService {
    Diagnose addDiagnose(Diagnose diagnose);
    List<Diagnose> getAllDiagnoses();
    void deleteDiagnose(List<Diagnose> diagnoses);

    Diagnose findByName(String name);

    Diagnose getDiagnose(Long id);
}
