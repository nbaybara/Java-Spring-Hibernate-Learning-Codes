<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName"/>
		<br><br>
		Last Name: <form:input path="lastName"/>
		<br><br>
		<br><br>
		 Country: <form:select path="country">
		 			<form:options items="${theCountryOptions}"/>
		 		</form:select>
		 		<br><br>
		 		Favorite Language
		 		Java <form:radiobutton path="favoriteLanguage" value="JAVA"/>
		 		PHP	 <form:radiobutton path="favoriteLanguage" value="PHP"/>
		 		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
		 		C#	 <form:radiobutton path="favoriteLanguage" value="c#"/>
		 		
		 		<br><br>
		 		Operating Systems:
		 		Linux <form:checkbox path="operatingSystem" value="Linux"/>
		 		MAC OS<form:checkbox path="operatingSystem" value="MAC"/>
		 		MS Windows <form:checkbox path="operatingSystem" value="Windows"/>
		 	
		 		<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
	<!--When the form is submitted mvc will call: student.setFirstname... -->
</body>
</html>