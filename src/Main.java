public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        System.out.println("~~~ Task 1 ~~~");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName);
    }

}