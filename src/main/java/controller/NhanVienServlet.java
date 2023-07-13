package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.entity.ChucVu;
import model.entity.CuaHang;
import model.entity.KhachHang;
import model.entity.NhanVien;
import service.NameObjectService;
import service.imple.ChucVuService;
import service.imple.CuaHangService;
import service.imple.NhanVienService;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@WebServlet({
        "/nhan-vien/index",
        "/nhan-vien/create",
        "/nhan-vien/insert",
        "/nhan-vien/edit",
        "/nhan-vien/update",
        "/nhan-vien/delete"
})
public class NhanVienServlet extends HttpServlet {
    private final NameObjectService<ChucVu> chucVuService;
    private final NameObjectService<CuaHang> cuaHangService;
    private final NameObjectService<NhanVien> nhanVienService;


    public NhanVienServlet() {
        nhanVienService = new NhanVienService();
        cuaHangService = new CuaHangService();
        chucVuService = new ChucVuService();
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
        request.setAttribute("list", nhanVienService.findAllByObject());
        request.getRequestDispatcher("/views/nhan-vien/index.jsp")
                .forward(request, response);

    }

    protected void create(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<CuaHang> cuaHangList = cuaHangService.findAllByObject();
        List<ChucVu> chucVuList = chucVuService.findAllByObject();
        request.setAttribute("listCuaHang", cuaHangList);
        request.setAttribute("listChucVu", chucVuList);
        request.setAttribute("listGuiBC", nhanVienService.findAllByObject());
        request.getRequestDispatcher("/views/nhan-vien/create.jsp")
                .forward(request, response);
    }

    protected void edit(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        NhanVien nhanVien = nhanVienService
                .findAllByObject()
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst().orElse(null);
        Optional<NhanVien> optional = Optional.ofNullable(nhanVien);
        List<CuaHang> cuaHangList = cuaHangService.findAllByObject();
        List<ChucVu> chucVuList = chucVuService.findAllByObject();
        request.setAttribute("listCuaHang", cuaHangList);
        request.setAttribute("listChucVu", chucVuList);
        request.setAttribute("listGuiBC", nhanVienService.findAllByObject());
        if (optional.isPresent()) {
            request.setAttribute("nhanVien", optional.get());
            request.getRequestDispatcher("/views/nhan-vien/edit.jsp")
                    .forward(request, response);
        }

    }

    protected void delete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        NhanVien nv = nhanVienService
                .findAllByObject()
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst().orElse(null);
        nv.setTrangThai(false);
        nhanVienService.delete(nv);
        request.setAttribute("list", nhanVienService.findAllByObject());
        request.getRequestDispatcher("/views/nhan-vien/index.jsp")
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
        int id = (int) nhanVienService.findAllByObject().stream().count();
        String ma = request.getParameter("ma");
        String ho = request.getParameter("ho");
        String tenDem = request.getParameter("tenDem");
        String ten = request.getParameter("ten");
        String gioiTinh = request.getParameter("gioiTinh");
        String ngaySinh = request.getParameter("ngaySinh");
        String sdt = request.getParameter("sdt");
        String diaChi = request.getParameter("diaChi");
        String matKhau = request.getParameter("matKhau");
        int idCH = Integer.parseInt(request.getParameter("idCH"));
        int idCV = Integer.parseInt(request.getParameter("idCV"));
        int idGuiBC = Integer.parseInt(request.getParameter("idGuiBC"));
        boolean gt = true;
        if (gioiTinh.equals("Nữ")) {
            gt = false;
        }
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(ngaySinh);
            NhanVien nhanVien = new NhanVien(++id, ma, ho, tenDem, ten, gt, date, diaChi, sdt, matKhau, idCH, idCV, idGuiBC, true);
            if (nhanVien != null) {
                nhanVienService.save(nhanVien);
                request.setAttribute("list", nhanVienService.findAllByObject());
                request.getRequestDispatcher("/views/nhan-vien/index.jsp")
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
        String gioiTinh = request.getParameter("gioiTinh");
        String ngaySinh = request.getParameter("ngaySinh");
        String sdt = request.getParameter("sdt");
        String diaChi = request.getParameter("diaChi");
        String matKhau = request.getParameter("matKhau");
        int idCH = Integer.parseInt(request.getParameter("idCH"));
        int idCV = Integer.parseInt(request.getParameter("idCV"));
        int idGuiBC = Integer.parseInt(request.getParameter("idGuiBC"));
        boolean gt = true;
        if (gioiTinh.equals("Nữ")) {
            gt = false;
        }
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = dateFormat.parse(ngaySinh);
            NhanVien nhanVien = new NhanVien(id, ma, ho, tenDem, ten, gt, date, diaChi, sdt, matKhau, idCH, idCV, idGuiBC, true);
            if (nhanVien != null) {
                nhanVienService.update(nhanVien);
                request.setAttribute("list", nhanVienService.findAllByObject());
                request.getRequestDispatcher("/views/nhan-vien/index.jsp")
                        .forward(request, response);
            } else {
                request.setAttribute("loi", "Khong thanh cong");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
