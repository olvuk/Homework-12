package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author mihailLermontov = new Author("Михаил", "Лермонтов");
        Author aleksandrPushkin = new Author("Александр", "Пушкин");
        Author aleksandrPeshkin = new Author("Александр", "Пушкин");
        Book vojnaIMir = new Book(levTolstoy, "Война и мир", 1863);
        Book maskarad = new Book(mihailLermontov, "Маскарад", 1835);
        Book pikovayaDama = new Book(aleksandrPushkin, "Пиковая дама", 1833);
        Book pikovajaDama = new Book(aleksandrPushkin, "Пиковая дама", 1834);

        System.out.println(aleksandrPushkin.equals(aleksandrPeshkin));
        System.out.println(aleksandrPeshkin.hashCode());
        System.out.println(aleksandrPushkin.hashCode());
        System.out.println(pikovayaDama.equals(pikovajaDama));
        System.out.println(pikovajaDama.hashCode());
        System.out.println(pikovayaDama.hashCode());

        System.out.println(vojnaIMir);
        System.out.println(maskarad);
        System.out.println(pikovayaDama);

        maskarad.setYear(1834);
        System.out.println(maskarad);




    }
}
