public class User {
    private int id;
    private int age;
    private String name;
    private String surname;
    private double weight;
    private double height;

    public User(int id, int age, String name, String surname, double weight, double height) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        User user1 = new User(1, 25, "Іван", "Іванов", 75.5, 180.0);
        User user2 = new User(2, 30, "Петро", "Петров", 80.0, 175.0);
        User user3 = new User(3, 28, "Марія", "Сидорова", 60.0, 165.0);
        User user4 = new User(4, 35, "Олена", "Петренко", 55.0, 170.0);
        User user5 = new User(5, 40, "Андрій", "Сидоренко", 90.0, 185.0);
        User user6 = new User(6, 27, "Олександр", "Іваненко", 70.0, 175.0);
        User user7 = new User(7, 32, "Наталія", "Олексієнко", 65.0, 160.0);
        User user8 = new User(8, 22, "Віктор", "Михайлов", 85.0, 190.0);
        User user9 = new User(9, 26, "Ірина", "Сергієнко", 75.0, 170.0);
        User user10 = new User(10, 33, "Анастасія", "Васильєва", 55.0, 165.0);

        int totalAge = user1.getAge() + user2.getAge() + user3.getAge() + user4.getAge() + user5.getAge() +
                user6.getAge() + user7.getAge() + user8.getAge() + user9.getAge() + user10.getAge();
        System.out.println("Загальний вік: " + totalAge);

        double totalWeight = user1.getWeight() + user2.getWeight() + user3.getWeight() + user4.getWeight() +
                user5.getWeight() + user6.getWeight() + user7.getWeight() + user8.getWeight() + user9.getWeight() + user10.getWeight();
        System.out.println("Загальна вага: " + totalWeight);

        double totalHeight = user1.getHeight() + user2.getHeight() + user3.getHeight() + user4.getHeight() +
                user5.getHeight() + user6.getHeight() + user7.getHeight() + user8.getHeight() + user9.getHeight() + user10.getHeight();
        System.out.println("Загальний зріст: " + totalHeight);
    }
}
