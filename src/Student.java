public  class Student {
    private String firstName;
    private String lastName;
    private String isElder;
    private double averageMark;
    private Grupa grupa;


    public Student(String firstName, String lastName, String isElder, double averageMark, Grupa grupa ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isElder = isElder;
        this.averageMark = averageMark;
        this.grupa=grupa;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIsElder() {
        return isElder;
    }

    public void setIsElder(String isElder) {
        this.isElder = isElder;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public  void getScholarship ( Student[] students){
        for (int i = 0; i < students.length; i++) {
            if (averageMark==5){
                System.out.println("1000 сом ");
            }else System.out.println("800 сом");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "Имя ='" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", isElder='" + isElder + '\'' +
                ", средний балл=" + averageMark +
                '}';
    }
}
