<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>影院信息查询</title>
<meta  content="text/html;charset=UTF-8">
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/form.css">
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/ajaxType.js"></script>
</head>
<body>
	<form action="Film_search" method="post">
		<table>
			<tr>
				<td>电影名称：</td>
				<td><input name="filmname" type="text" /></td>
			</tr>
			<tr>
				<td>电影类型：</td>
				<td><select id="typeId" name="type"><option value="">全部</option></select></td>
			</tr>
			<tr>
				<td>主&nbsp;&nbsp;&nbsp;&nbsp;演：</td>
				<td><input name="actor" type="text" /></td>
			</tr>
			<tr>
				<td>导&nbsp;&nbsp;&nbsp;&nbsp;演：</td>
				<td><input name="director" type="text" /></td>
			</tr>
			<tr>
				<td>价&nbsp;&nbsp;&nbsp;&nbsp;格：</td>
				<td><input name="minticketprice" type="text" class="priceTxt" />至<input
					name="maxticketprice" type="text" class="priceTxt" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center; font-size: 20px;"><input
					value="查询电影 " type="submit" class="btnTxt" />&nbsp;&nbsp;&nbsp; <input
					value="发布电影 " type="button" class="btnTxt"
					onclick="javascript:location.href='/Cinema_spring/page/add.jsp';" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
