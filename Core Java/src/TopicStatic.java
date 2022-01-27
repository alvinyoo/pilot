public class TopicStatic {

    static class Book {
        int id;
        String isbn;
        String name;
        String author;
        String publish_date;

        public Book(int id, String isbn, String name, String author, String publish_date) {
            this.id = id;
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.publish_date = publish_date;
        }
    }


    static class BookSeller {
        static class Book {
            public static void main() {
                Book books = sellBooks(0, "0439784549", "Harry Potter and the Half-Blood Prince", "J.K. Rowling, "2019-12-21);
            }

            int id;
            String isbn;
            String name;
            String author;
            String publish_date;

            public Book(int id, String isbn, String name, String author, String publish_date) {
                this.id = id;
                this.isbn = isbn;
                this.name = name;
                this.author = author;
                this.publish_date = publish_date;
            }

            public static Book sellBooks(int id, String isbn, String name, String author, String publish_date) {
                return new Book(id, isbn, name, author, publish_date);
            }
        }
    }
}