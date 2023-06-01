package designpatterns.builder.approachone;

public class Client {
    public static void main(String[] args) {
        UserExamParameters parameters = new UserExamParameters();
        parameters.englishMarks = 120;
        parameters.name = "Shafa";

        UserExam userExam;
        try {
            userExam = new UserExam(parameters);
        } catch (Exception exception) {
            System.out.println("Some parameters are wrong");
        }
    }
}
