package designpatterns.builder.approachone;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;

    public UserExam(UserExamParameters userExamParameters) {
        if(userExamParameters.englishMarks > 100 ||
                userExamParameters.scienceMarks > 100 ||
                userExamParameters.mathMarks > 100) {
            throw  new InvalidParameterException("Marks can't be greater than 100");
        }

        //some random checkings
        if (userExamParameters.mathMarks + userExamParameters.englishMarks > 150) {
            throw new InvalidParameterException("Maths + English can't be greater than 150");
        }

        if (userExamParameters.name.startsWith("0")) {
            throw new InvalidParameterException("Name can't start with 0");
        }

        this.englishMarks = userExamParameters.englishMarks;
        this.name = userExamParameters.name;
        this.mathMarks = userExamParameters.mathMarks;
        this.scienceMarks = userExamParameters.scienceMarks;


    }
    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
