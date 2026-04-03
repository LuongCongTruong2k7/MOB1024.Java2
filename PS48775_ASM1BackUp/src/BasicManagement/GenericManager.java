package BasicManagement;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GenericManager<T> implements Serializable {
    Map<String, T> mapData = new HashMap<>();

    public void them(String id, T doc) throws DuplicateIdException {
        if (mapData.containsKey(id.toLowerCase())) {
            throw new DuplicateIdException("ID đã tồn tại: " + id);
        }
        mapData.put(id.toLowerCase(), doc);
    }

    public void sua(String id, T item) throws Exception {
        if (!mapData.containsKey(id.toLowerCase())) {
            throw new Exception("ID không tồn tại: " + id);
        }
        mapData.put(id.toLowerCase(), item);
    }

    public void xoa(String id) throws Exception {
        if (!mapData.containsKey(id.toLowerCase())) {
            throw new Exception("ID không tồn tại: " + id);
        }
        mapData.remove(id.toLowerCase());
    }

    public void hienThi() {
        if (mapData.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        mapData.forEach((id, item) -> System.out.println("ID: " + id + ", Item: " + item));
    }

    public T layDuLieu(String id) {
        return mapData.get(id.toLowerCase());
    }
}
