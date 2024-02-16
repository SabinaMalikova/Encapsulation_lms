import java.util.Arrays;

public class University {
    private String universityName;
    private String universityAdress;
    private String formOfEducation;


    public University(){
    }
    public University(String universityName, String universityAdress, University[] formsOfEducation){
        this.universityName = universityName;
        this.universityAdress = universityAdress;

    }

    public String getUniversityName(){
        return universityName;
    }
    public void setUniversityName(String universityName){
        this.universityName = universityName;
    }
    public String getUniversityAdress(){
        return universityAdress;
    }
    public void setUniversityAdress(String universityAdress){
        this.universityAdress = universityAdress;
    }
    public String getFormOfEducation(){
        return  formOfEducation;
    }
    public void setFormOfEducation(String formOfEducation){
        this.formOfEducation = formOfEducation;
    }


    @Override
    public String toString() {
        return "Название университета: " + universityName + "\n" +
                "Адрес Университета: " + universityAdress + "\n" +
                "Форма обучения: " + formOfEducation;
    }
}
