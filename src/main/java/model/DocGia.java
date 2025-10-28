package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the doc_gia database table.
 * 
 */
@Entity
@Table(name="doc_gia")
@NamedQuery(name="DocGia.findAll", query="SELECT d FROM DocGia d")
public class DocGia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_doc_gia")
	private int idDocGia;

	@Column(name="dia_chi")
	private String diaChi;

	private String email;

	@Column(name="ho_ten")
	private String hoTen;

	private String sdt;

	//bi-directional many-to-one association to PhieuMuon
	@OneToMany(mappedBy="docGia")
	private List<PhieuMuon> phieuMuons;

	public DocGia() {
	}

	public int getIdDocGia() {
		return this.idDocGia;
	}

	public void setIdDocGia(int idDocGia) {
		this.idDocGia = idDocGia;
	}

	public String getDiaChi() {
		return this.diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHoTen() {
		return this.hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getSdt() {
		return this.sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public List<PhieuMuon> getPhieuMuons() {
		return this.phieuMuons;
	}

	public void setPhieuMuons(List<PhieuMuon> phieuMuons) {
		this.phieuMuons = phieuMuons;
	}

	public PhieuMuon addPhieuMuon(PhieuMuon phieuMuon) {
		getPhieuMuons().add(phieuMuon);
		phieuMuon.setDocGia(this);

		return phieuMuon;
	}

	public PhieuMuon removePhieuMuon(PhieuMuon phieuMuon) {
		getPhieuMuons().remove(phieuMuon);
		phieuMuon.setDocGia(null);

		return phieuMuon;
	}

}