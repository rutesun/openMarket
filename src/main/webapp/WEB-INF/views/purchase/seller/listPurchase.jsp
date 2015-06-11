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
                <th scope="col">배송</th>
                <th scope="col">관리</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="purchase" items="${purchaseList}" varStatus="x">
                <tr>
                    <th scope="rowgroup" rowspan="2" class="deal_info">
                        <div class="date_num">
                            <p><strong>2015.06.01</strong></p>

                            <p><em>${purchase.id}</em></p>
                        </div>
                        <div class="payment">
                            <p>총 주문 금액 : </p>

                            <p class="won"><em>${purchase.price}</em><span class="txt_won">원</span></p>
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
                                <div id="ticket_870379225173103181" name="ticket_870379225173103181"
                                     style="display:none;"
                                     attr-show="N">
                                    <ul>
                                    </ul>
                                </div>
                            </li>
                        </ul>
                    </th>
                    <td class="expiry">
                        <p class="delivery_condition">
                            상태 : <strong id="shipping_status">${purchase.shippingStateText}</strong>

                        </p>
                        <a href="#" class="delivery" data-id="${purchase.id}">
                            <button class="btn btn-primary">배송</button>
                        </a>
                    </td>
                    <td class="manage">
                        <div class="ly_btn">
                            TBD
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
    require(['jquery', 'lodash', 'template/deal.template'], function ($, _, template) {
        $('.delivery').on('click', function () {
            var id = $(this).attr('data-id');
            $.ajax({
                url: '/openMarket/purchase/delivery',
                data: {
                    id: id
                }
            }).done(function(data){
                   console.log("Success");
            });
        });
    });

</script>


