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
        <a class="navbar-brand" href="#"><img src="https://i.pinimg.com/736x/55/15/6d/55156dcf9b1b31041198fce6f98a8b46.jpg" width="40px" height="40px"style="border-radius: 30px;"></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/sanpham/list">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/sanpham/add">Add Product</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/sanpham/categories">Categories</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/sanpham/reports">Reports</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/sanpham/contact">Contact</a>
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
            <th scope="col">ID</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên</th>
            <th scope="col">Trạng thái</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="x" items="${page.content}">
            <tr>
                <td>${x.id}</td>
                <td>${x.ma}</td>
                <td>${x.ten}</td>
                <td>${x.trangThai ? "Còn" : "Hết"}</td>
                <td>
                    <a href="" type="button" class="btn btn-primary">Detail</a>
                    <a href="" type="button" class="btn btn-info">Edit</a>
                    <a href="" type="button" class="btn btn-danger">Remove</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <div class="d-flex justify-content-center">
        <a href="/sanpham/list" class="btn btn-secondary mx-1">First</a>
        <a href="/sanpham/list?p=${page.first ? 0 : page.number - 1}" class="btn btn-secondary mx-1">Prev</a>
        <a href="/sanpham/list?p=${page.last ? page.totalPages - 1 : page.number + 1}" class="btn btn-secondary mx-1">Next</a>
        <a href="/sanpham/list?p=${page.totalPages - 1}" class="btn btn-secondary mx-1">Last</a>
