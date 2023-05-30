import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program {
    public static void main(String[] args) {
        // Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
        // методы. Реализовать в java.
        // Создать множество ноутбуков.
        // Написать метод, который будет запрашивать у пользователя критерий (или
        // критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии
        // фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую
        // необходимому критерию:
        // 1 - ОЗУ
        // 2 - Объем ЖД
        // 3 - Операционная система
        // 4 - Цвет …
        // Далее нужно запросить минимальные значения для указанных критериев -
        // сохранить параметры фильтрации можно также в Map.
        // Отфильтровать ноутбуки из первоначального множества и вывести проходящие по
        // условиям.
        // Работу сдать как обычно ссылкой на гит репозиторий
        // P.S. Частые ошибки смотри в конце семинара

        Notebooks notebook1 = new Notebooks(4, 1024, "Windows", "black");
        Notebooks notebook2 = new Notebooks(8, 2048, "Linux", "red");
        Notebooks notebook3 = new Notebooks(8, 4096, "MacOs", "blue");
        Notebooks notebook4 = new Notebooks(32, 1048, "Windows", "red");
        Notebooks notebook5 = new Notebooks(64, 2048, "Linux", "yellow");
        Notebooks notebook6 = new Notebooks(4, 1024, "MacOs", "black");
        Notebooks notebook7 = new Notebooks(8, 2048, "Linux", "red");
        Notebooks notebook8 = new Notebooks(8, 4096, "Linux", "blue");
        Notebooks notebook9 = new Notebooks(32, 1048, "MacOs", "red");
        Notebooks notebook10 = new Notebooks(64, 1024, "Windows", "blue");
        Notebooks notebook11 = new Notebooks(4, 2048, "Windows", "red");
        Notebooks notebook12 = new Notebooks(8, 1048, "Linux", "red");
        Notebooks notebook13 = new Notebooks(8, 4096, "Linux", "blue");
        Notebooks notebook14 = new Notebooks(32, 1048, "Windows", "red");
        Notebooks notebook15 = new Notebooks(64, 2048, "Linux", "yellow");

        Set<Notebooks> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);
        notebooks.add(notebook11);
        notebooks.add(notebook12);
        notebooks.add(notebook13);
        notebooks.add(notebook14);
        notebooks.add(notebook15);
        for (Notebooks notebook : notebooks) {
            System.out.println(notebook);
        }

        filtration(notebooks);

    }

    static void filtration(Set<Notebooks> notebooks) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter minimum of ram, that you want. If it doesn't matter - press 0");
        int par1 = scanner.nextInt();

        System.out.println("Enter minimum of Hard Drive, that you want. If it doesn't matter - press 0");
        int par2 = scanner.nextInt();

        System.out.println(
                "Enter Operation System, that you want. <0> It doesn't matter, <1> for Windows, <2> for Linux, <3> for MacOs");
        int par03 = scanner.nextInt();
        String par3 = null;
        if (par03 == 1) {
            par3 = "Windows";
        }
        if (par03 == 2) {
            par3 = "Linux";
        }
        if (par03 == 3) {
            par3 = "MacOs";
        }

        System.out.println(
                "Enter colour, that you want. <0> It doesn't matter, <1> for black, <2> for red, <3> for blue, <4> for yellow");
        int par04 = scanner.nextInt();
        String par4 = null;
        if (par04 == 1) {
            par4 = "black";
        }
        if (par04 == 2) {
            par4 = "red";
        }
        if (par04 == 3) {
            par4 = "blue";
        }
        if (par04 == 4) {
            par4 = "yellow";
        }

        Notebooks idealNotebook = new Notebooks(par1, par2, par3, par4);
        

        Set<Notebooks> idealNotebooks = new HashSet<>();

        for (Notebooks notebook : notebooks) {
            if (notebook.getRam() >= idealNotebook.getRam()
                    && notebook.getHardDrive() >= idealNotebook.getHardDrive()) {
                if (idealNotebook.getOperationSystem() == null) {
                    if (idealNotebook.getColour() == null) {
                        idealNotebooks.add(notebook);
                    } else {
                        if (notebook.getColour().equals(idealNotebook.getColour())) {
                            idealNotebooks.add(notebook);
                        }
                    }

                } else {
                    if (notebook.getOperationSystem().equals(idealNotebook.getOperationSystem())
                            && idealNotebook.getColour() == null) {
                        idealNotebooks.add(notebook);
                    } else {
                        if (notebook.getOperationSystem().equals(idealNotebook.getOperationSystem())
                                && idealNotebook.getColour().equals(notebook.getColour())) {
                            idealNotebooks.add(notebook);
                        }
                    }
                }

            }

        }

        System.out.println("Appropriate notebooks: ");
        for (Notebooks notebook : idealNotebooks) {
            System.out.println(notebook);
        }

    }

}