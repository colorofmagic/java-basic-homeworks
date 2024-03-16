package homework4;

public class Box {
    private int height;
    private int width;
    private int depth;
    private String color;
    private boolean isOpen;
    private String boxFilling;

    public Box(int height, int width, int depth, String color, boolean isOpen, String boxFilling) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.color = color;
        this.isOpen = isOpen;
        this.boxFilling = boxFilling;
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

    public void info() {
        System.out.println("Размеры коробки: " + height + "*" + width + "*" + depth);
        System.out.println("Цвет коробки:" + color);
    }

    public void fill(String boxFilling, boolean isOpen, String str) {
        if (isOpen) {
            if (boxFilling == null) {
                boxFilling = str;
                System.out.println("В коробку положили " + str);
            } else {
                System.out.println("Коробка открыта, но она заполнена");
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }

    public void clear(boolean isOpen, String smth) {
        if (isOpen) {
            if (boxFilling == null) {
                System.out.println("Коробка пустая, из нее нечего выбрасывать");
            } else if (boxFilling == smth){
                boxFilling = null;
                System.out.println("Из коробки выбросили " + smth);
            } else {
                System.out.println("Из коробки нельзя выбросить то, чего в ней нет ;)");
            }
        } else {
            System.out.println("Коробка закрыта");
        }
    }

}
