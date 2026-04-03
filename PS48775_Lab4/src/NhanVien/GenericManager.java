package NhanVien;

import java.util.ArrayList;
import java.util.List;

public class GenericManager<T> {
    List<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void display() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        } else {
            list.forEach(item -> System.out.println(item));
        }
    }

    public int getSize() {
        return list.size();
    }

    public T getFirst() throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("Danh sách rỗng");
        }
        return list.get(0);
    }

    public T getLast() throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("Danh sách rỗng");
        }
        return list.get(list.size() - 1);
    }
}
