package kz.shakhuali.springproject.hospitalBackend.services;

import kz.shakhuali.springproject.hospitalBackend.dto.DoctorDto;

import java.util.List;

public interface DoctorService {
    DoctorDto addDoctor(DoctorDto doctorDto);
    List<DoctorDto> getAllDoctors();
    DoctorDto updateDoctor(DoctorDto doctorDto);
    void deleteDoctor(Long id);
    DoctorDto getDoctor(Long id);
}
