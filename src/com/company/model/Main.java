public class Main {
    private static int counter = 1;
    private final int id;
    private final String fullName;
    private int department;
    private double salary;

    public Main(String fullName, int department, double salary) {
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }
        if (department <= 0) {
            throw new IllegalArgumentException("Номер отдела должен быть положительным");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }

        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    // Геттеры
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Сеттеры с валидацией
    public void setDepartment(int department) {
        if (department <= 0) {
            throw new IllegalArgumentException("Номер отдела должен быть положительным");
        }
        this.department = department;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d, ФИО: %s, Отдел: %d, Зарплата: %.2f",
                id, fullName, department, salary
        );
    }
}