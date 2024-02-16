import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName(" Jennie ");
        person1.setAge(25);
        person1.setNationality(" korean");
        person1.setWork(" idol");

        Person person2 = new Person();
        person2.setName(" Ariana");
        person2.setAge(30);
        person2.setNationality(" American");
        person2.setWork(" singer");

        Person person3 = new Person();
        person3.setName(" Artem");
        person3.setAge(20);
        person3.setNationality(" kyrgyz");
        person3.setWork(" student");

        Car car1 = new Car();
        car1.setBrand(" Toyota");
        car1.setModel(" C-hr");
        car1.setColor(" White ");

        Car car2 = new Car();
        car2.setBrand(" Lexus");
        car2.setModel(" RX");
        car2.setColor(" Black");

        Car car3 = new Car();
        car2.setBrand(" Kia");
        car3.setModel(" K5");
        car3.setColor(" silver");

        School school1 = new School();
        school1.setSchoolName(" Bilinkana American School");
        school1.setSchoolAdress(" проспект Ч.Айтматова, 1 А");
        school1.setSchoolUniform(" classic style");

        School school2 = new School();
        school2.setSchoolName(" Nova school");
        school2.setSchoolAdress(" ул. Манаса 102");
        school2.setSchoolUniform(" classic style");

        School school3 = new School();
        school3.setSchoolName(" Seytek Steam School");
        school3.setSchoolAdress(" пр. Ч. Айтматова, 1/1.");
        school3.setSchoolUniform(" classic style");

        University university1 =  new University();
        university1.setUniversityName(" КРСУ");
        university1.setUniversityAdress(" ул. Киевская, 44");
        university1.setFormOfEducation(" Очное обучение");

        University university2 = new University();
        university2.setUniversityName(" КНУ");
        university2.setUniversityAdress(" ул. М. Фрунзе, 547");
        university2.setFormOfEducation(" Очное и заочное обучение ");

        University university3 = new University();
        university3.setUniversityName(" КГМА");
        university3.setUniversityAdress(" ул. Ахунбаева, 92");
        university3.setFormOfEducation(" Очное обучение ");

        Person[] people = {person1,person2,person3};
        Car[] cars = {car1,car2,car3};
        School[] schools = {school1,school2,school3};
        University[] universities = {university1,university2,university3};


        System.out.println("       Персона: \n" +Arrays.toString(people)+"\n"+
                "       Машины: \n" +Arrays.toString(cars)+"\n"+
                "       Школы: \n" +Arrays.toString(schools)+"\n"+
                "       Университеты: \n" +Arrays.toString(universities));





    }
}