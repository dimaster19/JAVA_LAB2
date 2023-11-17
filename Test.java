
public class Test {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 5);
        Rectangle rect3 = new Rectangle(2, 2, 10, 10);
        System.out.println("------Проверка конструкторов:------");
        rect1.rect_print();
        rect2.rect_print();
        rect3.rect_print();
        System.out.println("------Проверка метода move():------");
        rect1.move(11, 1);
        rect1.rect_print();
        rect2.move(1, 1);
        rect2.rect_print();
        rect3.move(11, 12);
        rect3.rect_print();
        System.out.println("------Проверка метода union():------");
        rect1.union(rect2, rect3);
        rect1.rect_print();
      

    }
}