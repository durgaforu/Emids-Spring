<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action=""  commandName="e">

Name: <form:input path="empName"/> <br>
Select Cities:
<form:checkboxes items="${myCities}" path="cityName"/> <br>
Select one City:

<form:radiobuttons path="${cityName}" items="${myCities}" /> <br>

<form:select path="cityName">
	<form:options items="${myCities}"/>
</form:select>




</form:form>

<hr/>

