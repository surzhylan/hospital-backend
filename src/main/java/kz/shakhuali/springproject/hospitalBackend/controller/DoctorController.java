package kz.shakhuali.springproject.hospitalBackend.controller;

import kz.shakhuali.springproject.hospitalBackend.dto.DoctorDto;
import kz.shakhuali.springproject.hospitalBackend.services.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

    @GetMapping
    public List<DoctorDto> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @PostMapping
    public DoctorDto addDoctor(@RequestBody DoctorDto doctorDto) {
        return doctorService.addDoctor(doctorDto);
    }

    @PutMapping
    public DoctorDto updateDoctor(@RequestBody DoctorDto doctorDto) {
        return doctorService.updateDoctor(doctorDto);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable("id") Long id) {
        doctorService.deleteDoctor(id);
    }

    @GetMapping("/{id}")
    public DoctorDto getDoctor(@PathVariable("id") Long id) {
        return doctorService.getDoctor(id);
    }
}
