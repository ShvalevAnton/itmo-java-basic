package Exercises.Ex_03;

class House {
    // Поля класса
    private int floors;       // количество этажей
    private int yearBuilt;    // год постройки
    private String name;      // наименование


    // Метод для установки всех значений
    public void setValues(int floors, int yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    // Метод для вывода всех значений
    public void printValues() {
        System.out.println("Наименование: " + name);
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год постройки: " + yearBuilt);
    }

    // Метод, возвращающий количество лет с момента постройки
    public int getYearsSinceBuilt() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - yearBuilt;
    }

    // Главный метод для теста класса
    public static void main(String[] args) {
        // Создаем два объекта класса Дом
        House house1 = new House();
        House house2 = new House();

        // Устанавливаем характеристики для первого дома через метод
        house1.setValues(5, 2010, "ЖК Солнечный");

        // Устанавливаем характеристики для второго дома через метод
        house2.setValues(12, 1995, "ЖК Старый город");

        // Выводим информацию о домах
        System.out.println("Информация о первом доме:");
        house1.printValues();
        System.out.println("Дому " + house1.getYearsSinceBuilt() + " лет\n");

        System.out.println("Информация о втором доме:");
        house2.printValues();
        System.out.println("Дому " + house2.getYearsSinceBuilt() + " лет");
    }
}



