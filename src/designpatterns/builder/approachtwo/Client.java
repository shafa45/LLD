package designpatterns.builder.approachtwo;

public class Client {
    public static void main(String[] args) {
        //UserExam userExam = UserExam.getBuilder().build();
        UserExam userExam;
        try {
            userExam = UserExam.getBuilder()
                    .setName("Shafa")
                    .setMathMarks(20)
                    .setEnglishMarks(50)
                    .build();

            UserExam userExam1 = UserExam.getBuilder().build();
            System.out.println("All went well");
        }
        catch (Exception e) {
            System.out.println("Some parameters are wrong");
        }
    }
}
