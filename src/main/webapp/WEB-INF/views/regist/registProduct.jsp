<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  buffer="none"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<h2>Hello world</h2>

<form method="POST" name=""<%-- action="${pageContext.request.contextPath}/product/create"--%>
	  action="daum.net" enctype="multipart/form-data">

</form>

<form class="form-horizontal" method="POST" name="createProduct"<%-- action="${pageContext.request.contextPath}/product/create"--%>
	  action="daum.net" enctype="multipart/form-data" encoding="multipart/form-data">
<div class="row">
	<div class="col-lg-6 control-box">
		<fieldset>
			<legend>상품 정보</legend>		
			<div class="form-group">
				<label for="code" class="col-sm-3 control-label">상품 코드</label>
			    <div class="col-sm-9">
			      <input type="text" class="form-control" id="code" placeholder="상품 코드">
					<p><form:errors path="code" cssClass="error" /></p>
			    </div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-3 control-label">상품명</label>
			    <div class="col-sm-9">
			      <input type="text" class="form-control" id="name" placeholder="상품명">
			    </div>
			</div>
			<div class="form-group">
				<label for="price" class="col-sm-3 control-label">가격</label>
			    <div class="col-sm-9">
			      <input type="number" class="form-control" id="price" placeholder="가격" min="0">
			    </div>
			</div>
			<div class="form-group">
				<label for="info" class="col-sm-3 control-label">상품 정보</label>
			    <div class="col-sm-9">
			      <input type="text" class="form-control" id="info" placeholder="상품 정보">
			    </div>
			</div>
			<div class="form-group">
				<label for="spec" class="col-sm-3 control-label">상품 스펙</label>
			    <div class="col-sm-9">
			      <input type="text" class="form-control" id="spec" placeholder="상품 스펙">
			    </div>
			</div>
			<div class="form-group">
				<label for="image" class="col-sm-3 control-label">상품 이미지</label>
			    <div class="col-sm-9">
			      <input type="file" class="form-control" id="image" placeholder="상품 이미지" accept="image/*">
			    </div>
			</div>
			<div class="form-group">
				<label for="thumbnail" class="col-sm-3 control-label">상품 썸네일 이미지</label>
			    <div class="col-sm-9">
			      <input type="file" class="form-control" id="thumbnail" placeholder="상품 썸네일 이미지" accept="image/*">
			    </div>
			</div>
			<div class="form-group">
				<label for="amount" class="col-sm-3 control-label">재고</label>
			    <div class="col-sm-9">
			      <input type="number" class="form-control" id="amount" placeholder="재고" min="0">
			    </div>
			</div>
			<div class="col-md-3 col-md-offset-9">
				<button type="submit" class="btn btn-default">제출</button>
			</div>
		</fieldset>
	</div>
</div>
</form>

