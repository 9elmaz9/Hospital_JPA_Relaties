package intecbrussel.be.model;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class MedicalFile {
    private int id;
    private Patient patient;
    private String illness;

}
