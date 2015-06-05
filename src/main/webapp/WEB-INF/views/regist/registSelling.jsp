<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" buffer="none" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<style>
    img {height: 300px; width: 300px;}
</style>


<h2>Hello world</h2>
<div class="row">
    <div class="col-lg-6 control-box">
        <fieldset>
            <legend>상품 선택</legend>
            <div class="form-group">
                <label for="sel-product" class="col-sm-3 control-label">등록할 상품 선택</label>
                <select name="sel-product" id="sel-product" class="form-control">
                    <c:forEach var="product" items="${productList}" varStatus="x">
                        <c:if test="${x.index == 0}">
                            <c:set var="selectedId" value="${product.name}" />
                        </c:if>
                        <option value="${product.code}">${product.name}</option>
                    </c:forEach>
                </select>
            </div>

        </fieldset>
    </div>
</div>
<form class="form-horizontal" method="POST" id="sellingProduct"
      name="createProduct" action="${pageContext.request.contextPath}/product/sell" enctype="multipart/form-data" encoding="multipart/form-data">
    <div class="row">
        <div class="col-lg-6 control-box">
            <legend>상품 정보</legend>
            <div class="form-group">
                <label for="code" class="col-sm-3 control-label">상품 코드</label>

                <div class="col-sm-9">
                    <p class="form-control" id="code">${productList[0].code}</p>
                </div>
            </div>
            <div class="form-group">
                <label for="name" class="col-sm-3 control-label">상품명</label>

                <div class="col-sm-9">
                    <p class="form-control" id="name">${productList[0].name}</p>
                </div>
            </div>
            <div class="form-group">
                <label for="price" class="col-sm-3 control-label">가격</label>

                <div class="col-sm-9">
                    <p class="form-control" id="price">${productList[0].price}</p>
                </div>
            </div>
            <div class="form-group">
                <label for="info" class="col-sm-3 control-label">상품 정보</label>

                <div class="col-sm-9">
                    <p class="form-control" id="info">${productList[0].info}</p>
                </div>
            </div>
            <div class="form-group">
                <label for="spec" class="col-sm-3 control-label">상품 스펙</label>

                <div class="col-sm-9">
                    <p class="form-control" id="spec">${productList[0].spec}</p>
                </div>
            </div>
            <div class="form-group">
                <label for="image" class="col-sm-3 control-label">상품 이미지</label>

                <div class="col-sm-9">
                    <img id="image" src="${pageContext.request.contextPath}/product_img/${productList[0].imageUrl}" alt=""/>
                </div>
            </div>
            <div class="form-group">
                <label for="thumbnail" class="col-sm-3 control-label">상품 썸네일 이미지</label>

                <div class="col-sm-9">
                    <img id="thumbnail" src="${pageContext.request.contextPath}/product_img/${productList[0].thumbnailUrl}" alt=""/>
                </div>
            </div>
            <div class="form-group">
                <label for="inventoryAmount" class="col-sm-3 control-label">재고</label>

                <div class="col-sm-9">
                    <p class="form-control" id="inventoryAmount">${productList[0].inventoryAmount}</p>
                </div>
            </div>
            <div class="form-group">
                <label for="selledAmount" class="col-sm-3 control-label">누적 판매량</label>

                <div class="col-sm-9">
                    <p class="form-control" id="selledAmount">${productList[0].selledAmount}</p>
                </div>
            </div>
            <div class="form-group">
                <label for="sellingAmount" class="col-sm-3 control-label">판매할 수량</label>

                <div class="col-sm-9">
                    <input type="number" class="form-control" name="sellingAmount" id="sellingAmount" placeholder="판매할 수량" min="0">
                </div>
            </div>
            <div class="form-group">
                <label for="startDate" class="col-sm-3 control-label">판매 시작 날짜</label>

                <div class="col-sm-9">
                    <input type="date" class="form-control" name="startDate" id="startDate" placeholder="판매 시작 날짜" min="0">
                </div>
            </div>
            <div class="form-group">
                <label for="endDate" class="col-sm-3 control-label">판매 종료 날짜</label>

                <div class="col-sm-9">
                    <input type="date" class="form-control" name="startDate" id="endDate" placeholder="판매 종료 날짜" min="0">
                </div>
            </div>
            <div class="col-md-3 col-md-offset-9">
                <button type="submit" class="btn btn-default">등록</button>
            </div>
        </div>
    </div>
</form>

<script type="text/javascript">

    $('#sellingProduct').submit(function (e) {
        e.stopPropagation();
        var fd = new FormData($(this)[0]);
        fd.append("code", $('#code').text());
        fd.append("startTimestamp", new Date($('#startDate').val()).getTime());
        fd.append("endTimestamp", new Date($('#endDate').val()).getTime());
        //fd.append("label", "WEBUPLOAD");
        $.ajax({
            url: '${pageContext.request.contextPath}/product/sell',
            type: "POST",
            data: fd,
            enctype: 'multipart/form-data',
            processData: false,  // tell jQuery not to process the data
            contentType: false   // tell jQuery not to set contentType
        }).done(function (data) {
            console.log(data);
        }).error(function () {
            alert("ERROR");
        });
        return false;
    });

    $(function(){
	    var result = $.parseJSON('${parsed}');
	    
	    var image_prefix = '${pageContext.request.contextPath}/product_img/'

	    $('#sel-product').on('change',function(e){
	        var product = result[this.selectedIndex];
            console.log("Product = ", product);
	        $('#code').html(product.code);
	        $('#name').html(product.name);
	        $('#price').html(product.price);
	        $('#info').html(product.info);
	        $('#spec').html(product.spec);
	        $('#image').attr('src',image_prefix + product.imageUrl);
	        $('#thumbnail').attr('src',image_prefix + product.thumbnailUrl);
	        $('#inventoryAmount').html(product.inventoryAmount);
	        $('#selledAmount').html(product.selledAmount)
	        $('#sellingAmount', '#start_date', '#end_date').val("");
	    });
    });
</script>

