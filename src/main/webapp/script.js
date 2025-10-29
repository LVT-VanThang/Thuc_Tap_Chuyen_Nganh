// --- Xử lý Tabs trên trang Mượn/Trả ---
function openTab(evt, tabName) {
    // Ẩn tất cả nội dung của các tab
    const tabcontent = document.getElementsByClassName("tab-content");
    for (let i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
        tabcontent[i].classList.remove("active");
    }

    // Xóa lớp 'active' khỏi tất cả các nút tab
    const tablinks = document.getElementsByClassName("tab-link");
    for (let i = 0; i < tablinks.length; i++) {
        tablinks[i].classList.remove("active");
    }

    // Hiển thị tab hiện tại và thêm lớp 'active' vào nút đã bấm
    document.getElementById(tabName).style.display = "block";
    document.getElementById(tabName).classList.add("active");
    evt.currentTarget.classList.add("active");
}

// Mở tab đầu tiên theo mặc định khi trang tải
document.addEventListener("DOMContentLoaded", function() {
    const firstTab = document.querySelector(".tab-link");
    if (firstTab) {
        firstTab.click();
    }
});


// --- Xử lý Modal (Popup) cho Form Thêm/Sửa ---
function openModal(modalId) {
    const modal = document.getElementById(modalId);
    if (modal) {
        modal.style.display = "block";
    }
}

function closeModal(modalId) {
    const modal = document.getElementById(modalId);
    if (modal) {
        modal.style.display = "none";
    }
}

// Đóng modal khi người dùng bấm ra ngoài vùng nội dung
window.onclick = function(event) {
    const modals = document.getElementsByClassName('modal');
    for (let i = 0; i < modals.length; i++) {
        if (event.target == modals[i]) {
            modals[i].style.display = "none";
        }
    }
}/**
 * 
 */