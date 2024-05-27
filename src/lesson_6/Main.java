package lesson_6;

public class Main {
    public static void main(String[] args) {
        //Task_1
        Employee personOne = new Employee("Petrov Ivan Ivanovich", "Engineer","pii@mail.ru","+79008889911",200000,35);
        System.out.println(personOne);

        //Task_2
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petrov Ivan Ivanovich", "Engineer","pii@mail.ru","+79008889911",200000,35);
        employees[1] = new Employee("Gashek Petr Sergeevich", "Salesman","gps@gmail.com","+79008889922",70000,26 );
        employees[2] = new Employee("Kimo Thue Chan", "translator", "ktc@mail.ru","+79008889933",210000,40);
        employees[3] = new Employee("Novikov Oleg Olegovich", "driver", "noop@mail.ru","+79008889944",150000,43);
        employees[4] = new Employee("Tonic Maxim Vasilevich", "tester", "tmv@mail.ru","+79008889955",180000,36);

        //Task_3
        Park park = new Park();

        park.addAttraction("Ведро", 10, 100);
        park.addAttraction("Молоточки", 20, 200);
        park.addAttraction("Карусель", 20, 300);

        System.out.println(park);

    }
}
