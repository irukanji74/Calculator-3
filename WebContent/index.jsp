<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Calculator</title>
<link rel="stylesheet" href="./css/styles.css" type="text/css" />
</head>
<body>
	<div align="center">
		<table class="title">
			<tr>
				<th>Calculator</th>
			</tr>
		</table>
		<br />
		<br />
		<form action="CalcServlet">

			<table>
				<tr></tr>
			</table>
			<input type="text" readonly="readonly" size="50" name="calc"
				value="${expHolder.expression}" /><br />

			<table class=buttons>

				<tr>
					<td><button  value="1" name="symbol">1</button></td>
					<td><button  value="2" name="symbol">2</button></td>
					<td><button  value="3" name="symbol">3</button></td>
					<td><button  value="+" name="symbol">+</button></td>
				</tr>
				<tr>
					<td><button  value="4" name="symbol">4</button></td>
					<td><button  value="5" name="symbol">5</button></td>
					<td><button  value="6" name="symbol">6</button></td>
					<td><button  value="-" name="symbol">-</button></td>
				</tr>
				<tr>
					<td><button  value="7" name="symbol">7</button></td>
					<td><button  value="8" name="symbol">8</button></td>
					<td><button  value="9" name="symbol">9</button></td>
					<td><button  value="*" name="symbol">*</button></td>
					<td><button  value="~" name="symbol">~</button></td>
				</tr>
				<tr>

					<td><button  value="." name="symbol">.</button></td>
					<td><button  value="0" name="symbol">0</button></td>
					<td><button  value="C" name="symbol">C</button></td>
					<td><button  value="/" name="symbol">/</button></td>
					<td><button  value="=" name="symbol">=</button></td>

				</tr>

			</table>
		</form>
	</div>
</body>
</html>