package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sach database table.
 * 
 */
@Entity
@NamedQuery(name="Sach.findAll", query="SELECT s FROM Sach s")
public class Sach implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sach")
	private int idSach;

	private String isbn;

	@Column(name="nam_xuat_ban")
	private int namXuatBan;

	@Column(name="nha_xuat_ban")
	private String nhaXuatBan;

	@Column(name="so_luong")
	private int soLuong;

	@Column(name="tac_gia")
	private String tacGia;

	@Column(name="ten_sach")
	private String tenSach;

	@Column(name="the_loai")
	private String theLoai;

	public Sach() {
	}

	public int getIdSach() {
		return this.idSach;
	}

	public void setIdSach(int idSach) {
		this.idSach = idSach;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getNamXuatBan() {
		return this.namXuatBan;
	}

	public void setNamXuatBan(int namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public String getNhaXuatBan() {
		return this.nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTacGia() {
		return this.tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public String getTenSach() {
		return this.tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTheLoai() {
		return this.theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

}