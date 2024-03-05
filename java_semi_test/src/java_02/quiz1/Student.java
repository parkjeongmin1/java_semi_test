package java_02.quiz1;

public class Student {
    String name = "김철수"; // 학생 이름
    int ban = 1; // 반
    int no = 10; // 번호
    int kor = 90; // 국어점수
    int eng = 70; // 영어점수
    int math = 85; // 수학점수

    public int getTotal() {
        return kor + eng + math;
    }

    public double getAverage() {
        int total = getTotal();
        int num = 3;
        return (double) total / num;
    }

    public static void main(String[] args) {
        Student student = new Student();

        int sum = student.getTotal();
        System.out.println("총점: " + sum);

        double avg = student.getAverage();
        System.out.println("평균: " + avg);
    }
}



