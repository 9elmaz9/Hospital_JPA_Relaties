package intecbrussel.be.model;

import lombok.Data;

import javax.persistence.*;

//Patient de 'eigenaar' van de relatie
//срок жизни объекта MedicalFile зависит от объекта Patient
//Если пациент удален, соответствующая медицинская запись также должна быть удалена
@Data
@Entity
@Table(name ="patient")
public class Patient {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
    private String rijksregisternummer;

    private String naam;
    private boolean sick;
    @OneToOne(mappedBy = "patient", cascade =CascadeType.ALL)
    private MedicalFile medicalFile;

}
