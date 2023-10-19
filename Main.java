// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Singlyllist lkist = new Singlyllist();
        lkist.insertNodeStart(4);
        lkist.insertNodeStart(5);
        lkist.insertNodeStart(60);
        lkist.insertNodeStart(70);
        lkist.insertNodeStart(80);
        lkist.insertAfterValue(80, 90);
        lkist.print();
        lkist.deleteAtStart();
        lkist.print();
        lkist.deleteAtEnd();
        lkist.print();

        lkist.deleteAtPos(3);
        lkist.print();
        }
    }
