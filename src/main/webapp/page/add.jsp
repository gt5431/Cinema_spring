<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>发布电影信息</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="../css/form.css">
<script type='text/javascript' src="../js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="../js/ajaxType.js"></script>
<script type="text/javascript" src="../js/add.js"></script>
</head>

<body>
	<form>
		<table style="width: 360px;">
			<tr>
				<td colspan="3"><div>
						<s:property value="message" />
					</div></td>
			</tr>
			<tr>
				<td>电影名称：</td>
				<td><input name="filmname" id="filmname" type="text" /></td>
				<td><div id="fnmessage" style="display: none;"></div></td>
			</tr>
			<tr>
				<td>电影类型：</td>
				<td><select id="typeId" name="typeid">
				</select></td>
				<td><div id="timessage" style="display: none"></div></td>
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
				<td><input name="ticketprice" id="ticketprice" type="text" /></td>
				<td><div id="tpmessage" style="display: none"></div></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;"><input
					name="submit" value="发布电影" type="button" class="btnTxt"
					onclick="add()" /> &nbsp;&nbsp;&nbsp;<input value="返    回 "
					type="button" class="btnTxt"
					onclick="javascript:location.href='/Cinema_spring/index.jsp';" /></td>
			</tr>
		</table>
	</form>
</body>
</html>