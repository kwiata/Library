public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book();

        book1.title = "Sapiens. Od zwierząt do bogów";
        book1.author = "Yuval Noah Harari";
        book1.releaseDate = 2014;
        book1.pages = 540;
        book1.publisher = "Wydawnictwo Literackie";
        book1.isbn = "978-83-08-06814-4";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece: ");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);
    }
}
