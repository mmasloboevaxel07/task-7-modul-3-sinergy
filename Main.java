package third_modul.seventh;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1\n----------------------------------------------------");

        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(Manufactures.Apple, "A1", 10000));
        phones.add(new Phone(Manufactures.OPPO, "O1", 30000));
        phones.add(new Phone(Manufactures.OPPO, "O2", 20000));
        phones.add(new Phone(Manufactures.Apple, "A2", 50000));
        phones.add(new Phone(Manufactures.Xiaomi, "X1", 9000));
        phones.add(new Phone(Manufactures.Xiaomi, "X2", 25000));
        phones.add(new Phone(Manufactures.Xiaomi, "X3", 7000));
        phones.add(new Phone(Manufactures.Apple, "A3", 100000));

        List<String> iPhones = phones.stream().filter(phone -> phone.getManufacturer() == Manufactures.Apple).map(Phone::getName).toList();
        System.out.println("Длина списка равнa " + iPhones.size());
        System.out.print("Элементы списка: ");
        iPhones.forEach(phone -> System.out.print(phone + " "));
        System.out.println("\n----------------------------------------------------\n\n\n");





        System.out.println("Задание 2\n----------------------------------------------------");
        System.out.println("Список телефонов в порядке возрастания цены: ");
        phones.stream().sorted().forEach(phone -> System.out.println(phone.getName() + ", стоимость " + phone.getCost() + " рублей"));

        System.out.println("----------------------------------------------------");
    }
}

