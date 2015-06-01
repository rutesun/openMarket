<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  buffer="none"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<h2>Hello world</h2>

<form class="form-horizontal" method="POST" name="product" action="">
<div class="row">
	<div class="col-lg-6 control-box">
		<fieldset>
			<legend>상품 정보</legend>		
			<div class="form-group">
				<label for="code" class="col-sm-3 control-label">상품 코드</label>
			    <div class="col-sm-9">
			      <input type="text" class="form-control" id="code" placeholder="상품 코드">
			    </div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-3 control-label">상품명</label>
			    <div class="col-sm-9">
			      <input type="text" class="form-control" id="name" placeholder="상품명">
			    </div>
			</div>
			<div class="form-group">
				<label for="code" class="col-sm-3 control-label">가격</label>
			    <div class="col-sm-9">
			      <input type="text" class="form-control" id="code" placeholder="가격">
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
				<label for="date" class="col-sm-3 control-label">상품 판매 일시</label>
			    <div class="col-sm-9">
			      <input type="date" class="form-control" id="date" placeholder="상품 판매 일시">
			    </div>
			</div>
			<div class="form-group">
				<label for="date" class="col-sm-3 control-label">재고</label>
			    <div class="col-sm-9">
			      <input type="text" class="form-control" id="date" placeholder="재고">
			    </div>
			</div>
		</fieldset>
		
	</div>
</div>

</form>

