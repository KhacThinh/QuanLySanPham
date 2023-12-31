<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: khact
  Date: 05/07/2023
  Time: 10:46 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chức Vụ</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
</head>
<body>
<div class="container">
    <div class="row py-5">
        <h1>Dòng sp</h1>
        <a href="/QuanLiCuaHang_war_exploded/dong-sp/create" class="btn btn-primary"><i class="bi bi-person-add"></i>
            Thêm</a>
    </div>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Mã Dòng SP</th>
            <th scope="col">Tên Dòng SP</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="dongSP" items="${list}">
            <tr>
                <th scope="row">${dongSP.id}</th>
                <td>${dongSP.ma}</td>
                <td>${dongSP.ten}</td>
                <td><a href="/QuanLiCuaHang_war_exploded/dong-sp/edit?id=${dongSP.id}"
                       class="btn btn-outline-warning"><i
                        class="bi bi-pencil"></i> Edit</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="http://localhost:8080/QuanLiCuaHang_war_exploded/" class="btn btn-primary"><i
            class="bi bi-house-down-fill"></i> Home</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
        integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
        crossorigin="anonymous"></script>
</body>
</html>
