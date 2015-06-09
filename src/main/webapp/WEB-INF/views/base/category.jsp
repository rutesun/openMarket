<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<div class="list-group" id="li-categorys">
    <a href="#" class="list-group-item active">
        <span class="glyphicon glyphicon-list" aria-hidden="true"></span>
        <span>카테고리</span>
    </a>
</div>

<script type="text/javascript">
    var snippet = '<a href="/openMarket/view/selling/search?classification1=\${code}" class="list-group-item" data-code="\${code}">\${name}</a>';
    var result = "";
    require(['jquery', 'lodash', 'template/deal.template'], function($, _, template){
        var classifications = $.parseJSON('${classifications}');
        for(var cate in classifications){
            result += _.template(snippet, classifications[cate]);
        }
        $("#li-categorys").append(result).find('a[data-code]');
    });
</script>