public class Notebooks {
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

    private int ram;
    private int hardDrive;
    private String operationSystem;
    private String colour;

    public Notebooks(int ram, int hardDrive, String operationSystem, String string) {
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.operationSystem = operationSystem;
        this.colour = string;
    }

    public String getColour() {
        return colour;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "RAM: " + ram + ", Hard Drive: " + hardDrive + ", Operation System: " + operationSystem + ", Colour: " + colour;
    }

}