package kz.shakhuali.springproject.hospitalBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "diagnoses")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diagnose {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    /*@Column(name = "date_of_illness")
    private Date dateOfIllness;*/

    /*@ManyToMany(fetch = FetchType.LAZY)
    private List<Patient> patients;*/

    /*@ManyToOne(fetch = FetchType.EAGER)
    private Doctor doctor;*/
}
