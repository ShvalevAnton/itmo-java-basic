package Exercises.Ex_03;

public class JavaProgram {
    public static void main(String[] args) {
        Study basicJava = new Study("Изучение Java - это просто!");
        String tmpStr = basicJava.printCourse();
        System.out.println(tmpStr);
    }
}