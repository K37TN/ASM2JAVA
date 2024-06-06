<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<H1>BÀI LÀM</H1>
<table>
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
    <c:forEach items="${list}" var="x">
        <tr>
            <td>${x.id}</td>
            <td>${x.ma}</td>
            <td>${x.ten}</td>
            <td>${x.trangThai}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>