public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.3";

        Book book1 = new Book("Sapiens. Od zwierząt do bogów", "Yuval Noah Harari",
                2014, 540, "Wydawnictwo Literackie",
                "978-83-08-06814-4");
        Book book2 = new Book("Pan raczy żartować, panie Feynman!", "Richard Feynman",
                2007, 350, "Wydawnictwo Znak", "978-83-240-0776-9");
        Book book3 = new Book("Algorytmy bez tajemnic" , "Thomas Cormen" , 2013,
                224, "Wydawnictwo HELION", "978-83-246-7482-4");


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece: ");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
