<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<div class="col-lg-9 col-md-9 detail_info" data-code="${productInfo[0].code}">
    <div class="row" class="">
        <div class="col-lg-3">
            <div>
                <img class="img-responsive" src="${pageContext.request.contextPath}/product_img/${productInfo[0].imageUrl}" alt="" style="width: 100%; height: auto;">
            </div>
        </div>
        <div class="col-lg-9">
            <div class="row">
                <div class="form-group">
                    <label for="count" class="col-sm-4 control-label">제품 이름</label>
                    <div class="col-sm-8">
                        <p>${productInfo[0].name}</p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="count" class="col-sm-4 control-label">제품 정보</label>
                    <div class="col-sm-8">
                        <p>${productInfo[0].info}</p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="count" class="col-sm-4 control-label">제품 스펙</label>
                    <div class="col-sm-8">
                        <p>${productInfo[0].spec}</p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="count" class="col-sm-4 control-label">가격</label>
                    <div class="col-sm-8">
                        <p id="price">${productInfo[0].price}</p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="sellingAmount" class="col-sm-4 control-label">구매 가능 수량</label>
                    <div class="col-sm-8">
                        <p id="sellingAmount">${productInfo[0].sellingAmount}</p>
                    </div>
                </div>




            </div>
            <div class="row">
                <form action="${pageContext.request.contextPath}/purchase" method="POST">
                    <input type="hidden" name="productId" id="productId" value="${productInfo[0].id}"/>
                    <div class="form-group">
                        <label for="count" class="col-sm-4 control-label">구매 수량</label>
                        <div class="col-sm-8">
                            <input type="number" class="form-control" name="count" id="count" placeholder="구매 수량"
                                   min="0">
                        </div>
                    </div>
                    <div class="form-group">
                        <span class="col-sm-4 control-label">예상 금액</span>
                        <div class="col-sm-8">
                            <span id="expectedAmount"></span>원
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="pull-right">
                        <button type="submit" class="btn btn-primary">구매</button>
                        </div>
                    </div>
                </form>
            </div>
    </div>
    </div>

    <div class="row" class="">

    </div>
</div>


<script type="text/javascript">
    var $target = $('#home_todayshot');
    require(['jquery', 'lodash', 'template/deal.template'], function($, _, template){
        var classifications = $.parseJSON('${classifications}');
        var productInfo = '${productInfo}';
        console.log(productInfo);

    });

    $('#count').on('change', function(e){
        var $_taret = $('#expectedAmount'),
                price = $('#price').html();
        return (function(e){
            var res = Number(price * $(this).val());
            if(res > ${userInfo.accountBalance}){
                alert("예산 초과 !!");

            } else{
                $_taret.text(res);

            }
        }).call(this, e);
    });




</script>


