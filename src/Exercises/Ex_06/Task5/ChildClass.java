package Exercises.Ex_06.Task5;

class ChildClass extends ParentClass {
    // Переопределенный метод для получения имени пользователя
    @Override
    public void getUserData() {
        System.out.print("Введите имя пользователя: ");
        //scanner.nextLine(); // Очистка буфера после nextInt()
        String name = scanner.nextLine();
        System.out.println("Имя пользователя: " + name);
    }
}
