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

<form action="" method="post" class="container">
    <div class="mb-3">
        <label  class="form-label">ID</label>
        <input type="text" class="form-control" name="id" value="${list.id}" readonly>
    </div>
    <div class="mb-3">
        <label  class="form-label">Ma</label>
        <input type="text" class="form-control" name="ma" value="${list.ma}" readonly>
    </div>
    <div class="mb-3">
        <label  class="form-label">Tên</label>
        <input type="text" class="form-control" name="ten" value="${list.ten}" readonly>
    </div>

    <div class="form-check">
        <input class="form-check-input" type="radio" name="trangThai" value="true" ${list.trangThai == "Còn" ? "" : "checked"} disabled>
        <label class="form-check-label">
            Còn
        </label>
    </div>
    <div class="form-check">
        <input class="form-check-input" type="radio" name="trangThai" value="false" ${list.trangThai == "Hết" ? "checked" : ""} disabled>
        <label class="form-check-label">
            Hết
        </label>
    </div>

    <a href="/kichthuoc/list" class="btn btn-primary">Quay Lại</a>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>