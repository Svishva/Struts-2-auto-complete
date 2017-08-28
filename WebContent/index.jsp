<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="js/autocomplete.js"></script>
<title>Insert title here</title>
</head>
<body>
<p><a href='<s:url action="autoComplete" />' > Page 2</a></p>
 <div class="header">
                <h3>Autocomplete in Struts 2 using Jquery and JSON</h3>
        </div>
        <br />
        <br />
        <div class="search-container">
                <div class="ui-widget">
                        <s:textfield id="search" name="search" />
                </div>
        </div>

</body>
</html>