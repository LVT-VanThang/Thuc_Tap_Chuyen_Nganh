package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Sach;
import view.SachDAO;

/**
 * Servlet implementation class DanhSachSach
 */
@WebServlet("/DanhSachSach")
public class DanhSachSach extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DanhSachSach() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    response.setCharacterEncoding("UTF-8");
	    SachDAO sachDAO=new SachDAO();
	    String tuKhoa=request.getParameter("tuKhoa");
		List<Sach> dss;
		if(tuKhoa !=null && !tuKhoa.trim().isEmpty()) {
			List<Sach> ketQuaTheoTen = sachDAO.timKiemTheoTenSach(tuKhoa);
            List<Sach> ketQuaTheoTacGia = sachDAO.timKiemTheoTacGia(tuKhoa);
            
            Set<Sach> ketQuaGop = new HashSet<>(ketQuaTheoTen);
            ketQuaGop.addAll(ketQuaTheoTacGia);
            dss = new ArrayList<>(ketQuaGop);
		}else {
            dss = sachDAO.layDanhSachSach();
        }
		System.out.println("So luong sach tim thay: " + dss.size());
		request.setAttribute("dss", dss);
		request.getRequestDispatcher("Sach.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
