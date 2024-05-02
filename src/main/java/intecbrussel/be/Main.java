package intecbrussel.be;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import intecbrussel.be.model.MedicalFile;
import intecbrussel.be.model.Patient;



/*One-To-One
Je maakt een Object Patient. Geef die een String rijksregisternummer, een String naam, boolean sick.
Dan, een MedicalFile object. Met een int id, een Patient variabele en een String illnes.
We gaan een paar patienten opmaken, en die elk een Medical File geven. Wat is logisch? Wie is de
owner?*/

/*1.) One-To-One
You create an Object Patient. Give it a String national register number, a String name, boolean sick.
Then, a MedicalFile object. With an int id, a Patient variable and a String illnes.
We are going to prepare a few patients and give each of them a Medical File. What makes sense? Who is the owner?*/



public class Main {
    public static void main(String[] args) {
        // Массив с именами пациентов
        String[] names = {"Richard", "Marry", "Lila", "Daniel", "Erica"};
        // Массив с болезнями
        String[] illnesses = {"Sinusitis ", "Common cold", "Headache", "Gastroenteritis ", "Flu"};
// create 5 patients and скуйеу  medicalfiles for them
        // Создаем 5 пациентов и для каждого создаем медицинскую карту
        for (int i = 0; i < 5; i++) {
            Patient patient = new Patient();
            patient.setRijksregisternummer("123456789" + (i + 1));
            patient.setNaam(names[i]);
            patient.setSick(i % 2 == 0); // Четные пациенты больны, нечетные - здоровы

            MedicalFile medicalFile = new MedicalFile();
            medicalFile.setId(i + 1);
            medicalFile.setPatient(patient);
            medicalFile.setIllness(patient.isSick() ? illnesses[i] : "Healthy");

            patient.setMedicalFile(medicalFile);

            // Выводим информацию о пациенте и его медицинской карте
            System.out.println("Patient " + (i + 1) + ":");
            System.out.println("Name: " + patient.getNaam());
            System.out.println("Rijksregisternummer: " + patient.getRijksregisternummer());
            System.out.println("Sick: " + patient.isSick());
            System.out.println("Medical File ID: " + medicalFile.getId());
            System.out.println("Illness: " + medicalFile.getIllness());
            System.out.println();
        }
    }

}
