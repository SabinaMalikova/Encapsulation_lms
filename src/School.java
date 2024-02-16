public class School {
    private String schoolName;
    private String schoolAdress;
    private String schoolUniform;

    public School(){
    }
    public School(String schoolName,String schoolAdress,String schoolUniform){
        this.schoolName = schoolName;
        this.schoolAdress = schoolAdress;
        this.schoolUniform = schoolUniform;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolAdress(){
        return  schoolAdress;
    }
    public void setSchoolAdress(String schoolAdress){
        this.schoolAdress = schoolAdress;
    }

    public String getSchoolUniform(){
        return schoolUniform;
    }
    public void setSchoolUniform(String schoolUniform){
        this.schoolUniform = schoolUniform;
    }

    @Override
    public String toString() {
        return "Названия школы: " + schoolName + "\n" +
                "Адресс школы:" + schoolAdress + "\n" +
                "Школьная форма школы: " + schoolUniform ;
    }
}
