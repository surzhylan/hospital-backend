package kz.shakhuali.springproject.hospitalBackend.services;

import kz.shakhuali.springproject.hospitalBackend.model.Patient;

import java.util.List;

public interface PatientService {
    Patient addPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient updatePatient(Patient updPatient);
    void deletePatient(Long id);

    Patient getPatient(Long id);
}
