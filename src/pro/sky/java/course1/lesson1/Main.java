package pro.sky.java.course1.lesson1;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author mihailLermontov = new Author("Михаил", "Лермонтов");
        Author aleksandrPushkin = new Author("Александр", "Пушкин");
        Book vojnaIMir = new Book(levTolstoy, "Война и мир", 1863);
        Book maskarad = new Book(mihailLermontov, "Маскарад", 1835);
        Book pikovayaDama = new Book(aleksandrPushkin, "Пиковая дама", 1833);

        System.out.println("Автор: " + levTolstoy.getName() + " " + levTolstoy.getSurname() + ", Название: " + vojnaIMir.getName() + ", Год написания: " + vojnaIMir.getYear());
        System.out.println("Автор: " + mihailLermontov.getName() + " " + mihailLermontov.getSurname() + ", Название: " + maskarad.getName() + ", Год написания: " + maskarad.getYear());
        System.out.println("Автор: " + aleksandrPushkin.getName() + " " + aleksandrPushkin.getSurname() + ", Название: " + pikovayaDama.getName() + ", Год написания: " + pikovayaDama.getYear());

        maskarad.setYear(1834);
        System.out.println("Автор: " + mihailLermontov.getName() + " " + mihailLermontov.getSurname() + ", Название: " + maskarad.getName() + ", Год написания: " + maskarad.getYear());




    }
}
