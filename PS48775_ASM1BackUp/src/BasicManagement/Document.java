package BasicManagement;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Document implements Serializable {
    private String maTaiLieu;
    private String tenTaiLieu;
    Map<String, Copy> listBanSao = new HashMap<>();

    public Document(String maTaiLieu, String tenTaiLieu) {
        this.maTaiLieu = maTaiLieu;
        this.tenTaiLieu = tenTaiLieu;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public Map<String, Copy> getListBanSao() {
        return listBanSao;
    }

    public void setListBanSao(Map<String, Copy> listBanSao) {
        this.listBanSao = listBanSao;
    }

    public void themBanSao(Copy copy) throws DuplicateIdException {
        if (listBanSao.containsKey(copy.getMaBanSao().toLowerCase())) {
            throw new DuplicateIdException("Mã bản sao đã tồn tại");
        }
        listBanSao.put(copy.getMaBanSao().toLowerCase(), copy);
    }

    public void suaBanSao(Copy oldCopy, Copy newCopy) {
        listBanSao.put(newCopy.getMaBanSao().toLowerCase(), newCopy);
    }

    public void xoaBanSao(Copy copy) {
        listBanSao.remove(copy.getMaBanSao().toLowerCase());
    }

    public void hienThiBanSao() {
        listBanSao.forEach((key, value) -> System.out.println("ID: " + key + ", Item: " + value));
    }

    @Override
    public String toString() {
        return "Document [maTaiLieu=" + maTaiLieu + ", tenTaiLieu=" + tenTaiLieu + ", listBanSao=" + listBanSao + "]";
    }
}
