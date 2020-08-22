package liep11.uzduotis2;

//1. Create a map and display its result (data should be provided by the user - console):
//        a) Names and surnames
//        b) Names and ages.
//        c) Names and lists of friends (other names).
//        d) * Names and details (map of maps), e.g.
//        „Mike”:
//        „ID”: „...”,
//        „birthPlace” : „…”

import java.util.*;
import java.util.stream.Collectors;

public class Maps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Map<String, String>> persons4;
        persons4 = inputPersons4(sc);
        printMap2(persons4);


    }

    private static <K, V> void printMap(Map<K, V> persons) {
        for (Map.Entry<K, V> person : persons.entrySet()) {
            String str = "\tVardas: %s, ";
            String type = person.getValue().getClass().getSimpleName();
            switch (type) {
                case "String":
                    str += "pavardė: %s";
                    break;
                case "Integer":
                    str += "amžius: %d";
                    break;
                case "List":
                    str += "Draugai: %s";
                    break;
            }
            str += "\n";
            System.out.printf(str, person.getKey(), person.getValue());
        }
    }

    private static <K, V> void printMap2(Map<K, Map<V, V>> persons) {
        for (Map.Entry<K, Map<V, V>> person : persons.entrySet()) {
            System.out.println(person.getKey() + ":");

            Map<V, V> details = person.getValue();
            String det = details.entrySet()
                    .stream()
                    .map(emp -> "\tID: " + emp.getKey() + "\n"
                            + "\tGimimo vieta: " + emp.getValue())
                    .collect(Collectors.joining("\n"));
            System.out.println(det);
        }
    }

    public static Map<String, String> inputPersons(Scanner sc) {
        Map<String, String> persons = new HashMap<>();
        System.out.println("Įvedimo nutraukimui įveskite 'stop'");
        while (true) {
            System.out.print("Iveskite vardą: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("Įveskite pavardę: ");
            String surname = sc.nextLine();
            persons.put(name, surname);
        }
        return persons;
    }

    public static Map<String, Integer> inputPersons2(Scanner sc) {
        Map<String, Integer> persons = new HashMap<>();
        System.out.println("Įvedimo nutraukimui įveskite 'stop'");
        while (true) {
            System.out.print("Iveskite vardą: ");
            String name = sc.next();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.print("Įveskite amžių: ");
            int age = sc.nextInt();
//            sc.nextLine();
            persons.put(name, age);
        }
        return persons;
    }

    public static Map<String, List<String>> inputPersons3(Scanner sc) {
        Map<String, List<String>> persons = new HashMap<>();
        System.out.println("Įvedimo nutraukimui įveskite 'stop'");
        while (true) {
            System.out.print("Iveskite vardą: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            List<String> friends = new ArrayList<>();
            while (true) {
                System.out.print("Įveskite draugo vardą: ");
                String friend = sc.nextLine();
                if (friend.equalsIgnoreCase("stop")) {
                    break;
                }
                friends.add(friend);
            }
            persons.put(name, friends);
        }
        return persons;
    }

    public static Map<String, Map<String, String>> inputPersons4(Scanner sc) {
        Map<String, Map<String, String>> persons = new HashMap<>();
        System.out.println("Įvedimo nutraukimui įveskite 'stop'");
        while (true) {
            System.out.print("Iveskite vardą: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("stop")) {
                break;
            }
            Map<String, String> details = new HashMap<>();

            System.out.print("Įveskite ID: ");
            String id = sc.nextLine();
            System.out.print("Įveskite gimimo vieta: ");
            String birthPlace = sc.nextLine();
            details.put(id, birthPlace);

            persons.put(name, details);
        }
        return persons;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //    Map<String, String> persons = readNameSurname(scanner);
//        //    printMap(persons);
//        //    Map<String, Integer> persons1 = readNameAge(scanner);
//        //    printMap(persons1);
//        //    Map<String, List<String>> persons2 = readNameFriends(scanner);
//        //    printMap(persons2);
//        Map<String, Map<String, String>> persons3 = readNameDetails(scanner);
//        printMap(persons3);
//    }
//    private static <K, V> void printMap(Map<K, V> map) {
//        for (Map.Entry<K, V> entry : map.entrySet()) {
//            K key = entry.getKey();
//            V value = entry.getValue();
//            System.out.printf("%s : %s\n", key, value);
//        }
//    }
//    private static Map<String, Integer> readNameAge(Scanner scanner) {
//        Map<String, Integer> persons = new HashMap<>();
//        while (true) {
//            System.out.println("Įveskite vardą");
//            String name = scanner.next();
//            if (name.equalsIgnoreCase("stop")) {
//                break;
//            }
//            System.out.println("Įveskite amžių");
//            int age = scanner.nextInt();
//            persons.put(name, age);
//        }
//        return persons;
//    }
//    private static Map<String, List<String>> readNameFriends(Scanner scanner) {
//        Map<String, List<String>> persons = new HashMap<>();
//        while (true) {
//            List<String> friends = new ArrayList<>();
//            System.out.println("Įveskite vardą");
//            String name = scanner.next();
//            if (name.equalsIgnoreCase("stop")) {
//                break;
//            }
//            while (true) {
//                System.out.println("Įveskite draugą");
//                String friend = scanner.next();
//                if (friend.equalsIgnoreCase("stop")) {
//                    break;
//                }
//                friends.add(friend);
//            }
//            persons.put(name, friends);
//        }
//        return persons;
//    }
//    private static Map<String, Map<String, String>> readNameDetails(Scanner scanner) {
//        Map<String, Map<String, String>> persons = new HashMap<>();
//        while (true) {
//            Map<String, String> details = new HashMap<>();
//            System.out.println("Įveskite vardą");
//            String name = scanner.next();
//            if (name.equalsIgnoreCase("stop")) {
//                break;
//            }
//            while (true) {
//                System.out.println("Įveskite raktą");
//                String key = scanner.next();
//                if (key.equalsIgnoreCase("stop")) {
//                    break;
//                }
//                System.out.println("Įveskite rakto reikšmę");
//                String value = scanner.next();
//                details.put(key, value);
//            }
//            persons.put(name, details);
//        }
//        return persons;
//    }
//    private static Map<String, String> readNameSurname(Scanner scanner) {
//        Map<String, String> persons = new HashMap<>();
//        while (true) {
//            System.out.println("Įveskite vardą");
//            String name = scanner.next();
//            if (name.equalsIgnoreCase("stop")) {
//                break;
//            }
//            System.out.println("Įveskite pavardę");
//            String surname = scanner.next();
//            persons.put(name, surname);
//        }
//        return persons;
//    }
}
