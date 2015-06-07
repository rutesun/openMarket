<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><tiles:getAsString name="title" /></title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet">

	<!-- Animated -->
	<link href="${pageContext.request.contextPath}/resources/css/lib/animate.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/resources/fonts/awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

	<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath}/resources/js/require.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
</head>
<script>
    (require.config({
        baseUrl: '${pageContext.request.contextPath}/js',
        //baseUrl: './js',
        paths: {
            lodash: 'lib/lodash'
        },
        shim: {
            lodash: {
                exports: '_'
            }
        }
    }));
</script>
<body>
	<div id="wrapper">
 	<!-- Navigation -->
 		<div class="navbar-default navbar-fixed-top" role="navigation">
 	 		<tiles:insertAttribute name="header" flush="false" /> 	 		
 	 	</div> 
 	 	
 	 	<div id="page-wrapper">
            <div class="container-fluid">
                <div class="col-lg-3 col-md-3">
                    <tiles:insertAttribute name="left" flush="false" />
                </div>
                <div class="col-lg-9 col-md-9">
                    <tiles:insertAttribute name="body" flush="false" />
                </div>
            </div>

		</div>
		<!-- /#page-wrapper -->
 	</div>
 	<!-- /#wrapper -->



    <!-- Bootstrap Core JavaScript -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    
    <!-- Template Engine and Else on -->
    <%--<script src="${pageContext.request.contextPath}/resources/js/lib/lodash.js"></script>--%>

    <!-- Effect -->
    <script src="${pageContext.request.contextPath}/resources/js/lib/effect/smoothscroll.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/lib/effect/wow.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>


</body>
</html>