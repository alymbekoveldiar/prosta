public class Aspirant extends Student {
    private String study_at_theTop;



    public Aspirant(String firstName, String lastName, String isElder, double averageMark, String study_at_theTop) {
        super(firstName,lastName,isElder,averageMark,new Grupa("ПИ"));

        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setIsElder(isElder);
        this.setAverageMark(averageMark);
        this.study_at_theTop = study_at_theTop;
    }


    public void getScholarship(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (getAverageMark() == 5) {
                System.out.println("2000 сом ");
            } else System.out.println("1800 сом");
        }
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "Вишка='" + study_at_theTop + '\'' +
                '}';
    }
}