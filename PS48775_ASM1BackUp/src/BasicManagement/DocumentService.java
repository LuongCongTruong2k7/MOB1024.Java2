package BasicManagement;

import java.io.*;

public class DocumentService {
    GenericManager<Document> docManager = new GenericManager<>();
    String File_Name = "documents.dat";
    

    public GenericManager<Document> getDocManager() {
        return docManager;
    }

    public void luuFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(File_Name))) {
            oos.writeObject(docManager);
            System.out.println("Lưu dữ liệu thành công");
        } catch (IOException e) {
            System.out.println("Lỗi lưu file: " + e.getMessage());
        }
    }

    public void docFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(File_Name))) {
            docManager = (GenericManager<Document>) ois.readObject();
            System.out.println("Đọc dữ liệu thành công");
            docManager.hienThi();
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
