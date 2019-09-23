
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 3 | Blog</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <c:import url="/admin/css"></c:import>
  

</head>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

 <c:import url="/admin/menu"></c:import>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <c:import url="/admin/header"></c:import>
    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="card">
              <div class="card-header">
                <h3 class="card-title">Blog List</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <table class="table table-bordered">
                  <thead>                  
                    <tr>
                      <th style="width: 10px">#</th>
                      <th>Title</th>
                      <th>Image</th>
                      <th style="width: 175px">Action</th>
                    </tr>
                  </thead>
                  <tbody>
                  
                  <c:if test="${ not empty blogData }">
                  	<c:forEach items="${blogData}"  var="item" >
                    <tr>
                      <td>${item.bid }</td>
                      <td>${item.btitle }</td>
                      <td><img src="${item.bimg }" style = "max-height: 50px; max-width: 50px;"></td>
                      <td>
                      	<a href='<s:url value="/admin/deleteBlog/${ item.bid }"></s:url>' class="btn btn-danger"  >Delete</a>
                      	<a href='<s:url value="/admin/editBlog/${ item.bid }"></s:url>' class="btn btn-info"  >Update</a>
                      </td>
                    </tr>
                    </c:forEach>
                  </c:if>
                    
                    
                    
                  </tbody>
                </table>
              </div>
             
            </div>
         </div>
    </section>
  </div>
  <c:import url="/admin/footer"></c:import>
  </div>
  
  <c:import url="/admin/js"></c:import>
  
  </body>
  </html>