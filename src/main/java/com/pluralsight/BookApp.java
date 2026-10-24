package com.pluralsight;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Book[] books = new Book[20];

        books[0] = new Book(1, "978-0-10-000001-1", "The Hobbit", false, "");
        books[1] = new Book(2, "978-0-10-000002-2", "The Fellowship of the Ring", false, "");
        books[2] = new Book(3, "978-0-10-000003-3", "Harry Potter and the Sorcerer's Stone", false, "");
        books[3] = new Book(4, "978-0-10-000004-4", "Harry Potter and the Chamber of Secrets", false, "");
        books[4] = new Book(5, "978-0-10-000005-5", "The Lion, the Witch and the Wardrobe", false, "");
        books[5] = new Book(6, "978-0-10-000006-6", "A Game of Thrones", false, "");
        books[6] = new Book(7, "978-0-10-000007-7", "The Name of the Wind", false, "");
        books[7] = new Book(8, "978-0-10-000008-8", "Mistborn: The Final Empire", false, "");
        books[8] = new Book(9, "978-0-10-000009-9", "The Way of Kings", false, "");
        books[9] = new Book(10, "978-0-10-000010-0", "The Eye of the World", false, "");
        books[10] = new Book(11, "978-0-10-000011-1", "Eragon", false, "");
        books[11] = new Book(12, "978-0-10-000012-2", "The Golden Compass", false, "");
        books[12] = new Book(13, "978-0-10-000013-3", "A Wizard of Earthsea", false, "");
        books[13] = new Book(14, "978-0-10-000014-4", "American Gods", false, "");
        books[14] = new Book(15, "978-0-10-000015-5", "The Hunger Games", false, "");
        books[15] = new Book(16, "978-0-10-000016-6", "Percy Jackson: The Lightning Thief", false, "");
        books[16] = new Book(17, "978-0-10-000017-7", "The Da Vinci Code", false, "");
        books[17] = new Book(18, "978-0-10-000018-8", "The Alchemist", false, "");
        books[18] = new Book(19, "978-0-10-000019-9", "Dune", false, "");
        books[19] = new Book(20, "978-0-10-000020-5", "The Giver", false, "");

        Scanner scanner = new Scanner(System.in);

        int command = 0;
        while (command != 3) {
            System.out.println("----HOME SCREEN----\n");
            System.out.println("[1] - Show Available Books");
            System.out.println("[2] - Show Checked Out Books");
            System.out.println("[3] - Exit\n");
            System.out.println("Enter number:");
            command = scanner.nextInt();
            scanner.nextLine();

        switch (command) {
            case 1:
                showAvailable(books, scanner);
                break;
            case 2:
                break;
        }
        }

    }

    public static void showAvailable(Book[] books, Scanner scanner) {
        while (true) {
            System.out.println("---- Available Books ----");
            boolean anyAvailable = false;

            for (Book book : books) {
                if (!book.isCheckedOut()) {
                    System.out.println(book);
                    anyAvailable = true;
                }
            }

            if (!anyAvailable) {
                System.out.println("No books available");
                return;
            }

            System.out.println("\nEnter a book ID to check out, or type 'exit' to go back: ");
            String input = scanner.nextLine().trim().equalsIgnoreCase();

            if (input.equalsIgnoreCase("exit")) {
                return;
            }


        }
    }


    public static void checkOut(Book[] books) {
        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println(book);
            }
        }
    }

}
