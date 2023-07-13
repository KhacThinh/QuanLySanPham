package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.entity.KhachHang;
import service.NameObjectService;
import service.imple.KhachHangService;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet({
        "/khach-hang/index",
        "/khach-hang/create",
        "/khach-hang/insert",
        "/khach-hang/edit",
        "/khach-hang/update",
        "/khach-hang/delete"
})
public class KhachHangServlet extends HttpServlet {

    private final NameObjectService<KhachHang> khachHangService;


    public KhachHangServlet() {
        khachHangService = new KhachHangService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("create")) {
            this.create(request, response);
        } else if (uri.contains("edit")) {
            this.edit(request, response);
        } else if (uri.contains("delete")) {
            this.delete(request, response);
        } else {
            this.index(request, response);
        }
    }

    protected void index(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("list", khachHangService.findAllByObject());
        request.getRequestDispatcher("/views/khach-hang/index.jsp")
                .forward(request, response);
    }

    protected void create(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/views/khach-hang/create.jsp")
                .forward(request, response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        KhachHang khachHang = khachHangService
                .findAllByObject()
                .stream()
                .filter(khachHang1 -> khachHang1.getId() == id)
                .findFirst().orElse(null);
        if (khachHang != null) {
            request.setAttribute("kh", khachHang);
            request.getRequestDispatcher("/views/khach-hang/edit.jsp")
                    .forward(request, response);
        } else {
            System.out.println("rong");
        }
    }

    protected void delete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        KhachHang khachHang = khachHangService
                .findAllByObject()
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst().orElse(null);
        khachHang.setTrangThai(false);
        khachHangService.delete(khachHang);
        request.setAttribute("list", khachHangService.findAllByObject());
        request.getRequestDispatcher("/views/khach-hang/index.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("insert")) {
            this.insert(request, response);
        } else if (uri.contains("update")) {
            this.update(request, response);
        }
    }

    protected void insert(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = khachHangService.findAllByObject().size();
        String ma = request.getParameter("ma");
        String ho = request.getParameter("ho");
        String tenDem = request.getParameter("tenDem");
        String ten = request.getParameter("ten");
        String ngaySinh = request.getParameter("ngaySinh");
        String sdt = request.getParameter("sdt");
        String diaChi = request.getParameter("diaChi");
        String thanhPho = request.getParameter("thanhPho");
        String quocGia = request.getParameter("quocGia");
        String matKhau = request.getParameter("matKhau");
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(ngaySinh);
            KhachHang khachHang = new KhachHang(++id, ma, ho, tenDem, ten, date, sdt, diaChi, thanhPho, quocGia, matKhau);
            if (khachHang != null) {
                khachHangService.save(khachHang);
                request.setAttribute("list", khachHangService.findAllByObject());
                request.getRequestDispatcher("/views/khach-hang/index.jsp")
                        .forward(request, response);
            } else {
                request.setAttribute("loi", "Khong thanh cong");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    protected void update(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String ma = request.getParameter("ma");
        String ho = request.getParameter("ho");
        String tenDem = request.getParameter("tenDem");
        String ten = request.getParameter("ten");
        String ngaySinh = request.getParameter("ngaySinh");
        String sdt = request.getParameter("sdt");
        String diaChi = request.getParameter("diaChi");
        String thanhPho = request.getParameter("thanhPho");
        String quocGia = request.getParameter("quocGia");
        String matKhau = request.getParameter("matKhau");
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = dateFormat.parse(ngaySinh);
            KhachHang khachHang = new KhachHang(id, ma, ho, tenDem, ten, date, sdt, diaChi, thanhPho, quocGia, matKhau);
            if (khachHang != null) {
                khachHangService.update(khachHang);
                request.setAttribute("list", khachHangService.findAllByObject());
                request.getRequestDispatcher("/views/khach-hang/index.jsp")
                        .forward(request, response);
            } else {
                request.setAttribute("loi", "Khong thanh cong");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
