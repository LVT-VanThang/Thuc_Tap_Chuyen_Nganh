package view;

import java.util.List;

import javax.persistence.EntityManager;
import model.Sach;
import util.HibernateUtil;

public class SachDAO {
      public List<Sach> layDanhSachSach(){
    	  EntityManager em =HibernateUtil.getEMF().createEntityManager();
    	  List<Sach> dss=em.createQuery("from sach").getResultList();
    	  em.close();
    	  return dss;
      }
      public Sach timKiemTheoMa(int idSach) {
    	  EntityManager em =HibernateUtil.getEMF().createEntityManager();
    	  Sach s=em.find(Sach.class, idSach);
    	  return s;
      }
      public Sach timKiemTheoTacGia(String tacGia ) {
    	  EntityManager em =HibernateUtil.getEMF().createEntityManager();
    	  Sach s=em.find(Sach.class, tacGia);
    	  return s;
      }
}
