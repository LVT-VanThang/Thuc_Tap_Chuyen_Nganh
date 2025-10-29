package view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Sach;
import util.HibernateUtil;

public class SachDAO {
      public List<Sach> layDanhSachSach(){
    	  EntityManager em =HibernateUtil.getEMF().createEntityManager();
    	  List<Sach> dss=em.createQuery("from Sach").getResultList();
    	  em.close();
    	  return dss;
      }
      public Sach timKiemTheoMa(int idSach) {
    	  EntityManager em =HibernateUtil.getEMF().createEntityManager();
    	  Sach s=em.find(Sach.class, idSach);
    	  return s;
      }
      public List<Sach> timKiemTheoTacGia(String tacGia ) {
    	  EntityManager em =HibernateUtil.getEMF().createEntityManager();
    	  try {
			 String jpql ="SELECT s FROM Sach s WHERE s.tacGia= :tenTacGia";
			 TypedQuery<Sach> lenh =em.createQuery(jpql, Sach.class); 
			 lenh.setParameter("tenTacGia", tacGia);
			 return lenh.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ArrayList<>();
		}finally {
	        if (em != null) {
	            em.close();
	        }
		}
      }
      public List<Sach> timKiemTheoTenSach(String tenSach ) {
    	  EntityManager em =HibernateUtil.getEMF().createEntityManager();
    	  try {
			 String jpql ="SELECT s FROM Sach s WHERE s.tenSach= :tenSach";
			 TypedQuery<Sach> lenh =em.createQuery(jpql, Sach.class); 
			 lenh.setParameter("tenSach", tenSach);
			 return lenh.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new ArrayList<>();
		}finally {
	        if (em != null) {
	            em.close();
	        }
		}
      }
      public void themSach(Sach sach) {
          EntityManager em = HibernateUtil.getEMF().createEntityManager();
          try {
              em.getTransaction().begin();
              em.persist(sach);
              em.getTransaction().commit(); 
          } catch (Exception e) {
              if (em.getTransaction().isActive()) {
                  em.getTransaction().rollback();
              }
              e.printStackTrace();
          } finally {
              if (em != null && em.isOpen()) {
                  em.close();
              }
          }
      }

      public void xoaSach(int maSach) {
          EntityManager em = HibernateUtil.getEMF().createEntityManager();
          try {
              em.getTransaction().begin();
              Sach sachCanXoa = em.find(Sach.class, maSach);
              if (sachCanXoa != null) {
                  em.remove(sachCanXoa);
              }
              em.getTransaction().commit();
          } catch (Exception e) {
              if (em.getTransaction().isActive()) {
                  em.getTransaction().rollback();
              }
              e.printStackTrace();
          } finally {
              if (em != null && em.isOpen()) {
                  em.close();
              }
          }
      }
}
