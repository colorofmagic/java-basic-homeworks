package homework4;

public class Box {
    private int height;
    private int width;
    private int depth;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int height, int width, int depth, String color, boolean isOpen, String item) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.color = color;
        this.isOpen = isOpen;
        this.item = item;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //Информация о коробке
    public void info() {
        System.out.println("Размеры коробки: " + height + "*" + width + "*" + depth);
        System.out.println("Цвет коробки:" + color);
    }


    //Наполнение коробки
    public void fill(String str) {
        if (isOpen) {
            if (item == null) {
                item = str;
                System.out.println("В коробку положили " + str);
            } else {
                System.out.println("Коробка открыта, но она заполнена");
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }


    //Очистка коробки
    public void clear(String smth) {
        if (isOpen) {
            if (item == null) {
                System.out.println("Коробка пустая, из нее нечего выбрасывать");
            } else if (item == smth){
                item = null;
                System.out.println("Из коробки выбросили " + smth);
            } else {
                System.out.println("Из коробки нельзя выбросить то, чего в ней нет");
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }

}
