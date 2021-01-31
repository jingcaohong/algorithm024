public class NewDeque{
    public static void main(String[] args) {
        Deque dq=new LinkedList();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}