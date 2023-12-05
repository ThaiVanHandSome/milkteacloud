<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>CẬP NHẬT CHI NHÁNH</title>
    <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
    <link href="<c:url value='/templates/admin/css/styles.css'/>" rel="stylesheet" />
    <link href="<c:url value='/templates/admin/css/my-style.css'/>" rel="stylesheet" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
</head>
<body class="sb-nav-fixed">
    <%@include file="/common/admin/header/header.jsp"%>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid px-4">
                <h1 class="mt-4">CẬP NHẬT CHI NHÁNH</h1>
                <ol class="breadcrumb mb-4">
                    <li class="breadcrumb-item"><a style="text-decoration: none" href="/admin/index">Trang chủ</a></li>
                    <li class="breadcrumb-item active"><a style="text-decoration: none; color: black" href="/admin/branch-update">Cập nhật chi nhánh</a></li>
                </ol>
                <div class="card mb-4">
                    <form class="mt-3 ms-3 me-3 mb-3" action="<c:url value="/admin/branch/saveOrUpdate"/>" method="post">
                        <!-- Name -->
                        <div class="mb-3">
                            <label for="exampleInputName" class="form-label">Tên chi nhánh*</label> 
                            <input placeholder="Branch Name" name="name" type="text" class="form-control" id="exampleInputName" aria-describedby="nameHelp" value="${branch.name}" required="required">
                        </div>

                        <!-- Address Detail -->
                        <div class="mb-3">
                            <label for="exampleInputAddressDetail" class="form-label">Địa chỉ chi tiết*</label> 
                            <input placeholder="Address Detail" name="addressDetail" type="text" class="form-control" id="exampleInputAddressDetail" aria-describedby="addressDetailHelp" value="${branch.addressDetail}" required="required">
                        </div>

                        <!-- Open Time -->
                        <div class="mb-3">
                            <label for="exampleInputOpenTime" class="form-label">Giờ mở cửa*</label> 
                            <input placeholder="Open Time" name="opentime" type="text" class="form-control" id="exampleInputOpenTime" aria-describedby="openTimeHelp" value="${branch.opentime}" required="required">
                        </div>

                        <!-- Image -->
                        <div class="mb-3">
                            <label for="exampleInputImage" class="form-label">Hình ảnh*</label> 
                            <input placeholder="Image URL" name="image" type="text" class="form-control" id="exampleInputImage" aria-describedby="imageHelp" value="${branch.image}" required="required">
                        </div>
						<div class="mb-3">
                            <label for="exampleInputDescription" class="form-label">ID City*</label> 
                            <input placeholder="ID City" name="idCity" type="text" class="form-control" id="exampleInputIDCity" aria-describedby="imageIDCity" value="${branch.idCity}"required="required">
                        </div>
                        <div class="mb-3">
                            <label for="exampleInputDescription" class="form-label">Mô tả*</label> 
                            <textarea placeholder="Description" name="description" class="form-control" id="exampleInputDescription" rows="4" required="required">${branch.description}</textarea>
                        </div>

                        <div class="text-end">
                            <button type="submit" class="btn btn-success">
                            	<c:if test="${branch.isEdit}">
                            		<span>Update</span>
                            	</c:if>
                            	<c:if test="${!branch.isEdit}">
                            		<span>Save</span>
                            	</c:if>
                            </button>
                        </div>
                    </form>
                    <h6 class="ms-3 text-primary">${message}</h6>
                </div>
            </div>
        </main>
    </div>
</body>
</html>
