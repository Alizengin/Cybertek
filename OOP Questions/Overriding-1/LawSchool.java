package Inheritance.Repl.Education;

public class LawSchool extends  EducationalInstitution{

    public LawSchool() {
        super();
    }
    public LawSchool(int duration) {
        super(duration);
    }

    @Override
    public String graduationRequirements(){
        System.out.print(super.graduationRequirements());
        return (" and passing the bar");
    }
}
