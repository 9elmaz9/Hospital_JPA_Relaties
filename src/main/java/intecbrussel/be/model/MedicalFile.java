package intecbrussel.be.model;

import jdk.jfr.DataAmount;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "medicalfile")
public class MedicalFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private int id;

    @OneToOne
    @JoinColumn(name = "patient-id")
    private Patient patient;
    private String illness;

}
