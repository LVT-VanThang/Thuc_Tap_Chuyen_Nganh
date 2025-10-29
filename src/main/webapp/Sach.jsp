<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
      <aside class="sidebar">
        <h2>Thư viện ABC</h2>
        <nav>
            <ul>
                <li><a href="trang_chu.html">Trang chủ</a></li>
                <li><a href="quan-ly-sach.html" class="active">Quản lý Sách</a></li>
                <li><a href="quan-ly-doc-gia.html">Quản lý Độc giả</a></li>
                <li><a href="quan-ly-muon-tra.html">Quản lý Mượn/Trả</a></li>
            </ul>
        </nav>
    </aside>

    <main class="main-content">
        <div class="container">
            <h1>Danh sách Sách</h1>
            <div class="toolbar">
                <form action="DanhSachSach" method="get" class="search-bar">
                    <input type="text" name="tuKhoa" placeholder="Tìm theo tên sách, tác giả..." value="${param.tuKhoa}">
                    <button type="submit" class="btn btn-primary">Tìm kiếm</button>
                </form>
                <button class="btn btn-primary" onclick="openModal('bookModal')">Thêm sách mới</button>
            </div>
            <table class="data-table">
                <thead>
                    <tr>
                        <th>Mã Sách</th>
                        <th>Tên sách</th>
                        <th>Tác giả</th>
                        <th>ISBN</th>
                        <th>Nhà Xuất Bản</th>
                        <th>Năm Xuất Bản</th>
                        <th>Thể loại</th>
                        <th>Số lượng </th>
                        <th>Hành động </th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                  <c:forEach var="s" items="${dss}">
                  <tr>
                        <td>${s.idSach}</td>
                        <td>${s.tenSach}</td>
                        <td>${s.tacGia}</td>
                        <td>${s.isbn}</td>
                        <td>${s.nhaXuatBan}</td>
                        <td>${s.namXuatBan}</td>
                        <td>${s.theLoai}</td>
                        <td>${s.soLuong}</td>
                        <td>
                            <button class="btn btn-warning">Sửa</button>
                            <button class="btn btn-danger">Xóa</button>
                        </td>
                    </tr>
                  </c:forEach>
                    
                </tbody>
            </table>
        </div>
    </main>

    <div id="bookModal" class="modal">
      <div class="modal-content">
        <span class="close-btn" onclick="closeModal('bookModal')">&times;</span>
        <h2>Thêm sách mới</h2>
        <form>
            <div class="form-group"><label>Mã Sách</label><input type="text"></div>
            <div class="form-group"><label>Tiêu đề sách</label><input type="text"></div>
            <div class="form-group"><label>Tác giả</label><input type="text"></div>
            <div class="form-group"><label>ISBN</label><input type="text"></div>
            <div class="form-group"><label>Nhà xuất bản</label><input type="text"></div>
            <div class="form-group"><label>Năm xuất bản</label><input type="number"></div>
            <div class="form-group"><label>Thể loại</label><input type="text"></div>
            <div class="form-group"><label>Số lượng</label><input type="number"></div>
            <button type="submit" class="btn btn-success">Lưu lại</button>
        </form>
      </div>
    </div>

    <script src="script.js"></script>
</body>
</html>