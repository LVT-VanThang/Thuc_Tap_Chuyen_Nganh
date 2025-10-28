package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tai_khoan database table.
 * 
 */
@Entity
@Table(name="tai_khoan")
@NamedQuery(name="TaiKhoan.findAll", query="SELECT t FROM TaiKhoan t")
public class TaiKhoan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_quan_ly")
	private int idQuanLy;

	@Column(name="mat_khau")
	private String matKhau;

	@Column(name="ten_dang_nhap")
	private String tenDangNhap;

	public TaiKhoan() {
	}

	public int getIdQuanLy() {
		return this.idQuanLy;
	}

	public void setIdQuanLy(int idQuanLy) {
		this.idQuanLy = idQuanLy;
	}

	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getTenDangNhap() {
		return this.tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

}