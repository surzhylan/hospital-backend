package kz.shakhuali.springproject.hospitalBackend.services.impl;

import kz.shakhuali.springproject.hospitalBackend.dto.DoctorDto;
import kz.shakhuali.springproject.hospitalBackend.mapper.DoctorMapper;
import kz.shakhuali.springproject.hospitalBackend.model.Doctor;
import kz.shakhuali.springproject.hospitalBackend.repositories.DoctorRepository;
import kz.shakhuali.springproject.hospitalBackend.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;
    private final DoctorMapper doctorMapper;


    @Override
    public DoctorDto addDoctor(DoctorDto doctorDto) {
        return doctorMapper.toDto(doctorRepository.save(doctorMapper.toEntity(doctorDto)));
    }

    @Override
    public List<DoctorDto> getAllDoctors() {
        return doctorMapper.toDtoList(doctorRepository.findAll());
    }

    @Override
    public DoctorDto updateDoctor(DoctorDto doctorDto) {
        return doctorMapper.toDto(doctorRepository.save(doctorMapper.toEntity(doctorDto)));
    }

    @Override
    public void deleteDoctor(Long id) {
        doctorRepository.findById(id).ifPresent(doctorRepository::delete);
    }

    @Override
    public DoctorDto getDoctor(Long id) {
        return doctorMapper.toDto(doctorRepository.findById(id).orElse(null));
    }
}
