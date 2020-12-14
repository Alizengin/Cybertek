package Inheritance.Repl.Education;

public class EducationalInstitution {
    private int years;
    public int duration;

    public EducationalInstitution(){

    }
    public EducationalInstitution(int duration){
        this.duration = duration;
    }
    public String graduationRequirements(){
      return (duration + " years of study");
    }
}
