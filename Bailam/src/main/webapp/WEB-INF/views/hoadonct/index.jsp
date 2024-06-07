<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>

<!-- Enhanced Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><img
                src="https://i.pinimg.com/736x/55/15/6d/55156dcf9b1b31041198fce6f98a8b46.jpg" width="40px" height="40px"
                style="border-radius: 30px;"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/sanpham/list">Sản Phẩm</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Thông tin HĐ - SP
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/hoadon/list">Hóa Đơn</a></li>
                        <li><a class="dropdown-item" href="/hoadonct/list">Hóa đơn chi tiết</a></li>
                        <li>
                            <hr class="dropdown-divider">
                        </li>
                        <li><a class="dropdown-item" href="/sanphamct/list">Sản Phẩm Chi Tiết</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/khachhang/list">Khách hàng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/nhanvien/list">Nhân Viên</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/mausac/list">Mau Sac</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/kichthuoc/list">Kích thước</a>
                </li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-light" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="container mt-4">
    <table class="table table-striped" style="background: darkgray">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">IDHĐ</th>
            <th scope="col">IDSPCT</th>
            <th scope="col">Số lượng</th>
            <th scope="col">Đơn giá</th>
            <th scope="col">Thời gian</th>
            <th scope="col">Trạng thái</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="x" items="${page.content}">
            <tr>
                <td>${x.id}</td>
                <td>${x.idhd}</td>
                <td>${x.idspct}</td>
                <td>${x.soLuong}</td>
                <td>${x.donGia}</td>
                <td>${x.thoiGian}</td>
                <td>${x.trangThai?"Đã thanh toán":"Chưa thanh toán"}</td>
                <td>
                    <a href="/hoadonct/showadd?id=${x.id}" type="button" class="btn btn-success">ADD</a>
                    <a href="/hoadonct/detail?id=${x.id}" type="button" class="btn btn-primary">Detail</a>
                    <a href="/hoadonct/showupdate?id=${x.id}" type="button" class="btn btn-info">Edit</a>
                    <a href="/hoadonct/delete?id=${x.id}" type="button" class="btn btn-danger">Remove</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="d-flex justify-content-center">
        <a href="/hoadonct/list" class="btn btn-secondary mx-1"><<</a>
        <a href="/hoadonct/list?p=${page.first ? 0 : page.number - 1}" class="btn btn-secondary mx-1"><<|</a>
        <a href="/hoadonct/list?p=${page.last ? page.totalPages - 1 : page.number + 1}" class="btn btn-secondary mx-1">|>></a>
        <a href="/hoadonct/list?p=${page.totalPages - 1}" class="btn btn-secondary mx-1">>></a>
    </div>


</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>