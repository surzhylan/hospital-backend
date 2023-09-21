package kz.shakhuali.springproject.hospitalBackend.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DoctorDto {

    private Long id;
    private String fullName;
    private String email;
    private String phoneNum;
    private int age;
}
