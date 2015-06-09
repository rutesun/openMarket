<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
        <span class="icon-bar"></span> <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="index.html">SB Admin v2.0</a>
</div>
<!-- /.navbar-header -->

<!-- Collect the nav links, forms, and other content for toggling -->
<div id="nav-menu" class="collapse navbar-left navbar-collapse">
    <ul class="nav navbar-nav">
        <li class="">
            <ul class="dropdown-menu wow fadeInDown animated" role="menu" aria-labelledby="dropdownMenu1">
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Action</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1"
                                           href="${pageContext.request.contextPath}/menu/menu3">Another action</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Something else here</a></li>
                <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Separated link</a></li>
            </ul>
        </li>
        <li class="">
            <form class="form-inline" method="GET" id="sellingProduct"
                  action="${pageContext.request.contextPath}/view/selling/search">
                <div class="form-group">
                    <label for="name" class="col-sm-3 control-label"></label>

                    <div class="input-group">
                        <div class="input-group-addon">
                            <button type="submit" id="search">
                                <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
                            </button>
                        </div>
                        <input type="text" class="form-control" name="name" id="name" placeholder="" min="0">
                    </div>
                </div>
            </form>
        </li>


    </ul>
</div>
<!-- /.navbar-collapse -->
<ul class="nav navbar-top-links navbar-right">
    <li>
        <span>
            User : ${userInfo.userId}
        </span>
    </li>
    <li>
        <span>
            Balance : ${userInfo.accountBalance}
        </span>
    </li>
</ul>

<ul class="nav navbar-top-links navbar-right">

    <!-- /.dropdown -->
    <li class="dropdown"><a class="dropdown-toggle"
                            data-toggle="dropdown" href="#"> <i class="fa fa-bell fa-fw"></i>
        <i class="fa fa-caret-down"></i>
    </a>
        <ul class="dropdown-menu dropdown-alerts">
            <li><a href="#">
                <div>
                    <i class="fa fa-comment fa-fw"></i> New Comment <span
                        class="pull-right text-muted small">4 minutes ago</span>
                </div>
            </a></li>
            <li class="divider"></li>
            <li><a href="#">
                <div>
                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers <span
                        class="pull-right text-muted small">12 minutes ago</span>
                </div>
            </a></li>
            <li class="divider"></li>
            <li><a href="#">
                <div>
                    <i class="fa fa-envelope fa-fw"></i> Message Sent <span
                        class="pull-right text-muted small">4 minutes ago</span>
                </div>
            </a></li>
            <li class="divider"></li>
            <li><a href="#">
                <div>
                    <i class="fa fa-tasks fa-fw"></i> New Task <span
                        class="pull-right text-muted small">4 minutes ago</span>
                </div>
            </a></li>
            <li class="divider"></li>
            <li><a href="#">
                <div>
                    <i class="fa fa-upload fa-fw"></i> Server Rebooted <span
                        class="pull-right text-muted small">4 minutes ago</span>
                </div>
            </a></li>
            <li class="divider"></li>
            <li><a class="text-center" href="#"> <strong>See
                All Alerts</strong> <i class="fa fa-angle-right"></i>
            </a></li>
        </ul>
        <!-- /.dropdown-alerts --></li>
    <!-- /.dropdown -->
    <li class="dropdown"><a class="dropdown-toggle"
                            data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
        <i class="fa fa-caret-down"></i>
    </a>
        <ul class="dropdown-menu dropdown-user">
            <li><a href="#"><i class="fa fa-user fa-fw"></i> User
                Profile</a></li>
            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a></li>
            <li class="divider"></li>
            <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
                Logout</a></li>
        </ul>
        <!-- /.dropdown-user --></li>
    <!-- /.dropdown -->
</ul>
<!-- /.navbar-top-links -->

<script type="text/javascript">

</script>