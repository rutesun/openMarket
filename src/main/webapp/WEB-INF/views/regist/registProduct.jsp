<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" buffer="none" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<h2>Hello world</h2>

<form class="form-horizontal" method="POST" id="createProduct"
      name="createProduct" action="${pageContext.request.contextPath}/product/sell" enctype="multipart/form-data" encoding="multipart/form-data">
    <div class="row">
        <div class="col-lg-6 control-box">
                <legend>상품 정보</legend>
                <div class="form-group">
                    <label for="code" class="col-sm-3 control-label">상품 코드</label>

                    <div class="col-sm-9">
                        <input type="text" class="form-control" name="code" id="code" placeholder="상품 코드">

                        <p><form:errors path="code" cssClass="error"/></p>
                    </div>
                </div>
                <div class="form-group">
                    <label for="name" class="col-sm-3 control-label">상품명</label>

                    <div class="col-sm-9">
                        <input type="text" class="form-control" name="name" id="name" placeholder="상품명">
                    </div>
                </div>
                <div class="form-group">
                    <label for="price" class="col-sm-3 control-label">가격</label>

                    <div class="col-sm-9">
                        <input type="number" class="form-control" name="price" id="price" placeholder="가격" min="0">
                    </div>
                </div>
                <div class="form-group">
                    <label for="info" class="col-sm-3 control-label">상품 정보</label>

                    <div class="col-sm-9">
                        <input type="text" class="form-control" name="info" id="info" placeholder="상품 정보">
                    </div>
                </div>
                <div class="form-group">
                    <label for="spec" class="col-sm-3 control-label">상품 스펙</label>

                    <div class="col-sm-9">
                        <input type="text" class="form-control" name="spec" id="spec" placeholder="상품 스펙">
                    </div>
                </div>
                <div class="form-group">
                    <label for="image" class="col-sm-3 control-label">상품 이미지</label>

                    <div class="col-sm-9">
                        <input type="file" class="form-control" name="image" id="image" placeholder="상품 이미지" accept="image/*">
                    </div>
                </div>
                <div class="form-group">
                    <label for="thumbnail" class="col-sm-3 control-label">상품 썸네일 이미지</label>

                    <div class="col-sm-9">
                        <input type="file" class="form-control" name="thumbnail"id="thumbnail" placeholder="상품 썸네일 이미지"
                               accept="image/*">
                    </div>
                </div>
                <div class="form-group">
                    <label for="amount" class="col-sm-3 control-label">재고</label>

                    <div class="col-sm-9">
                        <input type="number" class="form-control" name="amount" id="amount" placeholder="재고" min="0">
                    </div>
                </div>
                <div class="col-md-3 col-md-offset-9">
                    <button type="submit" class="btn btn-default">제출</button>
                </div>
        </div>
    </div>
</form>

<script type="text/javascript">

   $('#createProduct').submit(function(e){
        e.stopPropagation();
        var fd = new FormData($(this)[0]);
        //fd.append("label", "WEBUPLOAD");
        $.ajax({
            url: '${pageContext.request.contextPath}/product/create',
            type: "POST",
            data: fd,
            enctype: 'multipart/form-data',
            processData: false,  // tell jQuery not to process the data
            contentType: false   // tell jQuery not to set contentType
        }).done(function( data ) {
            console.log(data);
        }).error(function () {
            alert("ERROR");
        });
        return false;
    });

    /*$(':submit').on('click', function (e) {
        e.stopPropagation();
        var formData = new FormData($('#createProduct')[0]);
        $.ajax({
            url: '${pageContext.request.contextPath}/product/create', //server script to process data
            type: 'POST',
            xhr: function () { // custom xhr
                myXhr = $.ajaxSettings.xhr();
                if (myXhr.upload) { // if upload property exists
                    myXhr.upload.addEventListener('progress', function(e) {
                        var done = e.position || e.loaded, total = e.totalSize || e.total;
                        console.log('xhr progress: ' + (Math.floor(done/total*1000)/10) + '%');
                    }, false); // progressbar
                }
                return myXhr;
            },
            //Ajax events
            success: completeHandler = function (data) {
                /!*
                 * workaround for crome browser // delete the fakepath
                 *!/
                if (navigator.userAgent.indexOf('Chrome')) {
                    var catchFile = $(":file").val().replace(/C:\\fakepath\\/i, '');
                }
                else {
                    var catchFile = $(":file").val();
                }
                var writeFile = $(":file");
                writeFile.html(writer(catchFile));
                $("*setIdOfImageInHiddenInput*").val(data.logo_id);
            },
            error: errorHandler = function () {
                alert("Något gick fel");
            },
            // Form data
            data: formData,
            //Options to tell JQuery not to process data or worry about content-type
            cache: false,
            contentType: false,
            processData: false,
            enctype: 'multipart/form-data',
        }, 'json');
    });*/
</script>

