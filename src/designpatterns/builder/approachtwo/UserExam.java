package designpatterns.builder.approachtwo;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;
    private UserExam(){}

    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    public static class UserExamBuilder {

        private int englishMarks = 50;
        private int mathMarks = 60;
        private int scienceMarks = 40;
        private  String name = "shafa";


        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }
        public UserExamBuilder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }
        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build() {
            if(englishMarks > 100 ||
                    scienceMarks > 100 ||
                    mathMarks > 100) {
                throw  new InvalidParameterException("Marks can't be greater than 100");
            }

            //some random checkings
            if (mathMarks + englishMarks > 150) {
                throw new InvalidParameterException("Maths + English can't be greater than 150");
            }

            if (name != null && name.startsWith("0")) {
                throw new InvalidParameterException("Name can't start with 0");
            }

            UserExam userExam = new UserExam();
            userExam.englishMarks = this.englishMarks;
            userExam.mathMarks = this.mathMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;

            return userExam;
        }

    }
}
