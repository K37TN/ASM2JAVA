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
<form class="" action="">
    <div class="col-auto">

        <input type="text" class="form-control" placeholder="Tìm Kiếm" name="id" >
    </div>
    <div class="col-auto">
        <button type="submit" class="btn btn-primary mb-3">Seach</button>
    </div>
    <div class="col-auto">
        <a href="" class="btn btn-success mb-3">ADD</a>
    </div>
</form>
<table class="table table-striped">
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
    <c:forEach var="x" items="${list}">
        <tr>
            <td>${x.id}</td>
            <td>${x.ma}</td>
            <td>${x.ten}</td>
            <td>${x.trangThai == 0?"Còn":"Hết"}</td>
            <td><a href="" type="button" class="btn btn-primary">Detail</a>
                <a href="" type="button" class="btn btn-info">Edit</a>
                <a href="" type="button" class="btn btn-danger">Remove</a></td>

        </tr>
    </c:forEach>

    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
</body>
</html>