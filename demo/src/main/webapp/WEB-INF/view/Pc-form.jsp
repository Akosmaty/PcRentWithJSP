<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>?
<head>
    <title>Student Registration Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="pc">


    Witaj w wyborze Swojego nowego PC
    <br><br>
    <br><br>
    <br><br>
    Powiedz jaki procesor chcesz miec w swoim nowym pc:
    <br><br>
    <form:select path="pro">
        <form:option value="1" label="I3"/>
        <form:option value="2" label="I5"/>
        <form:option value="3" label="I7"/>
    </form:select>
    <br><br>
    Wybierz obudowe procesora:
    <br><br>
    <form:select path="cas">
        <form:option value="1" label="X1"/>
        <form:option value="2" label="X2"/>

    </form:select>
    <br><br>
    Wybierz karte graficzna
    <br><br>
    <form:select path="gpu">
        <form:option value="1" label="GTX1660s"/>
        <form:option value="2" label="RTX3090"/>

    </form:select>

    <input type = "submit" value="Submit">

</form:form>

</body>
</html>
