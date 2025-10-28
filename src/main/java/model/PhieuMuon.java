package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the phieu_muon database table.
 * 
 */
@Entity
@Table(name="phieu_muon")
@NamedQuery(name="PhieuMuon.findAll", query="SELECT p FROM PhieuMuon p")
public class PhieuMuon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_phieu")
	private int idPhieu;

	//bi-directional many-to-one association to Sach
	@ManyToOne
	@JoinColumn(name="id_sach")
	private Sach sach;
	
	//bi-directional many-to-one association to DocGia
	@ManyToOne
	@JoinColumn(name="id_doc_gia")
	private DocGia docGia;

	@Temporal(TemporalType.DATE)
	@Column(name="ngay_hen_tra")
	private Date ngayHenTra;

	@Temporal(TemporalType.DATE)
	@Column(name="ngay_muon")
	private Date ngayMuon;

	@Temporal(TemporalType.DATE)
	@Column(name="ngay_tra_thuc_te")
	private Date ngayTraThucTe;

	@Column(name="trang_thai")
	private String trangThai;

	

	public PhieuMuon() {
	}

	public int getIdPhieu() {
		return this.idPhieu;
	}

	public void setIdPhieu(int idPhieu) {
		this.idPhieu = idPhieu;
	}

	

	public Date getNgayHenTra() {
		return this.ngayHenTra;
	}

	public void setNgayHenTra(Date ngayHenTra) {
		this.ngayHenTra = ngayHenTra;
	}

	public Date getNgayMuon() {
		return this.ngayMuon;
	}

	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public Date getNgayTraThucTe() {
		return this.ngayTraThucTe;
	}

	public void setNgayTraThucTe(Date ngayTraThucTe) {
		this.ngayTraThucTe = ngayTraThucTe;
	}

	public String getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public DocGia getDocGia() {
		return this.docGia;
	}

	public void setDocGia(DocGia docGia) {
		this.docGia = docGia;
	}
	public Sach getSach() {
		return this.sach;
	}

	public void setIdSach(Sach sach) {
		this.sach =sach ;
	}

}