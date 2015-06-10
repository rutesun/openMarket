<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="col-lg-9 col-md-9">
    <div class="row">
        <table cellspacing="0" border="1">
            <caption>구매내역</caption>
            <colgroup>
                <col width="170">
                <col width="500">
                <col width="121">
                <col width="139">
            </colgroup>
            <thead>
            <tr>
                <th scope="colgroup" colspan="2">구매내역</th>
                <th scope="col">유효기간/배송상태</th>
                <th scope="col">관리</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="purchase" items="${purchaseList}" varStatus="x">
            <tr>
                <th scope="rowgroup" rowspan="2" class="deal_info">
                    <div class="date_num">
                        <p><strong>2015.06.01</strong></p>

                        <p><em>870379225</em></p>
                    </div>
                    <div class="payment">
                        <p>총 주문 금액 : </p>

                        <p class="won"><em>${purchase.price}</em><span class="txt_won">원</span></p>

                        <p class="coupon">(적립금 <em>0</em>원 사용)</p>
                    </div>
                </th>
                <th class="sum_up">
                    <div class="thmb_area">
                        <a href="/deal/173103181?isHistory=Y" tl:area="PDCO" tl:ord="1" target="blank">
                        </a>
                        <h4>
                            <a href="/deal/173103181?isHistory=Y" tl:area="PDCO" tl:ord="1" target="blank">
                                    ${purchase.productName}
                            </a>
                        </h4>

                        <p class="pay_info">
                            <span class="won"><em>${purchase.price}</em>원</span>
                            (결제완료)
                        </p>
                    </div>
                    <p class="add_date_info">&nbsp;
                    </p>

                    <p class="add_date_info">배송완료일 : <strong>2015.06.02</strong></p>

                    <p></p>


                    <ul class="ticket_lst">
                        <li>
                            <div class="tit">
                                <strong>
                                        ${purchase.productSpec} </strong>

                                <p>
                                    (구매수량<em>${purchase.count}</em>개 )
                                </p>
                            </div>
                            <div id="ticket_870379225173103181" name="ticket_870379225173103181" style="display:none;"
                                 attr-show="N">
                                <ul>
                                </ul>
                            </div>
                        </li>
                    </ul>
                </th>
                <td class="expiry">
                    <p class="delivery_condition">
                        <strong>${purchase.shippingStateText}</strong>
                    </p>
                </td>
                <td class="manage">
                    <div class="ly_btn">
                        <a href="javascript:layer_process('review', 'review', '870379225', '173103181', '1', '');"
                           class="review_w" id="review_870379225_173103181">구매후기쓰기</a>

                    </div>

                </td>
            </tr>

            <tr>
                <td colspan="3" class="delivery">
                <span title="" class="adr">
                <span class="bu"></span><%--배송지 정보 : 송준현, (151-852)서울특별시 관악구 신림동 10-426 동문타운 동문타운 101호<br>[도로명주소]서울특별시 관악구 남부순환로200가길 30 동문타운 동문타운 101호--%></span>
                </td>
            </tr>







            </c:forEach>
            </tbody>
        </table>


    </div>
</div>

<script type="text/javascript">
    var $target = $('#home_todayshot');
    require(['jquery', 'lodash', 'template/deal.template'], function ($, _, template) {
        var classifications = $.parseJSON('${classifications}');
        var productList = $.parseJSON('${productList}');
        console.log(productList);
        console.log(classifications);

        var result = "";
        for (var i = 0; i < productList.length; i++) {
            result += _.template(template.recommendedTemplate, productList[i]);
        }

        $target.append(result);


    });


    $(document).ready(function () {

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


