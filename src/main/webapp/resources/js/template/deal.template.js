/**
 * Created by 준현 on 2015-06-07.
 */
define(function () {
   function Template(){

   }
    var templ = (function() {
        this.recommendedTemplate =
            '<li class="dealli" id="dealli_home_${id}">'
            + '<a href="/openMarket/view/product/detail/${id}/" class="thmb">'
            + '<img src="/openMarket/product_img/${thumbnailUrl}" width="322" height="330" alt="">'
            + '<span class="edge"></span>'
            + '<span class="hover"></span>'
            + '</a>'
            + '<div class="detail">'
            + '<p class="summary">${info}</p>'
            + '<a href="/deal/86521857/" class="subject">${name}</a>'
            + '<div class="amounts">'
            + '<div class="price">'
            + '<p class="sale"><span class="blind">티몬가</span><em>${price}</em>원</p>'
            + '<p class="price_info" title=""></p>'
            + '</div>'
            + '</div>'
            + '<span class="people"><em>22,837</em>개 구매</span>'
            + '</div>'
            + '<div class="option">'
            + '<div class="zzim">'
            + '<a style="cursor:pointer" class="btn_zzim" title="찜하기"><span>찜하기</span></a>'
            + '</div>'
            + '</div>'
            + '</li>';

        this.categoryTemplate = "";

        return this;
    }).call({});
    return templ;
});