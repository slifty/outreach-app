<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Client</title>
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/styles.css">
        <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/jquery.mobile-1.4.5.min.css">
        <script src="${contextPath}/resources/js/jquery.js"></script>
        <script src="${contextPath}/resources/js/jquery.mobile-1.4.5.js"></script>
        <link rel="stylesheet" href="${contextPath}/resources/css/jquery.mobile.datepicker.css">	
        <script src="${contextPath}/resources/js/jquery.ui.datepicker.js"></script> 
        <script src="${contextPath}/resources/js/jquery.mobile.datepicker.js"></script>
        <script src="${contextPath}/resources/js/jquery.validate.js"></script>         
    </head>

    <body>
        <div data-role="page" id="pathstatus-info">
             <script src="${contextPath}/resources/js/utils.js"></script> 

            <script>
                $(document).on('pageinit', function () {
                    configDate($(".servicesdateClass"));
                });
            </script>
            <div data-role="header" class="mheader">
                <a class="iconbar ui-nodisc-icon " href="#services-info-menu" data-role="button" 
                   data-theme="c" data-rel="back" data-inline="true" data-icon="bars"> &nbsp; </a>
                <h1>Services</h1>
                <a href="${contextPath}/ui" data-transition="fade"  class="hdright"> 
                    <img src="${contextPath}/resources/img/findicon.jpg"  >
                </a>
            </div>
            <div data-role="panel" id="services-info-menu" data-display="push" class="push-menu">
                <div class="ui-panel-inner">
                    <h3>Menu</h3>
                    <ul data-role="listview" class="mainMenu">
                        <li> <a href="${contextPath}/ui" data-transition="fade" >
                                <img src="${contextPath}/resources/img/search.png"> Client Search</a></li>
                        <li><a href="${contextPath}/logout" data-transition="fade" >
                                <img src="${contextPath}/resources/img/logout.png"> Logout</a></li>
                    </ul>
                </div>
            </div> 
            <div data-role="main" class="ui-content maincontent">
                <form:form action="${contextPath}/ui/services" method="post" modelAttribute="services" id="servicesForm">
                    <div class="sresult">
                        <ul class="noborder">
                            <li class="nobg">
                            <h4>Services</h4>
                            </li>
                            <li class="nobg">

                                <div class="clientmenu">
                                    <h5>Date Provided</h5>
                                    <fmt:formatDate value="${services.dateProvided}" var="dateProvided1" pattern="MM/dd/yyyy" />
                                    <input type="text" name="dateProvided" class="servicesdateClass" data-role="date" 
                                           placeholder="Enter Date" value="${dateProvided1}" required="true"/>
                                    <input type="hidden" name="projectEntryID.personalID.id" value = "${clientProfile.id}"/>  
                                    <input type="hidden" name="projectEntryID.id" value = "${enrollment.id}"/>   
                                    <input type="hidden" name="id" value = "${services.id}"/>            
                                </div>
                            </li>

                            <li class="nobg mtp10">

                                <div class="clientmenu">
                                    <h5>Record Type</h5>
                                    <form:select path="recordType" name="recordType">
                                        <form:option value="-1" label="- Select a record type -" />
                                        <form:options items="${recordTypeList}" itemValue="valueString" itemLabel="displayName"/>
                                    </form:select>
                                </div>
                            </li>
                            <li>

                                <div class="clientmenu">
                                    <h5>Type Provided</h5>
                                    <input type="number" name="typeProvided" placeholder="Number" 
                                           value="${services.typeProvided}"/>          
                                </div>
                            </li>      
                            <li>

                                <div class="clientmenu">
                                    <h5>Other Type Provided</h5>
                                    <input type="text" name="otherTypeProvided" placeholder="Other Type Provided" 
                                           value="${services.otherTypeProvided}"/>          
                                </div>
                            </li>
                            <li>

                                <div class="clientmenu">
                                    <h5>Sub Type Provided</h5>
                                    <input type="number" name="subTypeProvided" placeholder="Number" 
                                           value="${services.subTypeProvided}"/>          
                                </div>
                            </li>              
                            <li>
                                <div class="clientmenu">
                                    <h5>FA Amount</h5>
                                    <input type="number" name="fAAmount" placeholder="Number in ###.## format" 
                                           step="0.01" min="0" value="${services.fAAmount}"/>          
                                </div>
                            </li>
                            <li class="nobg mtp10">
                                <div class="clientmenu">
                                    <h5>Referral Outcome</h5>
                                    <form:select path="referralOutcome" name="referralOutcome">
                                        <form:option value="-1" label="- Select a record type -" />
                                        <form:options items="${referralOutcomeList}" itemValue="valueString" itemLabel="displayName"/>
                                    </form:select>
                                </div>
                            </li>
                        </ul>
                    </div>
                    <div class="ui-grid-a">
                        <div class="ui-block-a">
                            <c:choose>
                                <c:when test="${not empty clientProfile.id}">
                                    <a href="${contextPath}/ui/client/${clientProfile.id}" data-role="button" 
                                       data-direction="reverse" data-transition="slide" 
                                       class="whitebtn mtp20" >Back</a>
                                </c:when>
                                <c:otherwise>
                                    <a href="${contextPath}/ui" data-role="button" 
                                       data-direction="reverse" data-transition="slide" 
                                       class="whitebtn mtp20" >Back</a>
                                </c:otherwise>
                            </c:choose>
                        </div>
                        <div class="ui-block-b">
                            <button type="submit" data-role="button" class="blubtn mtp20" 
                                    data-transition="fade">Save</button> 
                        </div>
                    </div>
                </form:form>
            </div>
        </div>

    </body>
</html>
