public class Main {
    public static void main(String[] args) {
        LinkedList listTest = new LinkedList();

        for (int i = 0; i <= 5; i++) {
            listTest = LinkedList.insertLast(listTest, i);
        }
        printListTest(listTest);


        listTest = LinkedList.insertAtLocation(listTest, 3, 10);
        printListTest(listTest);


        listTest = LinkedList.removeAtLocation(listTest, 3);
        printListTest(listTest);

        listTest = LinkedList.insertAtLocation(listTest, 0, 69);
        printListTest(listTest);
    }

    public static void printListTest(LinkedList listTest) {
        for (int i = 0; i < LinkedList.size(listTest); i++) {
            System.out.print(LinkedList.getNodeAtLocation(listTest, i).data + " ");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
