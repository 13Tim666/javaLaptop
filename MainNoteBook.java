import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainNoteBook {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(1, "samsung", "a10", 8, 512, "windowsXP", 15.2, "black");
        Notebook notebook2 = new Notebook(2, "dell", "shark", 16, 256, "windows11", 16, "white");
        Notebook notebook3 = new Notebook(3, "mac", "666", 16, 1024, "windowsXP", 15.2, "green");
        Notebook notebook4 = new Notebook(4, "mac", "stels", 2, 256, "linux", 15.2, "black");

        Set<Notebook> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4));
        Set<Notebook> filterNotebooks = new HashSet<>();
        for (Notebook notebook : notebooks) {
            System.out.println(notebook);
        }
        System.out.println("_________________________________________________");
        Scanner scanner = new Scanner(System.in);

        int inInt = 0;
        String inStr = "";
        boolean x = true;
        while (x) {

            System.out.println(
                    "1-ID ; 2-Бренд; 3-Модель; 4-RAM; 5-Память; 6-Операционная система; 7-Диагональ; 8-Цвет; 9-выход");
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            inInt = scanner.nextInt();

            switch (inInt) {
                case 0:
                    notebooks.clear();
                    notebooks.addAll(Arrays.asList(notebook1, notebook2, notebook3, notebook4));
                    for (Notebook notebook : notebooks) {
                        System.out.println(notebook);
                    }
                    System.out.println("-------------------------------------------------");
                    continue;

                case 1:
                    System.out.println("Что ищем?): ");
                    inInt = scanner.nextInt();
                    for (Notebook notebook : notebooks) {
                        if (notebook.findId(inInt)) {
                            filterNotebooks.add(notebook);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Что ищем?): ");
                    scanner.nextLine();
                    inStr = scanner.nextLine();
                    for (Notebook notebook : notebooks) {
                        if (notebook.findBrand(inStr)) {
                            filterNotebooks.add(notebook);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Что ищем?): ");
                    scanner.nextLine();
                    inStr = scanner.nextLine();
                    for (Notebook notebook : notebooks) {
                        if (notebook.findModel(inStr)) {
                            filterNotebooks.add(notebook);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Что ищем?): ");
                    inInt = scanner.nextInt();
                    for (Notebook notebook : notebooks) {
                        if (notebook.findRam(inInt)) {
                            filterNotebooks.add(notebook);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Что ищем?): ");
                    inInt = scanner.nextInt();
                    for (Notebook notebook : notebooks) {
                        if (notebook.findHardDriveCapacity(inInt)) {
                            filterNotebooks.add(notebook);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Что ищем?): ");
                    scanner.nextLine();
                    inStr = scanner.nextLine();
                    for (Notebook notebook : notebooks) {
                        if (notebook.findOs(inStr)) {
                            filterNotebooks.add(notebook);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Что ищем?): ");
                    double indou = scanner.nextInt();
                    for (Notebook notebook : notebooks) {
                        if (notebook.findScreenSize(indou)) {
                            filterNotebooks.add(notebook);
                        }
                    }
                    break;
                case 8:
                    System.out.println("Что ищем?): ");
                    scanner.nextLine();
                    inStr = scanner.nextLine();
                    for (Notebook notebook : notebooks) {
                        if (notebook.findColor(inStr)) {
                            filterNotebooks.add(notebook);
                        }
                    }
                    break;

                default:
                    x = false;
                    continue;
            }
            System.out.println("-------------------------------------------------");
            if (filterNotebooks.isEmpty()) {
                System.out.println("Ничего не найдено");
            } else {
                for (Notebook notebook : filterNotebooks) {
                    System.out.println(notebook);
                }
            }
            System.out.println("Фильтрация продолжается, чтобы начать сначала нажмите: 0");
            notebooks.clear();
            notebooks.addAll(filterNotebooks);
            filterNotebooks.clear();
            System.out.println("_________________________________________________");
        }
        scanner.close();

    }
}
