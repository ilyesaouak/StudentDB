public class Student {
    private String Nom;
    private int Age;
    public Student(String Nom,int Age){
        this.Nom=Nom;
        this.Age=Age;
    }
    public String donnerNom(){
        return this.Nom;
    }
    public int donnerAge(){
        return this.Age;
    }
}

