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
            <p>${productInfo[0].name}</p>
            <p>${productInfo[0].info}</p>
            <p>${productInfo[0].spec}</p>
            <p>${productInfo[0].price}</p>

    </div>
    </div>

    <div class="row" class="">


    </div>
</div>


<script type="text/javascript">
    var $target = $('#home_todayshot');
    require(['jquery', 'lodash', 'template/deal.template'], function($, _, template){
        var classifications = $.parseJSON('${classifications}')
        var productInfo = '${productInfo}';
        console.log(productInfo);

    });




</script>


