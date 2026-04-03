package BasicManagement;

import java.io.Serializable;

public class Copy implements Serializable {
	private String maBanSao;
	private TrangThai trangThai;

	public Copy() {
	}

	public Copy(String maBanSao, TrangThai trangThai) {
		this.maBanSao = maBanSao;
		this.trangThai = trangThai;
	}

	public String getMaBanSao() {
		return maBanSao;
	}

	public void setMaBanSao(String maBanSao) {
		this.maBanSao = maBanSao;
	}

	public TrangThai getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(TrangThai trangThai) {
		this.trangThai = trangThai;
	}

	@Override
	public String toString() {
		return "Copy [maBanSao=" + maBanSao + ", trangThai=" + trangThai + "]";
	}
}
