<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Login to Time Sheet Application </title>
</head>
<body style="background-color:#ffffE9">
<div style="background-color:#1010ff; align:center; margin-top:200px; width:400px; margin-left:450px">
<div style="margin-top:20px" >
<span style="align:left; padding-left:15px; font-size:22px; color:white"> Please Login to enter into the application </span>
</div>
<form action="action/loginApplication" method="post">
        <table style="margin-top:30px; align:center; margin-left:70px; color:white">
          <tr><td>Username</td><td><input name="userName" /></td></tr>
          <tr><td colspan="2" align="right"><input type="submit" value="Login" /></td></tr>
        </table>
</form>
</div>
</body>
</html>
