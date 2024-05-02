package intecbrussel.be.model;

import lombok.Data;
//Patient de 'eigenaar' van de relatie
//срок жизни объекта MedicalFile зависит от объекта Patient
//Если пациент удален, соответствующая медицинская запись также должна быть удалена
@Data
public class Patient {

    private String rijksregisternummer;
    private String naam;
    private boolean sick;
    private MedicalFile medicalFile;

}
