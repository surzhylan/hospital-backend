package kz.shakhuali.springproject.hospitalBackend.mapper;

import kz.shakhuali.springproject.hospitalBackend.dto.DoctorDto;
import kz.shakhuali.springproject.hospitalBackend.model.Doctor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorDto toDto(Doctor doctor);

    Doctor toEntity(DoctorDto doctorDto);

    List<DoctorDto> toDtoList(List<Doctor> doctors);
}
