<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" buffer="none" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<script type="text/javascript">


      $.ajax({
          url: "",
          error: errorHandler = function () {
              alert("Error");
          },
          success: function(data){console.log(data)}
      });


</script>

