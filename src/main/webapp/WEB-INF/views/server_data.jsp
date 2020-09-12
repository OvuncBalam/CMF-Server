<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Login Failed</title>

    <style>
        body,html {
            width: 100%;
            height: 100%;

        }

    </style>
</head>
<body>
<form:form method="post" action="/filterAndRedirect"  id="filterForm" modelAttribute="filterModel">
<div style="width: 100%; height: 100%;">
    <div style="width: 30%;margin-left: 35%;margin-right: 35%; margin-top: 10%">
                <form:input class="form-control"  type="text" path="filterWord"/>
    </div>

    <div style="width: 20%;margin-left: 47%;margin-right: 40%">
        <button type="submit">Filter</button>
    </div>

    </form:form>
    <h2 style="text-align: center;margin-top: 5%;">Table Data</h2>

    <table class="table table-view" style="width: 100%; height: 80%; margin-top: 1.5%;">
        <thead>
        <tr>
            <th scope="col">rowId</th>
            <th scope="col">objectId</th>
            <th scope="col">aValue</th>
            <th scope="col">addressOut</th>
            <th scope="col">addressIn</th>
            <th scope="col">bvalue</th>
            <th scope="col">bitPosition</th>
            <th scope="col">buttonPath</th>
            <th scope="col">code</th>
            <th scope="col">decimal</th>
            <th scope="col">defaultValue</th>
            <th scope="col">delay</th>
            <th scope="col">delta</th>
            <th scope="col">description</th>
            <th scope="col">dimension</th>
            <th scope="col">frequency</th>
            <th scope="col">functionCode</th>
            <th scope="col">grpCategory</th>
            <th scope="col">idgroup</th>
            <th scope="col">idhsVariable</th>
            <th scope="col">idVarMdl</th>
            <th scope="col">imageOff</th>
            <th scope="col">imageOn</th>
            <th scope="col">insertTime</th>
            <th scope="col">isActive</th>
            <th scope="col">isCancelled</th>
            <th scope="col">isHaccp</th>
            <th scope="col">isLogic</th>
            <th scope="col">isOnChange</th>
            <th scope="col">lastUpdate</th>
            <th scope="col">length</th>
            <th scope="col">maximum</th>
            <th scope="col">minimum</th>
            <th scope="col">priority</th>
            <th scope="col">readWrite</th>
            <th scope="col">toDisplay</th>
            <th scope="col">varEncoding</th>
            <th scope="col">detailId</th>
            <th scope="col">deviceModel</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${serverObjects}" var="serverobject">
            <tr>
                <th scope="col">${serverobject.rowId}</th>
                <th scope="col">${serverobject.objectId}</th>
                <th scope="col">${serverobject.avalue}</th>
                <th scope="col">${serverobject.addressOut}</th>
                <th scope="col">${serverobject.addressIn}</th>
                <th scope="col">${serverobject.bvalue}</th>
                <th scope="col">${serverobject.bitPosition}</th>
                <th scope="col">${serverobject.buttonPath}</th>
                <th scope="col">${serverobject.code}</th>
                <th scope="col">${serverobject.decimal}</th>
                <th scope="col">${serverobject.defaultValue}</th>
                <th scope="col">${serverobject.delay}</th>
                <th scope="col">${serverobject.delta}</th>
                <th scope="col">${serverobject.description}</th>
                <th scope="col">${serverobject.dimension}</th>
                <th scope="col">${serverobject.frequency}</th>
                <th scope="col">${serverobject.functionCode}</th>
                <th scope="col">${serverobject.grpCategory}</th>
                <th scope="col">${serverobject.idgroup}</th>
                <th scope="col">${serverobject.idhsVariable}</th>
                <th scope="col">${serverobject.idVarMdl}</th>
                <th scope="col">${serverobject.imageOff}</th>
                <th scope="col">${serverobject.imageOn}</th>
                <th scope="col">${serverobject.insertTime}</th>
                <th scope="col">${serverobject.isActive}</th>
                <th scope="col">${serverobject.isCancelled}</th>
                <th scope="col">${serverobject.isHaccp}</th>
                <th scope="col">${serverobject.isLogic}</th>
                <th scope="col">${serverobject.isOnChange}</th>
                <th scope="col">${serverobject.lastUpdate}</th>
                <th scope="col">${serverobject.length}</th>
                <th scope="col">${serverobject.maximum}</th>
                <th scope="col">${serverobject.minimum}</th>
                <th scope="col">${serverobject.priority}</th>
                <th scope="col">${serverobject.readWrite}</th>
                <th scope="col">${serverobject.toDisplay}</th>
                <th scope="col">${serverobject.varEncoding}</th>
                <th scope="col">${serverobject.detailId}</th>
                <th scope="col">${serverobject.deviceModel}</th>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</body>
</html>