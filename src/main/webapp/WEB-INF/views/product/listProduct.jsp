<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<div class="col-lg-9 col-md-9">
    <div class="today_recom_deal wrap_deal_lst thmb_lst">
        <ul class="lst" id="home_todayshot">
        </ul>
     </div>
</div>

<script type="text/javascript">
    var $target = $('#home_todayshot');
    require(['jquery', 'lodash', 'template/deal.template'], function($, _, template){
        var classifications = $.parseJSON('${classifications}');
        var productList = $.parseJSON('${productList}');
        console.log(productList);
        console.log(classifications);

        var result = "";
        for(var i = 0; i < productList.length; i++){
            result += _.template(template.recommendedTemplate, productList[i]);
        }

        $target.append(result);


    });


    $(document).ready(function(){

    });

    <%--var companyId = '${companyId}';--%>
    <%--console.log(companyId);--%>

//    $.ajax({
//        url: "",
//        error: errorHandler = function () {
//            alert("Error");
//        },
//        success: function (data) {
//            //console.log(data)
//        }
//    });


</script>


